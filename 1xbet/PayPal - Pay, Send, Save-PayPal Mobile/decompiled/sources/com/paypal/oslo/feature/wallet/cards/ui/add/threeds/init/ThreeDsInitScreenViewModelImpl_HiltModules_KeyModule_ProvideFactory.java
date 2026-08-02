package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

/* loaded from: classes15.dex */
public final class ThreeDsInitScreenViewModelImpl_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
