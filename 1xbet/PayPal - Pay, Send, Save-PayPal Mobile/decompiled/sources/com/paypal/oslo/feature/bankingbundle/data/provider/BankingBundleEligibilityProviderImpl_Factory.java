package com.paypal.oslo.feature.bankingbundle.data.provider;

/* loaded from: classes11.dex */
public final class BankingBundleEligibilityProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> getHighSpeedVideoFpsRanges;

    private BankingBundleEligibilityProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository> provider) {
        return new com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl newInstance(com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bankingBundleRepository) {
        return new com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl(bankingBundleRepository);
    }
}
