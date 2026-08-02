package com.paypal.oslo.feature.directdeposit.data.repository;

/* loaded from: classes12.dex */
public final class VirtualBankAccountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private VirtualBankAccountRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.VirtualBankAccountRepositoryImpl(apolloClient);
    }
}
