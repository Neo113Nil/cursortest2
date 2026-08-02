package com.paypal.oslo.feature.wallet.loyalty.ui;

/* loaded from: classes16.dex */
public final class LoyaltyManualConfirmScreenViewModel_HiltModules {
    private LoyaltyManualConfirmScreenViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel loyaltyManualConfirmScreenViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
