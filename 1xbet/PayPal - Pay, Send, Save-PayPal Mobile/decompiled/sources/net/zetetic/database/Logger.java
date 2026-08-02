package net.zetetic.database;

/* loaded from: classes5.dex */
public class Logger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static net.zetetic.database.LogTarget target;

    static {
        setTarget(new net.zetetic.database.LogcatTarget());
    }

    public static void setTarget(net.zetetic.database.LogTarget logTarget) {
        target = logTarget;
    }

    private static net.zetetic.database.LogTarget getTarget() {
        if (target == null) {
            setTarget(new net.zetetic.database.NoopTarget());
        }
        return target;
    }

    public static boolean isLoggable(java.lang.String str, int i) {
        return getTarget().isLoggable(str, i);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        getTarget().log(4, str, str2, null);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(4, str, str2, th);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        getTarget().log(3, str, str2, null);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(3, str, str2, th);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        getTarget().log(6, str, str2, null);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(6, str, str2, th);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        getTarget().log(2, str, str2, null);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(2, str, str2, th);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        getTarget().log(5, str, str2, null);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(5, str, str2, th);
    }

    public static void wtf(java.lang.String str, java.lang.String str2) {
        getTarget().log(7, str, str2, null);
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTarget().log(7, str, str2, th);
    }
}
