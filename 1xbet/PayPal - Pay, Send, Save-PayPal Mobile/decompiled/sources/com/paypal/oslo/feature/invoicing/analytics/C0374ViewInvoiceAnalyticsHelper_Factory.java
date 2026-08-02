package com.paypal.oslo.feature.invoicing.analytics;

/* renamed from: com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0374ViewInvoiceAnalyticsHelper_Factory {
    public final com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper get(java.lang.String str) {
        return newInstance(str);
    }

    public static com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory create() {
        return com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper newInstance(java.lang.String str) {
        return new com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper(str);
    }

    /* renamed from: com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory();

        private InstanceHolder() {
        }
    }
}
