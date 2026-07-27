package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673mc extends Yn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f7858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0673mc(InterfaceC0362ab interfaceC0362ab, AppMetricaConfig appMetricaConfig) {
        super(interfaceC0362ab);
        String str = appMetricaConfig.apiKey;
        this.f7858b = appMetricaConfig;
    }

    public final InterfaceC0388bb a() {
        return this.f6881a.a().a(this.f7858b);
    }
}
