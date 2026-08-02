package com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel;

/* loaded from: classes16.dex */
public final class TransferAmountViewModel_HiltModules {
    private TransferAmountViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel transferAmountViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
