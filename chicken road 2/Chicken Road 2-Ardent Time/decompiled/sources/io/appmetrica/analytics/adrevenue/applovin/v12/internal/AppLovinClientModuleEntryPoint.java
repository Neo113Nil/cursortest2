package io.appmetrica.analytics.adrevenue.applovin.v12.internal;

/* loaded from: classes.dex */
public final class AppLovinClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3427a = "ad-revenue-applovin-v12";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return this.f3427a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.applovin.sdk.AppLovinSdk")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new io.appmetrica.analytics.adrevenue.applovin.v12.impl.b(new io.appmetrica.analytics.adrevenue.applovin.v12.impl.a(), clientContext));
        }
    }
}
