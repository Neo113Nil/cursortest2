package com.microblink.blinkid.geometry;

/* loaded from: classes10.dex */
public class QuadrangleEvaluator implements android.animation.TypeEvaluator<com.microblink.blinkid.geometry.Quadrilateral> {
    private final android.animation.ArgbEvaluator Camera2StreamConfigurationMap = new android.animation.ArgbEvaluator();
    private final com.microblink.blinkid.geometry.Quadrilateral getHighSpeedVideoFpsRanges = new com.microblink.blinkid.geometry.Quadrilateral();

    @Override // android.animation.TypeEvaluator
    public com.microblink.blinkid.geometry.Quadrilateral evaluate(float f, com.microblink.blinkid.geometry.Quadrilateral quadrilateral, com.microblink.blinkid.geometry.Quadrilateral quadrilateral2) {
        int intValue = ((java.lang.Integer) this.Camera2StreamConfigurationMap.evaluate(f, java.lang.Integer.valueOf(quadrilateral.getColor()), java.lang.Integer.valueOf(quadrilateral2.getColor()))).intValue();
        com.microblink.blinkid.geometry.Point makeCopy = quadrilateral2.getUpperLeft().makeCopy();
        makeCopy.operatorMinusEquals(quadrilateral.getUpperLeft()).operatorMultiplyEquals(f);
        com.microblink.blinkid.geometry.Point makeCopy2 = quadrilateral2.getUpperRight().makeCopy();
        makeCopy2.operatorMinusEquals(quadrilateral.getUpperRight()).operatorMultiplyEquals(f);
        com.microblink.blinkid.geometry.Point makeCopy3 = quadrilateral2.getLowerLeft().makeCopy();
        makeCopy3.operatorMinusEquals(quadrilateral.getLowerLeft()).operatorMultiplyEquals(f);
        com.microblink.blinkid.geometry.Point makeCopy4 = quadrilateral2.getLowerRight().makeCopy();
        makeCopy4.operatorMinusEquals(quadrilateral.getLowerRight()).operatorMultiplyEquals(f);
        this.getHighSpeedVideoFpsRanges.setPoints(quadrilateral.getUpperLeft().operatorPlus(makeCopy), quadrilateral.getUpperRight().operatorPlus(makeCopy2), quadrilateral.getLowerLeft().operatorPlus(makeCopy3), quadrilateral.getLowerRight().operatorPlus(makeCopy4));
        this.getHighSpeedVideoFpsRanges.setColor(intValue);
        if (quadrilateral2.isDefaultQuad() && (f > 0.95d || quadrilateral.isDefaultQuad())) {
            this.getHighSpeedVideoFpsRanges.setIsDefaultQuad(true);
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}
