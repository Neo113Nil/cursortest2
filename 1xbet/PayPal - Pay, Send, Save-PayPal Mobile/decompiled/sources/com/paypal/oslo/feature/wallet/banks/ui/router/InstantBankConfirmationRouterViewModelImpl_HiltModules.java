package com.paypal.oslo.feature.wallet.banks.ui.router;

/* loaded from: classes15.dex */
public final class InstantBankConfirmationRouterViewModelImpl_HiltModules {
    private InstantBankConfirmationRouterViewModelImpl_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl instantBankConfirmationRouterViewModelImpl);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
