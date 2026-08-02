package com.paypal.oslo.feature.moneymovement.ui.shared;

/* loaded from: classes13.dex */
public final class MoneyAmountFormatterViewModel_HiltModules {
    private MoneyAmountFormatterViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel moneyAmountFormatterViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
