package com.paypal.oslo.feature.identity.logincontroller.ui;

/* loaded from: classes12.dex */
public final class AuthenticateViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateReducer> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getInputFormats;

    private AuthenticateViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateReducer> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getInputFormats = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateReducer> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider7) {
        return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel newInstance(com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase postLoginDeviceRegisterUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase hasRememberedUserUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase isInContextLoginEnabledUseCase, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateReducer authenticateReducer, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel(postLoginDeviceRegisterUseCase, hasRememberedUserUseCase, getRememberedUserUseCase, isInContextLoginEnabledUseCase, identityAnalyticsTracker, authenticateReducer, coroutineScope);
    }
}
