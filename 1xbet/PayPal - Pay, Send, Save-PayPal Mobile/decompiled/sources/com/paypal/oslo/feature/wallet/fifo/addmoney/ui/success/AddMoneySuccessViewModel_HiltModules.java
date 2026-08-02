package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success;

/* loaded from: classes15.dex */
public final class AddMoneySuccessViewModel_HiltModules {
    private AddMoneySuccessViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
