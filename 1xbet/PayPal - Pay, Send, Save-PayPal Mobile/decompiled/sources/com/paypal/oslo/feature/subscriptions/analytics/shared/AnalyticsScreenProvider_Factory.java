package com.paypal.oslo.feature.subscriptions.analytics.shared;

/* loaded from: classes15.dex */
public final class AnalyticsScreenProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider_Factory create() {
        return com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider newInstance() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider_Factory();

        private InstanceHolder() {
        }
    }
}
