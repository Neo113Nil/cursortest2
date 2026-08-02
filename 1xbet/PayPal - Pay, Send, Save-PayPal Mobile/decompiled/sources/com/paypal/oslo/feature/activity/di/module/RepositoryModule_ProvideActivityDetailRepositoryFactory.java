package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class RepositoryModule_ProvideActivityDetailRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideActivityDetailRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository get() {
        return provideActivityDetailRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityDetailRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider3) {
        return new com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityDetailRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository provideActivityDetailRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return (com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.RepositoryModule.INSTANCE.provideActivityDetailRepository(apolloClient, iActivityErrorMapper, activityFeatureManager));
    }
}
