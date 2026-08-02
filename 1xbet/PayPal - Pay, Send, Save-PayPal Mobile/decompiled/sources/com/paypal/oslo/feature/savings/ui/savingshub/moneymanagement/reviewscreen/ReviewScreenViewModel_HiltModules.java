package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

/* loaded from: classes14.dex */
public final class ReviewScreenViewModel_HiltModules {
    private ReviewScreenViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
