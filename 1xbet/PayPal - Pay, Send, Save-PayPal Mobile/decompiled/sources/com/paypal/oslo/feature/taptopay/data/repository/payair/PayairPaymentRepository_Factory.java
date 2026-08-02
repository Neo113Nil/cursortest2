package com.paypal.oslo.feature.taptopay.data.repository.payair;

/* loaded from: classes15.dex */
public final class PayairPaymentRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository> {
    private final dagger.internal.Provider<com.payair.logic.managers.PaymentServiceManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private PayairPaymentRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.payair.logic.managers.PaymentServiceManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.payair.logic.managers.PaymentServiceManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository newInstance(android.content.Context context, com.payair.logic.managers.PaymentServiceManager paymentServiceManager, com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource payairPaymentDataSource) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository(context, paymentServiceManager, payairPaymentDataSource);
    }
}
