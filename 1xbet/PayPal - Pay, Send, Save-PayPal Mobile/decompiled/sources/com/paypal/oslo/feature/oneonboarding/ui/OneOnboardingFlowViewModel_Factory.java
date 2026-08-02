package com.paypal.oslo.feature.oneonboarding.ui;

/* loaded from: classes13.dex */
public final class OneOnboardingFlowViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private OneOnboardingFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel newInstance(com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase getFlowUseCase, com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher imagePrefetcher) {
        return new com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel(getFlowUseCase, imagePrefetcher);
    }
}
