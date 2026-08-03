package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

/* loaded from: classes.dex */
public final class a implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint f3435a;

    public a(io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        this.f3435a = ironSourceClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = this.f3435a.f3434b;
        return atomicBoolean.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final java.lang.String getSourceIdentifier() {
        return "ironsource";
    }
}
