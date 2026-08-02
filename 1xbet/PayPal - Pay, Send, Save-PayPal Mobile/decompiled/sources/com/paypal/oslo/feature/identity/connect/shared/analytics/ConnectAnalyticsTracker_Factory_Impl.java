package com.paypal.oslo.feature.identity.connect.shared.analytics;

/* loaded from: classes12.dex */
public final class ConnectAnalyticsTracker_Factory_Impl implements com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory {
    private final com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory getHighResolutionOutputSizeshNQ4ISI;

    private ConnectAnalyticsTracker_Factory_Impl(com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory c0372ConnectAnalyticsTracker_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0372ConnectAnalyticsTracker_Factory;
    }

    @Override // com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory
    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str, str2, str3, str4, str5);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory> create(com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory c0372ConnectAnalyticsTracker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker_Factory_Impl(c0372ConnectAnalyticsTracker_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory> createFactoryProvider(com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory c0372ConnectAnalyticsTracker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker_Factory_Impl(c0372ConnectAnalyticsTracker_Factory));
    }
}
