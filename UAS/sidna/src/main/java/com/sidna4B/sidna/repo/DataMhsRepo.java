package com.sidna4B.sidna.repo;

import com.sidna4B.sidna.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}