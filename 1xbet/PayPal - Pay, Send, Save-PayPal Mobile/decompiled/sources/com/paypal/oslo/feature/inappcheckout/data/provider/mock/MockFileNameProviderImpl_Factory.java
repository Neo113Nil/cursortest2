package com.paypal.oslo.feature.inappcheckout.data.provider.mock;

/* loaded from: classes13.dex */
public final class MockFileNameProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.data.provider.mock.MockFileNameProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
