package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class PayPalRepositoryModule_ProvideCachedTransactionRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider> getHighSpeedVideoFpsRanges;

    private PayPalRepositoryModule_ProvideCachedTransactionRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository get() {
        return provideCachedTransactionRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvideCachedTransactionRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvideCachedTransactionRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository provideCachedTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider cachedTransactionRepositoryProvider) {
        return (com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule.INSTANCE.provideCachedTransactionRepository(cachedTransactionRepositoryProvider));
    }
}
