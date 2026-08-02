package com.miteksystems.misnap.document.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001B±\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J¸\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0018J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u00106R\"\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u00106R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010<R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010=\u001a\u0004\b>\u0010 \"\u0004\b?\u0010@R\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u00106R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010<R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u00109\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010<R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00103\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u00106R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u00106R\"\u0010\n\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u00106R\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00103\u001a\u0004\bM\u0010\u0018\"\u0004\bN\u00106R\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00103\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u00106R\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u00103\u001a\u0004\bQ\u0010\u0018\"\u0004\bR\u00106R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\bS\u0010\u0018\"\u0004\bT\u00106R\"\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u00106"}, d2 = {"Lcom/miteksystems/misnap/document/internal/CoreFlowIqaResults;", "", "", "brightness", "sharpness", "fourCornerConfidence", "skewAngle", "rotationAngle", "horizontalFill", "padding", "noGlareConfidence", "solidBackgroundConfidence", "contrastConfidence", "mrzConfidence", "", "Landroid/graphics/Point;", "fourCorners", "documentBoundingBox", "glareBoundingBox", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "documentOcr", "<init>", "(IIIIIIIIIII[Landroid/graphics/Point;[Landroid/graphics/Point;[Landroid/graphics/Point;Lcom/miteksystems/misnap/document/internal/BaseDocument;)V", "component1", "()I", "component10", "component11", "component12", "()[Landroid/graphics/Point;", "component13", "component14", "component15", "()Lcom/miteksystems/misnap/document/internal/BaseDocument;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIIIIIIIII[Landroid/graphics/Point;[Landroid/graphics/Point;[Landroid/graphics/Point;Lcom/miteksystems/misnap/document/internal/BaseDocument;)Lcom/miteksystems/misnap/document/internal/CoreFlowIqaResults;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getBrightness", "setBrightness", "(I)V", "getContrastConfidence", "setContrastConfidence", "[Landroid/graphics/Point;", "getDocumentBoundingBox", "setDocumentBoundingBox", "([Landroid/graphics/Point;)V", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "getDocumentOcr", "setDocumentOcr", "(Lcom/miteksystems/misnap/document/internal/BaseDocument;)V", "getFourCornerConfidence", "setFourCornerConfidence", "getFourCorners", "setFourCorners", "getGlareBoundingBox", "setGlareBoundingBox", "getHorizontalFill", "setHorizontalFill", "getMrzConfidence", "setMrzConfidence", "getNoGlareConfidence", "setNoGlareConfidence", "getPadding", "setPadding", "getRotationAngle", "setRotationAngle", "getSharpness", "setSharpness", "getSkewAngle", "setSkewAngle", "getSolidBackgroundConfidence", "setSolidBackgroundConfidence"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CoreFlowIqaResults {
    private int brightness;
    private int contrastConfidence;
    private android.graphics.Point[] documentBoundingBox;
    private com.miteksystems.misnap.document.internal.BaseDocument documentOcr;
    private int fourCornerConfidence;
    private android.graphics.Point[] fourCorners;
    private android.graphics.Point[] glareBoundingBox;
    private int horizontalFill;
    private int mrzConfidence;
    private int noGlareConfidence;
    private int padding;
    private int rotationAngle;
    private int sharpness;
    private int skewAngle;
    private int solidBackgroundConfidence;

    public CoreFlowIqaResults() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 32767, null);
    }

    public CoreFlowIqaResults(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, android.graphics.Point[] pointArr, android.graphics.Point[] pointArr2, android.graphics.Point[] pointArr3, com.miteksystems.misnap.document.internal.BaseDocument baseDocument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDocument, "");
        this.brightness = i;
        this.sharpness = i2;
        this.fourCornerConfidence = i3;
        this.skewAngle = i4;
        this.rotationAngle = i5;
        this.horizontalFill = i6;
        this.padding = i7;
        this.noGlareConfidence = i8;
        this.solidBackgroundConfidence = i9;
        this.contrastConfidence = i10;
        this.mrzConfidence = i11;
        this.fourCorners = pointArr;
        this.documentBoundingBox = pointArr2;
        this.glareBoundingBox = pointArr3;
        this.documentOcr = baseDocument;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CoreFlowIqaResults(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, android.graphics.Point[] pointArr, android.graphics.Point[] pointArr2, android.graphics.Point[] pointArr3, com.miteksystems.misnap.document.internal.BaseDocument baseDocument, int i12, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r34, r16, r13, (i12 & 16384) != 0 ? com.miteksystems.misnap.document.internal.BaseDocument.Default.INSTANCE : baseDocument);
        android.graphics.Point[] pointArr4;
        android.graphics.Point[] pointArr5;
        android.graphics.Point[] pointArr6;
        android.graphics.Point[] pointArr7;
        android.graphics.Point[] pointArr8;
        int i13 = (i12 & 1) != 0 ? Integer.MIN_VALUE : i;
        int i14 = (i12 & 2) != 0 ? Integer.MIN_VALUE : i2;
        int i15 = (i12 & 4) != 0 ? Integer.MIN_VALUE : i3;
        int i16 = (i12 & 8) != 0 ? Integer.MIN_VALUE : i4;
        int i17 = (i12 & 16) != 0 ? Integer.MIN_VALUE : i5;
        int i18 = (i12 & 32) != 0 ? Integer.MIN_VALUE : i6;
        int i19 = (i12 & 64) != 0 ? Integer.MIN_VALUE : i7;
        int i20 = (i12 & 128) != 0 ? Integer.MIN_VALUE : i8;
        int i21 = (i12 & 256) != 0 ? Integer.MIN_VALUE : i9;
        int i22 = (i12 & 512) != 0 ? Integer.MIN_VALUE : i10;
        int i23 = (i12 & 1024) == 0 ? i11 : Integer.MIN_VALUE;
        int i24 = 0;
        if ((i12 & 2048) != 0) {
            pointArr4 = new android.graphics.Point[4];
            int i25 = 0;
            for (int i26 = 4; i25 < i26; i26 = 4) {
                pointArr4[i25] = new android.graphics.Point(0, 0);
                i25++;
            }
        } else {
            pointArr4 = pointArr;
        }
        if ((i12 & 4096) != 0) {
            pointArr6 = new android.graphics.Point[2];
            for (int i27 = 2; i24 < i27; i27 = 2) {
                pointArr6[i24] = new android.graphics.Point(0, 0);
                i24++;
                pointArr4 = pointArr4;
            }
            pointArr5 = pointArr4;
        } else {
            pointArr5 = pointArr4;
            pointArr6 = pointArr2;
        }
        if ((i12 & 8192) != 0) {
            pointArr8 = new android.graphics.Point[4];
            int i28 = 0;
            for (int i29 = 4; i28 < i29; i29 = 4) {
                pointArr8[i28] = new android.graphics.Point(0, 0);
                i28++;
                pointArr6 = pointArr6;
            }
            pointArr7 = pointArr6;
        } else {
            pointArr7 = pointArr6;
            pointArr8 = pointArr3;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CoreFlowIqaResults(brightness=");
        sb.append(this.brightness);
        sb.append(", sharpness=");
        sb.append(this.sharpness);
        sb.append(", fourCornerConfidence=");
        sb.append(this.fourCornerConfidence);
        sb.append(", skewAngle=");
        sb.append(this.skewAngle);
        sb.append(", rotationAngle=");
        sb.append(this.rotationAngle);
        sb.append(", horizontalFill=");
        sb.append(this.horizontalFill);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", noGlareConfidence=");
        sb.append(this.noGlareConfidence);
        sb.append(", solidBackgroundConfidence=");
        sb.append(this.solidBackgroundConfidence);
        sb.append(", contrastConfidence=");
        sb.append(this.contrastConfidence);
        sb.append(", mrzConfidence=");
        sb.append(this.mrzConfidence);
        sb.append(", fourCorners=");
        sb.append(java.util.Arrays.toString(this.fourCorners));
        sb.append(", documentBoundingBox=");
        sb.append(java.util.Arrays.toString(this.documentBoundingBox));
        sb.append(", glareBoundingBox=");
        sb.append(java.util.Arrays.toString(this.glareBoundingBox));
        sb.append(", documentOcr=");
        sb.append(this.documentOcr);
        sb.append(')');
        return sb.toString();
    }

    public final void setSolidBackgroundConfidence(int i) {
        this.solidBackgroundConfidence = i;
    }

    public final void setSkewAngle(int i) {
        this.skewAngle = i;
    }

    public final void setSharpness(int i) {
        this.sharpness = i;
    }

    public final void setRotationAngle(int i) {
        this.rotationAngle = i;
    }

    public final void setPadding(int i) {
        this.padding = i;
    }

    public final void setNoGlareConfidence(int i) {
        this.noGlareConfidence = i;
    }

    public final void setMrzConfidence(int i) {
        this.mrzConfidence = i;
    }

    public final void setHorizontalFill(int i) {
        this.horizontalFill = i;
    }

    public final void setGlareBoundingBox(android.graphics.Point[] pointArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
        this.glareBoundingBox = pointArr;
    }

    public final void setFourCorners(android.graphics.Point[] pointArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
        this.fourCorners = pointArr;
    }

    public final void setFourCornerConfidence(int i) {
        this.fourCornerConfidence = i;
    }

    public final void setDocumentOcr(com.miteksystems.misnap.document.internal.BaseDocument baseDocument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDocument, "");
        this.documentOcr = baseDocument;
    }

    public final void setDocumentBoundingBox(android.graphics.Point[] pointArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
        this.documentBoundingBox = pointArr;
    }

    public final void setContrastConfidence(int i) {
        this.contrastConfidence = i;
    }

    public final void setBrightness(int i) {
        this.brightness = i;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((java.lang.Integer.hashCode(this.brightness) * 31) + java.lang.Integer.hashCode(this.sharpness)) * 31) + java.lang.Integer.hashCode(this.fourCornerConfidence)) * 31) + java.lang.Integer.hashCode(this.skewAngle)) * 31) + java.lang.Integer.hashCode(this.rotationAngle)) * 31) + java.lang.Integer.hashCode(this.horizontalFill)) * 31) + java.lang.Integer.hashCode(this.padding)) * 31) + java.lang.Integer.hashCode(this.noGlareConfidence)) * 31) + java.lang.Integer.hashCode(this.solidBackgroundConfidence)) * 31) + java.lang.Integer.hashCode(this.contrastConfidence)) * 31) + java.lang.Integer.hashCode(this.mrzConfidence)) * 31) + java.util.Arrays.hashCode(this.fourCorners)) * 31) + java.util.Arrays.hashCode(this.documentBoundingBox)) * 31) + java.util.Arrays.hashCode(this.glareBoundingBox)) * 31) + this.documentOcr.hashCode();
    }

    public final int getSolidBackgroundConfidence() {
        return this.solidBackgroundConfidence;
    }

    public final int getSkewAngle() {
        return this.skewAngle;
    }

    public final int getSharpness() {
        return this.sharpness;
    }

    public final int getRotationAngle() {
        return this.rotationAngle;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final int getNoGlareConfidence() {
        return this.noGlareConfidence;
    }

    public final int getMrzConfidence() {
        return this.mrzConfidence;
    }

    public final int getHorizontalFill() {
        return this.horizontalFill;
    }

    public final android.graphics.Point[] getGlareBoundingBox() {
        return this.glareBoundingBox;
    }

    public final android.graphics.Point[] getFourCorners() {
        return this.fourCorners;
    }

    public final int getFourCornerConfidence() {
        return this.fourCornerConfidence;
    }

    public final com.miteksystems.misnap.document.internal.BaseDocument getDocumentOcr() {
        return this.documentOcr;
    }

    public final android.graphics.Point[] getDocumentBoundingBox() {
        return this.documentBoundingBox;
    }

    public final int getContrastConfidence() {
        return this.contrastConfidence;
    }

    public final int getBrightness() {
        return this.brightness;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.document.internal.CoreFlowIqaResults)) {
            return false;
        }
        com.miteksystems.misnap.document.internal.CoreFlowIqaResults coreFlowIqaResults = (com.miteksystems.misnap.document.internal.CoreFlowIqaResults) other;
        return this.brightness == coreFlowIqaResults.brightness && this.sharpness == coreFlowIqaResults.sharpness && this.fourCornerConfidence == coreFlowIqaResults.fourCornerConfidence && this.skewAngle == coreFlowIqaResults.skewAngle && this.rotationAngle == coreFlowIqaResults.rotationAngle && this.horizontalFill == coreFlowIqaResults.horizontalFill && this.padding == coreFlowIqaResults.padding && this.noGlareConfidence == coreFlowIqaResults.noGlareConfidence && this.solidBackgroundConfidence == coreFlowIqaResults.solidBackgroundConfidence && this.contrastConfidence == coreFlowIqaResults.contrastConfidence && this.mrzConfidence == coreFlowIqaResults.mrzConfidence && kotlin.jvm.internal.Intrinsics.areEqual(this.fourCorners, coreFlowIqaResults.fourCorners) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentBoundingBox, coreFlowIqaResults.documentBoundingBox) && kotlin.jvm.internal.Intrinsics.areEqual(this.glareBoundingBox, coreFlowIqaResults.glareBoundingBox) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentOcr, coreFlowIqaResults.documentOcr);
    }

    public final com.miteksystems.misnap.document.internal.CoreFlowIqaResults copy(int brightness, int sharpness, int fourCornerConfidence, int skewAngle, int rotationAngle, int horizontalFill, int padding, int noGlareConfidence, int solidBackgroundConfidence, int contrastConfidence, int mrzConfidence, android.graphics.Point[] fourCorners, android.graphics.Point[] documentBoundingBox, android.graphics.Point[] glareBoundingBox, com.miteksystems.misnap.document.internal.BaseDocument documentOcr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fourCorners, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentBoundingBox, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glareBoundingBox, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentOcr, "");
        return new com.miteksystems.misnap.document.internal.CoreFlowIqaResults(brightness, sharpness, fourCornerConfidence, skewAngle, rotationAngle, horizontalFill, padding, noGlareConfidence, solidBackgroundConfidence, contrastConfidence, mrzConfidence, fourCorners, documentBoundingBox, glareBoundingBox, documentOcr);
    }

    /* renamed from: component9, reason: from getter */
    public final int getSolidBackgroundConfidence() {
        return this.solidBackgroundConfidence;
    }

    /* renamed from: component8, reason: from getter */
    public final int getNoGlareConfidence() {
        return this.noGlareConfidence;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHorizontalFill() {
        return this.horizontalFill;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRotationAngle() {
        return this.rotationAngle;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSkewAngle() {
        return this.skewAngle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFourCornerConfidence() {
        return this.fourCornerConfidence;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSharpness() {
        return this.sharpness;
    }

    /* renamed from: component15, reason: from getter */
    public final com.miteksystems.misnap.document.internal.BaseDocument getDocumentOcr() {
        return this.documentOcr;
    }

    /* renamed from: component14, reason: from getter */
    public final android.graphics.Point[] getGlareBoundingBox() {
        return this.glareBoundingBox;
    }

    /* renamed from: component13, reason: from getter */
    public final android.graphics.Point[] getDocumentBoundingBox() {
        return this.documentBoundingBox;
    }

    /* renamed from: component12, reason: from getter */
    public final android.graphics.Point[] getFourCorners() {
        return this.fourCorners;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMrzConfidence() {
        return this.mrzConfidence;
    }

    /* renamed from: component10, reason: from getter */
    public final int getContrastConfidence() {
        return this.contrastConfidence;
    }

    /* renamed from: component1, reason: from getter */
    public final int getBrightness() {
        return this.brightness;
    }
}
