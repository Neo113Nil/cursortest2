package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetHelpAndSupportUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighSpeedVideoSizes;

    private GetHelpAndSupportUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase newInstance(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase(iSettingsRepository, settingsStringsProvider, settingsDynamicConfiguration);
    }
}
