package com.paypal.oslo.feature.userprofile.data.repository;

/* loaded from: classes15.dex */
public final class PhotoRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.api.DmsApiService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getInputSizeshNQ4ISI;

    private PhotoRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.api.DmsApiService> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.api.DmsApiService> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        return new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl newInstance(android.content.Context context, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.userprofile.data.api.DmsApiService dmsApiService, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl(context, apolloClient, dmsApiService, userStore, tokenProvider, coroutineDispatcher);
    }
}
