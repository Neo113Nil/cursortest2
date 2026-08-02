package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

/* loaded from: classes11.dex */
public final class InvoiceRepositoryFake_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> Camera2StreamConfigurationMap;

    private InvoiceRepositoryFake_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake(invoiceRepositoryImpl);
    }
}
