package com.paypal.oslo.feature.pools.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockCreatePoolRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository_Factory create() {
        return com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository newInstance() {
        return new com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pools.data.repository.mock.MockCreatePoolRepository_Factory();

        private InstanceHolder() {
        }
    }
}
