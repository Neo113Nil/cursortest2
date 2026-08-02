package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ManageFaceScanViewModel_HiltModules {
    private ManageFaceScanViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
