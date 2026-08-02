package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

/* loaded from: classes15.dex */
public final class BusinessesHubViewModel_HiltModules {
    private BusinessesHubViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
