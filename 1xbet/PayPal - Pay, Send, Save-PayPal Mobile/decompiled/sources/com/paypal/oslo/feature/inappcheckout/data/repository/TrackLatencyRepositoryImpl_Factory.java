package com.paypal.oslo.feature.inappcheckout.data.repository;

/* loaded from: classes13.dex */
public final class TrackLatencyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback> getHighResolutionOutputSizeshNQ4ISI;

    private TrackLatencyRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl newInstance(com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider timeProvider, com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback latencyPairReportCallback) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl(timeProvider, latencyPairReportCallback);
    }
}
