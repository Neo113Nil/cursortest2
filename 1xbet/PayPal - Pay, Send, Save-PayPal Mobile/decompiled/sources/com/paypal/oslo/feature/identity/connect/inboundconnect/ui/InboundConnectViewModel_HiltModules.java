package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

/* loaded from: classes12.dex */
public final class InboundConnectViewModel_HiltModules {
    private InboundConnectViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
