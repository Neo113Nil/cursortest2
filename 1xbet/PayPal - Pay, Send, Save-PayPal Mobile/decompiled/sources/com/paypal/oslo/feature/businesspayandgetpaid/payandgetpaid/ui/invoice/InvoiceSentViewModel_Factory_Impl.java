package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* loaded from: classes11.dex */
public final class InvoiceSentViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0326InvoiceSentViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private InvoiceSentViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0326InvoiceSentViewModel_Factory c0326InvoiceSentViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0326InvoiceSentViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(invoiceSentDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0326InvoiceSentViewModel_Factory c0326InvoiceSentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel_Factory_Impl(c0326InvoiceSentViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0326InvoiceSentViewModel_Factory c0326InvoiceSentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel_Factory_Impl(c0326InvoiceSentViewModel_Factory));
    }
}
