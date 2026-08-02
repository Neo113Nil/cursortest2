package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetSavingsHubDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> getHighSpeedVideoFpsRangesFor;

    private GetSavingsHubDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> provider3) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase(savingsRepository, savingsFeatureManager, currencyHandlerImpl);
    }
}
