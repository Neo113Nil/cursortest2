package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class TapToPayProgressViewModel_HiltModules {
    private TapToPayProgressViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
