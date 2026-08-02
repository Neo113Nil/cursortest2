package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class RoundedCornersContent implements com.airbnb.lottie.animation.content.ShapeModifierContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.LottieDrawable getHighSpeedVideoFpsRangesFor;
    private com.airbnb.lottie.model.content.ShapeData getHighSpeedVideoSizes;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
    }

    public RoundedCornersContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.RoundedCorners roundedCorners) {
        this.getHighSpeedVideoFpsRangesFor = lottieDrawable;
        this.Camera2StreamConfigurationMap = roundedCorners.getName();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> createAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.getHighSpeedVideoFpsRanges = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighSpeedVideoFpsRangesFor.invalidateSelf();
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getRoundedCorners() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public void addUpdateListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener) {
        this.getHighSpeedVideoFpsRanges.addUpdateListener(animationListener);
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public com.airbnb.lottie.model.content.ShapeData modifyShape(com.airbnb.lottie.model.content.ShapeData shapeData) {
        java.util.List<com.airbnb.lottie.model.CubicCurveData> list;
        com.airbnb.lottie.model.content.ShapeData shapeData2;
        java.util.List<com.airbnb.lottie.model.CubicCurveData> list2;
        boolean z;
        java.util.List<com.airbnb.lottie.model.CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() > 2) {
            float floatValue = this.getHighSpeedVideoFpsRanges.getValue().floatValue();
            if (floatValue != 0.0f) {
                java.util.List<com.airbnb.lottie.model.CubicCurveData> curves2 = shapeData.getCurves();
                boolean isClosed = shapeData.isClosed();
                boolean z2 = true;
                int size = curves2.size() - 1;
                int i = 0;
                while (size >= 0) {
                    com.airbnb.lottie.model.CubicCurveData cubicCurveData = curves2.get(size);
                    com.airbnb.lottie.model.CubicCurveData cubicCurveData2 = curves2.get(getHighSpeedVideoFpsRanges(size - 1, curves2.size()));
                    android.graphics.PointF vertex = (size != 0 || isClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
                    i = (((size != 0 || isClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && (size == 0 || size == curves2.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                com.airbnb.lottie.model.content.ShapeData shapeData3 = this.getHighSpeedVideoSizes;
                if (shapeData3 == null || shapeData3.getCurves().size() != i) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(new com.airbnb.lottie.model.CubicCurveData());
                    }
                    this.getHighSpeedVideoSizes = new com.airbnb.lottie.model.content.ShapeData(new android.graphics.PointF(0.0f, 0.0f), false, arrayList);
                }
                this.getHighSpeedVideoSizes.setClosed(isClosed);
                com.airbnb.lottie.model.content.ShapeData shapeData4 = this.getHighSpeedVideoSizes;
                shapeData4.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
                java.util.List<com.airbnb.lottie.model.CubicCurveData> curves3 = shapeData4.getCurves();
                boolean isClosed2 = shapeData.isClosed();
                int i3 = 0;
                int i4 = 0;
                while (i3 < curves.size()) {
                    com.airbnb.lottie.model.CubicCurveData cubicCurveData3 = curves.get(i3);
                    com.airbnb.lottie.model.CubicCurveData cubicCurveData4 = curves.get(getHighSpeedVideoFpsRanges(i3 - 1, curves.size()));
                    com.airbnb.lottie.model.CubicCurveData cubicCurveData5 = curves.get(getHighSpeedVideoFpsRanges(i3 - 2, curves.size()));
                    android.graphics.PointF vertex2 = (i3 != 0 || isClosed2) ? cubicCurveData4.getVertex() : shapeData.getInitialPoint();
                    android.graphics.PointF controlPoint2 = (i3 != 0 || isClosed2) ? cubicCurveData4.getControlPoint2() : vertex2;
                    android.graphics.PointF controlPoint1 = cubicCurveData3.getControlPoint1();
                    android.graphics.PointF vertex3 = cubicCurveData5.getVertex();
                    android.graphics.PointF vertex4 = cubicCurveData3.getVertex();
                    boolean z3 = (shapeData.isClosed() || !(i3 == 0 || i3 == curves.size() + (-1))) ? false : z2;
                    if (controlPoint2.equals(vertex2) && controlPoint1.equals(vertex2) && !z3) {
                        float f = vertex2.x;
                        float f2 = vertex3.x;
                        float f3 = vertex2.y;
                        float f4 = vertex3.y;
                        float f5 = vertex4.x;
                        float f6 = vertex2.x;
                        list = curves;
                        float f7 = vertex4.y;
                        z = isClosed2;
                        float f8 = vertex2.y;
                        com.airbnb.lottie.model.content.ShapeData shapeData5 = shapeData4;
                        java.util.List<com.airbnb.lottie.model.CubicCurveData> list3 = curves3;
                        float hypot = (float) java.lang.Math.hypot(f - f2, f3 - f4);
                        float hypot2 = (float) java.lang.Math.hypot(f5 - f6, f7 - f8);
                        float min = java.lang.Math.min(floatValue / hypot, 0.5f);
                        float min2 = java.lang.Math.min(floatValue / hypot2, 0.5f);
                        float f9 = vertex2.x + ((vertex3.x - vertex2.x) * min);
                        float f10 = vertex2.y + ((vertex3.y - vertex2.y) * min);
                        float f11 = vertex2.x + ((vertex4.x - vertex2.x) * min2);
                        float f12 = vertex2.y + ((vertex4.y - vertex2.y) * min2);
                        float f13 = vertex2.x;
                        float f14 = vertex2.y;
                        float f15 = vertex2.x;
                        float f16 = vertex2.y;
                        list2 = list3;
                        com.airbnb.lottie.model.CubicCurveData cubicCurveData6 = list2.get(getHighSpeedVideoFpsRanges(i4 - 1, list3.size()));
                        com.airbnb.lottie.model.CubicCurveData cubicCurveData7 = list2.get(i4);
                        cubicCurveData6.setControlPoint2(f9, f10);
                        cubicCurveData6.setVertex(f9, f10);
                        shapeData2 = shapeData5;
                        if (i3 == 0) {
                            shapeData2.setInitialPoint(f9, f10);
                        }
                        cubicCurveData7.setControlPoint1(f9 - ((f9 - f13) * 0.5519f), f10 - ((f10 - f14) * 0.5519f));
                        com.airbnb.lottie.model.CubicCurveData cubicCurveData8 = list2.get(i4 + 1);
                        cubicCurveData7.setControlPoint2(f11 - ((f11 - f15) * 0.5519f), f12 - ((f12 - f16) * 0.5519f));
                        cubicCurveData7.setVertex(f11, f12);
                        cubicCurveData8.setControlPoint1(f11, f12);
                        i4 += 2;
                    } else {
                        list = curves;
                        shapeData2 = shapeData4;
                        list2 = curves3;
                        z = isClosed2;
                        com.airbnb.lottie.model.CubicCurveData cubicCurveData9 = list2.get(getHighSpeedVideoFpsRanges(i4 - 1, list2.size()));
                        com.airbnb.lottie.model.CubicCurveData cubicCurveData10 = list2.get(i4);
                        cubicCurveData9.setControlPoint2(cubicCurveData4.getControlPoint2().x, cubicCurveData4.getControlPoint2().y);
                        cubicCurveData9.setVertex(cubicCurveData4.getVertex().x, cubicCurveData4.getVertex().y);
                        cubicCurveData10.setControlPoint1(cubicCurveData3.getControlPoint1().x, cubicCurveData3.getControlPoint1().y);
                        i4++;
                    }
                    i3++;
                    curves3 = list2;
                    shapeData4 = shapeData2;
                    curves = list;
                    isClosed2 = z;
                    z2 = true;
                }
                return shapeData4;
            }
        }
        return shapeData;
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }
}
