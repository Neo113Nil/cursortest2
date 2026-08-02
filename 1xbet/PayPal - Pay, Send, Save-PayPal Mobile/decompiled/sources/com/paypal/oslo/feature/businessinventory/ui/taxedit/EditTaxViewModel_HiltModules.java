package com.paypal.oslo.feature.businessinventory.ui.taxedit;

/* loaded from: classes11.dex */
public final class EditTaxViewModel_HiltModules {
    private EditTaxViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
