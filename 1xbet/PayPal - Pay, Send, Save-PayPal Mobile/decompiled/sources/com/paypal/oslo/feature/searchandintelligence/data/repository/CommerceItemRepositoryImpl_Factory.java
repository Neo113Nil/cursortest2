package com.paypal.oslo.feature.searchandintelligence.data.repository;

/* loaded from: classes14.dex */
public final class CommerceItemRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private CommerceItemRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl(apolloClient);
    }
}
