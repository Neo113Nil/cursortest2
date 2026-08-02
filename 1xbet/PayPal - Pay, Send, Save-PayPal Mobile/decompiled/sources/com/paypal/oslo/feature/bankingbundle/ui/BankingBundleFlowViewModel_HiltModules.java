package com.paypal.oslo.feature.bankingbundle.ui;

/* loaded from: classes11.dex */
public final class BankingBundleFlowViewModel_HiltModules {
    private BankingBundleFlowViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel bankingBundleFlowViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
