package com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase;

/* loaded from: classes12.dex */
public final class SystemPasskeyEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> getHighSpeedVideoSizes;

    private SystemPasskeyEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector> provider3) {
        return new com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase newInstance(com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker biometricCapabilityChecker, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker, com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector emulatorDetector) {
        return new com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.SystemPasskeyEligibilityUseCase(biometricCapabilityChecker, deviceLockCapabilityChecker, emulatorDetector);
    }
}
