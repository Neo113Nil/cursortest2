package com.paypal.oslo.feature.searchandintelligence.data.repository;

/* loaded from: classes14.dex */
public final class StartersRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private StartersRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl(apolloClient);
    }
}
