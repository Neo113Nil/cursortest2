package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

/* loaded from: classes11.dex */
public final class PayAndGetPaidViewModel_HiltModules {
    private PayAndGetPaidViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
