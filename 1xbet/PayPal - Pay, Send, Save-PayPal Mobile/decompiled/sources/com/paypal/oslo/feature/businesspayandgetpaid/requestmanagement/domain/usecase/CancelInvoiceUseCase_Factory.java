package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase;

/* loaded from: classes11.dex */
public final class CancelInvoiceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> getHighResolutionOutputSizeshNQ4ISI;

    private CancelInvoiceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase(invoiceRepository);
    }
}
