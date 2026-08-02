package com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank;

/* loaded from: classes15.dex */
public final class AddBankManualUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository> getHighSpeedVideoFpsRangesFor;

    private AddBankManualUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository addBankManualRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase(addBankManualRepository);
    }
}
