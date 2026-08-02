package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi;

/* loaded from: classes15.dex */
public final class AllTransactionsMviViewModel_HiltModules {
    private AllTransactionsMviViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
