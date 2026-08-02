package com.paypal.oslo.feature.taptopay.data.repository;

/* loaded from: classes15.dex */
public final class PayPalLocalCardDataRepositoryProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> getHighSpeedVideoSizes;

    private PayPalLocalCardDataRepositoryProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider newInstance(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider(manager, provider, provider2);
    }
}
