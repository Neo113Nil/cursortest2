package com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyDeleteRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private PasskeyDeleteRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl(apolloClient);
    }
}
