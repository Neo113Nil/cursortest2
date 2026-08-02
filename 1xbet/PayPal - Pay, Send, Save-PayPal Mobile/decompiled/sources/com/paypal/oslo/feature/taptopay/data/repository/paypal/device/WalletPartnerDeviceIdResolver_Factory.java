package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

/* loaded from: classes15.dex */
public final class WalletPartnerDeviceIdResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver> {
    private final dagger.internal.Provider<kotlin.Lazy<java.lang.String>> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> getHighSpeedVideoFpsRangesFor;

    private WalletPartnerDeviceIdResolver_Factory(dagger.internal.Provider<kotlin.Lazy<java.lang.String>> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver_Factory create(dagger.internal.Provider<kotlin.Lazy<java.lang.String>> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver newInstance(kotlin.Lazy<java.lang.String> lazy, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver(lazy, deviceRegistrationInformation, cardRepository);
    }
}
