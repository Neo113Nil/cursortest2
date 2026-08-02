package com.paypal.oslo.feature.identity.login;

/* loaded from: classes12.dex */
public final class IdentityTokenProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getInputFormats;

    private IdentityTokenProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        return new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl newInstance(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase getClientTokenUseCase, com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase, dagger.Lazy<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> lazy, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl(identityTokenStorage, getClientTokenUseCase, lLSLoginUseCase, lazy, elapsedRealtimeProvider, coroutineScope);
    }
}
