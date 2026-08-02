package sspog;

/* loaded from: classes18.dex */
public class SimpleLogger {
    private static boolean debug = false;
    private static boolean enable = false;
    private static boolean verbose = false;

    static void init(boolean z) {
        enable = z;
        debug = false;
        verbose = false;
    }

    private SimpleLogger() {
    }

    public static boolean checkLogEnabled() {
        return enable;
    }

    public static boolean isDebug() {
        return enable && debug;
    }

    public static boolean isVerbose() {
        return enable && verbose;
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (debug) {
            getTag(str);
        }
    }

    private static java.lang.String getTag(java.lang.String str) {
        java.lang.String obj;
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            obj = "[MAIN]";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(java.lang.Thread.currentThread().getId());
            sb.append("]");
            obj = sb.toString();
        }
        return java.lang.String.format("%s%s", str, obj);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (enable) {
            getTag(str);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (enable) {
            getTag(str);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (enable) {
            getTag(str);
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (verbose) {
            getTag(str);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (enable) {
            getTag(str);
        }
    }
}
