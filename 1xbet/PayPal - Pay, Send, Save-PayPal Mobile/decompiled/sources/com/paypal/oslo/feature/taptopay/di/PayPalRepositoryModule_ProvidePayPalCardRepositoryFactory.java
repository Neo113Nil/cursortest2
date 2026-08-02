package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class PayPalRepositoryModule_ProvidePayPalCardRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider> Camera2StreamConfigurationMap;

    private PayPalRepositoryModule_ProvidePayPalCardRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository get() {
        return providePayPalCardRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvidePayPalCardRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvidePayPalCardRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository providePayPalCardRepository(com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider payPalCardRepositoryProvider) {
        return (com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule.INSTANCE.providePayPalCardRepository(payPalCardRepositoryProvider));
    }
}
