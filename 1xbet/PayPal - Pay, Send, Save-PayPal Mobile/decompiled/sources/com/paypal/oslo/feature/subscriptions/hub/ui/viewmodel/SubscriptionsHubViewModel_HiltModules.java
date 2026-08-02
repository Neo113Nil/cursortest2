package com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel;

/* loaded from: classes15.dex */
public final class SubscriptionsHubViewModel_HiltModules {
    private SubscriptionsHubViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
