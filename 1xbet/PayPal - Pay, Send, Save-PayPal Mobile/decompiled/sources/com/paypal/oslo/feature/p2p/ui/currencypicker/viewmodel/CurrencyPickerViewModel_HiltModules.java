package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

/* loaded from: classes13.dex */
public final class CurrencyPickerViewModel_HiltModules {
    private CurrencyPickerViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
