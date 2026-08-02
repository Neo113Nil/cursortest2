package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private PasskeyCreateChallengeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl(apolloClient);
    }
}
