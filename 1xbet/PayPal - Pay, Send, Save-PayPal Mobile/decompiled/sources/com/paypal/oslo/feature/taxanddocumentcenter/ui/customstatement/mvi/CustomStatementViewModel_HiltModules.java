package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

/* loaded from: classes15.dex */
public final class CustomStatementViewModel_HiltModules {
    private CustomStatementViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
