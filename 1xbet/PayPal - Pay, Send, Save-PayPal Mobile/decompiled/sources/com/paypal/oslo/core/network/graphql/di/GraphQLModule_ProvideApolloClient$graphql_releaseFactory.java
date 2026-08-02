package com.paypal.oslo.core.network.graphql.di;

/* loaded from: classes4.dex */
public final class GraphQLModule_ProvideApolloClient$graphql_releaseFactory implements dagger.internal.Factory<com.apollographql.apollo.ApolloClient> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider> getHighSpeedVideoSizes;

    private GraphQLModule_ProvideApolloClient$graphql_releaseFactory(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.ApolloClient get() {
        return provideApolloClient$graphql_release(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideApolloClient$graphql_releaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider> provider) {
        return new com.paypal.oslo.core.network.graphql.di.GraphQLModule_ProvideApolloClient$graphql_releaseFactory(provider);
    }

    public static com.apollographql.apollo.ApolloClient provideApolloClient$graphql_release(com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider dynamicApolloClientProvider) {
        return (com.apollographql.apollo.ApolloClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.graphql.di.GraphQLModule.INSTANCE.provideApolloClient$graphql_release(dynamicApolloClientProvider));
    }
}
