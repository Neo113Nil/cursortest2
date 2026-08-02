package common.emv.util;

/* loaded from: classes17.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static common.emv.util.Logger.LoggerDelegate f6719a;

    public interface LoggerDelegate {
        void d(java.lang.String str);

        void e(java.lang.String str, java.lang.Throwable th);

        void i(java.lang.String str);

        void v(java.lang.String str);

        void w(java.lang.String str);
    }

    public static void w(java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.w(a(str, objArr));
        }
    }

    public static void v(java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.v(a(str, objArr));
        }
    }

    public static boolean isLogEnable() {
        return f6719a != null;
    }

    public static void init(common.emv.util.Logger.LoggerDelegate loggerDelegate) {
        f6719a = loggerDelegate;
    }

    public static void i(java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.i(a(str, objArr));
        }
    }

    public static void e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.e(a(str, objArr), th);
        }
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.e(a(str, objArr), null);
        }
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        common.emv.util.Logger.LoggerDelegate loggerDelegate = f6719a;
        if (loggerDelegate != null) {
            loggerDelegate.d(a(str, objArr));
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : java.lang.String.format(str, objArr);
    }
}
