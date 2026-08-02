package com.paypal.oslo.feature.mosaic.widget;

/* loaded from: classes13.dex */
public final class DocUploadSelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel_Factory create() {
        return com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel newInstance() {
        return new com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
