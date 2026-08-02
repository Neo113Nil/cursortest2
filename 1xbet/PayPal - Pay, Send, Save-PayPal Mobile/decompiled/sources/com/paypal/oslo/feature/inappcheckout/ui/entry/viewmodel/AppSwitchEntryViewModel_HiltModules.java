package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

/* loaded from: classes13.dex */
public final class AppSwitchEntryViewModel_HiltModules {
    private AppSwitchEntryViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
