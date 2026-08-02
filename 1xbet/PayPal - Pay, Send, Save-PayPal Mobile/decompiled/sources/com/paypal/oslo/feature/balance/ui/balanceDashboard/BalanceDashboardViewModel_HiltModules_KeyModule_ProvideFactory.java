package com.paypal.oslo.feature.balance.ui.balanceDashboard;

/* loaded from: classes11.dex */
public final class BalanceDashboardViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
