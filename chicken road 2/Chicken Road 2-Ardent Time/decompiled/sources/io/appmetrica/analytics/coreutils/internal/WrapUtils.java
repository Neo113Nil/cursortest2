package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d2, double d3) {
        return java.lang.Double.isFinite(d2) ? d2 : d3;
    }

    public static double getFiniteDoubleOrDefaultNullable(java.lang.Double d2, double d3) {
        return d2 == null ? d3 : getFiniteDoubleOrDefault(d2.doubleValue(), d3);
    }

    public static long getMillisOrDefault(java.lang.Long l2, java.util.concurrent.TimeUnit timeUnit, long j2) {
        return l2 == null ? j2 : timeUnit.toMillis(l2.longValue());
    }

    public static <T> T getOrDefault(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static java.lang.String getOrDefaultIfEmpty(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static java.lang.String getOrDefaultNullableIfEmpty(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> java.lang.String wrapToTag(T t) {
        return t == null ? "<null>" : t.toString().isEmpty() ? "<empty>" : t.toString();
    }
}
