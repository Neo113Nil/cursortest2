package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

/* loaded from: classes14.dex */
public final class CloseYourAccountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer> getHighSpeedVideoSizes;

    private CloseYourAccountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer> provider3) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer closeAccountReducer) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel(closeAccountUseCasesProvider, settingsStringsProvider, closeAccountReducer);
    }
}
