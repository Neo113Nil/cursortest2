package com.paypal.oslo.feature.xoom.ui.interstitial;

/* loaded from: classes16.dex */
public final class InterstitialViewModel_HiltModules {
    private InterstitialViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel interstitialViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
