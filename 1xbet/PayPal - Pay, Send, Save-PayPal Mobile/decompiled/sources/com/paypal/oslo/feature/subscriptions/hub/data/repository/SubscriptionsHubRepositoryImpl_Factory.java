package com.paypal.oslo.feature.subscriptions.hub.data.repository;

/* loaded from: classes15.dex */
public final class SubscriptionsHubRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private SubscriptionsHubRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl(lazy);
    }
}
