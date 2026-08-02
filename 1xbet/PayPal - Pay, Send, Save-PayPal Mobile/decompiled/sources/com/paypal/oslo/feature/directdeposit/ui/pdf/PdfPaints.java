package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPaints;", "", "Landroid/graphics/Paint;", "titlePaint", "bodyPaint", "dividerPaint", "", "blackColor", "grayColor", "<init>", "(Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;II)V", "component1", "()Landroid/graphics/Paint;", "component2", "component3", "component4", "()I", "component5", "copy", "(Landroid/graphics/Paint;Landroid/graphics/Paint;Landroid/graphics/Paint;II)Lcom/paypal/oslo/feature/directdeposit/ui/pdf/PdfPaints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Paint;", "getTitlePaint", "getBodyPaint", "getDividerPaint", com.visa.cbp.getEncExpo.warmup, "getBlackColor", "getGrayColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdfPaints {
    public static final int $stable = 8;
    private final int blackColor;
    private final android.graphics.Paint bodyPaint;
    private final android.graphics.Paint dividerPaint;
    private final int grayColor;
    private final android.graphics.Paint titlePaint;

    public PdfPaints(android.graphics.Paint paint, android.graphics.Paint paint2, android.graphics.Paint paint3, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paint2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paint3, "");
        this.titlePaint = paint;
        this.bodyPaint = paint2;
        this.dividerPaint = paint3;
        this.blackColor = i;
        this.grayColor = i2;
    }

    public final android.graphics.Paint getTitlePaint() {
        return this.titlePaint;
    }

    public final android.graphics.Paint getBodyPaint() {
        return this.bodyPaint;
    }

    public final android.graphics.Paint getDividerPaint() {
        return this.dividerPaint;
    }

    public final int getBlackColor() {
        return this.blackColor;
    }

    public final int getGrayColor() {
        return this.grayColor;
    }

    public final java.lang.String toString() {
        android.graphics.Paint paint = this.titlePaint;
        android.graphics.Paint paint2 = this.bodyPaint;
        android.graphics.Paint paint3 = this.dividerPaint;
        int i = this.blackColor;
        int i2 = this.grayColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PdfPaints(titlePaint=");
        sb.append(paint);
        sb.append(", bodyPaint=");
        sb.append(paint2);
        sb.append(", dividerPaint=");
        sb.append(paint3);
        sb.append(", blackColor=");
        sb.append(i);
        sb.append(", grayColor=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.titlePaint.hashCode() * 31) + this.bodyPaint.hashCode()) * 31) + this.dividerPaint.hashCode()) * 31) + java.lang.Integer.hashCode(this.blackColor)) * 31) + java.lang.Integer.hashCode(this.grayColor);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints pdfPaints = (com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.titlePaint, pdfPaints.titlePaint) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyPaint, pdfPaints.bodyPaint) && kotlin.jvm.internal.Intrinsics.areEqual(this.dividerPaint, pdfPaints.dividerPaint) && this.blackColor == pdfPaints.blackColor && this.grayColor == pdfPaints.grayColor;
    }

    public final com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints copy(android.graphics.Paint titlePaint, android.graphics.Paint bodyPaint, android.graphics.Paint dividerPaint, int blackColor, int grayColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titlePaint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyPaint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dividerPaint, "");
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints(titlePaint, bodyPaint, dividerPaint, blackColor, grayColor);
    }

    /* renamed from: component5, reason: from getter */
    public final int getGrayColor() {
        return this.grayColor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBlackColor() {
        return this.blackColor;
    }

    /* renamed from: component3, reason: from getter */
    public final android.graphics.Paint getDividerPaint() {
        return this.dividerPaint;
    }

    /* renamed from: component2, reason: from getter */
    public final android.graphics.Paint getBodyPaint() {
        return this.bodyPaint;
    }

    /* renamed from: component1, reason: from getter */
    public final android.graphics.Paint getTitlePaint() {
        return this.titlePaint;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints copy$default(com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints pdfPaints, android.graphics.Paint paint, android.graphics.Paint paint2, android.graphics.Paint paint3, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            paint = pdfPaints.titlePaint;
        }
        if ((i3 & 2) != 0) {
            paint2 = pdfPaints.bodyPaint;
        }
        android.graphics.Paint paint4 = paint2;
        if ((i3 & 4) != 0) {
            paint3 = pdfPaints.dividerPaint;
        }
        android.graphics.Paint paint5 = paint3;
        if ((i3 & 8) != 0) {
            i = pdfPaints.blackColor;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = pdfPaints.grayColor;
        }
        return pdfPaints.copy(paint, paint4, paint5, i4, i2);
    }
}
