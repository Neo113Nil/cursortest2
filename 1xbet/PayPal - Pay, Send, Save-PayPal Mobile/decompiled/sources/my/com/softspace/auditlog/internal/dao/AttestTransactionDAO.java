package my.com.softspace.auditlog.internal.dao;

/* loaded from: classes17.dex */
public interface AttestTransactionDAO {
    void delete(java.util.Collection<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> collection);

    void delete(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr);

    void deleteAll();

    java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> getAll();

    long[] insertAttestTransaction(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr);

    void update(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr);
}
