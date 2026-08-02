package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class GetInstantBankConfirmationAggregatorUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository> getHighSpeedVideoSizes;

    private GetInstantBankConfirmationAggregatorUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository instantBankConfirmationRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase(instantBankConfirmationRepository);
    }
}
