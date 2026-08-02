package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* loaded from: classes11.dex */
public final class InvoiceQrCodeViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private InvoiceQrCodeViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory c0325InvoiceQrCodeViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0325InvoiceQrCodeViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination) {
        return this.getHighSpeedVideoFpsRangesFor.get(invoiceQrCodeDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory c0325InvoiceQrCodeViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel_Factory_Impl(c0325InvoiceQrCodeViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory c0325InvoiceQrCodeViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel_Factory_Impl(c0325InvoiceQrCodeViewModel_Factory));
    }
}
