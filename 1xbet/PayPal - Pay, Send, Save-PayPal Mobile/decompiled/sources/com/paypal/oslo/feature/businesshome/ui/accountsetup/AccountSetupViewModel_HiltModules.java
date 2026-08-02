package com.paypal.oslo.feature.businesshome.ui.accountsetup;

/* loaded from: classes11.dex */
public final class AccountSetupViewModel_HiltModules {
    private AccountSetupViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
