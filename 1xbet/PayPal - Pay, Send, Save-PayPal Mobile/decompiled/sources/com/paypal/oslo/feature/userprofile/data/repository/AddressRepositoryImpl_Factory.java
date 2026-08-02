package com.paypal.oslo.feature.userprofile.data.repository;

/* loaded from: classes15.dex */
public final class AddressRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> getHighSpeedVideoSizes;

    private AddressRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl(observeUserStoreUseCase, apolloClient, userStore);
    }
}
