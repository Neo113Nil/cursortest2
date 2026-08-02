package com.paypal.oslo.feature.identity.logout.data.repository;

/* loaded from: classes12.dex */
public final class LogoutRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private LogoutRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl(apolloClient);
    }
}
