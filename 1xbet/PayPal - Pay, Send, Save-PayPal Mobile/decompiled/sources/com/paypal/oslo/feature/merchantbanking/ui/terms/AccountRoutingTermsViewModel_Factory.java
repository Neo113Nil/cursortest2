package com.paypal.oslo.feature.merchantbanking.ui.terms;

/* loaded from: classes13.dex */
public final class AccountRoutingTermsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> getHighSpeedVideoFpsRanges;

    private AccountRoutingTermsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase> provider2) {
        return new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel newInstance(com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase, com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase enrollForAccountRoutingNumbersUseCase) {
        return new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel(checkAccountRoutingEligibilityUseCase, enrollForAccountRoutingNumbersUseCase);
    }
}
