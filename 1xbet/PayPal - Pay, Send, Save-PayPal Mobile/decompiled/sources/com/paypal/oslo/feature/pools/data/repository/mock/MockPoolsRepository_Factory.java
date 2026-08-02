package com.paypal.oslo.feature.pools.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockPoolsRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository_Factory create() {
        return com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository newInstance() {
        return new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolsRepository_Factory();

        private InstanceHolder() {
        }
    }
}
