package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530m6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f6391a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fh f6392b;

    public C0530m6(io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.impl.D8 d8, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        this.f6391a = c0801wi;
        this.f6392b = new io.appmetrica.analytics.impl.Fh(bf, new io.appmetrica.analytics.internal.CounterConfiguration(appMetricaConfig, io.appmetrica.analytics.internal.CounterConfigurationReporterType.CRASH), d8, appMetricaConfig.userProfileID);
    }

    public final io.appmetrica.analytics.impl.Fh a() {
        return this.f6392b;
    }
}
