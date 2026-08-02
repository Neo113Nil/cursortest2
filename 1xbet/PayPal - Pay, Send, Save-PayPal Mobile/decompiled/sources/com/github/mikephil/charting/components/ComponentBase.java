package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public abstract class ComponentBase {
    protected boolean mEnabled = true;
    protected float mXOffset = 5.0f;
    protected float mYOffset = 5.0f;
    protected android.graphics.Typeface mTypeface = null;
    protected float mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
    protected int mTextColor = -16777216;

    public float getXOffset() {
        return this.mXOffset;
    }

    public void setXOffset(float f) {
        this.mXOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    public void setYOffset(float f) {
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public android.graphics.Typeface getTypeface() {
        return this.mTypeface;
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.mTypeface = typeface;
    }

    public void setTextSize(float f) {
        if (f > 24.0f) {
            f = 24.0f;
        }
        if (f < 6.0f) {
            f = 6.0f;
        }
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public void setTextColor(int i) {
        this.mTextColor = i;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }
}
