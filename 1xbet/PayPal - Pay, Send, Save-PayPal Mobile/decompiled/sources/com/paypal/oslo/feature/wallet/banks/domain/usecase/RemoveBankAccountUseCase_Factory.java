package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class RemoveBankAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository> getHighSpeedVideoFpsRangesFor;

    private RemoveBankAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository removeBankAccountRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase(removeBankAccountRepository);
    }
}
