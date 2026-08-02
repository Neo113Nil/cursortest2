package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

/* loaded from: classes11.dex */
public final class PayLaterHubViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
