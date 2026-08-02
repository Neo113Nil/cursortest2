package com.paypal.oslo.feature.identity.userverification.data.repository;

/* loaded from: classes13.dex */
public final class VerifyCredentialRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private VerifyCredentialRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> provider3) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache authOptionCache) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl(lazy, provider, authOptionCache);
    }
}
