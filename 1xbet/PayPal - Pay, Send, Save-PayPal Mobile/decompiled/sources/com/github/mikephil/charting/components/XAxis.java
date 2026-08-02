package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class XAxis extends com.github.mikephil.charting.components.AxisBase {
    public int mLabelWidth = 1;
    public int mLabelHeight = 1;
    public int mLabelRotatedWidth = 1;
    public int mLabelRotatedHeight = 1;
    protected float mLabelRotationAngle = 0.0f;
    private boolean getHighSpeedVideoSizes = false;
    private com.github.mikephil.charting.components.XAxis.XAxisPosition getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP;

    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
    }

    public com.github.mikephil.charting.components.XAxis.XAxisPosition getPosition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition xAxisPosition) {
        this.getHighSpeedVideoFpsRangesFor = xAxisPosition;
    }

    public float getLabelRotationAngle() {
        return this.mLabelRotationAngle;
    }

    public void setLabelRotationAngle(float f) {
        this.mLabelRotationAngle = f;
    }

    public void setAvoidFirstLastClipping(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public boolean isAvoidFirstLastClippingEnabled() {
        return this.getHighSpeedVideoSizes;
    }
}
