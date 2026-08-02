package com.paypal.oslo.feature.activity.data.repository.search;

/* loaded from: classes10.dex */
public final class ActivitySearchRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private ActivitySearchRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl(apolloClient, iActivityErrorMapper, coroutineDispatcher);
    }
}
