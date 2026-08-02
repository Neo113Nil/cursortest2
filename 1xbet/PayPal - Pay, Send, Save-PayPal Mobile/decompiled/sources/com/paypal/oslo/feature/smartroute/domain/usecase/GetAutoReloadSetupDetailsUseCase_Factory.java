package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class GetAutoReloadSetupDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> getHighSpeedVideoFpsRanges;

    private GetAutoReloadSetupDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository autoReloadRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase(autoReloadRepository);
    }
}
