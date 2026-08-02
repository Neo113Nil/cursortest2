package com.paypal.oslo.feature.balance.data.repository.nba;

/* loaded from: classes11.dex */
public final class NbaRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private NbaRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl(apolloClient);
    }
}
