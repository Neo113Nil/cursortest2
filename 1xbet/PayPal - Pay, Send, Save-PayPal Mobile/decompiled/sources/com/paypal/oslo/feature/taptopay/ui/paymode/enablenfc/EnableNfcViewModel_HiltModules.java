package com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc;

/* loaded from: classes15.dex */
public final class EnableNfcViewModel_HiltModules {
    private EnableNfcViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
