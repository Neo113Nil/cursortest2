package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

/* loaded from: classes15.dex */
public final class ChooseAccountsViewModel_HiltModules {
    private ChooseAccountsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
