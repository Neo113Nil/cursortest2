package com.paypal.oslo.feature.mosaic.ui.webview;

/* loaded from: classes13.dex */
public final class ComplianceWebViewViewModel_HiltModules {
    private ComplianceWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
