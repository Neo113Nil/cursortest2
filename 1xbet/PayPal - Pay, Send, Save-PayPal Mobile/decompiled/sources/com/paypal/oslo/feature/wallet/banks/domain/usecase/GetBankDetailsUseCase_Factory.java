package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class GetBankDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository> Camera2StreamConfigurationMap;

    private GetBankDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository bankDetailsRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase(bankDetailsRepository);
    }
}
