package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideSettingsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> getHighSpeedVideoSizes;

    private SettingsModule_ProvideSettingsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository get() {
        return provideSettingsRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> provider4) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository provideSettingsRepository(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider iAccountVisibilityLabelProvider) {
        return (com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideSettingsRepository(iSettingsApolloClient, userStore, identityManagement, iAccountVisibilityLabelProvider));
    }
}
