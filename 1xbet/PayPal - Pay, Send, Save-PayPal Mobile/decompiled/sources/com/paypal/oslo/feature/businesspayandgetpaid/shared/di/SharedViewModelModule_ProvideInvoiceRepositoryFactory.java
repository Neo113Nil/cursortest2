package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes11.dex */
public final class SharedViewModelModule_ProvideInvoiceRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> getHighSpeedVideoFpsRanges;

    private SharedViewModelModule_ProvideInvoiceRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository get() {
        return provideInvoiceRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule_ProvideInvoiceRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule_ProvideInvoiceRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository provideInvoiceRepository(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake invoiceRepositoryFake, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl invoiceRepositoryImpl) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule.INSTANCE.provideInvoiceRepository(invoiceRepositoryFake, invoiceRepositoryImpl));
    }
}
