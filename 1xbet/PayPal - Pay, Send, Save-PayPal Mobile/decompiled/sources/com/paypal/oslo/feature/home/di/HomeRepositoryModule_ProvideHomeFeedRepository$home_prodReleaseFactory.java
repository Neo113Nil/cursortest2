package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class HomeRepositoryModule_ProvideHomeFeedRepository$home_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighSpeedVideoSizesFor;

    private HomeRepositoryModule_ProvideHomeFeedRepository$home_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository get() {
        return provideHomeFeedRepository$home_prodRelease(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.di.HomeRepositoryModule_ProvideHomeFeedRepository$home_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> provider6) {
        return new com.paypal.oslo.feature.home.di.HomeRepositoryModule_ProvideHomeFeedRepository$home_prodReleaseFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository provideHomeFeedRepository$home_prodRelease(com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper accountSnapshotMapper, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator) {
        return (com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.HomeRepositoryModule.INSTANCE.provideHomeFeedRepository$home_prodRelease(homeConfigManager, apolloClient, homeFeedMapper, accountSnapshotMapper, stringProvider, demoErrorSimulator));
    }
}
