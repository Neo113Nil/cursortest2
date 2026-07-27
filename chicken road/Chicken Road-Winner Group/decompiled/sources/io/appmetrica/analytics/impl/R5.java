package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* loaded from: classes.dex */
public final class R5 implements Q5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0744p5 f6494a;

    public R5(C0744p5 c0744p5) {
        this.f6494a = c0744p5;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C0744p5 getAdRevenueProcessorsHolder() {
        return this.f6494a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f6494a;
    }
}
