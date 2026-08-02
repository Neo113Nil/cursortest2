package com.paypal.oslo.feature.subscriptions.updatefi.ui;

/* loaded from: classes15.dex */
public final class UpdateFiViewModel_HiltModules {
    private UpdateFiViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
