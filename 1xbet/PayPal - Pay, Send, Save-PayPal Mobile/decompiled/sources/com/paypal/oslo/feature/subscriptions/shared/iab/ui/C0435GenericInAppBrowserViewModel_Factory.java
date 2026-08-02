package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

/* renamed from: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0435GenericInAppBrowserViewModel_Factory {
    public final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel get(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs) {
        return newInstance(genericInAppBrowserArgs);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory create() {
        return com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel newInstance(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserArgs genericInAppBrowserArgs) {
        return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel(genericInAppBrowserArgs);
    }

    /* renamed from: com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserViewModel_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.C0435GenericInAppBrowserViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
