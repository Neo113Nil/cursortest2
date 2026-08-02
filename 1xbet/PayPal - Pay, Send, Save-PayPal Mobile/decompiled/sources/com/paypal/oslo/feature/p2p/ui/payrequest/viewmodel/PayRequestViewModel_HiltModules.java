package com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel;

/* loaded from: classes13.dex */
public final class PayRequestViewModel_HiltModules {
    private PayRequestViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
