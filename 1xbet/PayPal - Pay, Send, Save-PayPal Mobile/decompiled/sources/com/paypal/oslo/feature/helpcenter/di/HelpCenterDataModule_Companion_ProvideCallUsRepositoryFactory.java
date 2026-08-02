package com.paypal.oslo.feature.helpcenter.di;

/* loaded from: classes5.dex */
public final class HelpCenterDataModule_Companion_ProvideCallUsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private HelpCenterDataModule_Companion_ProvideCallUsRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository get() {
        return provideCallUsRepository(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideCallUsRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideCallUsRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository provideCallUsRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.INSTANCE.provideCallUsRepository(apolloClient, coroutineDispatcher));
    }
}
