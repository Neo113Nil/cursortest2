package com.paypal.oslo.feature.wallet.cards.ui.nickname;

/* loaded from: classes15.dex */
public final class NicknameViewModelImpl_HiltModules {
    private NicknameViewModelImpl_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl nicknameViewModelImpl);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
