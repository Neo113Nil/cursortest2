package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M1 {
    public final android.content.Intent a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) io.appmetrica.analytics.internal.AppMetricaService.class);
        intent.setAction(str);
        return intent;
    }
}
