package com.paypal.oslo.feature.identity.identitymanagement;

/* loaded from: classes12.dex */
public final class IdentityManagementImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> getInputSizeshNQ4ISI;

    private IdentityManagementImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider7) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoSizes = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider7) {
        return new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl newInstance(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase enableAuthenticationMethodUseCase, com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase disableAuthenticationMethodUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl(enableAuthenticationMethodUseCase, disableAuthenticationMethodUseCase, deviceBindingTokenStorage, userStore, rememberedUserStorageWithProfile, coroutineDispatcher, appStorage);
    }
}
