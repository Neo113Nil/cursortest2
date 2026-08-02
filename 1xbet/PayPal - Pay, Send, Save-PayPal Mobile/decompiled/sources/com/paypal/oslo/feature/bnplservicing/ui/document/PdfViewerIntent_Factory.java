package com.paypal.oslo.feature.bnplservicing.ui.document;

/* loaded from: classes11.dex */
public final class PdfViewerIntent_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private PdfViewerIntent_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent(context);
    }
}
