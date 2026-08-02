package com.paypal.oslo.feature.ads.data.tracking;

/* loaded from: classes11.dex */
public final class AdTrackingServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getHighResolutionOutputSizeshNQ4ISI;

    private AdTrackingServiceImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider) {
        return new com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl newInstance(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        return new com.paypal.oslo.feature.ads.data.tracking.AdTrackingServiceImpl(analyticsTracker);
    }
}
