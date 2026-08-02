package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockTransactionRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository_Factory create() {
        return com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository newInstance() {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository_Factory();

        private InstanceHolder() {
        }
    }
}
