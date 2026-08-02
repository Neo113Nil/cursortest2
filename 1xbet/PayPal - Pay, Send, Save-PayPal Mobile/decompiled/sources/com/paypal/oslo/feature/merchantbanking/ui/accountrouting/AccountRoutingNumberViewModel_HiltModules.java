package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

/* loaded from: classes13.dex */
public final class AccountRoutingNumberViewModel_HiltModules {
    private AccountRoutingNumberViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
