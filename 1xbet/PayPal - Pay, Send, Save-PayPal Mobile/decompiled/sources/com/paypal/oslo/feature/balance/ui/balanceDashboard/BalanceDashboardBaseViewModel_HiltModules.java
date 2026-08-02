package com.paypal.oslo.feature.balance.ui.balanceDashboard;

/* loaded from: classes11.dex */
public final class BalanceDashboardBaseViewModel_HiltModules {
    private BalanceDashboardBaseViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel balanceDashboardBaseViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
