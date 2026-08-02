package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

/* loaded from: classes15.dex */
public final class LinkAgreementInAppBrowserViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory Camera2StreamConfigurationMap;

    private LinkAgreementInAppBrowserViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory c0434LinkAgreementInAppBrowserViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0434LinkAgreementInAppBrowserViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel create(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs) {
        return this.Camera2StreamConfigurationMap.get(linkAgreementInAppBrowserArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory c0434LinkAgreementInAppBrowserViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel_Factory_Impl(c0434LinkAgreementInAppBrowserViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory c0434LinkAgreementInAppBrowserViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel_Factory_Impl(c0434LinkAgreementInAppBrowserViewModel_Factory));
    }
}
