package io.appmetrica.analytics.adrevenue.fyber.v3.internal;

/* loaded from: classes.dex */
public class FyberClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return "ad-revenue-fyber-v3";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.fyber.fairbid.ads.Interstitial")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new io.appmetrica.analytics.adrevenue.fyber.v3.impl.c(new io.appmetrica.analytics.adrevenue.fyber.v3.impl.b(), clientContext));
        }
    }
}
