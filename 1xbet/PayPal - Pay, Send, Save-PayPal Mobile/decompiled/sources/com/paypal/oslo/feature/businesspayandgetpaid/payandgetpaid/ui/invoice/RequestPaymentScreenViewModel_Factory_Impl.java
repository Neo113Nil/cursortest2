package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* loaded from: classes11.dex */
public final class RequestPaymentScreenViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory Camera2StreamConfigurationMap;

    private RequestPaymentScreenViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory c0329RequestPaymentScreenViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0329RequestPaymentScreenViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        return this.Camera2StreamConfigurationMap.get(invoice);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory c0329RequestPaymentScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel_Factory_Impl(c0329RequestPaymentScreenViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory c0329RequestPaymentScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel_Factory_Impl(c0329RequestPaymentScreenViewModel_Factory));
    }
}
