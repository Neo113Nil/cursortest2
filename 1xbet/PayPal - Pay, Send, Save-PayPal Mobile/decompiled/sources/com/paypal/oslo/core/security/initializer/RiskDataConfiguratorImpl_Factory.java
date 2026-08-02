package com.paypal.oslo.core.security.initializer;

/* loaded from: classes10.dex */
public final class RiskDataConfiguratorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.di.appguid.AppGuidProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> getHighSpeedVideoSizes;

    private RiskDataConfiguratorImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> provider2, dagger.internal.Provider<com.paypal.oslo.core.di.appguid.AppGuidProvider> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> provider2, dagger.internal.Provider<com.paypal.oslo.core.di.appguid.AppGuidProvider> provider3) {
        return new com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl newInstance(android.content.Context context, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK, com.paypal.oslo.core.di.appguid.AppGuidProvider appGuidProvider) {
        return new com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl(context, magnesSDK, appGuidProvider);
    }
}
