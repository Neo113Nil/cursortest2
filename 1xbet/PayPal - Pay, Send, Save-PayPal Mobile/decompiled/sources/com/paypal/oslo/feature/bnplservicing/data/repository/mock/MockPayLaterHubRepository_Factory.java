package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockPayLaterHubRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository_Factory();

        private InstanceHolder() {
        }
    }
}
