package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateInvoiceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> Camera2StreamConfigurationMap;

    private UpdateInvoiceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase(invoiceRepository);
    }
}
