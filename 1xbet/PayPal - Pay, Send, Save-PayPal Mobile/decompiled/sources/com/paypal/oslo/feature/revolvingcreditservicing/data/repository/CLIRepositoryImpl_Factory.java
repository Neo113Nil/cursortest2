package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class CLIRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CLIRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl(apolloClient);
    }
}
