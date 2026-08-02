package com.paypal.oslo.feature.xoom.ui.interstitial;

/* loaded from: classes16.dex */
public final class InterstitialViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> getHighSpeedVideoSizes;

    private InterstitialViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> provider2) {
        return new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel newInstance(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialReducer interstitialReducer, com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase setUserAgreementAcceptedUseCase) {
        return new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel(interstitialReducer, setUserAgreementAcceptedUseCase);
    }
}
