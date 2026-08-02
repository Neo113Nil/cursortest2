package com.paypal.oslo.feature.bankingbundle.ui;

/* loaded from: classes11.dex */
public final class BankingBundleFlowViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private BankingBundleFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel newInstance(com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel(getBankingBundleEligibilityUseCase, userStore);
    }
}
