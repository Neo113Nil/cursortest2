package com.paypal.oslo.feature.activity.data.repository.common;

/* loaded from: classes10.dex */
public final class ActivityActionsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private ActivityActionsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider4) {
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl(apolloClient, iActivityErrorMapper, coroutineDispatcher, activityFeatureManager);
    }
}
