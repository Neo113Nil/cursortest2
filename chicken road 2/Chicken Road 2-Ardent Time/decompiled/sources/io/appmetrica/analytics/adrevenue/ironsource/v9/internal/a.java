package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

/* loaded from: classes.dex */
public final class a implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint f3440a;

    public a(io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint ironSourceV9ClientModuleEntryPoint) {
        this.f3440a = ironSourceV9ClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = this.f3440a.f3439b;
        return atomicBoolean.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final java.lang.String getSourceIdentifier() {
        return "ironsource";
    }
}
