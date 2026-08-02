package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetFinancialInstrumentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase> getHighSpeedVideoFpsRangesFor;

    private GetFinancialInstrumentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase> provider2) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase newInstance(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase getSavingsBalanceUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase(getSavingsBalanceUseCase, getDepositOptionsUseCase);
    }
}
