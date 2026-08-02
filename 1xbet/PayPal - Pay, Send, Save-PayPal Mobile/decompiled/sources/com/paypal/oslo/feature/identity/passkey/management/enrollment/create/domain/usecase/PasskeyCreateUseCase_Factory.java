package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyCreateUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> getInputFormats;

    private PasskeyCreateUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getInputFormats = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider6) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase newInstance(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase passkeyCreateChallengeUseCase, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.repository.PasskeyAttestationRepository passkeyAttestationRepository, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository passkeyCreateRepository, com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase systemPasskeyEligibilityUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase(passkeyCreateChallengeUseCase, passkeyAttestationRepository, passkeyCreateRepository, systemPasskeyEligibilityUseCase, featureGate, getRememberedUserUseCase);
    }
}
