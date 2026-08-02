package com.paypal.oslo.core.permission.ui.viewmodel;

/* loaded from: classes10.dex */
public final class PermissionViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
