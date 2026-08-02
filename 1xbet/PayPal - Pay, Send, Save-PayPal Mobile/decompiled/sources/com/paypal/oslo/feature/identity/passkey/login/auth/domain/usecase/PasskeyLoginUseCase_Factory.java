package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyLoginUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> getOutputMinFrameDuration;

    private PasskeyLoginUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider7) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider7) {
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase newInstance(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.usecase.PasskeyLoginChallengeUseCase passkeyLoginChallengeUseCase, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.usecase.PasskeyAssertionUseCase passkeyAssertionUseCase, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase(passkeyLoginChallengeUseCase, passkeyAssertionUseCase, loginUseCase, base64Encoder, systemPasskeyEligibilityUseCase, featureGate, getRememberedUserUseCase);
    }
}
