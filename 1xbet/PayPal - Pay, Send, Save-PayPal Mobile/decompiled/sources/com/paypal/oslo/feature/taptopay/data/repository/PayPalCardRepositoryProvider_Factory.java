package com.paypal.oslo.feature.taptopay.data.repository;

/* loaded from: classes15.dex */
public final class PayPalCardRepositoryProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> getHighSpeedVideoSizes;

    private PayPalCardRepositoryProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> provider2, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> provider2, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider newInstance(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> provider, javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider2, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> provider3, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider4) {
        return new com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider(manager, provider, provider2, provider3, provider4);
    }
}
