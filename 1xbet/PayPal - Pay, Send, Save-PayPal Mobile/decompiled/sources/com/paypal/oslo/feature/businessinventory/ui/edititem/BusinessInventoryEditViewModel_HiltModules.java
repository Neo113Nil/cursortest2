package com.paypal.oslo.feature.businessinventory.ui.edititem;

/* loaded from: classes11.dex */
public final class BusinessInventoryEditViewModel_HiltModules {
    private BusinessInventoryEditViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
