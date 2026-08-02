package com.paypal.oslo.feature.identity.sso.data.repository;

/* loaded from: classes13.dex */
public final class TokenToCodeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private TokenToCodeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl(apolloClient);
    }
}
