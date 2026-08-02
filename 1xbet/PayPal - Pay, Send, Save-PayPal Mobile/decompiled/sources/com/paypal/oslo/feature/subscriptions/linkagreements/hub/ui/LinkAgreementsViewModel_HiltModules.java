package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

/* loaded from: classes15.dex */
public final class LinkAgreementsViewModel_HiltModules {
    private LinkAgreementsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
