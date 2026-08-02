package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

/* loaded from: classes15.dex */
public final class ChooseSecondaryPaymentViewModel_HiltModules {
    private ChooseSecondaryPaymentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
