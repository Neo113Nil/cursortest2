package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

/* loaded from: classes12.dex */
public final class ValidateChallengeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoFpsRangesFor;

    private ValidateChallengeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl(lazy, identityTokenStorage);
    }
}
