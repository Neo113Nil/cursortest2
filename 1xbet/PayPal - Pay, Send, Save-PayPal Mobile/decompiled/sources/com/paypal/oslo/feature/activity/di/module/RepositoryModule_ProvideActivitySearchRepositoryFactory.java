package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class RepositoryModule_ProvideActivitySearchRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvideActivitySearchRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository get() {
        return provideActivitySearchRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivitySearchRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2) {
        return new com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivitySearchRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository provideActivitySearchRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        return (com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.RepositoryModule.INSTANCE.provideActivitySearchRepository(apolloClient, iActivityErrorMapper));
    }
}
