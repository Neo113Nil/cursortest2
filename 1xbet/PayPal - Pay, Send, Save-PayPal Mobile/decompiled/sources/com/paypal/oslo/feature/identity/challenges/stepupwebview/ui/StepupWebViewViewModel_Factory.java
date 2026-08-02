package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

/* loaded from: classes12.dex */
public final class StepupWebViewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewReducer> getHighSpeedVideoSizes;

    private StepupWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel newInstance(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewReducer stepupWebViewReducer, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel(stepupWebViewReducer, identityTokenStorage);
    }
}
