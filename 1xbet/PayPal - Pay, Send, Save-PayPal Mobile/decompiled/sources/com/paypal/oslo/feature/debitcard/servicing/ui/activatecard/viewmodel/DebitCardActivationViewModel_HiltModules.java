package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardActivationViewModel_HiltModules {
    private DebitCardActivationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
