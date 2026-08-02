package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class AppIdentityProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.AppIdentityProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DistributionChannel> getHighSpeedVideoSizes;

    private AppIdentityProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DistributionChannel> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.AppIdentityProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.appidentity.data.AppIdentityProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DistributionChannel> provider4) {
        return new com.paypal.oslo.core.appidentity.data.AppIdentityProvider_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.appidentity.data.AppIdentityProvider newInstance(com.paypal.oslo.core.appidentity.domain.AppInformation appInformation, com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.appidentity.domain.DistributionChannel distributionChannel) {
        return new com.paypal.oslo.core.appidentity.data.AppIdentityProvider(appInformation, deviceInformation, localeInformation, distributionChannel);
    }
}
