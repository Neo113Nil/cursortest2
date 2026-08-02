package com.paypal.oslo.feature.taptopay.data.payair.replenishment;

/* loaded from: classes15.dex */
public final class PayairCardPaymentKeysReplenisher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> {
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.payair.logic.managers.PaymentManager> getHighSpeedVideoSizes;

    private PayairCardPaymentKeysReplenisher_Factory(dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager> provider2, dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher_Factory create(dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager> provider2, dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher newInstance(com.payair.logic.managers.PaymentManager paymentManager, com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager payairWorkManager, com.payair.logic.managers.TokenManager tokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher(paymentManager, payairWorkManager, tokenManager, coroutineDispatcher);
    }
}
