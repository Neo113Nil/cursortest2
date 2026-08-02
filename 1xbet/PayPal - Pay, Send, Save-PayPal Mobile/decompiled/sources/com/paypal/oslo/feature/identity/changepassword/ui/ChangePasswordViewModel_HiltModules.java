package com.paypal.oslo.feature.identity.changepassword.ui;

/* loaded from: classes12.dex */
public final class ChangePasswordViewModel_HiltModules {
    private ChangePasswordViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
