package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

/* loaded from: classes11.dex */
public final class ContentViewerContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
