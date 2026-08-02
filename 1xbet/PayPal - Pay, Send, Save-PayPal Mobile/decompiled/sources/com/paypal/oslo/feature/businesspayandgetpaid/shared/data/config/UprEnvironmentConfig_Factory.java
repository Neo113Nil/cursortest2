package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config;

/* loaded from: classes11.dex */
public final class UprEnvironmentConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private UprEnvironmentConfig_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig(context);
    }
}
