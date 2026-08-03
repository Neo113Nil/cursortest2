package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class K5 implements io.appmetrica.analytics.impl.J5 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0426i5 f4534a;

    public K5(io.appmetrica.analytics.impl.C0426i5 c0426i5) {
        this.f4534a = c0426i5;
    }

    @Override // io.appmetrica.analytics.impl.J5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final io.appmetrica.analytics.impl.C0426i5 getAdRevenueProcessorsHolder() {
        return this.f4534a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f4534a;
    }
}
