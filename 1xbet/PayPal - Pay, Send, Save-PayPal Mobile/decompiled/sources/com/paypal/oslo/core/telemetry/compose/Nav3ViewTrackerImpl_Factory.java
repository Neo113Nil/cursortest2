package com.paypal.oslo.core.telemetry.compose;

/* loaded from: classes10.dex */
public final class Nav3ViewTrackerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl> {
    private final dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker>> getHighSpeedVideoFpsRanges;

    private Nav3ViewTrackerImpl_Factory(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker>> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl_Factory create(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker>> provider) {
        return new com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl newInstance(java.util.Map<java.lang.String, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> map) {
        return new com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackerImpl(map);
    }
}
