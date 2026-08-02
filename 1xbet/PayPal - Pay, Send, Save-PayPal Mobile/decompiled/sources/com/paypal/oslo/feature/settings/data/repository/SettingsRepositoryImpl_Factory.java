package com.paypal.oslo.feature.settings.data.repository;

/* loaded from: classes14.dex */
public final class SettingsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> getHighSpeedVideoSizes;

    private SettingsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider> provider4) {
        return new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl newInstance(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider iAccountVisibilityLabelProvider) {
        return new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl(iSettingsApolloClient, userStore, identityManagement, iAccountVisibilityLabelProvider);
    }
}
