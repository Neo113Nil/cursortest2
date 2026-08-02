package my.com.softspace.auditlog.service.intf;

/* loaded from: classes17.dex */
public interface AuditLogger {
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_SUCCESS = 0;

    void attestTransactionLogging(java.lang.Long l, java.lang.String str, java.lang.Long l2);

    void attestTransactionLogging(my.com.softspace.auditlog.vo.AttestTransactionLogEntry attestTransactionLogEntry);

    void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator);

    void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str2);

    void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str2, java.lang.Throwable th);

    void auditLogging(java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3);

    void auditLogging(java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3, java.lang.Throwable th);

    void auditLogging(my.com.softspace.auditlog.vo.LogItem logItem);

    java.lang.String getUserUuid();

    void setUserUuid(java.lang.String str);

    public enum Originator {
        USER(0),
        SYSTEM(1),
        OTHERS(2);

        private int getHighResolutionOutputSizeshNQ4ISI;

        Originator(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final int getOrdinal() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public static my.com.softspace.auditlog.service.intf.AuditLogger.Originator valueOfInt(int i) {
            if (i == 0) {
                return USER;
            }
            if (i == 1) {
                return SYSTEM;
            }
            if (i == 2) {
                return OTHERS;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }
}
