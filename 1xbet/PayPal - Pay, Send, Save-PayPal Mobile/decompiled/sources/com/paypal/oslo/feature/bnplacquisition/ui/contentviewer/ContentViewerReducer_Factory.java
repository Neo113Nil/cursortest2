package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

/* loaded from: classes11.dex */
public final class ContentViewerReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer_Factory();

        private InstanceHolder() {
        }
    }
}
