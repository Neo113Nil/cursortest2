package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessScreenViewModel_HiltModules {
    private DebitCardCreationSuccessScreenViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
