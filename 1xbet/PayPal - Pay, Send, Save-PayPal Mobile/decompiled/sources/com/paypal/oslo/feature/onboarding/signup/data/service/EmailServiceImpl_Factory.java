package com.paypal.oslo.feature.onboarding.signup.data.service;

/* loaded from: classes13.dex */
public final class EmailServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private EmailServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl confirmationMapperImpl) {
        return new com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl(lazy, confirmationMapperImpl);
    }
}
