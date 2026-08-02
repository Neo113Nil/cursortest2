package com.paypal.oslo.feature.mosaic.api.widget.docupload;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;", "getProvider", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;", "widgetProvider", "", "setProvider", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;)V", "resetProvider", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DocUploadWidgetFactory {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static volatile com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory INSTANCE = new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory();
    public static final int $stable = 8;

    private DocUploadWidgetFactory() {
    }

    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider getProvider() {
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider docUploadWidgetProvider = getHighSpeedVideoFpsRanges;
        if (docUploadWidgetProvider != null) {
            return docUploadWidgetProvider;
        }
        throw new java.lang.IllegalStateException("DocUploadWidgetProvider is not available. Ensure the mosaic module is included in your dependencies.".toString());
    }

    @kotlin.jvm.JvmStatic
    public static final void setProvider(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider widgetProvider) {
        synchronized (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetProvider, "");
            if (getHighSpeedVideoFpsRanges != null && getHighSpeedVideoFpsRanges != widgetProvider) {
                throw new java.lang.IllegalStateException("DocUploadWidgetFactory provider is already set and cannot be reassigned.".toString());
            }
            getHighSpeedVideoFpsRanges = widgetProvider;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void resetProvider() {
        synchronized (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory.class) {
            getHighSpeedVideoFpsRanges = null;
        }
    }
}
