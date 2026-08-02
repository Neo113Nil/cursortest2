package com.paypal.oslo.core.webview.ui.viewmodel;

/* loaded from: classes10.dex */
public final class SecureWebViewViewModel_HiltModules {
    private SecureWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
