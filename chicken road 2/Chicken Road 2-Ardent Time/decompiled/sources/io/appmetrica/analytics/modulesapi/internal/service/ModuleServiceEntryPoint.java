package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public abstract class ModuleServiceEntryPoint<T> {
    public io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider getClientConfigProvider() {
        return null;
    }

    public abstract java.lang.String getIdentifier();

    public io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension getLocationServiceExtension() {
        return null;
    }

    public io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return null;
    }

    public io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase getModuleServicesDatabase() {
        return null;
    }

    public io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<T> getRemoteConfigExtensionConfiguration() {
        return null;
    }

    public void initServiceSide(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig<T> moduleRemoteConfig) {
    }
}
