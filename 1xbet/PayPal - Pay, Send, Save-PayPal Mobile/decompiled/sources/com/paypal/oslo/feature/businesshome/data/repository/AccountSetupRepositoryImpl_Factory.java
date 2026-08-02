package com.paypal.oslo.feature.businesshome.data.repository;

/* loaded from: classes11.dex */
public final class AccountSetupRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private AccountSetupRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl(lazy, userStore);
    }
}
