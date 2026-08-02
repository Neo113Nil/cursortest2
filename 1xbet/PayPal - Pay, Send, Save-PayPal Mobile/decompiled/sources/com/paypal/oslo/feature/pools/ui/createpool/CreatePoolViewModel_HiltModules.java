package com.paypal.oslo.feature.pools.ui.createpool;

/* loaded from: classes13.dex */
public final class CreatePoolViewModel_HiltModules {
    private CreatePoolViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel createPoolViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
