package com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel;

/* loaded from: classes13.dex */
public final class ErrorViewModel_HiltModules {
    private ErrorViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
