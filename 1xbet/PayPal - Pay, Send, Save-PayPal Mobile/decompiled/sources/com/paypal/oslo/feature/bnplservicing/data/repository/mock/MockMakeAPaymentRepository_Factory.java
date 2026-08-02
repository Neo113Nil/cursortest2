package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockMakeAPaymentRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository_Factory();

        private InstanceHolder() {
        }
    }
}
