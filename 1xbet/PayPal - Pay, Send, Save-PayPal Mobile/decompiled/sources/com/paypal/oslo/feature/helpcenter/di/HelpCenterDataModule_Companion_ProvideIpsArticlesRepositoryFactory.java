package com.paypal.oslo.feature.helpcenter.di;

/* loaded from: classes5.dex */
public final class HelpCenterDataModule_Companion_ProvideIpsArticlesRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private HelpCenterDataModule_Companion_ProvideIpsArticlesRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository get() {
        return provideIpsArticlesRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideIpsArticlesRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideIpsArticlesRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository provideIpsArticlesRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.INSTANCE.provideIpsArticlesRepository(apolloClient, coroutineDispatcher));
    }
}
