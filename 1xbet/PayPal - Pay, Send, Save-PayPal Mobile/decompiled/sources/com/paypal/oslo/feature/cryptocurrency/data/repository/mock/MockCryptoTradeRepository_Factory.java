package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

/* loaded from: classes12.dex */
public final class MockCryptoTradeRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository_Factory();

        private InstanceHolder() {
        }
    }
}
