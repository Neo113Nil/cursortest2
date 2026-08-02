package com.paypal.oslo.feature.smartroute.data.repository;

/* loaded from: classes15.dex */
public final class GraphQLAutoReloadRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private GraphQLAutoReloadRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository(apolloClient);
    }
}
