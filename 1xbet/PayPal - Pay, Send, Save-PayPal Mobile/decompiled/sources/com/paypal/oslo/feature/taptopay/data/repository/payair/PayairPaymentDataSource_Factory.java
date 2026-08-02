package com.paypal.oslo.feature.taptopay.data.repository.payair;

/* loaded from: classes15.dex */
public final class PayairPaymentDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
