package com.microblink.blinkid.metadata.detection.points;

/* loaded from: classes10.dex */
public final class DisplayablePointsDetection extends com.microblink.blinkid.metadata.detection.DisplayableDetection {
    private com.microblink.blinkid.geometry.PointSet getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.geometry.PointSet getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.metadata.detection.points.PointsType getHighSpeedVideoSizes;

    public DisplayablePointsDetection(int i, float[] fArr, float[] fArr2, int i2) {
        super(i, fArr);
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.geometry.PointSet(fArr2);
        this.getHighSpeedVideoSizes = com.microblink.blinkid.metadata.detection.points.PointsType.values()[i2];
    }

    public final com.microblink.blinkid.geometry.PointSet getPointSet() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final com.microblink.blinkid.metadata.detection.points.PointsType getPointsType() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.geometry.PointSet getTransformedPointSet() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            float[] floatArray = this.getHighSpeedVideoFpsRanges.toFloatArray();
            this.llIIlIlIIl.mapPoints(floatArray);
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.geometry.PointSet(floatArray);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
