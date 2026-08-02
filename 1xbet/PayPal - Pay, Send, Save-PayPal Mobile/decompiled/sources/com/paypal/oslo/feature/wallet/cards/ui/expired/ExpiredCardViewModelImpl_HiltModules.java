package com.paypal.oslo.feature.wallet.cards.ui.expired;

/* loaded from: classes15.dex */
public final class ExpiredCardViewModelImpl_HiltModules {
    private ExpiredCardViewModelImpl_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl expiredCardViewModelImpl);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
