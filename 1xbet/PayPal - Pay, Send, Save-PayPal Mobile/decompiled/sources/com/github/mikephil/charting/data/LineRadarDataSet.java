package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class LineRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<T> implements com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<T> {
    private float Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    protected android.graphics.drawable.Drawable mFillDrawable;

    public LineRadarDataSet(java.util.List<T> list, java.lang.String str) {
        super(list, str);
        this.getHighSpeedVideoFpsRangesFor = android.graphics.Color.rgb(140, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 255);
        this.getHighSpeedVideoSizes = 85;
        this.Camera2StreamConfigurationMap = 2.5f;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public int getFillColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setFillColor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.mFillDrawable = null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public android.graphics.drawable.Drawable getFillDrawable() {
        return this.mFillDrawable;
    }

    public void setFillDrawable(android.graphics.drawable.Drawable drawable) {
        this.mFillDrawable = drawable;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public int getFillAlpha() {
        return this.getHighSpeedVideoSizes;
    }

    public void setFillAlpha(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setLineWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.Camera2StreamConfigurationMap = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public float getLineWidth() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public void setDrawFilled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public boolean isDrawFilledEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected void copy(com.github.mikephil.charting.data.LineRadarDataSet lineRadarDataSet) {
        super.copy((com.github.mikephil.charting.data.LineScatterCandleRadarDataSet) lineRadarDataSet);
        lineRadarDataSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        lineRadarDataSet.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        lineRadarDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        lineRadarDataSet.mFillDrawable = this.mFillDrawable;
        lineRadarDataSet.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
    }
}
