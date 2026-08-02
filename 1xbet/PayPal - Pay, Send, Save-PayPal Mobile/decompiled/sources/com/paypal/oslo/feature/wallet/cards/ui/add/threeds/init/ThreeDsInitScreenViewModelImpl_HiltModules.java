package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

/* loaded from: classes15.dex */
public final class ThreeDsInitScreenViewModelImpl_HiltModules {
    private ThreeDsInitScreenViewModelImpl_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl threeDsInitScreenViewModelImpl);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
