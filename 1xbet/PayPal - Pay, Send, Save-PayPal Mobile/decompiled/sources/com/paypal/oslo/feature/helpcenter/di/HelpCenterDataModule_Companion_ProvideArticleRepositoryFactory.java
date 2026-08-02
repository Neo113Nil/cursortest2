package com.paypal.oslo.feature.helpcenter.di;

/* loaded from: classes5.dex */
public final class HelpCenterDataModule_Companion_ProvideArticleRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private HelpCenterDataModule_Companion_ProvideArticleRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository get() {
        return provideArticleRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideArticleRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideArticleRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository provideArticleRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.INSTANCE.provideArticleRepository(apolloClient, coroutineDispatcher));
    }
}
