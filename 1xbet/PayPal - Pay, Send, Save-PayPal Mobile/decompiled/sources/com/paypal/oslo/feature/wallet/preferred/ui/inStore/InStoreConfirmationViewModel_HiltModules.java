package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

/* loaded from: classes16.dex */
public final class InStoreConfirmationViewModel_HiltModules {
    private InStoreConfirmationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel inStoreConfirmationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
