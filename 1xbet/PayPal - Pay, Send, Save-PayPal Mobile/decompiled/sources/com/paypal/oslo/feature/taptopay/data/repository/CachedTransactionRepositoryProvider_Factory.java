package com.paypal.oslo.feature.taptopay.data.repository;

/* loaded from: classes15.dex */
public final class CachedTransactionRepositoryProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> getHighSpeedVideoSizes;

    private CachedTransactionRepositoryProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider newInstance(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider(manager, provider, provider2);
    }
}
