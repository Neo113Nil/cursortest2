package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class DeletePhoneViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
