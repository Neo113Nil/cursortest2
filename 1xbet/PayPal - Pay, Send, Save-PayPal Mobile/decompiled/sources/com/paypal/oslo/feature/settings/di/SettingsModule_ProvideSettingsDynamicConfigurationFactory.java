package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideSettingsDynamicConfigurationFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoSizes;

    private SettingsModule_ProvideSettingsDynamicConfigurationFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration get() {
        return provideSettingsDynamicConfiguration(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsDynamicConfigurationFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsDynamicConfigurationFactory(provider);
    }

    public static com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration provideSettingsDynamicConfiguration(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideSettingsDynamicConfiguration(dynamicConfiguration));
    }
}
