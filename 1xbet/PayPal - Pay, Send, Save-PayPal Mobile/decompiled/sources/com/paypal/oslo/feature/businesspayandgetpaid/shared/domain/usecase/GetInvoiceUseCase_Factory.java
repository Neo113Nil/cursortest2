package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class GetInvoiceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> getHighSpeedVideoFpsRangesFor;

    private GetInvoiceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase(invoiceRepository);
    }
}
