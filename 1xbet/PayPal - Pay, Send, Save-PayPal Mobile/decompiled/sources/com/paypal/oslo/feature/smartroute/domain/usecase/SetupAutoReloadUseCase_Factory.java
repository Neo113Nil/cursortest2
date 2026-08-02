package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class SetupAutoReloadUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> getHighSpeedVideoSizes;

    private SetupAutoReloadUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository autoReloadRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase(autoReloadRepository);
    }
}
