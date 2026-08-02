package com.paypal.oslo.feature.inappcheckout.features.switchback;

/* loaded from: classes13.dex */
public final class SwitchBackActionBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder> getHighSpeedVideoFpsRanges;

    private SwitchBackActionBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder newInstance(com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder switchBackUriBuilder) {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder(switchBackUriBuilder);
    }
}
