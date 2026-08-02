package com.paypal.oslo.feature.onboarding.signup.data.service;

/* loaded from: classes13.dex */
public final class PhoneServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> getHighSpeedVideoFpsRangesFor;

    private PhoneServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl confirmationMapperImpl) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl(lazy, confirmationMapperImpl);
    }
}
