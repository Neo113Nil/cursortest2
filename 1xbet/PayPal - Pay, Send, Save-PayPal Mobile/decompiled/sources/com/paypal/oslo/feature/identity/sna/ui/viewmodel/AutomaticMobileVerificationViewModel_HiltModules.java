package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

/* loaded from: classes13.dex */
public final class AutomaticMobileVerificationViewModel_HiltModules {
    private AutomaticMobileVerificationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel automaticMobileVerificationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
