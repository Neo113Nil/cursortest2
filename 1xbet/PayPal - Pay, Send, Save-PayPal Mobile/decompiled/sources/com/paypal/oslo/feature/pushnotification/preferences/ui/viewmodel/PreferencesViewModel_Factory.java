package com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel;

/* loaded from: classes13.dex */
public final class PreferencesViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase> getHighSpeedVideoFpsRanges;

    private PreferencesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase> provider2) {
        return new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel newInstance(com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase getPreferencesUseCase, com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase updatePreferencesUseCase) {
        return new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel(getPreferencesUseCase, updatePreferencesUseCase);
    }
}
