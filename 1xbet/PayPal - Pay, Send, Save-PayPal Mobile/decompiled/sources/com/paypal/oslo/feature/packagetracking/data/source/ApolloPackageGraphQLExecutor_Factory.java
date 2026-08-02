package com.paypal.oslo.feature.packagetracking.data.source;

/* loaded from: classes13.dex */
public final class ApolloPackageGraphQLExecutor_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private ApolloPackageGraphQLExecutor_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor(apolloClient);
    }
}
