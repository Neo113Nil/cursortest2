package com.paypal.oslo.feature.subscriptions.details.data.repository;

/* loaded from: classes15.dex */
public final class SubscriptionDetailsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private SubscriptionDetailsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl(lazy);
    }
}
