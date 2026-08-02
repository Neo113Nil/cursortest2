package com.paypal.oslo.feature.wallet.amexandp3.ui;

/* loaded from: classes15.dex */
public final class ProvisionInstrumentsViewModel_HiltModules {
    private ProvisionInstrumentsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
