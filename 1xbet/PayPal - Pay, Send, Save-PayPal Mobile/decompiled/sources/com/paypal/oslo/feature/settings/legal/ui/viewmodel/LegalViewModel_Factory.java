package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

/* loaded from: classes14.dex */
public final class LegalViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer> getHighSpeedVideoSizes;

    private LegalViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer> provider4) {
        return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel newInstance(com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase getLegalScreenItemsUseCase, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer legalReducer) {
        return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel(getLegalScreenItemsUseCase, settingsStringsProvider, appNavigator, legalReducer);
    }
}
