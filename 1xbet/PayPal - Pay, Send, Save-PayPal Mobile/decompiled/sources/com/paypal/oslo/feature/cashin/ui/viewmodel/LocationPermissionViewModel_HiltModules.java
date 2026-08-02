package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class LocationPermissionViewModel_HiltModules {
    private LocationPermissionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
