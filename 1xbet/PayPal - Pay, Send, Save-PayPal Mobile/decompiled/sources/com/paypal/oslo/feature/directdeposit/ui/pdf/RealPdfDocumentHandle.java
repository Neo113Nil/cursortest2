package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/RealPdfDocumentHandle;", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentHandle;", "Landroid/os/ParcelFileDescriptor;", "p0", "Landroid/graphics/pdf/PdfRenderer;", "p1", "<init>", "(Landroid/os/ParcelFileDescriptor;Landroid/graphics/pdf/PdfRenderer;)V", "", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPageHandle;", "openPage", "(I)Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPageHandle;", "", "close", "()V", "getHighSpeedVideoFpsRangesFor", "Landroid/os/ParcelFileDescriptor;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroid/graphics/pdf/PdfRenderer;", "getPageCount", "()I", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RealPdfDocumentHandle implements com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle {
    private final android.graphics.pdf.PdfRenderer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.os.ParcelFileDescriptor getHighResolutionOutputSizeshNQ4ISI;

    public RealPdfDocumentHandle(android.os.ParcelFileDescriptor parcelFileDescriptor, android.graphics.pdf.PdfRenderer pdfRenderer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelFileDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfRenderer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = parcelFileDescriptor;
        this.Camera2StreamConfigurationMap = pdfRenderer;
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle
    public final int getPageCount() {
        return this.Camera2StreamConfigurationMap.getPageCount();
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle
    public final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle openPage(int p0) {
        final android.graphics.pdf.PdfRenderer.Page openPage = this.Camera2StreamConfigurationMap.openPage(p0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openPage, "");
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle() { // from class: com.paypal.oslo.feature.directdeposit.ui.pdf.RealPdfDocumentHandle$openPage$1
            @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle
            public final int getWidth() {
                return openPage.getWidth();
            }

            @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle
            public final int getHeight() {
                return openPage.getHeight();
            }

            @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle
            public final void render(android.graphics.Bitmap dest, int renderMode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
                openPage.render(dest, null, null, renderMode);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                openPage.close();
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.close();
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }
}
