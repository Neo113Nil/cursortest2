package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

/* loaded from: classes15.dex */
public final class OfferDetailsViewModel_HiltModules {
    private OfferDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel offerDetailsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
