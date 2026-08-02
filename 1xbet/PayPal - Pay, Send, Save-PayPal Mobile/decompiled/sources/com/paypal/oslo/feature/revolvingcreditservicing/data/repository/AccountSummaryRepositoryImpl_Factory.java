package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class AccountSummaryRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> getHighSpeedVideoSizes;

    private AccountSummaryRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider3, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider3, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider5) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager dynamicConfigManager, javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl(apolloClient, dynamicConfigManager, provider, webEnvironmentProvider, featureGateManager);
    }
}
