package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardActivationRouterViewModel_HiltModules {
    private DebitCardActivationRouterViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
