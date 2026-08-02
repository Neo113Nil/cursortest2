package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

/* loaded from: classes15.dex */
public final class LinkAgreementInAppBrowserViewModel_HiltModules {
    private LinkAgreementInAppBrowserViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
