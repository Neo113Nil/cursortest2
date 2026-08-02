package com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardWebViewModel_HiltModules {
    private DebitCardWebViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
