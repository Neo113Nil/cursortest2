package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class PayPalRepositoryModule_ProvidePayPalLocalCardDataRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider> Camera2StreamConfigurationMap;

    private PayPalRepositoryModule_ProvidePayPalLocalCardDataRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository get() {
        return providePayPalLocalCardDataRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvidePayPalLocalCardDataRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvidePayPalLocalCardDataRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository providePayPalLocalCardDataRepository(com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider payPalLocalCardDataRepositoryProvider) {
        return (com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule.INSTANCE.providePayPalLocalCardDataRepository(payPalLocalCardDataRepositoryProvider));
    }
}
