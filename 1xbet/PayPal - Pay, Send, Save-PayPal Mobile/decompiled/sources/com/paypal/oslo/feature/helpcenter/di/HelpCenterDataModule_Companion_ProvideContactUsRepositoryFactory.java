package com.paypal.oslo.feature.helpcenter.di;

/* loaded from: classes5.dex */
public final class HelpCenterDataModule_Companion_ProvideContactUsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private HelpCenterDataModule_Companion_ProvideContactUsRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository get() {
        return provideContactUsRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideContactUsRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule_Companion_ProvideContactUsRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository provideContactUsRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.INSTANCE.provideContactUsRepository(apolloClient, coroutineDispatcher));
    }
}
