package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

/* loaded from: classes15.dex */
public final class ChooseAccountsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase> getHighSpeedVideoFpsRangesFor;

    private ChooseAccountsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase getExternalBankAccountsUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase linkExternalBankAccountsUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel(getExternalBankAccountsUseCase, linkExternalBankAccountsUseCase);
    }
}
