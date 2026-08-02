package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class InitiateExternalBankAccessUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> getHighSpeedVideoFpsRangesFor;

    private InitiateExternalBankAccessUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase(externalBankAccessRepository);
    }
}
