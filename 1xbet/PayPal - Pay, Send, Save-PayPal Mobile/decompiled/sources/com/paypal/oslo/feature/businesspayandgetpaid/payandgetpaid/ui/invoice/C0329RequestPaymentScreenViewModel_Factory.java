package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0329RequestPaymentScreenViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase> getHighSpeedVideoFpsRanges;

    private C0329RequestPaymentScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        return newInstance(invoice, this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0329RequestPaymentScreenViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase sendInvoiceUseCase, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase updateInvoiceUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel(invoice, sendInvoiceUseCase, updateInvoiceUseCase);
    }
}
