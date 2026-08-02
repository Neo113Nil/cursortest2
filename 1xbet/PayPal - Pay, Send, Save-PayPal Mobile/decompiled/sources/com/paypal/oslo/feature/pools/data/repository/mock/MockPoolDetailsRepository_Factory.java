package com.paypal.oslo.feature.pools.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockPoolDetailsRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository_Factory create() {
        return com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository newInstance() {
        return new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository_Factory();

        private InstanceHolder() {
        }
    }
}
