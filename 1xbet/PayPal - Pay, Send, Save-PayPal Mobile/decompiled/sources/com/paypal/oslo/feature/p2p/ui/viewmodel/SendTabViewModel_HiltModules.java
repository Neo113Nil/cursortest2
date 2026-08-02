package com.paypal.oslo.feature.p2p.ui.viewmodel;

/* loaded from: classes13.dex */
public final class SendTabViewModel_HiltModules {
    private SendTabViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
