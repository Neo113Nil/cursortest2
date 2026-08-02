package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockCheckoutUrlRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCheckoutUrlRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
