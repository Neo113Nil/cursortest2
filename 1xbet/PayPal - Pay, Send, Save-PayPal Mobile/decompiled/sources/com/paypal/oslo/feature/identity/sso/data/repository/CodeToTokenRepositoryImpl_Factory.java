package com.paypal.oslo.feature.identity.sso.data.repository;

/* loaded from: classes13.dex */
public final class CodeToTokenRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private CodeToTokenRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl(apolloClient);
    }
}
