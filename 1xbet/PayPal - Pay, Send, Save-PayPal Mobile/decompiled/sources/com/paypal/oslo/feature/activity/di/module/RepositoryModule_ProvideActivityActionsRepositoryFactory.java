package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class RepositoryModule_ProvideActivityActionsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideActivityActionsRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository get() {
        return provideActivityActionsRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityActionsRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider3) {
        return new com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityActionsRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository provideActivityActionsRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return (com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.RepositoryModule.INSTANCE.provideActivityActionsRepository(apolloClient, iActivityErrorMapper, activityFeatureManager));
    }
}
