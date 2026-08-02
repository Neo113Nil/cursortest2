package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

/* loaded from: classes12.dex */
public final class MockCryptoQuoteRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository_Factory();

        private InstanceHolder() {
        }
    }
}
