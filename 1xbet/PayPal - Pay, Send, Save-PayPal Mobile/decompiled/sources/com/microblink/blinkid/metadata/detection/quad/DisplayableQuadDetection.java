package com.microblink.blinkid.metadata.detection.quad;

/* loaded from: classes10.dex */
public final class DisplayableQuadDetection extends com.microblink.blinkid.metadata.detection.DisplayableDetection {
    private final com.microblink.blinkid.geometry.Quadrilateral getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.geometry.Quadrilateral getHighSpeedVideoFpsRangesFor;

    public DisplayableQuadDetection(int i, float[] fArr, float[] fArr2) {
        super(i, fArr);
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.geometry.Quadrilateral(fArr2);
    }

    public final com.microblink.blinkid.geometry.Quadrilateral getDisplayLocation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final com.microblink.blinkid.geometry.Quadrilateral getTransformedDisplayLocation() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            float[] fArr = new float[8];
            this.getHighSpeedVideoFpsRanges.toFloatArray(fArr);
            this.llIIlIlIIl.mapPoints(fArr);
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.geometry.Quadrilateral(fArr);
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
