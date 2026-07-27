package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822mc extends Yn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f8785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0822mc(InterfaceC0511ab interfaceC0511ab, AppMetricaConfig appMetricaConfig) {
        super(interfaceC0511ab);
        String str = appMetricaConfig.apiKey;
        this.f8785b = appMetricaConfig;
    }

    public final InterfaceC0537bb a() {
        return this.f7759a.a().a(this.f8785b);
    }
}
