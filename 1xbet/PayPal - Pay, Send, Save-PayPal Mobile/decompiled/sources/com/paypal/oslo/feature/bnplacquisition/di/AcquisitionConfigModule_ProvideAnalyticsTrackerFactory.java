package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes5.dex */
public final class AcquisitionConfigModule_ProvideAnalyticsTrackerFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker get() {
        return provideAnalyticsTracker();
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideAnalyticsTrackerFactory create() {
        return com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideAnalyticsTrackerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule.INSTANCE.provideAnalyticsTracker());
    }

    /* loaded from: classes11.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideAnalyticsTrackerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule_ProvideAnalyticsTrackerFactory();

        private InstanceHolder() {
        }
    }
}
