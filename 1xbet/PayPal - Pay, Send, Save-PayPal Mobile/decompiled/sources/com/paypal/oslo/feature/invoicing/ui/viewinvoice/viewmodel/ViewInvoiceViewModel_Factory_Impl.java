package com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel;

/* loaded from: classes13.dex */
public final class ViewInvoiceViewModel_Factory_Impl implements com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory {
    private final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory Camera2StreamConfigurationMap;

    private ViewInvoiceViewModel_Factory_Impl(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory c0375ViewInvoiceViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0375ViewInvoiceViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory
    public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel create(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(viewInvoiceDestination, str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory> create(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory c0375ViewInvoiceViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel_Factory_Impl(c0375ViewInvoiceViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.C0375ViewInvoiceViewModel_Factory c0375ViewInvoiceViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel_Factory_Impl(c0375ViewInvoiceViewModel_Factory));
    }
}
