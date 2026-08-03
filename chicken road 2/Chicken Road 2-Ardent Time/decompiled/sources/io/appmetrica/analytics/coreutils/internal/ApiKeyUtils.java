package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class ApiKeyUtils {
    public static final io.appmetrica.analytics.coreutils.internal.ApiKeyUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.ApiKeyUtils();

    private ApiKeyUtils() {
    }

    public static final java.lang.String createPartialApiKey(java.lang.String str) {
        if (str == null || str.length() != 36) {
            return io.appmetrica.analytics.coreutils.internal.StringUtils.UNDEFINED;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }
}
