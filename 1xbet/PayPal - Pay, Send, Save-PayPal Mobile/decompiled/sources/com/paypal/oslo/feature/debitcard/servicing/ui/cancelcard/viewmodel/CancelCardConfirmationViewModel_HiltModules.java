package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel;

/* loaded from: classes12.dex */
public final class CancelCardConfirmationViewModel_HiltModules {
    private CancelCardConfirmationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
