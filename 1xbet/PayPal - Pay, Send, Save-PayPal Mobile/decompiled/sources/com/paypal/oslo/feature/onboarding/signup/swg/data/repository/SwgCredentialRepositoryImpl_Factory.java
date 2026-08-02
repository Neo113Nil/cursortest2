package com.paypal.oslo.feature.onboarding.signup.swg.data.repository;

/* loaded from: classes13.dex */
public final class SwgCredentialRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private SwgCredentialRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper swgCredentialMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl(lazy, swgCredentialMapper);
    }
}
