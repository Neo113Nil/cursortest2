package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

/* loaded from: classes16.dex */
public final class WithdrawModalViewModel_HiltModules {
    private WithdrawModalViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
