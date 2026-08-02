package com.paypal.oslo.feature.activity.ui.detail.model;

/* loaded from: classes10.dex */
public final class ActivityPromotionalRewardsDetailsViewModel_HiltModules {
    private ActivityPromotionalRewardsDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel activityPromotionalRewardsDetailsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
