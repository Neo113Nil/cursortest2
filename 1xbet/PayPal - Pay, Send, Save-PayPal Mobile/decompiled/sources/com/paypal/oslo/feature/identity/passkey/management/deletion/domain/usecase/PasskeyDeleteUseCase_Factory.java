package com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyDeleteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private PasskeyDeleteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        return new com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase newInstance(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository passkeyDeleteRepository, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase(passkeyDeleteRepository, featureGate);
    }
}
