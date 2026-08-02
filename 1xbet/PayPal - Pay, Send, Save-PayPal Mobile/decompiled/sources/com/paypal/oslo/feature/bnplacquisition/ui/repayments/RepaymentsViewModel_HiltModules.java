package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

/* loaded from: classes11.dex */
public final class RepaymentsViewModel_HiltModules {
    private RepaymentsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
