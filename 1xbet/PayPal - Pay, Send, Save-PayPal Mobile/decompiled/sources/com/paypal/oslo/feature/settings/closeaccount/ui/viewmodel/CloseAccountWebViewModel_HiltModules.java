package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

/* loaded from: classes14.dex */
public final class CloseAccountWebViewModel_HiltModules {
    private CloseAccountWebViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel closeAccountWebViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
