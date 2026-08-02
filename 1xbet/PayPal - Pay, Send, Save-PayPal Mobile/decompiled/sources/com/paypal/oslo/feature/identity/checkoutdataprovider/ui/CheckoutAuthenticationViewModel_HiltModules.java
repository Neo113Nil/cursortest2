package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

/* loaded from: classes12.dex */
public final class CheckoutAuthenticationViewModel_HiltModules {
    private CheckoutAuthenticationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
