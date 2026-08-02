package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

/* loaded from: classes15.dex */
public final class DeviceInfoProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> getHighSpeedVideoFpsRanges;

    private DeviceInfoProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider newInstance(com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider(deviceIdResolver, cardRepository);
    }
}
