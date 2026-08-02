package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository;

/* loaded from: classes15.dex */
public final class BusinessesHubRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private BusinessesHubRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl(lazy);
    }
}
