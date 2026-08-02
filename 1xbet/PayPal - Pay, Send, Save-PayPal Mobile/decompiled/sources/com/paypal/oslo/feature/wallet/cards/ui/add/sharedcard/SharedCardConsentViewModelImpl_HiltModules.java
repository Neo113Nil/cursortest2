package com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard;

/* loaded from: classes15.dex */
public final class SharedCardConsentViewModelImpl_HiltModules {
    private SharedCardConsentViewModelImpl_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl sharedCardConsentViewModelImpl);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
