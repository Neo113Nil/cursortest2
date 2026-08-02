package com.paypal.oslo.feature.taptopay.data.repository.payair;

/* loaded from: classes15.dex */
public final class PayairPaymentManagerRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl> {
    private final dagger.internal.Provider<com.payair.logic.managers.PaymentManager> getHighSpeedVideoFpsRanges;

    private PayairPaymentManagerRepositoryImpl_Factory(dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl_Factory create(dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl newInstance(com.payair.logic.managers.PaymentManager paymentManager) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentManagerRepositoryImpl(paymentManager);
    }
}
