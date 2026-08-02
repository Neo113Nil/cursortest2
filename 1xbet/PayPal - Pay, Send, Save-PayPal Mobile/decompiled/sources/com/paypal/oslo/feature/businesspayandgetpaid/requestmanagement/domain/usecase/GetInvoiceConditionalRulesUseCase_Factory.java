package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase;

/* loaded from: classes11.dex */
public final class GetInvoiceConditionalRulesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> getHighSpeedVideoFpsRanges;

    private GetInvoiceConditionalRulesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase(invoiceRepository);
    }
}
