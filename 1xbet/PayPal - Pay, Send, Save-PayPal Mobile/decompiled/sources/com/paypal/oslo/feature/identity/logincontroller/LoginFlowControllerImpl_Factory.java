package com.paypal.oslo.feature.identity.logincontroller;

/* loaded from: classes12.dex */
public final class LoginFlowControllerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> getOutputMinFrameDuration;

    private LoginFlowControllerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getOutputFormats = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.Camera2StreamConfigurationMap = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        return new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl newInstance(com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase processAuthIntentUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl(loginEffectResolver, appNavigator, userStore, rememberedUserStorageWithProfile, processAuthIntentUseCase, postLoginDeviceBindUseCase, coroutineScope);
    }
}
