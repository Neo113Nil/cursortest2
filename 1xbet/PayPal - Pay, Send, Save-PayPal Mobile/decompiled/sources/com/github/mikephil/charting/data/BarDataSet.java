package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class BarDataSet extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BarEntry> implements com.github.mikephil.charting.interfaces.datasets.IBarDataSet {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private java.lang.String[] getHighSpeedVideoSizesFor;
    private int getInputFormats;

    public BarDataSet(java.util.List<com.github.mikephil.charting.data.BarEntry> list, java.lang.String str) {
        super(list, str);
        this.getInputFormats = 1;
        this.getHighSpeedVideoFpsRangesFor = android.graphics.Color.rgb(215, 215, 215);
        this.getHighSpeedVideoSizes = 0.0f;
        this.Camera2StreamConfigurationMap = -16777216;
        this.getHighSpeedVideoFpsRanges = 120;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizesFor = new java.lang.String[]{"Stack"};
        this.mHighLightColor = android.graphics.Color.rgb(0, 0, 0);
        for (int i = 0; i < list.size(); i++) {
            float[] yVals = list.get(i).getYVals();
            if (yVals != null && yVals.length > this.getInputFormats) {
                this.getInputFormats = yVals.length;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            float[] yVals2 = list.get(i2).getYVals();
            if (yVals2 == null) {
                this.getHighResolutionOutputSizeshNQ4ISI++;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI += yVals2.length;
            }
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.BarEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.BarEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.BarDataSet barDataSet = new com.github.mikephil.charting.data.BarDataSet(arrayList, getLabel());
        copy(barDataSet);
        return barDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.BarDataSet barDataSet) {
        super.copy((com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet) barDataSet);
        barDataSet.getInputFormats = this.getInputFormats;
        barDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        barDataSet.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        barDataSet.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor;
        barDataSet.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.BarEntry barEntry) {
        if (barEntry == null || java.lang.Float.isNaN(barEntry.getY())) {
            return;
        }
        if (barEntry.getYVals() == null) {
            if (barEntry.getY() < this.mYMin) {
                this.mYMin = barEntry.getY();
            }
            if (barEntry.getY() > this.mYMax) {
                this.mYMax = barEntry.getY();
            }
        } else {
            if ((-barEntry.getNegativeSum()) < this.mYMin) {
                this.mYMin = -barEntry.getNegativeSum();
            }
            if (barEntry.getPositiveSum() > this.mYMax) {
                this.mYMax = barEntry.getPositiveSum();
            }
        }
        calcMinMaxX(barEntry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public int getStackSize() {
        return this.getInputFormats;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public boolean isStacked() {
        return this.getInputFormats > 1;
    }

    public int getEntryCountStacks() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setBarShadowColor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public int getBarShadowColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setBarBorderWidth(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public float getBarBorderWidth() {
        return this.getHighSpeedVideoSizes;
    }

    public void setBarBorderColor(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public int getBarBorderColor() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setHighLightAlpha(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public int getHighLightAlpha() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setStackLabels(java.lang.String[] strArr) {
        this.getHighSpeedVideoSizesFor = strArr;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public java.lang.String[] getStackLabels() {
        return this.getHighSpeedVideoSizesFor;
    }
}
