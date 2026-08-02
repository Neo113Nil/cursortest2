package com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase;

/* loaded from: classes13.dex */
public final class TrackCriticalAlertUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> getHighSpeedVideoSizes;

    private TrackCriticalAlertUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository> provider) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase newInstance(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository criticalAlertRepository) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase(criticalAlertRepository);
    }
}
