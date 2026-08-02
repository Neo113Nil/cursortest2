package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetAccountSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> getHighSpeedVideoSizes;

    private GetAccountSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider5) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase newInstance(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase(iSettingsRepository, settingsStringsProvider, settingsDynamicConfiguration, formatAddressUseCase, nameFormatUseCase);
    }
}
