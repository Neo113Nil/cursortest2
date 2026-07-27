package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715o2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ma a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0362ab interfaceC0362ab) {
        return new Gh(new C0673mc(interfaceC0362ab, appMetricaConfig), new A0.r(13), appMetricaConfig.crashTransformer, new T9(context));
    }
}
