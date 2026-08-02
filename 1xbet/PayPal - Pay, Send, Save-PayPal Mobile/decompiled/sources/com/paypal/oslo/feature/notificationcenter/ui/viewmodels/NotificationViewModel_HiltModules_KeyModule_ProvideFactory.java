package com.paypal.oslo.feature.notificationcenter.ui.viewmodels;

/* loaded from: classes13.dex */
public final class NotificationViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
