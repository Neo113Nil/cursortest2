package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class FetchAndUpdateForPlaidUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> getHighResolutionOutputSizeshNQ4ISI;

    private FetchAndUpdateForPlaidUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase(externalBankAccessRepository);
    }
}
