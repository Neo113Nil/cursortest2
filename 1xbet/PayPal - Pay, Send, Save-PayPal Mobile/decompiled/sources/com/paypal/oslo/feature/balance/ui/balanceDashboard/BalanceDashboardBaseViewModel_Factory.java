package com.paypal.oslo.feature.balance.ui.balanceDashboard;

/* loaded from: classes11.dex */
public final class BalanceDashboardBaseViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel_Factory create() {
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel newInstance() {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
