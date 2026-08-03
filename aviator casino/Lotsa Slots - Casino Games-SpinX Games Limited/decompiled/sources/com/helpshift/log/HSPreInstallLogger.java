package com.helpshift.log;

/* loaded from: classes2.dex */
public class HSPreInstallLogger {
    private static com.helpshift.log.ILogger logger;

    private HSPreInstallLogger() {
    }

    public static void initLogger(com.helpshift.log.ILogger iLogger) {
        logger = iLogger;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        d(str, str2, null);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        w(str, str2, null);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        e(str, str2, null);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.helpshift.log.ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.d(str, str2, th);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.helpshift.log.ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.w(str, str2, th);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.helpshift.log.ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.e(str, str2, th);
    }

    public static java.lang.String getStackTrace(java.lang.Throwable th) {
        com.helpshift.log.ILogger iLogger = logger;
        return iLogger == null ? "" : iLogger.getStackTrace(th);
    }
}
