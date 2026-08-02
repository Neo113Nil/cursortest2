package com.paypal.oslo.feature.xoom.ui.accountlinking;

/* loaded from: classes16.dex */
public final class AccountLinkingViewModel_HiltModules {
    private AccountLinkingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel accountLinkingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
