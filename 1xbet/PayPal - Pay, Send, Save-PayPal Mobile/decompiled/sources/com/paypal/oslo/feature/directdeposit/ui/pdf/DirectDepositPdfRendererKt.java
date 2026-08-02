package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentOpener;", "defaultPdfDocumentOpener", "()Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentOpener;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositPdfRendererKt {
    public static final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener defaultPdfDocumentOpener() {
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener() { // from class: com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRendererKt$$ExternalSyntheticLambda0
            @Override // com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentOpener
            public final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle open(java.io.File file) {
                com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRendererKt.getHighSpeedVideoFpsRanges(file);
                return highSpeedVideoFpsRanges;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfDocumentHandle getHighSpeedVideoFpsRanges(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        try {
            android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, 268435456);
            kotlin.jvm.internal.Intrinsics.checkNotNull(open);
            return new com.paypal.oslo.feature.directdeposit.ui.pdf.RealPdfDocumentHandle(open, new android.graphics.pdf.PdfRenderer(open));
        } catch (java.io.IOException e) {
            com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to open PDF document", e);
            return null;
        } catch (java.lang.SecurityException e2) {
            com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Security exception when opening PDF document", e2);
            return null;
        }
    }
}
