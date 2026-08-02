package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/DirectDepositPdfRenderer;", "", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentOpener;", "opener", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentOpener;)V", "Ljava/io/File;", "pdfFile", "", "pageIndex", "width", "height", "Landroid/graphics/Bitmap;", "renderPageToBitmap", "(Ljava/io/File;III)Landroid/graphics/Bitmap;", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentHandle;", "p0", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentHandle;III)Landroid/graphics/Bitmap;", "getPageCount", "(Ljava/io/File;)I", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentOpener;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositPdfRenderer {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener getHighSpeedVideoFpsRanges;

    public DirectDepositPdfRenderer(com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener pdfDocumentOpener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfDocumentOpener, "");
        this.getHighSpeedVideoFpsRanges = pdfDocumentOpener;
    }

    public /* synthetic */ DirectDepositPdfRenderer(com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener pdfDocumentOpener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRendererKt.defaultPdfDocumentOpener() : pdfDocumentOpener);
    }

    public final android.graphics.Bitmap renderPageToBitmap(java.io.File pdfFile, int pageIndex, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfFile, "");
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle open = this.getHighSpeedVideoFpsRanges.open(pdfFile);
        if (open == null) {
            return null;
        }
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle pdfDocumentHandle = open;
        try {
            android.graphics.Bitmap highSpeedVideoSizes = getHighSpeedVideoSizes(pdfDocumentHandle, pageIndex, width, height);
            kotlin.io.CloseableKt.closeFinally(pdfDocumentHandle, null);
            return highSpeedVideoSizes;
        } finally {
        }
    }

    private static android.graphics.Bitmap getHighSpeedVideoSizes(com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle p0, int p1, int p2, int p3) {
        if (p1 >= 0 && p1 < p0.getPageCount()) {
            try {
                com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle openPage = p0.openPage(p1);
                try {
                    float min = java.lang.Math.min(p2 / r4.getWidth(), p3 / r4.getHeight());
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(kotlin.ranges.RangesKt.coerceAtLeast((int) (r4.getWidth() * min), 1), kotlin.ranges.RangesKt.coerceAtLeast((int) (r4.getHeight() * min), 1), android.graphics.Bitmap.Config.ARGB_8888);
                    openPage.render(createBitmap, 1);
                    kotlin.io.CloseableKt.closeFinally(openPage, null);
                    return createBitmap;
                } finally {
                }
            } catch (java.lang.IllegalArgumentException e) {
                com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to open PDF page", e);
            }
        }
        return null;
    }

    public final int getPageCount(java.io.File pdfFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfFile, "");
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle open = this.getHighSpeedVideoFpsRanges.open(pdfFile);
        if (open == null) {
            return 0;
        }
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle pdfDocumentHandle = open;
        try {
            int pageCount = pdfDocumentHandle.getPageCount();
            kotlin.io.CloseableKt.closeFinally(pdfDocumentHandle, null);
            return pageCount;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositPdfRenderer() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
