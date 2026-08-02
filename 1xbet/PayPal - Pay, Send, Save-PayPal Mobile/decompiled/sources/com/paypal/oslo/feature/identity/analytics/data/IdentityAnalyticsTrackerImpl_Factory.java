package com.paypal.oslo.feature.identity.analytics.data;

/* loaded from: classes12.dex */
public final class IdentityAnalyticsTrackerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getHighSpeedVideoFpsRangesFor;

    private IdentityAnalyticsTrackerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider) {
        return new com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl newInstance(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        return new com.paypal.oslo.feature.identity.analytics.data.IdentityAnalyticsTrackerImpl(analyticsTracker);
    }
}
