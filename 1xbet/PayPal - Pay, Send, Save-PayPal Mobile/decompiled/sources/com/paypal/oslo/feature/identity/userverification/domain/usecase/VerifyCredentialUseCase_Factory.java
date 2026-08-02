package com.paypal.oslo.feature.identity.userverification.domain.usecase;

/* loaded from: classes13.dex */
public final class VerifyCredentialUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> getHighSpeedVideoSizes;

    private VerifyCredentialUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider3) {
        return new com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase newInstance(com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository, com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository verifyCredentialRepository2, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase(verifyCredentialRepository, verifyCredentialRepository2, featureGate);
    }
}
