package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideCloseAccountRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> getHighSpeedVideoSizes;

    private SettingsModule_ProvideCloseAccountRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository get() {
        return provideCloseAccountRepository(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideCloseAccountRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideCloseAccountRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository provideCloseAccountRepository(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        return (com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideCloseAccountRepository(iSettingsApolloClient, userStore));
    }
}
