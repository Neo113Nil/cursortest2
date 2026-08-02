package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

/* loaded from: classes11.dex */
public final class ContentViewerUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider> getHighSpeedVideoFpsRangesFor;

    private ContentViewerUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider contentViewerContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper(contentViewerContentProvider);
    }
}
