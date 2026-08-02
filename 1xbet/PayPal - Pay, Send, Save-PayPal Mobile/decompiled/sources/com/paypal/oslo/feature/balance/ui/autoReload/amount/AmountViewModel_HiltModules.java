package com.paypal.oslo.feature.balance.ui.autoReload.amount;

/* loaded from: classes11.dex */
public final class AmountViewModel_HiltModules {
    private AmountViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
