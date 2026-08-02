package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfDocumentHandle;", "Ljava/io/Closeable;", "", "index", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPageHandle;", "openPage", "(I)Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPageHandle;", "getPageCount", "()I", "pageCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PdfDocumentHandle extends java.io.Closeable {
    int getPageCount();

    com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPageHandle openPage(int index);
}
