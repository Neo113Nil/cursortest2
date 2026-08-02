package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class DobsLogUtils {
    private static boolean Camera2StreamConfigurationMap = false;
    public static java.lang.String TAG = "DOBS_LOG";
    private static final com.daon.dmds.utils.DobsLogUtils.DebugLogger getHighResolutionOutputSizeshNQ4ISI;
    private static final com.daon.dmds.utils.DobsLogUtils.WarnLogger getHighSpeedVideoFpsRanges;
    private static final com.daon.dmds.utils.DobsLogUtils.ErrorLogger getHighSpeedVideoFpsRangesFor;
    private static final com.daon.dmds.utils.DobsLogUtils.VerboseLogger getHighSpeedVideoSizes;

    static class DebugLogger implements com.daon.dmds.utils.DobsLogUtils.ILogger {
        private DebugLogger() {
        }

        /* synthetic */ DebugLogger(byte b) {
            this();
        }
    }

    static class ErrorLogger implements com.daon.dmds.utils.DobsLogUtils.ILogger {
        private ErrorLogger() {
        }

        /* synthetic */ ErrorLogger(byte b) {
            this();
        }
    }

    interface ILogger {
    }

    static class VerboseLogger implements com.daon.dmds.utils.DobsLogUtils.ILogger {
        private VerboseLogger() {
        }

        /* synthetic */ VerboseLogger(byte b) {
            this();
        }
    }

    static class WarnLogger implements com.daon.dmds.utils.DobsLogUtils.ILogger {
        private WarnLogger() {
        }

        /* synthetic */ WarnLogger(byte b) {
            this();
        }
    }

    static {
        byte b = 0;
        getHighSpeedVideoSizes = new com.daon.dmds.utils.DobsLogUtils.VerboseLogger(b);
        getHighResolutionOutputSizeshNQ4ISI = new com.daon.dmds.utils.DobsLogUtils.DebugLogger(b);
        getHighSpeedVideoFpsRangesFor = new com.daon.dmds.utils.DobsLogUtils.ErrorLogger(b);
        getHighSpeedVideoFpsRanges = new com.daon.dmds.utils.DobsLogUtils.WarnLogger(b);
    }

    public static java.lang.String getStackTrace(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static boolean isEnabled() {
        return Camera2StreamConfigurationMap;
    }

    public static void logDebug(java.lang.String str) {
        logDebug(TAG, str);
    }

    public static void logDebug(java.lang.String str, java.lang.String str2) {
    }

    public static void logError(java.lang.String str) {
        logError(TAG, str);
    }

    public static void logError(java.lang.String str, java.lang.String str2) {
    }

    public static void logVerbose(java.lang.String str) {
        logVerbose(TAG, str);
    }

    public static void logVerbose(java.lang.String str, java.lang.String str2) {
    }

    public static void logWarn(java.lang.String str) {
        logWarn(TAG, str);
    }

    public static void logWarn(java.lang.String str, java.lang.String str2) {
    }

    public static void setEnabled(boolean z) {
        Camera2StreamConfigurationMap = z;
    }
}
