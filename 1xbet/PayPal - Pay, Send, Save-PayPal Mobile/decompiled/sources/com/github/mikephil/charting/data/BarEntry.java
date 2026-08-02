package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class BarEntry extends com.github.mikephil.charting.data.Entry {
    private float Camera2StreamConfigurationMap;
    private float getHighSpeedVideoFpsRanges;
    private float[] getHighSpeedVideoFpsRangesFor;
    private com.github.mikephil.charting.highlight.Range[] getHighSpeedVideoSizes;

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public BarEntry(float f, float f2, java.lang.Object obj) {
        super(f, f2, obj);
    }

    public BarEntry(float f, float f2, android.graphics.drawable.Drawable drawable) {
        super(f, f2, drawable);
    }

    public BarEntry(float f, float f2, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, f2, drawable, obj);
    }

    public BarEntry(float f, float[] fArr) {
        super(f, getHighSpeedVideoFpsRanges(fArr));
        this.getHighSpeedVideoFpsRangesFor = fArr;
        Camera2StreamConfigurationMap();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, java.lang.Object obj) {
        super(f, getHighSpeedVideoFpsRanges(fArr), obj);
        this.getHighSpeedVideoFpsRangesFor = fArr;
        Camera2StreamConfigurationMap();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, android.graphics.drawable.Drawable drawable) {
        super(f, getHighSpeedVideoFpsRanges(fArr), drawable);
        this.getHighSpeedVideoFpsRangesFor = fArr;
        Camera2StreamConfigurationMap();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, getHighSpeedVideoFpsRanges(fArr), drawable, obj);
        this.getHighSpeedVideoFpsRangesFor = fArr;
        Camera2StreamConfigurationMap();
        calcRanges();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BarEntry copy() {
        com.github.mikephil.charting.data.BarEntry barEntry = new com.github.mikephil.charting.data.BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.getHighSpeedVideoFpsRangesFor);
        return barEntry;
    }

    public float[] getYVals() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public com.github.mikephil.charting.highlight.Range[] getRanges() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isStacked() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    @java.lang.Deprecated
    public float getBelowSum(int i) {
        return getSumBelow(i);
    }

    public float getSumBelow(int i) {
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i && length >= 0; length--) {
            f += this.getHighSpeedVideoFpsRangesFor[length];
        }
        return f;
    }

    public float getPositiveSum() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getNegativeSum() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private void Camera2StreamConfigurationMap() {
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        if (fArr == null) {
            this.getHighSpeedVideoFpsRanges = 0.0f;
            this.Camera2StreamConfigurationMap = 0.0f;
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 : fArr) {
            if (f3 <= 0.0f) {
                f += java.lang.Math.abs(f3);
            } else {
                f2 += f3;
            }
        }
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = f2;
    }

    private static float getHighSpeedVideoFpsRanges(float[] fArr) {
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    protected void calcRanges() {
        float[] yVals = getYVals();
        if (yVals == null || yVals.length == 0) {
            return;
        }
        this.getHighSpeedVideoSizes = new com.github.mikephil.charting.highlight.Range[yVals.length];
        float f = -getNegativeSum();
        int i = 0;
        float f2 = 0.0f;
        while (true) {
            com.github.mikephil.charting.highlight.Range[] rangeArr = this.getHighSpeedVideoSizes;
            if (i >= rangeArr.length) {
                return;
            }
            float f3 = yVals[i];
            if (f3 < 0.0f) {
                float f4 = f - f3;
                rangeArr[i] = new com.github.mikephil.charting.highlight.Range(f, f4);
                f = f4;
            } else {
                float f5 = f3 + f2;
                rangeArr[i] = new com.github.mikephil.charting.highlight.Range(f2, f5);
                f2 = f5;
            }
            i++;
        }
    }

    public void setVals(float[] fArr) {
        float f = 0.0f;
        if (fArr != null) {
            for (float f2 : fArr) {
                f += f2;
            }
        }
        setY(f);
        this.getHighSpeedVideoFpsRangesFor = fArr;
        Camera2StreamConfigurationMap();
        calcRanges();
    }
}
