package com.paypal.oslo.feature.cryptocurrency.ui.receive;

/* loaded from: classes12.dex */
public final class CryptoReceiveViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
