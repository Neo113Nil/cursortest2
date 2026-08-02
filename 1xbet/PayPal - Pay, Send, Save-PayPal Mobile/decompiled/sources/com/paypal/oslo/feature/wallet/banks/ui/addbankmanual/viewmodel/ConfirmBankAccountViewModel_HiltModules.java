package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmBankAccountViewModel_HiltModules {
    private ConfirmBankAccountViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
