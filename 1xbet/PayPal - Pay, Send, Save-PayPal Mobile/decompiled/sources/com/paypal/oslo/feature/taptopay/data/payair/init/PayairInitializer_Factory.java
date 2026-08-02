package com.paypal.oslo.feature.taptopay.data.payair.init;

/* loaded from: classes15.dex */
public final class PayairInitializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.app.Application> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener> getHighSpeedVideoSizes;

    private PayairInitializer_Factory(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer_Factory create(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer newInstance(android.app.Application application, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager, com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager sdkConfigurationManager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase) {
        return new com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer(application, sdkSetupManager, csdkListener, sdkConfigurationManager, isApiLevelSupportedUseCase);
    }
}
