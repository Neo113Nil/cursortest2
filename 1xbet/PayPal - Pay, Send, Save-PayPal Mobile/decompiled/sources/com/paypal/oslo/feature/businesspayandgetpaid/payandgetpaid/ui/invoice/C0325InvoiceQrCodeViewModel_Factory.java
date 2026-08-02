package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0325InvoiceQrCodeViewModel_Factory {
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination) {
        return newInstance(invoiceQrCodeDestination);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory create() {
        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceQrCodeDestination invoiceQrCodeDestination) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel(invoiceQrCodeDestination);
    }

    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeViewModel_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0325InvoiceQrCodeViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
