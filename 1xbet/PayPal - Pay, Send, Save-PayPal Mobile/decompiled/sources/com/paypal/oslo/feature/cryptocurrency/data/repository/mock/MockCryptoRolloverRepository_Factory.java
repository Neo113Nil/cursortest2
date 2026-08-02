package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

/* loaded from: classes12.dex */
public final class MockCryptoRolloverRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository_Factory();

        private InstanceHolder() {
        }
    }
}
