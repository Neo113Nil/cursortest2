package io.appmetrica.analytics.modulesapi.internal.client;

/* loaded from: classes.dex */
public abstract class ModuleClientEntryPoint<T> {
    public io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector getAdRevenueCollector() {
        return null;
    }

    public abstract java.lang.String getIdentifier();

    public io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration<T> getServiceConfigExtensionConfiguration() {
        return null;
    }

    public void initClientSide(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
    }

    public void onActivated() {
    }
}
