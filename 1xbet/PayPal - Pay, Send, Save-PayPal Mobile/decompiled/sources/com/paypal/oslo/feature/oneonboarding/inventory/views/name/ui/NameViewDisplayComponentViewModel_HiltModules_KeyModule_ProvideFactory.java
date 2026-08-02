package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

/* loaded from: classes13.dex */
public final class NameViewDisplayComponentViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
