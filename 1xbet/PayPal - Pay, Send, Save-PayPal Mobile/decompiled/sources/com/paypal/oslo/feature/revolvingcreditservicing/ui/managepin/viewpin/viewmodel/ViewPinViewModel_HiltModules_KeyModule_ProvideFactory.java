package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel;

/* loaded from: classes14.dex */
public final class ViewPinViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
