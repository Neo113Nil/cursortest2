package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* loaded from: classes15.dex */
public final class DaonFaceLivenessViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_HiltModules_KeyModule_ProvideFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
