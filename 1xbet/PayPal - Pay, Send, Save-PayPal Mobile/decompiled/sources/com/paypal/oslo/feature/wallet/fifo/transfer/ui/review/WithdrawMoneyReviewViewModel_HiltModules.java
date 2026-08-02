package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

/* loaded from: classes15.dex */
public final class WithdrawMoneyReviewViewModel_HiltModules {
    private WithdrawMoneyReviewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
