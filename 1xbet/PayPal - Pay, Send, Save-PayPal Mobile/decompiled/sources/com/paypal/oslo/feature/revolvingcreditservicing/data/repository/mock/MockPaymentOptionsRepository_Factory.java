package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockPaymentOptionsRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository_Factory();

        private InstanceHolder() {
        }
    }
}
