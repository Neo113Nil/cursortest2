package com.paypal.oslo.feature.activity.data.repository.detail;

/* loaded from: classes10.dex */
public final class ActivityTransactionDetailRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoSizes;

    private ActivityTransactionDetailRepositoryImpl_Factory(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl_Factory create(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider4) {
        return new com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl newInstance(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl(coroutineDispatcher, apolloClient, iActivityErrorMapper, activityFeatureManager);
    }
}
