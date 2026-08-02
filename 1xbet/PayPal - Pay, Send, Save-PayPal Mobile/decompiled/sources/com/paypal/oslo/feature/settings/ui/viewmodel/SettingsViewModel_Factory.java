package com.paypal.oslo.feature.settings.ui.viewmodel;

/* loaded from: classes14.dex */
public final class SettingsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getOutputMinFrameDuration;

    private SettingsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider6, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider7, dagger.internal.Provider<com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer> provider8) {
        this.getInputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getOutputFormats = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider6, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider7, dagger.internal.Provider<com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer> provider8) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel newInstance(com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider settingsUseCasesProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig settingsFeatureGateConfig, com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.settings.ui.mvi.reducer.SettingsReducer settingsReducer) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel(settingsUseCasesProvider, settingsDynamicConfiguration, settingsFeatureGateConfig, getAccountSettingsUseCase, settingsStringsProvider, identityManagement, webEnvironmentProvider, settingsReducer);
    }
}
