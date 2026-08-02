package com.microblink.blinkid.entities.detectors.quad.document;

/* loaded from: classes9.dex */
public class DocumentSpecification extends com.microblink.blinkid.entities.detectors.quad.Specification {
    public DocumentSpecification(double d, float f) {
        super(nativeConstruct(d, f), true);
    }

    public static com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset documentSpecificationPreset) {
        return new com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification(nativeCreateFromPreset(documentSpecificationPreset.ordinal()), true);
    }

    private static native long nativeConstruct(double d, float f);

    private static native long nativeCreateFromPreset(int i);

    private static native void nativeDestruct(long j);

    private static native double nativeGetAspectRatio(long j);

    private static native void nativeGetLandscapeScale(long j, double[] dArr);

    private static native double nativeGetMaxAngle(long j);

    private static native void nativeGetPortraitScale(long j, double[] dArr);

    private static native int nativeGetScanningMode(long j);

    private static native void nativeGetXRange(long j, double[] dArr);

    private static native void nativeGetYRange(long j, double[] dArr);

    private static native void nativeSetAspectRatio(long j, double d);

    private static native void nativeSetLandscapeScale(long j, double d, double d2);

    private static native void nativeSetMaxAngle(long j, double d);

    private static native void nativeSetPortraitScale(long j, double d, double d2);

    private static native void nativeSetScanningMode(long j, int i);

    private static native void nativeSetXRange(long j, double d, double d2);

    private static native void nativeSetYRange(long j, double d, double d2);

    public double getAspectRatio() {
        return nativeGetAspectRatio(this.llIIlIlIIl);
    }

    public com.microblink.blinkid.entities.detectors.quad.document.DetectionMode getDetectionMode() {
        return com.microblink.blinkid.entities.detectors.quad.document.DetectionMode.values()[nativeGetScanningMode(this.llIIlIlIIl)];
    }

    public double[] getLandscapeScale() {
        double[] dArr = new double[2];
        nativeGetLandscapeScale(this.llIIlIlIIl, dArr);
        return dArr;
    }

    public double getMaxAngle() {
        return nativeGetMaxAngle(this.llIIlIlIIl);
    }

    public double[] getPortraitScale() {
        double[] dArr = new double[2];
        nativeGetPortraitScale(this.llIIlIlIIl, dArr);
        return dArr;
    }

    public double[] getXRange() {
        double[] dArr = new double[2];
        nativeGetXRange(this.llIIlIlIIl, dArr);
        return dArr;
    }

    public double[] getYRange() {
        double[] dArr = new double[2];
        nativeGetYRange(this.llIIlIlIIl, dArr);
        return dArr;
    }

    @Override // com.microblink.blinkid.entities.detectors.quad.Specification
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public void setAspectRatio(double d) {
        if (d <= 0.0d) {
            throw new java.lang.IllegalArgumentException("Aspect ratio must be positive!");
        }
        nativeSetAspectRatio(this.llIIlIlIIl, d);
    }

    public void setDetectionMode(com.microblink.blinkid.entities.detectors.quad.document.DetectionMode detectionMode) {
        nativeSetScanningMode(this.llIIlIlIIl, detectionMode.ordinal());
    }

    public void setLandscapeScale(double d, double d2) {
        if (d <= 0.0d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("Scale must be > 0.0 and <= 1.0");
        }
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new java.lang.IllegalStateException("Tolerance must be >= 0.0 and <= 1.0");
        }
        nativeSetLandscapeScale(this.llIIlIlIIl, d, d2);
    }

    public void setMaxAngle(double d) {
        if (d < 0.0d || d > 35.0d) {
            throw new java.lang.IllegalArgumentException("Maximum angle cannot be less than 0 or larger than 35 degrees");
        }
        nativeSetMaxAngle(this.llIIlIlIIl, d);
    }

    public void setPortraitScale(double d, double d2) {
        if (d <= 0.0d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("Scale must be > 0.0 and <= 1.0");
        }
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new java.lang.IllegalStateException("Tolerance must be >= 0.0 and <= 1.0");
        }
        nativeSetPortraitScale(this.llIIlIlIIl, d, d2);
    }

    public void setScale(double d, double d2) {
        setLandscapeScale(d, d2);
        setPortraitScale(d, d2);
    }

    public void setXRange(double d, double d2) {
        if (d < -1.0d || d > 0.0d) {
            throw new java.lang.IllegalArgumentException("Left X range must be >= -1.0 and <= 0.0");
        }
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Right X range must be >= 0.0 and <= 1.0");
        }
        nativeSetXRange(this.llIIlIlIIl, d, d2);
    }

    public void setYRange(double d, double d2) {
        if (d < -1.0d || d > 0.0d) {
            throw new java.lang.IllegalArgumentException("Left X range must be >= -1.0 and <= 0.0");
        }
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Right X range must be >= 0.0 and <= 1.0");
        }
        nativeSetYRange(this.llIIlIlIIl, d, d2);
    }

    DocumentSpecification(long j, boolean z) {
        super(j, z);
    }
}
