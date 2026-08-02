package com.paypal.oslo.feature.inappcheckout.features.webview;

/* loaded from: classes13.dex */
public final class AppSwitchWebViewViewModel_HiltModules {
    private AppSwitchWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
