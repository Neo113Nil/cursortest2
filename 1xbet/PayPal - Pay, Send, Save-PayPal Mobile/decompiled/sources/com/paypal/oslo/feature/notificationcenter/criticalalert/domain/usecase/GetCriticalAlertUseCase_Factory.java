package com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCriticalAlertUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> getHighSpeedVideoFpsRanges;

    private GetCriticalAlertUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> provider) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase newInstance(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository criticalAlertRepository) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase(criticalAlertRepository);
    }
}
