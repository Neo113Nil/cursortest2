package com.paypal.oslo.feature.cryptocurrency.ui.details;

/* loaded from: classes12.dex */
public final class CryptoDetailsViewModel_HiltModules {
    private CryptoDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
