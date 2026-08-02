package com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair;

/* loaded from: classes15.dex */
public final class PayairReplenishPaymentKeysUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private PayairReplenishPaymentKeysUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository payairPaymentManagerRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase(payairPaymentManagerRepository, coroutineDispatcher);
    }
}
