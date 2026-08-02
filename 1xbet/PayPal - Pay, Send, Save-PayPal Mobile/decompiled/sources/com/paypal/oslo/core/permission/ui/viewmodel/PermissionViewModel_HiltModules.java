package com.paypal.oslo.core.permission.ui.viewmodel;

/* loaded from: classes10.dex */
public final class PermissionViewModel_HiltModules {
    private PermissionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel permissionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.core.permission.ui.viewmodel.PermissionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
