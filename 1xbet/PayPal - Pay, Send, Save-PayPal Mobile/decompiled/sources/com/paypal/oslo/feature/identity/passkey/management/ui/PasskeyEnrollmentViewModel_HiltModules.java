package com.paypal.oslo.feature.identity.passkey.management.ui;

/* loaded from: classes12.dex */
public final class PasskeyEnrollmentViewModel_HiltModules {
    private PasskeyEnrollmentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
