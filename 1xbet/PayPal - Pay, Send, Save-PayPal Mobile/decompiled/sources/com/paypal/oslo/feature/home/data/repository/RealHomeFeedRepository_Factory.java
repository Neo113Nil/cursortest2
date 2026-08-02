package com.paypal.oslo.feature.home.data.repository;

/* loaded from: classes12.dex */
public final class RealHomeFeedRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> getHighSpeedVideoSizes;

    private RealHomeFeedRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider5) {
        return new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper accountSnapshotMapper, com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository(apolloClient, homeFeedMapper, homeConfigManager, accountSnapshotMapper, stringProvider);
    }
}
