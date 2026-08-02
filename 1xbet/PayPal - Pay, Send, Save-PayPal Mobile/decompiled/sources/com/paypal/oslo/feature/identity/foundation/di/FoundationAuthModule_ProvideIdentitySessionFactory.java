package com.paypal.oslo.feature.identity.foundation.di;

/* loaded from: classes5.dex */
public final class FoundationAuthModule_ProvideIdentitySessionFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoSizes;

    private FoundationAuthModule_ProvideIdentitySessionFactory(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl get() {
        return provideIdentitySession(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule_ProvideIdentitySessionFactory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> provider4) {
        return new com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule_ProvideIdentitySessionFactory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl provideIdentitySession(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase hasRememberedUserUseCase, dagger.Lazy<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> lazy) {
        return (com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule.INSTANCE.provideIdentitySession(identityTokenStorage, deviceBindingTokenStorage, hasRememberedUserUseCase, lazy));
    }
}
