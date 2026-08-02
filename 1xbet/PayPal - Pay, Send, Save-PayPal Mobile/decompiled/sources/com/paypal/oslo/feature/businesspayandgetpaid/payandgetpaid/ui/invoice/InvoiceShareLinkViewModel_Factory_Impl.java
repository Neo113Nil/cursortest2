package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* loaded from: classes11.dex */
public final class InvoiceShareLinkViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0327InvoiceShareLinkViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private InvoiceShareLinkViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0327InvoiceShareLinkViewModel_Factory c0327InvoiceShareLinkViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0327InvoiceShareLinkViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceShareLinkDestination invoiceShareLinkDestination) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(invoiceShareLinkDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0327InvoiceShareLinkViewModel_Factory c0327InvoiceShareLinkViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel_Factory_Impl(c0327InvoiceShareLinkViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0327InvoiceShareLinkViewModel_Factory c0327InvoiceShareLinkViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceShareLinkViewModel_Factory_Impl(c0327InvoiceShareLinkViewModel_Factory));
    }
}
