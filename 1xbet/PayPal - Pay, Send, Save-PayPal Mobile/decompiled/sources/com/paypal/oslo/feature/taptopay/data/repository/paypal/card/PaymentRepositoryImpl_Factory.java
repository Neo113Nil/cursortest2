package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

/* loaded from: classes15.dex */
public final class PaymentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.PaymentRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
