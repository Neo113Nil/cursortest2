package com.paypal.oslo.feature.identity.passwordlogin.ui;

/* loaded from: classes12.dex */
public final class PasswordViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator> getHighSpeedVideoSizes;

    private PasswordViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> provider5) {
        return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel newInstance(com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase passwordUseCase, com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase mapToAuthOptionUseCase, com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator passwordValidator, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler) {
        return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel(passwordUseCase, passwordRecoveryFlowCoordinator, mapToAuthOptionUseCase, passwordValidator, biometricLoginHandler);
    }
}
