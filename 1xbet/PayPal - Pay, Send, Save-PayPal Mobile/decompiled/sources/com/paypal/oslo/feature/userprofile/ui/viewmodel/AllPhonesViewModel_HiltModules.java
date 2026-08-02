package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class AllPhonesViewModel_HiltModules {
    private AllPhonesViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
