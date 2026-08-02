package com.paypal.oslo.feature.taptopay.data.payair.init;

/* loaded from: classes15.dex */
public final class HceConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private HceConfigurationProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider(context);
    }
}
