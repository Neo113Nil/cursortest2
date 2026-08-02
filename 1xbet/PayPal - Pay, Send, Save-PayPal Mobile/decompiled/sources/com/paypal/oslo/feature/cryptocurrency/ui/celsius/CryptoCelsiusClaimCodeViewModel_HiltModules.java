package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

/* loaded from: classes12.dex */
public final class CryptoCelsiusClaimCodeViewModel_HiltModules {
    private CryptoCelsiusClaimCodeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
