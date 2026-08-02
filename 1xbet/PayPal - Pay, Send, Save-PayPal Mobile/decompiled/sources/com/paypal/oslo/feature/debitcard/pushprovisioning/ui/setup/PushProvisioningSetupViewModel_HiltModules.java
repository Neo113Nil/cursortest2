package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

/* loaded from: classes12.dex */
public final class PushProvisioningSetupViewModel_HiltModules {
    private PushProvisioningSetupViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel pushProvisioningSetupViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
