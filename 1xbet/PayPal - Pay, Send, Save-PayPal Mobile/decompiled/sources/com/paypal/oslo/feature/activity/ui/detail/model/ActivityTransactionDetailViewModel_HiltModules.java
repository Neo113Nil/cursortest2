package com.paypal.oslo.feature.activity.ui.detail.model;

/* loaded from: classes10.dex */
public final class ActivityTransactionDetailViewModel_HiltModules {
    private ActivityTransactionDetailViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
