package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetNotificationPreferencesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighSpeedVideoSizes;

    private GetNotificationPreferencesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider4) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase newInstance(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase(iSettingsRepository, settingsStringsProvider, settingsDynamicConfiguration, remoteConfigConfig);
    }
}
