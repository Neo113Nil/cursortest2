package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

/* loaded from: classes13.dex */
public final class RypViewModel_HiltModules {
    private RypViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
