package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class TrackMonitoringEventUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository> getHighSpeedVideoSizes;

    private TrackMonitoringEventUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository trackLatencyRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase(trackLatencyRepository);
    }
}
