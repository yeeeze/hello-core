package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemorymemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemorymemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemorymemberRepository(), new FixDiscountPolicy());
    }
}
