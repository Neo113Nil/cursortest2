package com.paypal.oslo.feature.revolvingcreditservicing;

/* loaded from: classes14.dex */
public final class AnalyticsModule_ProvideAnalyticsTrackerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker get() {
        return provideAnalyticsTracker();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.AnalyticsModule_ProvideAnalyticsTrackerFactory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.AnalyticsModule_ProvideAnalyticsTrackerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.AnalyticsModule.INSTANCE.provideAnalyticsTracker());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.AnalyticsModule_ProvideAnalyticsTrackerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.revolvingcreditservicing.AnalyticsModule_ProvideAnalyticsTrackerFactory();

        private InstanceHolder() {
        }
    }
}
