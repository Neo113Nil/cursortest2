package com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel;

/* renamed from: com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0375ViewInvoiceViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer> getHighSpeedVideoFpsRangesFor;

    private C0375ViewInvoiceViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel get(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, java.lang.String str) {
        return newInstance(viewInvoiceDestination, str, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory> provider2) {
        return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel newInstance(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, java.lang.String str, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer viewInvoiceReducer, com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory factory) {
        return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel(viewInvoiceDestination, str, viewInvoiceReducer, factory);
    }
}
