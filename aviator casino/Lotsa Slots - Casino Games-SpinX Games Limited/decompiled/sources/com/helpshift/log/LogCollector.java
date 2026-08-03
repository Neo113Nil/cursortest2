package com.helpshift.log;

/* loaded from: classes2.dex */
public class LogCollector {
    private static final java.lang.String TAG = "Heplshift_LogCollector";
    private final java.util.concurrent.ExecutorService executorService;
    private java.io.FileOutputStream fos;
    private final boolean isAppInDebugMode;
    private final java.io.File logFile;
    private final long mainThreadId;
    private static final java.util.List<java.lang.String> internalLogs = new java.util.ArrayList();
    public static final java.lang.String LOG_DIR_PATH = "helpshift" + java.io.File.separator + "debugLogs";

    public LogCollector(java.io.File file, java.lang.String str, long j, java.util.concurrent.ExecutorService executorService, boolean z) {
        java.io.File file2 = new java.io.File(file, LOG_DIR_PATH);
        file2.mkdirs();
        deleteOldFiles(file2);
        this.logFile = new java.io.File(file2, str + ".txt");
        this.mainThreadId = j;
        this.executorService = executorService;
        this.isAppInDebugMode = z;
    }

    public void collectLog(final java.lang.String str, final java.lang.String str2, final java.lang.Throwable th, final com.helpshift.log.ILogger.LEVEL level) {
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        final long id = java.lang.Thread.currentThread().getId();
        if (this.fos == null) {
            try {
                this.fos = new java.io.FileOutputStream(this.logFile, true);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSPreInstallLogger.e(TAG, "Error opening debug log file: " + this.logFile.getAbsolutePath(), e);
                return;
            }
        }
        try {
            this.executorService.submit(new java.lang.Runnable() { // from class: com.helpshift.log.LogCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.log.LogCollector.this.m5667lambda$collectLog$0$comhelpshiftlogLogCollector(currentTimeMillis, id, level, str, str2, th);
                }
            });
        } catch (java.lang.Exception e2) {
            com.helpshift.log.HSPreInstallLogger.e(TAG, "Error submitting to executor", e2);
        }
    }

    /* renamed from: lambda$collectLog$0$com-helpshift-log-LogCollector, reason: not valid java name */
    /* synthetic */ void m5667lambda$collectLog$0$comhelpshiftlogLogCollector(long j, long j2, com.helpshift.log.ILogger.LEVEL level, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US).format(new java.util.Date(j));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(format);
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(this.mainThreadId);
            sb.append("-");
            sb.append(j2);
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(level.name());
            sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
            sb.append(str);
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(str2);
            java.lang.String message = th instanceof java.net.UnknownHostException ? th.getMessage() : com.helpshift.log.HSPreInstallLogger.getStackTrace(th);
            sb.append("\n");
            sb.append(message);
            sb.append("\n");
            addInternalLogs(format, str2);
            this.fos.write(sb.toString().getBytes());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSPreInstallLogger.e(TAG, "Error writing to debug log file", e);
        }
    }

    private void addInternalLogs(java.lang.String str, java.lang.String str2) {
        if (this.isAppInDebugMode) {
            internalLogs.add(str + io.ktor.sse.ServerSentEventKt.SPACE + str2);
        }
    }

    public static java.util.List<java.lang.String> getInternalLogs() {
        return internalLogs;
    }

    private void deleteOldFiles(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 5) {
            return;
        }
        java.util.Arrays.sort(listFiles);
        for (int i = 0; i < listFiles.length - 5; i++) {
            if (!listFiles[i].delete()) {
                com.helpshift.log.HSPreInstallLogger.e(TAG, "File not deleted: " + listFiles[i]);
            }
        }
    }

    public static java.lang.String getLogFileName() {
        return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US).format(new java.util.Date(java.lang.System.currentTimeMillis()));
    }
}
