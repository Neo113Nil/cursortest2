package com.paypal.oslo.feature.savings.data.repository;

/* loaded from: classes14.dex */
public final class SavingsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient> getHighSpeedVideoFpsRanges;

    private SavingsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.manager.SavingsFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> provider3) {
        return new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl newInstance(com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl) {
        return new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl(savingsApolloClient, savingsFeatureManager, currencyHandlerImpl);
    }
}
