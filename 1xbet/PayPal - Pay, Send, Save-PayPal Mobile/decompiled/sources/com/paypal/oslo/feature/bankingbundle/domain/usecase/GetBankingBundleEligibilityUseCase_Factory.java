package com.paypal.oslo.feature.bankingbundle.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBankingBundleEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetBankingBundleEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> provider) {
        return new com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase newInstance(com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bankingBundleRepository) {
        return new com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase(bankingBundleRepository);
    }
}
