package com.paypal.oslo.feature.paymentauth.domain;

/* loaded from: classes13.dex */
public final class PaymentAuthService_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService_Factory create() {
        return com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService newInstance() {
        return new com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.paymentauth.domain.PaymentAuthService_Factory();

        private InstanceHolder() {
        }
    }
}
