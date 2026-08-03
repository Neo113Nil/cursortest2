package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

/* loaded from: classes.dex */
public class IronSourceClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3433a = null;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f3434b = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector getAdRevenueCollector() {
        return new io.appmetrica.analytics.adrevenue.ironsource.v7.internal.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return "ad-revenue-ironsource-v7";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3433a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext;
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.ironsource.mediationsdk.IronSource") || (clientContext = this.f3433a) == null) {
            return;
        }
        com.ironsource.mediationsdk.IronSource.addImpressionDataListener(new io.appmetrica.analytics.adrevenue.ironsource.v7.impl.c(clientContext));
        this.f3434b.set(true);
    }
}
