package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class CubicCurveData {
    private final android.graphics.PointF getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.PointF getHighSpeedVideoFpsRangesFor;
    private final android.graphics.PointF getHighSpeedVideoSizes;

    public CubicCurveData() {
        this.getHighSpeedVideoSizes = new android.graphics.PointF();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.PointF();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.PointF();
    }

    public CubicCurveData(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3) {
        this.getHighSpeedVideoSizes = pointF;
        this.getHighResolutionOutputSizeshNQ4ISI = pointF2;
        this.getHighSpeedVideoFpsRangesFor = pointF3;
    }

    public void setControlPoint1(float f, float f2) {
        this.getHighSpeedVideoSizes.set(f, f2);
    }

    public android.graphics.PointF getControlPoint1() {
        return this.getHighSpeedVideoSizes;
    }

    public void setControlPoint2(float f, float f2) {
        this.getHighResolutionOutputSizeshNQ4ISI.set(f, f2);
    }

    public android.graphics.PointF getControlPoint2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setVertex(float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor.set(f, f2);
    }

    public void setFrom(com.airbnb.lottie.model.CubicCurveData cubicCurveData) {
        setVertex(cubicCurveData.getHighSpeedVideoFpsRangesFor.x, cubicCurveData.getHighSpeedVideoFpsRangesFor.y);
        setControlPoint1(cubicCurveData.getHighSpeedVideoSizes.x, cubicCurveData.getHighSpeedVideoSizes.y);
        setControlPoint2(cubicCurveData.getHighResolutionOutputSizeshNQ4ISI.x, cubicCurveData.getHighResolutionOutputSizeshNQ4ISI.y);
    }

    public android.graphics.PointF getVertex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        return java.lang.String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor.x), java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor.y), java.lang.Float.valueOf(this.getHighSpeedVideoSizes.x), java.lang.Float.valueOf(this.getHighSpeedVideoSizes.y), java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.x), java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.y));
    }
}
