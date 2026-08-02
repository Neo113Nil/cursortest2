package com.paypal.oslo.feature.qrc.ui.review;

/* loaded from: classes14.dex */
public final class PaymentReviewViewModel_HiltModules {
    private PaymentReviewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
