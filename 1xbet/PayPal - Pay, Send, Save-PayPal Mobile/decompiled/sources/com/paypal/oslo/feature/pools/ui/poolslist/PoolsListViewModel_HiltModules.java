package com.paypal.oslo.feature.pools.ui.poolslist;

/* loaded from: classes13.dex */
public final class PoolsListViewModel_HiltModules {
    private PoolsListViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
