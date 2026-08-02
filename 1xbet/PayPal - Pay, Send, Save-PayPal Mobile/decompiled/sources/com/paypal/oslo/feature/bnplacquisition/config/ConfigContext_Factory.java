package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class ConfigContext_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> {
    private final dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> getHighSpeedVideoFpsRangesFor;

    private ConfigContext_Factory(dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.ConfigContext_Factory create(dagger.internal.Provider<kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country>> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.config.ConfigContext_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.ConfigContext newInstance(kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> function0) {
        return new com.paypal.oslo.feature.bnplacquisition.config.ConfigContext(function0);
    }
}
