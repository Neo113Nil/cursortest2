package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class GetOpenBankingAggregatorUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository> getHighSpeedVideoFpsRangesFor;

    private GetOpenBankingAggregatorUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository openBankingAggregatorRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase(openBankingAggregatorRepository);
    }
}
