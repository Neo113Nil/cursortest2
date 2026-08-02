package com.paypal.oslo.feature.settings.closeaccount.data.repository;

/* loaded from: classes14.dex */
public final class CloseAccountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private CloseAccountRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl newInstance(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl(iSettingsApolloClient, userStore);
    }
}
