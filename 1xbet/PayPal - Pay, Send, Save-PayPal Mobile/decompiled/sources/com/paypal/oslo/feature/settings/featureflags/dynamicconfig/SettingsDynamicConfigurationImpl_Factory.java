package com.paypal.oslo.feature.settings.featureflags.dynamicconfig;

/* loaded from: classes14.dex */
public final class SettingsDynamicConfigurationImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private SettingsDynamicConfigurationImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl(dynamicConfiguration);
    }
}
