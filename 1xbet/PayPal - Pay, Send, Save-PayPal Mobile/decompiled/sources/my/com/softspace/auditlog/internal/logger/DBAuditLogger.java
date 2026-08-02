package my.com.softspace.auditlog.internal.logger;

/* loaded from: classes17.dex */
public class DBAuditLogger implements my.com.softspace.auditlog.service.intf.AuditLogger {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private android.content.Context getHighSpeedVideoFpsRangesFor;

    public DBAuditLogger(android.content.Context context, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = context.getApplicationContext();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public java.lang.String getUserUuid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void setUserUuid(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(my.com.softspace.auditlog.vo.LogItem logItem) {
        Camera2StreamConfigurationMap(logItem);
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator) {
        auditLogging(str, i, originator, (java.lang.String) null, (java.lang.Throwable) null);
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str2) {
        auditLogging(str, i, originator, str2, (java.lang.Throwable) null);
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3) {
        auditLogging(str, str2, i, originator, str3, null);
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(java.lang.String str, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str2, java.lang.Throwable th) {
        auditLogging(new my.com.softspace.auditlog.vo.LogItem.Builder(str, i, originator).setDateTime(java.lang.System.currentTimeMillis()).setLog(str2).setThrowable(th).build());
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void auditLogging(java.lang.String str, java.lang.String str2, int i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, java.lang.String str3, java.lang.Throwable th) {
        auditLogging(new my.com.softspace.auditlog.vo.LogItem.Builder(str, i, originator).setAttestID(str2).setDateTime(java.lang.System.currentTimeMillis()).setLog(str3).setThrowable(th).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(final my.com.softspace.auditlog.vo.LogItem logItem) {
        synchronized (this) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                android.os.AsyncTask.THREAD_POOL_EXECUTOR.execute(new java.lang.Runnable() { // from class: my.com.softspace.auditlog.internal.logger.DBAuditLogger$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        my.com.softspace.auditlog.internal.logger.DBAuditLogger.this.Camera2StreamConfigurationMap(logItem);
                    }
                });
                return;
            }
            if (logItem == null) {
                throw new java.lang.IllegalArgumentException("logItem shouldn't be null");
            }
            if (logItem.getEvent() == null || logItem.getEvent().isEmpty()) {
                throw new java.lang.IllegalArgumentException("event message shouldn't be null");
            }
            if (logItem.getOrigination() == null) {
                throw new java.lang.IllegalArgumentException("origination shouln't be null");
            }
            my.com.softspace.auditlog.internal.dto.LogEntry logEntry = new my.com.softspace.auditlog.internal.dto.LogEntry();
            logEntry.setId(null);
            logEntry.setUserUuid(this.getHighResolutionOutputSizeshNQ4ISI);
            if (logItem.getDateTime() <= 0) {
                logEntry.setDateTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                logEntry.setDateTime(java.lang.Long.valueOf(logItem.getDateTime()));
            }
            logEntry.setAttestID(logItem.getAttestID());
            logEntry.setEvent(logItem.getEvent());
            logEntry.setStatus(java.lang.Integer.valueOf(logItem.getStatus()));
            logEntry.setOrigination(java.lang.Integer.valueOf(logItem.getOrigination().getOrdinal()));
            logEntry.setLog(logItem.getLog());
            java.lang.Throwable throwable = logItem.getThrowable();
            if (throwable != null) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                throwable.printStackTrace(new java.io.PrintWriter(stringWriter));
                logEntry.setThrowable(stringWriter.toString());
            } else {
                logEntry.setThrowable(null);
            }
            my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().logEntryDAO().insertLogEntry(logEntry);
        }
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void attestTransactionLogging(my.com.softspace.auditlog.vo.AttestTransactionLogEntry attestTransactionLogEntry) {
        synchronized (this) {
            if (attestTransactionLogEntry != null) {
                if (attestTransactionLogEntry.getAttestId() != null && attestTransactionLogEntry.getKsn() != null && attestTransactionLogEntry.getAttestId().longValue() > 0 && !attestTransactionLogEntry.getKsn().isEmpty()) {
                    java.lang.Long timestamp = attestTransactionLogEntry.getTimestamp();
                    if (timestamp == null || timestamp.longValue() <= 0) {
                        timestamp = java.lang.Long.valueOf(new java.util.Date().getTime());
                    }
                    my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().attestTransactionDAO().insertAttestTransaction(new my.com.softspace.auditlog.internal.dto.AttestTransactionEntry(attestTransactionLogEntry.getAttestId(), attestTransactionLogEntry.getKsn(), timestamp));
                }
            }
        }
    }

    @Override // my.com.softspace.auditlog.service.intf.AuditLogger
    public void attestTransactionLogging(java.lang.Long l, java.lang.String str, java.lang.Long l2) {
        if (l == null || str == null || l.longValue() <= 0 || str.isEmpty()) {
            return;
        }
        attestTransactionLogging(new my.com.softspace.auditlog.vo.AttestTransactionLogEntry(l, str, l2));
    }
}
