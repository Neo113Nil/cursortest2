package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateViewModel_HiltModules {
    private DebitCardApplyAndCreateViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
