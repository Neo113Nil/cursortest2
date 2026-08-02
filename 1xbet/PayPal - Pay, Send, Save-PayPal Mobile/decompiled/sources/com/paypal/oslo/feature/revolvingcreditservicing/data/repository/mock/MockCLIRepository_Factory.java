package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockCLIRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository_Factory();

        private InstanceHolder() {
        }
    }
}
