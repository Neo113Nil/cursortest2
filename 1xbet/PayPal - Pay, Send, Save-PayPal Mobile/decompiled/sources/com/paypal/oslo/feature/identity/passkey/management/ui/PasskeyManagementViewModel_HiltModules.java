package com.paypal.oslo.feature.identity.passkey.management.ui;

/* loaded from: classes12.dex */
public final class PasskeyManagementViewModel_HiltModules {
    private PasskeyManagementViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
