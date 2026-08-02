package com.paypal.oslo.feature.controlcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class RefreshUserProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> getHighSpeedVideoFpsRanges;

    private RefreshUserProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository> provider) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase newInstance(com.paypal.oslo.feature.controlcenter.domain.repository.IUserProfileRepository iUserProfileRepository) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase(iUserProfileRepository);
    }
}
