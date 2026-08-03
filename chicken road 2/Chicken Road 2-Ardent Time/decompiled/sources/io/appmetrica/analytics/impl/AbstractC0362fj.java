package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0362fj {
    public static void a(java.lang.String str, java.lang.Object... objArr) {
        io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica-Attribution", java.lang.String.format(str, objArr), new java.lang.Object[0]);
    }

    public static java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(io.appmetrica.analytics.BuildConfig.SDK_BUILD_FLAVOR);
        if (!android.text.TextUtils.isEmpty(io.appmetrica.analytics.BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!android.text.TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }
}
