package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

/* loaded from: classes15.dex */
public final class SubscriptionDetailViewModel_HiltModules {
    private SubscriptionDetailViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
