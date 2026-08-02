package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* loaded from: classes12.dex */
public final class CryptoProvisioningViewModel_HiltModules {
    private CryptoProvisioningViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
