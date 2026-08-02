package com.paypal.oslo.feature.taptopay.data.payair.csdk;

/* loaded from: classes15.dex */
public final class SdkSetupManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager> {
    private final dagger.internal.Provider<com.payair.logic.managers.PaymentManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.payair.logic.managers.SetupManager> getHighSpeedVideoFpsRanges;

    private SdkSetupManager_Factory(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider, dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager_Factory create(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider, dagger.internal.Provider<com.payair.logic.managers.PaymentManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager newInstance(com.payair.logic.managers.SetupManager setupManager, com.payair.logic.managers.PaymentManager paymentManager, com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider hceConfigurationProvider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager(setupManager, paymentManager, hceConfigurationProvider);
    }
}
