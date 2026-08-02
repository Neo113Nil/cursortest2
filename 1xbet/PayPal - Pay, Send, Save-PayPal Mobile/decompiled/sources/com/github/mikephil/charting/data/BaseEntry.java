package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class BaseEntry {
    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private java.lang.Object getHighSpeedVideoSizes;

    public BaseEntry() {
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public BaseEntry(float f) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public BaseEntry(float f, java.lang.Object obj) {
        this(f);
        this.getHighSpeedVideoSizes = obj;
    }

    public BaseEntry(float f, android.graphics.drawable.Drawable drawable) {
        this(f);
        this.getHighSpeedVideoFpsRanges = drawable;
    }

    public BaseEntry(float f, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        this(f);
        this.getHighSpeedVideoFpsRanges = drawable;
        this.getHighSpeedVideoSizes = obj;
    }

    public float getY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRanges = drawable;
    }

    public android.graphics.drawable.Drawable getIcon() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setY(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public java.lang.Object getData() {
        return this.getHighSpeedVideoSizes;
    }

    public void setData(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
    }
}
