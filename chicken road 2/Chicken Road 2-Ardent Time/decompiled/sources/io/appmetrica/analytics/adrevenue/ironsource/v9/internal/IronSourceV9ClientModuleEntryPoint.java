package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

/* loaded from: classes.dex */
public class IronSourceV9ClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3438a = null;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f3439b = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector getAdRevenueCollector() {
        return new io.appmetrica.analytics.adrevenue.ironsource.v9.internal.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return "ad-revenue-ironsource-v9";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3438a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext;
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.unity3d.mediation.LevelPlay") || (clientContext = this.f3438a) == null) {
            return;
        }
        com.unity3d.mediation.LevelPlay.addImpressionDataListener(new io.appmetrica.analytics.adrevenue.ironsource.v9.impl.c(clientContext));
        this.f3439b.set(true);
    }
}
