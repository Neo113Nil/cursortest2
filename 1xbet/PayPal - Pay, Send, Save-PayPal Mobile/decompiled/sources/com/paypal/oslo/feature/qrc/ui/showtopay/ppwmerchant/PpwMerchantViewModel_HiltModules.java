package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

/* loaded from: classes14.dex */
public final class PpwMerchantViewModel_HiltModules {
    private PpwMerchantViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel ppwMerchantViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
