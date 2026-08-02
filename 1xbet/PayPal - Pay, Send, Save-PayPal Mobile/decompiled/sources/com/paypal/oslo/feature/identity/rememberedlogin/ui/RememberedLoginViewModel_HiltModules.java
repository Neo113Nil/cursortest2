package com.paypal.oslo.feature.identity.rememberedlogin.ui;

/* loaded from: classes13.dex */
public final class RememberedLoginViewModel_HiltModules {
    private RememberedLoginViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
