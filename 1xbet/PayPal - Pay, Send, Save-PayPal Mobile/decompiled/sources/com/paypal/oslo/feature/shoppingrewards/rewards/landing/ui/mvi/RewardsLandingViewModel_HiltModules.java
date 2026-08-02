package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

/* loaded from: classes15.dex */
public final class RewardsLandingViewModel_HiltModules {
    private RewardsLandingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel rewardsLandingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
