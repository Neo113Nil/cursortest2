package com.paypal.oslo.feature.businessinventory.ui.taxlist;

/* loaded from: classes11.dex */
public final class TaxListScreenViewModel_HiltModules {
    private TaxListScreenViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
