package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class SettingsUseCasesProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase> getOutputMinFrameDuration;

    private SettingsUseCasesProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase> provider8) {
        this.getOutputMinFrameDuration = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getOutputFormats = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getInputSizeshNQ4ISI = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase> provider8) {
        return new com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider newInstance(com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getSettingsUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getPaymentPreferencesUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase getDataAndPrivacyUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getNotificationPreferencesUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetHelpAndSupportUseCase getHelpAndSupportUseCase, com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase, com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase getAppVersionUseCase, com.paypal.oslo.feature.settings.domain.usecase.RefreshItemUseCase refreshItemUseCase) {
        return new com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider(getSettingsUseCase, getPaymentPreferencesUseCase, getDataAndPrivacyUseCase, getNotificationPreferencesUseCase, getHelpAndSupportUseCase, logoutUseCase, getAppVersionUseCase, refreshItemUseCase);
    }
}
