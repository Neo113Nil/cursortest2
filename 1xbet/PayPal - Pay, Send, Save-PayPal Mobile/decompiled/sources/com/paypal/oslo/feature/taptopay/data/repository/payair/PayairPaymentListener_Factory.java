package com.paypal.oslo.feature.taptopay.data.repository.payair;

/* loaded from: classes15.dex */
public final class PayairPaymentListener_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.payair.logic.managers.PaymentManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> getHighSpeedVideoSizes;

    private PayairPaymentListener_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> provider, dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider2, dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> provider, dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider2, dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener newInstance(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource payairPaymentDataSource, com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.PaymentManager paymentManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener(payairPaymentDataSource, tokenManager, paymentManager, coroutineDispatcher);
    }
}
