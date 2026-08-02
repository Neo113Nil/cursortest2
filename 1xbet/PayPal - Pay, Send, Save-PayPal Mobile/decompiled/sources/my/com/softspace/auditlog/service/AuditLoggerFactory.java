package my.com.softspace.auditlog.service;

/* loaded from: classes17.dex */
public class AuditLoggerFactory {
    public static my.com.softspace.auditlog.service.intf.AuditLogger getLogger(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context shouldn't be null");
        }
        if (str == null || str.isEmpty()) {
            str = "-";
        }
        return new my.com.softspace.auditlog.internal.logger.DBAuditLogger(context, str);
    }
}
