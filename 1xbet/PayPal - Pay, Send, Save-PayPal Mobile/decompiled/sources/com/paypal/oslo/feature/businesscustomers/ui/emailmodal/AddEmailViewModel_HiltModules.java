package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

/* loaded from: classes11.dex */
public final class AddEmailViewModel_HiltModules {
    private AddEmailViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
