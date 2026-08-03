package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public abstract class e implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected final io.appmetrica.analytics.adrevenue.admob.v23.impl.b f3423a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3424b;

    public e(io.appmetrica.analytics.adrevenue.admob.v23.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3423a = bVar;
        this.f3424b = clientContext;
    }

    public final void a(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue moduleAdRevenue) {
        this.f3424b.getInternalClientModuleFacade().reportAdRevenue(moduleAdRevenue);
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final java.lang.String getDescription() {
        return "AdMob";
    }
}
