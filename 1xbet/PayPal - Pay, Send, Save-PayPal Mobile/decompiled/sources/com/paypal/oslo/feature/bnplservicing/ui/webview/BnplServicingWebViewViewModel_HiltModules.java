package com.paypal.oslo.feature.bnplservicing.ui.webview;

/* loaded from: classes11.dex */
public final class BnplServicingWebViewViewModel_HiltModules {
    private BnplServicingWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
