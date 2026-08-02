package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* loaded from: classes11.dex */
public final class InvoiceViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private InvoiceViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory c0328InvoiceViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0328InvoiceViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction invoiceAction) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(invoiceAction);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory c0328InvoiceViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel_Factory_Impl(c0328InvoiceViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory c0328InvoiceViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel_Factory_Impl(c0328InvoiceViewModel_Factory));
    }
}
