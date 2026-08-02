package com.paypal.oslo.feature.taptopay.data.remoteconfig;

/* loaded from: classes15.dex */
public final class TapToPayConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl> {
    public static int getHighResolutionOutputSizeshNQ4ISI;
    public static int getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private TapToPayConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.taptopay.data.remoteconfig.TapToPayConfigManagerImpl(featureGate, dynamicConfiguration);
    }

    public static int getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizes;
        int i2 = i % 6908679;
        getHighSpeedVideoSizes = i + 1;
        if (i2 != 0) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
        getHighResolutionOutputSizeshNQ4ISI = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
