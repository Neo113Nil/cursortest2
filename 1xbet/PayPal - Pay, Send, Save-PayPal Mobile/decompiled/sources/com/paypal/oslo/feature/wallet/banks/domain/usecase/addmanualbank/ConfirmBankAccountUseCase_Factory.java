package com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank;

/* loaded from: classes15.dex */
public final class ConfirmBankAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ConfirmBankAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository confirmBankAccountRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase(confirmBankAccountRepository);
    }
}
