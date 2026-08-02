package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetPaymentPreferencesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighSpeedVideoSizes;

    private GetPaymentPreferencesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase newInstance(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase(iSettingsRepository, settingsStringsProvider, settingsDynamicConfiguration, featureGate);
    }
}
