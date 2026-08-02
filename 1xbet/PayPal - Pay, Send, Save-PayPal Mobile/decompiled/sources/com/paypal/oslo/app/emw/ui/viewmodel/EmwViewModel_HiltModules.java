package com.paypal.oslo.app.emw.ui.viewmodel;

/* loaded from: classes10.dex */
public final class EmwViewModel_HiltModules {
    private EmwViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
