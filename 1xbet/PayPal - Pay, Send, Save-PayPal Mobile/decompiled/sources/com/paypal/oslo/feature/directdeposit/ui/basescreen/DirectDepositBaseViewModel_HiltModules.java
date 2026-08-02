package com.paypal.oslo.feature.directdeposit.ui.basescreen;

/* loaded from: classes12.dex */
public final class DirectDepositBaseViewModel_HiltModules {
    private DirectDepositBaseViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
