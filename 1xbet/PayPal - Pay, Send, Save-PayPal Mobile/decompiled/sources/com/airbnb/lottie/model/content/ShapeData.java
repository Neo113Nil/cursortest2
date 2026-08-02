package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapeData {
    private final java.util.List<com.airbnb.lottie.model.CubicCurveData> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private android.graphics.PointF getHighSpeedVideoSizes;

    public ShapeData(android.graphics.PointF pointF, boolean z, java.util.List<com.airbnb.lottie.model.CubicCurveData> list) {
        this.getHighSpeedVideoSizes = pointF;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(list);
    }

    public ShapeData() {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    public void setInitialPoint(float f, float f2) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new android.graphics.PointF();
        }
        this.getHighSpeedVideoSizes.set(f, f2);
    }

    public android.graphics.PointF getInitialPoint() {
        return this.getHighSpeedVideoSizes;
    }

    public void setClosed(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public boolean isClosed() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.List<com.airbnb.lottie.model.CubicCurveData> getCurves() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void interpolateBetween(com.airbnb.lottie.model.content.ShapeData shapeData, com.airbnb.lottie.model.content.ShapeData shapeData2, float f) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new android.graphics.PointF();
        }
        this.getHighSpeedVideoFpsRangesFor = shapeData.isClosed() || shapeData2.isClosed();
        if (shapeData.getCurves().size() != shapeData2.getCurves().size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(shapeData.getCurves().size());
            sb.append("\tShape 2: ");
            sb.append(shapeData2.getCurves().size());
            com.airbnb.lottie.utils.Logger.warning(sb.toString());
        }
        int min = java.lang.Math.min(shapeData.getCurves().size(), shapeData2.getCurves().size());
        if (this.getHighResolutionOutputSizeshNQ4ISI.size() < min) {
            for (int size = this.getHighResolutionOutputSizeshNQ4ISI.size(); size < min; size++) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(new com.airbnb.lottie.model.CubicCurveData());
            }
        } else if (this.getHighResolutionOutputSizeshNQ4ISI.size() > min) {
            for (int size2 = this.getHighResolutionOutputSizeshNQ4ISI.size() - 1; size2 >= min; size2--) {
                java.util.List<com.airbnb.lottie.model.CubicCurveData> list = this.getHighResolutionOutputSizeshNQ4ISI;
                list.remove(list.size() - 1);
            }
        }
        android.graphics.PointF initialPoint = shapeData.getInitialPoint();
        android.graphics.PointF initialPoint2 = shapeData2.getInitialPoint();
        setInitialPoint(com.airbnb.lottie.utils.MiscUtils.lerp(initialPoint.x, initialPoint2.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(initialPoint.y, initialPoint2.y, f));
        for (int size3 = this.getHighResolutionOutputSizeshNQ4ISI.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.CubicCurveData cubicCurveData = shapeData.getCurves().get(size3);
            com.airbnb.lottie.model.CubicCurveData cubicCurveData2 = shapeData2.getCurves().get(size3);
            android.graphics.PointF controlPoint1 = cubicCurveData.getControlPoint1();
            android.graphics.PointF controlPoint2 = cubicCurveData.getControlPoint2();
            android.graphics.PointF vertex = cubicCurveData.getVertex();
            android.graphics.PointF controlPoint12 = cubicCurveData2.getControlPoint1();
            android.graphics.PointF controlPoint22 = cubicCurveData2.getControlPoint2();
            android.graphics.PointF vertex2 = cubicCurveData2.getVertex();
            this.getHighResolutionOutputSizeshNQ4ISI.get(size3).setControlPoint1(com.airbnb.lottie.utils.MiscUtils.lerp(controlPoint1.x, controlPoint12.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(controlPoint1.y, controlPoint12.y, f));
            this.getHighResolutionOutputSizeshNQ4ISI.get(size3).setControlPoint2(com.airbnb.lottie.utils.MiscUtils.lerp(controlPoint2.x, controlPoint22.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(controlPoint2.y, controlPoint22.y, f));
            this.getHighResolutionOutputSizeshNQ4ISI.get(size3).setVertex(com.airbnb.lottie.utils.MiscUtils.lerp(vertex.x, vertex2.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(vertex.y, vertex2.y, f));
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeData{numCurves=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.size());
        sb.append("closed=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
