package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

/* loaded from: classes11.dex */
public final class ReviewTermsViewModel_HiltModules {
    private ReviewTermsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
