package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CashInBalanceLandingViewModel_HiltModules {
    private CashInBalanceLandingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel cashInBalanceLandingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
