package com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank;

/* loaded from: classes15.dex */
public final class GetBankDefinitionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository> Camera2StreamConfigurationMap;

    private GetBankDefinitionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository bankDefinitionsRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase(bankDefinitionsRepository);
    }
}
