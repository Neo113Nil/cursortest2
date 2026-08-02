package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

/* loaded from: classes11.dex */
public final class InvoiceDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory getHighSpeedVideoSizes;

    private InvoiceDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory c0333InvoiceDetailsViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0333InvoiceDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoSizes.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory c0333InvoiceDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel_Factory_Impl(c0333InvoiceDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory c0333InvoiceDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel_Factory_Impl(c0333InvoiceDetailsViewModel_Factory));
    }
}
