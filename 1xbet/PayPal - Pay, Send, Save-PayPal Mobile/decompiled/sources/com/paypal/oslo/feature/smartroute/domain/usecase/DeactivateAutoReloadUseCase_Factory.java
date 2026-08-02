package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class DeactivateAutoReloadUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> getHighSpeedVideoFpsRanges;

    private DeactivateAutoReloadUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository autoReloadRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase(autoReloadRepository);
    }
}
