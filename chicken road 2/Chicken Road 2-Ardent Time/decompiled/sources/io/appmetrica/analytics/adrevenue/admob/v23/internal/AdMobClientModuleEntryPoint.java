package io.appmetrica.analytics.adrevenue.admob.v23.internal;

/* loaded from: classes.dex */
public class AdMobClientModuleEntryPoint extends io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public java.lang.String getIdentifier() {
        return "ad-revenue-admob-v23";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.google.android.gms.ads.AdView")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new io.appmetrica.analytics.adrevenue.admob.v23.impl.a(new io.appmetrica.analytics.adrevenue.admob.v23.impl.b(), clientContext));
        }
    }
}
