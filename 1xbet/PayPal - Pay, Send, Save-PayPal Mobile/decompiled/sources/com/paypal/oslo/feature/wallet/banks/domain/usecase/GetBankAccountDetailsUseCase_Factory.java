package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class GetBankAccountDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> getHighSpeedVideoSizes;

    private GetBankAccountDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository bankAccountDetailsRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase(bankAccountDetailsRepository);
    }
}
