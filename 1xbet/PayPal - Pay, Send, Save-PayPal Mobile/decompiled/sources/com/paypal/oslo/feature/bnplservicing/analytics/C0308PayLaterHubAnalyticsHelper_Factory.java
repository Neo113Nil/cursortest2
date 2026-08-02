package com.paypal.oslo.feature.bnplservicing.analytics;

/* renamed from: com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0308PayLaterHubAnalyticsHelper_Factory {
    public final com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper get(java.lang.String str) {
        return newInstance(str);
    }

    public static com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper newInstance(java.lang.String str) {
        return new com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper(str);
    }

    /* renamed from: com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.analytics.C0308PayLaterHubAnalyticsHelper_Factory();

        private InstanceHolder() {
        }
    }
}
