package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockBusinessesHubRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository_Factory create() {
        return com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository newInstance() {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock.MockBusinessesHubRepository_Factory();

        private InstanceHolder() {
        }
    }
}
