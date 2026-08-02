package com.paypal.oslo.feature.invoicing.analytics;

/* loaded from: classes13.dex */
public final class ViewInvoiceAnalyticsHelper_Factory_Impl implements com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory {
    private final com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory getHighSpeedVideoFpsRanges;

    private ViewInvoiceAnalyticsHelper_Factory_Impl(com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory c0374ViewInvoiceAnalyticsHelper_Factory) {
        this.getHighSpeedVideoFpsRanges = c0374ViewInvoiceAnalyticsHelper_Factory;
    }

    @Override // com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory
    public final com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory> create(com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory c0374ViewInvoiceAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper_Factory_Impl(c0374ViewInvoiceAnalyticsHelper_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory> createFactoryProvider(com.paypal.oslo.feature.invoicing.analytics.C0374ViewInvoiceAnalyticsHelper_Factory c0374ViewInvoiceAnalyticsHelper_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper_Factory_Impl(c0374ViewInvoiceAnalyticsHelper_Factory));
    }
}
