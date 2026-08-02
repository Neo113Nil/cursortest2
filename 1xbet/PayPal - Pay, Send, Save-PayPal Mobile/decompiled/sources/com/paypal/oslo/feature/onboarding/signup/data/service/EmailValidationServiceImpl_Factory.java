package com.paypal.oslo.feature.onboarding.signup.data.service;

/* loaded from: classes13.dex */
public final class EmailValidationServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper> getHighSpeedVideoFpsRangesFor;

    private EmailValidationServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper emailValidationMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl(lazy, emailValidationMapper);
    }
}
