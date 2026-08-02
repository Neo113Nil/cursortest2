package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

/* loaded from: classes13.dex */
public final class ViewInvoiceReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer_Factory create() {
        return com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer newInstance() {
        return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer_Factory();

        private InstanceHolder() {
        }
    }
}
