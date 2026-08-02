package com.paypal.oslo.feature.businesscustomers.ui.customerform;

/* loaded from: classes11.dex */
public final class CustomerFormViewModel_HiltModules {
    private CustomerFormViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
