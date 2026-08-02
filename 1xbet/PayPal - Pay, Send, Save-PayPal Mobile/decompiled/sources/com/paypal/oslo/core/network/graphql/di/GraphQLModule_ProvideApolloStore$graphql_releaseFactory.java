package com.paypal.oslo.core.network.graphql.di;

/* loaded from: classes4.dex */
public final class GraphQLModule_ProvideApolloStore$graphql_releaseFactory implements dagger.internal.Factory<com.apollographql.apollo.cache.normalized.ApolloStore> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> getHighSpeedVideoSizes;

    private GraphQLModule_ProvideApolloStore$graphql_releaseFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.cache.normalized.ApolloStore get() {
        return provideApolloStore$graphql_release(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideApolloStore$graphql_releaseFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> provider3) {
        return new com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideApolloStore$graphql_releaseFactory(provider, provider2, provider3);
    }

    public static com.apollographql.apollo.cache.normalized.ApolloStore provideApolloStore$graphql_release(android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, com.paypal.oslo.core.network.graphql.ApolloStoreFactory apolloStoreFactory) {
        return (com.apollographql.apollo.cache.normalized.ApolloStore) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.graphql.di.GraphQLModule.INSTANCE.provideApolloStore$graphql_release(context, graphQlConfig, apolloStoreFactory));
    }
}
