package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class GetExternalBankAccountsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> getHighSpeedVideoFpsRanges;

    private GetExternalBankAccountsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase(externalBankAccessRepository);
    }
}
