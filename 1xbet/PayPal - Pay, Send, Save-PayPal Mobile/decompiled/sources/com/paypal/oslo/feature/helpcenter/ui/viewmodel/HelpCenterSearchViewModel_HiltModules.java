package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class HelpCenterSearchViewModel_HiltModules {
    private HelpCenterSearchViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
