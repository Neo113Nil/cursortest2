package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

/* loaded from: classes12.dex */
public final class MoreOptionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> getHighSpeedVideoFpsRanges;

    private MoreOptionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider2) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase newInstance(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository, com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase(moreOptionRepository, biometricEligibilityRepository);
    }
}
