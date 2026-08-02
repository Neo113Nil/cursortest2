package com.paypal.oslo.feature.merchantbanking.ui.terms;

/* loaded from: classes13.dex */
public final class AccountRoutingTermsViewModel_HiltModules {
    private AccountRoutingTermsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
