package io.appmetrica.analytics.coreutils.internal.system;

/* loaded from: classes.dex */
public final class SystemServiceUtils {
    public static final io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils();

    private SystemServiceUtils() {
    }

    public static final <T, S> S accessSystemServiceByNameSafely(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, S s2, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s2, functionWithThrowable);
        } catch (java.lang.Throwable unused) {
            return s2;
        }
    }

    public static final <T, S> S accessSystemServiceSafely(T t, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(T t, java.lang.String str, java.lang.String str2, S s2, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<T, S> functionWithThrowable) {
        S s3 = (S) accessSystemServiceSafely(t, str, str2, functionWithThrowable);
        return s3 == null ? s2 : s3;
    }
}
