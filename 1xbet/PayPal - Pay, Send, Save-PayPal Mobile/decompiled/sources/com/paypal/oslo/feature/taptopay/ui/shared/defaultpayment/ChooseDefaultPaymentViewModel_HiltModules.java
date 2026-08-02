package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

/* loaded from: classes15.dex */
public final class ChooseDefaultPaymentViewModel_HiltModules {
    private ChooseDefaultPaymentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
