package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmBankAccountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private ConfirmBankAccountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel(confirmBankAccountUseCase);
    }
}
