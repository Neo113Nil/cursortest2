package com.paypal.oslo.feature.publicprofile.data.repository;

/* loaded from: classes13.dex */
public final class PublicProfileRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private PublicProfileRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl(apolloClient);
    }
}
