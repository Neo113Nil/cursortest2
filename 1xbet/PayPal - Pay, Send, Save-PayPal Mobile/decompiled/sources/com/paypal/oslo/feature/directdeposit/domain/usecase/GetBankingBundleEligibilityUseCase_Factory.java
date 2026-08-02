package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class GetBankingBundleEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> getHighSpeedVideoFpsRanges;

    private GetBankingBundleEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase newInstance(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase(bankingBundleEligibilityProvider);
    }
}
