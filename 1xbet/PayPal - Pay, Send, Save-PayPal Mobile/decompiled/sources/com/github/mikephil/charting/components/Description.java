package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class Description extends com.github.mikephil.charting.components.ComponentBase {
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoFpsRanges = "Description Label";
    private android.graphics.Paint.Align getHighSpeedVideoSizes = android.graphics.Paint.Align.RIGHT;

    public Description() {
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f);
    }

    public void setText(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.String getText() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPosition(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF = this.getHighSpeedVideoFpsRangesFor;
        if (mPPointF == null) {
            this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.MPPointF.getInstance(f, f2);
        } else {
            mPPointF.x = f;
            this.getHighSpeedVideoFpsRangesFor.y = f2;
        }
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setTextAlign(android.graphics.Paint.Align align) {
        this.getHighSpeedVideoSizes = align;
    }

    public android.graphics.Paint.Align getTextAlign() {
        return this.getHighSpeedVideoSizes;
    }
}
