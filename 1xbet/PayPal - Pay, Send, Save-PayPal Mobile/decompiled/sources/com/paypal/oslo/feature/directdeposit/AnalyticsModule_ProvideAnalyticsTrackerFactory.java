package com.paypal.oslo.feature.directdeposit;

/* loaded from: classes12.dex */
public final class AnalyticsModule_ProvideAnalyticsTrackerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker get() {
        return provideAnalyticsTracker();
    }

    public static com.paypal.oslo.feature.directdeposit.AnalyticsModule_ProvideAnalyticsTrackerFactory create() {
        return com.paypal.oslo.feature.directdeposit.AnalyticsModule_ProvideAnalyticsTrackerFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.directdeposit.AnalyticsModule.INSTANCE.provideAnalyticsTracker());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.directdeposit.AnalyticsModule_ProvideAnalyticsTrackerFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.directdeposit.AnalyticsModule_ProvideAnalyticsTrackerFactory();

        private InstanceHolder() {
        }
    }
}
