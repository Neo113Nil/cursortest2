package com.paypal.oslo.feature.revolvingcreditacquisition;

/* loaded from: classes14.dex */
public final class AnalyticsModule_ProvideAnalyticsTrackerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker get() {
        return provideAnalyticsTracker();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.AnalyticsModule_ProvideAnalyticsTrackerFactory create() {
        return com.paypal.oslo.feature.revolvingcreditacquisition.AnalyticsModule_ProvideAnalyticsTrackerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditacquisition.AnalyticsModule.INSTANCE.provideAnalyticsTracker());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditacquisition.AnalyticsModule_ProvideAnalyticsTrackerFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditacquisition.AnalyticsModule_ProvideAnalyticsTrackerFactory();

        private InstanceHolder() {
        }
    }
}
