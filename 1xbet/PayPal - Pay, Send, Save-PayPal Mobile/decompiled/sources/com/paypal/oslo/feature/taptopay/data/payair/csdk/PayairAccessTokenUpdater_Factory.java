package com.paypal.oslo.feature.taptopay.data.payair.csdk;

/* loaded from: classes15.dex */
public final class PayairAccessTokenUpdater_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> getHighSpeedVideoFpsRangesFor;

    private PayairAccessTokenUpdater_Factory(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater_Factory create(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater newInstance(com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater(configurationManager, authToken, isApiLevelSupportedUseCase);
    }
}
