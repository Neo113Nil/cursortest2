package androidx.camera.core;

/* loaded from: classes6.dex */
public final class Logger {
    private static int getHighSpeedVideoFpsRangesFor = 3;

    public static void d(java.lang.String str, java.lang.String str2) {
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    public static void e(java.lang.String str, java.lang.String str2) {
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    public static void i(java.lang.String str, java.lang.String str2) {
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    public static void w(java.lang.String str, java.lang.String str2) {
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    private Logger() {
    }

    static void getHighSpeedVideoSizes(int i) {
        getHighSpeedVideoFpsRangesFor = i;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = 3;
    }

    public static boolean isDebugEnabled(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor <= 3 || android.util.Log.isLoggable(str, 3);
    }

    public static boolean isErrorEnabled(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor <= 6 || android.util.Log.isLoggable(str, 6);
    }

    public static boolean isInfoEnabled(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor <= 4 || android.util.Log.isLoggable(str, 4);
    }

    public static boolean isVerboseEnabled(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor <= 2 || android.util.Log.isLoggable(str, 2);
    }

    public static boolean isWarnEnabled(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor <= 5 || android.util.Log.isLoggable(str, 5);
    }
}
