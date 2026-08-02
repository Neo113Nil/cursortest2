package com.paypal.oslo.feature.subscriptions.details.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockSubscriptionsDetailsRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository_Factory create() {
        return com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository newInstance() {
        return new com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository_Factory();

        private InstanceHolder() {
        }
    }
}
