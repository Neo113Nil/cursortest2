package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class TtpEopWebViewViewModel_HiltModules {
    private TtpEopWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel ttpEopWebViewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
