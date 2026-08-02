package com.paypal.oslo.feature.wallet.banks.ui.consent;

/* loaded from: classes15.dex */
public final class AddBankConsentViewModel_HiltModules {
    private AddBankConsentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
