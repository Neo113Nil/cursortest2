package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetViewModel_HiltModules {
    private DeactivateContactlessSheetViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
