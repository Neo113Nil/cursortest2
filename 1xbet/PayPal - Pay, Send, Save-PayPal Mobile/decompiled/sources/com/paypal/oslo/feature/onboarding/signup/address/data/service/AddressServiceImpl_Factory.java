package com.paypal.oslo.feature.onboarding.signup.address.data.service;

/* loaded from: classes13.dex */
public final class AddressServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> getHighSpeedVideoSizes;

    private AddressServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl(lazy, errorMapper);
    }
}
