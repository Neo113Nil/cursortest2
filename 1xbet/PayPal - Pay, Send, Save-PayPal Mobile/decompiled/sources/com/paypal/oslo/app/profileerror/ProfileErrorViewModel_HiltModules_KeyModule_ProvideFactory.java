package com.paypal.oslo.app.profileerror;

/* loaded from: classes10.dex */
public final class ProfileErrorViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.app.profileerror.ProfileErrorViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.app.profileerror.ProfileErrorViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.app.profileerror.ProfileErrorViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.profileerror.ProfileErrorViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.app.profileerror.ProfileErrorViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
