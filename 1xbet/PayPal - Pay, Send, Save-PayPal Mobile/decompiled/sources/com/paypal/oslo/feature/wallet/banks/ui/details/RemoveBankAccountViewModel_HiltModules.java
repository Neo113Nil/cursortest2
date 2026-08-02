package com.paypal.oslo.feature.wallet.banks.ui.details;

/* loaded from: classes15.dex */
public final class RemoveBankAccountViewModel_HiltModules {
    private RemoveBankAccountViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
