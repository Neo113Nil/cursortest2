package com.paypal.oslo.feature.taptopay.ui.setup.fiselector;

/* loaded from: classes15.dex */
public final class FiSelectorViewModel_HiltModules {
    private FiSelectorViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
