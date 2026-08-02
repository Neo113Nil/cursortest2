package com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoSizes;

    private PasskeyLoginChallengeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2) {
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl(lazy, provider);
    }
}
