package com.paypal.oslo.feature.identity.connect.shared.analytics;

/* loaded from: classes12.dex */
public final class ConnectAnalyticsHelper_Factory_Impl implements com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory {
    private final com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory getHighSpeedVideoFpsRangesFor;

    private ConnectAnalyticsHelper_Factory_Impl(com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory c0371ConnectAnalyticsHelper_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0371ConnectAnalyticsHelper_Factory;
    }

    @Override // com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory
    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper create(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.getHighSpeedVideoFpsRangesFor.get(str, str2, str3);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory> create(com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory c0371ConnectAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper_Factory_Impl(c0371ConnectAnalyticsHelper_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory> createFactoryProvider(com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory c0371ConnectAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper_Factory_Impl(c0371ConnectAnalyticsHelper_Factory));
    }
}
