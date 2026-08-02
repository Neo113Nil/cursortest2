package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

/* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0434LinkAgreementInAppBrowserViewModel_Factory {
    public final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel get(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs) {
        return newInstance(linkAgreementInAppBrowserArgs);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory create() {
        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel newInstance(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs linkAgreementInAppBrowserArgs) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel(linkAgreementInAppBrowserArgs);
    }

    /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.subscriptions.linkagreements.iab.C0434LinkAgreementInAppBrowserViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
