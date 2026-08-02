package com.paypal.oslo.feature.cryptocurrency.ui.hub;

/* loaded from: classes12.dex */
public final class CryptoHubViewModel_HiltModules {
    private CryptoHubViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
