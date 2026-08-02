package com.paypal.oslo.feature.identity.passkey.management.list.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyListRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private PasskeyListRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl(apolloClient);
    }
}
