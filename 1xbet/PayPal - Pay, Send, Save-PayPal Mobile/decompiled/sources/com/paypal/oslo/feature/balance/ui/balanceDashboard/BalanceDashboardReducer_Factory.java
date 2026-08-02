package com.paypal.oslo.feature.balance.ui.balanceDashboard;

/* loaded from: classes11.dex */
public final class BalanceDashboardReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer_Factory create() {
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer newInstance() {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer_Factory();

        private InstanceHolder() {
        }
    }
}
