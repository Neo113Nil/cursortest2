package com.paypal.oslo.feature.xoom.ui.interstitial;

/* loaded from: classes16.dex */
public final class InterstitialViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
