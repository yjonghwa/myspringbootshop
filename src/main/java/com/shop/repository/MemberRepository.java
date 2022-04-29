package com.shop.repository;

import com.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// Member 엔티티를 데이터베이스에 저장할 수 있도록 MemberRepository 생성
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 중복된 회원이 있는지 검사하기 위한 쿼리 메소드 작성
    Member findByEmail(String email);
}
