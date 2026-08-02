package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetDebitCardEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> getHighResolutionOutputSizeshNQ4ISI;

    private GetDebitCardEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase newInstance(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase(bankingBundleEligibilityProvider);
    }
}
