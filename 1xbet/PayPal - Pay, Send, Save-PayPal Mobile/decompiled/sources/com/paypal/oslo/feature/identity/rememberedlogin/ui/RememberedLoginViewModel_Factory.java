package com.paypal.oslo.feature.identity.rememberedlogin.ui;

/* loaded from: classes13.dex */
public final class RememberedLoginViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginReducer> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> getInputFormats;

    private RememberedLoginViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getInputFormats = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider6) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel newInstance(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginReducer rememberedLoginReducer, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase clearRememberedUserProfileUseCase, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler, com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase, com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel(rememberedLoginReducer, getRememberedUserUseCase, clearRememberedUserProfileUseCase, biometricLoginHandler, verifyCredentialUseCase, passkeyLoginUseCase);
    }
}
