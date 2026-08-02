package com.paypal.oslo.core.remoteconfig.di;

/* loaded from: classes5.dex */
public final class RemoteConfigModule_ProvideDynamicConfigurationFactory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration get() {
        return provideDynamicConfiguration();
    }

    public static com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideDynamicConfigurationFactory create() {
        return com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideDynamicConfigurationFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration provideDynamicConfiguration() {
        return (com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule.INSTANCE.provideDynamicConfiguration());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideDynamicConfigurationFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideDynamicConfigurationFactory();

        private InstanceHolder() {
        }
    }
}
