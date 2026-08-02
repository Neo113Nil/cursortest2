package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmIdentityViewModel_HiltModules {
    private ConfirmIdentityViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel confirmIdentityViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
