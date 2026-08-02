package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel;

/* loaded from: classes15.dex */
public final class MainMenuViewModel_HiltModules {
    private MainMenuViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel mainMenuViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.viewmodel.MainMenuViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
