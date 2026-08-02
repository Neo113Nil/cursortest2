package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

/* loaded from: classes11.dex */
public final class SendInvoiceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> getHighSpeedVideoFpsRangesFor;

    private SendInvoiceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase(invoiceRepository);
    }
}
