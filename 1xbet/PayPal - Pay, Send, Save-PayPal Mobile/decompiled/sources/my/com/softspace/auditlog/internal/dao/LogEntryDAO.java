package my.com.softspace.auditlog.internal.dao;

/* loaded from: classes17.dex */
public interface LogEntryDAO {
    void delete(java.util.Collection<my.com.softspace.auditlog.internal.dto.LogEntry> collection);

    void delete(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr);

    void deleteAll();

    java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> getAll();

    long[] insertLogEntry(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr);

    void update(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr);
}
