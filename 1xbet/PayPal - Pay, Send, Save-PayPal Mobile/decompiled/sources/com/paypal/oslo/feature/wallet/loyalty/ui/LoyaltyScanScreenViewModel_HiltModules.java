package com.paypal.oslo.feature.wallet.loyalty.ui;

/* loaded from: classes16.dex */
public final class LoyaltyScanScreenViewModel_HiltModules {
    private LoyaltyScanScreenViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel loyaltyScanScreenViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
