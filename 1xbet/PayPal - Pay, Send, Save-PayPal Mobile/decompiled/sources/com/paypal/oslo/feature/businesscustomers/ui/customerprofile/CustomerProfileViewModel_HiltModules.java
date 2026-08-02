package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

/* loaded from: classes11.dex */
public final class CustomerProfileViewModel_HiltModules {
    private CustomerProfileViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
