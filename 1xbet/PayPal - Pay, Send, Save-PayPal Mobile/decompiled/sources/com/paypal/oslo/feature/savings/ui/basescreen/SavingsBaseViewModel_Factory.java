package com.paypal.oslo.feature.savings.ui.basescreen;

/* loaded from: classes14.dex */
public final class SavingsBaseViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> getHighSpeedVideoSizes;

    private SavingsBaseViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider4) {
        return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase getSavingsAccountUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase getSavingsAccountEligibilityUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getSavingsLandingPageDataUseCase, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager) {
        return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel(getSavingsAccountUseCase, getSavingsAccountEligibilityUseCase, getSavingsLandingPageDataUseCase, savingsFeatureManager);
    }
}
