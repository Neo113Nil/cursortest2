package com.paypal.oslo.feature.cryptocurrency.ui.common.qr;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeAnalyzer;", "", "<init>", "()V", "Lcom/google/zxing/common/BitMatrix;", "bitMatrix", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;", "analyze", "(Lcom/google/zxing/common/BitMatrix;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;", "", "density", "Landroidx/compose/ui/unit/Dp;", "calculateMarkerOffset-u2uoSUM", "(F)F", "calculateMarkerOffset", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "DensityResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QRCodeAnalyzer {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer();
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(12.2f);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);

    private QRCodeAnalyzer() {
    }

    /* renamed from: calculateMarkerOffset-u2uoSUM, reason: not valid java name */
    public final float m13867calculateMarkerOffsetu2uoSUM(float density) {
        if (0.0f > density || density > 1.0f) {
            throw new java.lang.IllegalArgumentException("Density must be between 0.0 and 1.0".toString());
        }
        if (density < 0.45f) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        if (density < 0.55f) {
            return getHighSpeedVideoFpsRangesFor;
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeAnalyzer$DensityResult;", "", "", "p0", "", "p1", "p2", "<init>", "(FII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class DensityResult {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final float Camera2StreamConfigurationMap;

        public DensityResult(float f, int i, int i2) {
            this.Camera2StreamConfigurationMap = f;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = i2;
        }

        public final java.lang.String toString() {
            float f = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DensityResult(Camera2StreamConfigurationMap=");
            sb.append(f);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(i);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Float.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.DensityResult)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.DensityResult densityResult = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.DensityResult) p0;
            return java.lang.Float.compare(this.Camera2StreamConfigurationMap, densityResult.Camera2StreamConfigurationMap) == 0 && this.getHighSpeedVideoFpsRanges == densityResult.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == densityResult.getHighSpeedVideoSizes;
        }
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics analyze(com.google.zxing.common.BitMatrix bitMatrix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        int height = bitMatrix.getHeight();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            int width = bitMatrix.getWidth();
            for (int i4 = 0; i4 < width; i4++) {
                i++;
                if (bitMatrix.get(i4, i3)) {
                    i2++;
                }
            }
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.DensityResult densityResult = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.DensityResult(i > 0 ? i2 / i : 0.0f, i2, i);
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.INSTANCE.getVersion(bitMatrix), densityResult.Camera2StreamConfigurationMap, densityResult.getHighSpeedVideoFpsRanges, densityResult.getHighSpeedVideoSizes, m13867calculateMarkerOffsetu2uoSUM(densityResult.Camera2StreamConfigurationMap), com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.INSTANCE.detectPositionMarkers(bitMatrix), null);
    }
}
