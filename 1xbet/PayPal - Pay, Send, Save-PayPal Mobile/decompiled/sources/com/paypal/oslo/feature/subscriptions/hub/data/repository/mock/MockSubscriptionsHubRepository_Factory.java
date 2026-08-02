package com.paypal.oslo.feature.subscriptions.hub.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockSubscriptionsHubRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository_Factory create() {
        return com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository newInstance() {
        return new com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.subscriptions.hub.data.repository.mock.MockSubscriptionsHubRepository_Factory();

        private InstanceHolder() {
        }
    }
}
