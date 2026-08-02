package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CashInStoresListViewModel_HiltModules {
    private CashInStoresListViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
