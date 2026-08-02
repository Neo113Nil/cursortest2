package com.paypal.oslo.feature.smartroute.data.repository;

/* loaded from: classes15.dex */
public final class GraphQLDistributionRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private GraphQLDistributionRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository(apolloClient);
    }
}
