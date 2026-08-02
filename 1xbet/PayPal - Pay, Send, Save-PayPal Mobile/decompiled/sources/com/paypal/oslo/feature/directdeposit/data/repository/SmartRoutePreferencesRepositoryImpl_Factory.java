package com.paypal.oslo.feature.directdeposit.data.repository;

/* loaded from: classes12.dex */
public final class SmartRoutePreferencesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private SmartRoutePreferencesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl(apolloClient);
    }
}
