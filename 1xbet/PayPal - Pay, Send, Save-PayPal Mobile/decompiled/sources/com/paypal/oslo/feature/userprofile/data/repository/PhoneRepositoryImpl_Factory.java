package com.paypal.oslo.feature.userprofile.data.repository;

/* loaded from: classes15.dex */
public final class PhoneRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> getHighSpeedVideoSizes;

    private PhoneRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl(observeUserStoreUseCase, apolloClient, userStore);
    }
}
