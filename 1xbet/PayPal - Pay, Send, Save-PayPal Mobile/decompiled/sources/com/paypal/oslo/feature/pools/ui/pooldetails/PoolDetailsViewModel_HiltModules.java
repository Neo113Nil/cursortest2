package com.paypal.oslo.feature.pools.ui.pooldetails;

/* loaded from: classes13.dex */
public final class PoolDetailsViewModel_HiltModules {
    private PoolDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
