package com.paypal.oslo.feature.identity.connect.shared.analytics;

/* renamed from: com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0372ConnectAnalyticsTracker_Factory {
    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker get(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return newInstance(str, str2, str3, str4, str5);
    }

    public static com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory create() {
        return com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker newInstance(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker(str, str2, str3, str4, str5);
    }

    /* renamed from: com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.connect.shared.analytics.C0372ConnectAnalyticsTracker_Factory();

        private InstanceHolder() {
        }
    }
}
