package io.appmetrica.analytics.modulesapi.internal.client;

/* loaded from: classes.dex */
public abstract class ServiceConfigExtensionConfiguration<T> {
    public abstract io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter<T> getBundleConverter();

    public abstract io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener<T> getServiceConfigUpdateListener();
}
