package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class LineDataSet extends com.github.mikephil.charting.data.LineRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.ILineDataSet {
    private int Camera2StreamConfigurationMap;
    private java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private com.github.mikephil.charting.formatter.IFillFormatter getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private com.github.mikephil.charting.data.LineDataSet.Mode getOutputFormats;
    private android.graphics.DashPathEffect getOutputMinFrameDuration;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        super(list, str);
        this.getOutputFormats = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRangesFor = 8.0f;
        this.getHighSpeedVideoSizes = 4.0f;
        this.getHighSpeedVideoFpsRanges = 0.2f;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizesFor = new com.github.mikephil.charting.formatter.DefaultFillFormatter();
        this.getInputSizeshNQ4ISI = true;
        this.getInputFormats = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.add(java.lang.Integer.valueOf(android.graphics.Color.rgb(140, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 255)));
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.Entry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(arrayList, getLabel());
        copy(lineDataSet);
        return lineDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.LineDataSet lineDataSet) {
        super.copy((com.github.mikephil.charting.data.LineRadarDataSet) lineDataSet);
        lineDataSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        lineDataSet.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        lineDataSet.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        lineDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        lineDataSet.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        lineDataSet.getOutputMinFrameDuration = this.getOutputMinFrameDuration;
        lineDataSet.getInputFormats = this.getInputFormats;
        lineDataSet.getInputSizeshNQ4ISI = this.getInputFormats;
        lineDataSet.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor;
        lineDataSet.getOutputFormats = this.getOutputFormats;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public com.github.mikephil.charting.data.LineDataSet.Mode getMode() {
        return this.getOutputFormats;
    }

    public void setMode(com.github.mikephil.charting.data.LineDataSet.Mode mode) {
        this.getOutputFormats = mode;
    }

    public void setCubicIntensity(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.getHighSpeedVideoFpsRanges = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCubicIntensity() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setCircleRadius(float f) {
        if (f >= 1.0f) {
            this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCircleRadius() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setCircleHoleRadius(float f) {
        if (f >= 0.5f) {
            this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public float getCircleHoleRadius() {
        return this.getHighSpeedVideoSizes;
    }

    @java.lang.Deprecated
    public void setCircleSize(float f) {
        setCircleRadius(f);
    }

    @java.lang.Deprecated
    public float getCircleSize() {
        return getCircleRadius();
    }

    public void enableDashedLine(float f, float f2, float f3) {
        this.getOutputMinFrameDuration = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void disableDashedLine() {
        this.getOutputMinFrameDuration = null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDashedLineEnabled() {
        return this.getOutputMinFrameDuration != null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public android.graphics.DashPathEffect getDashPathEffect() {
        return this.getOutputMinFrameDuration;
    }

    public void setDrawCircles(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDrawCirclesEnabled() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    @java.lang.Deprecated
    public boolean isDrawCubicEnabled() {
        return this.getOutputFormats == com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    @java.lang.Deprecated
    public boolean isDrawSteppedEnabled() {
        return this.getOutputFormats == com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED;
    }

    public java.util.List<java.lang.Integer> getCircleColors() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleColor(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(i).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleColorCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public void setCircleColors(java.util.List<java.lang.Integer> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public void setCircleColors(int... iArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.github.mikephil.charting.utils.ColorTemplate.createColors(iArr);
    }

    public void setCircleColors(int[] iArr, android.content.Context context) {
        java.util.List<java.lang.Integer> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        list.clear();
        for (int i : iArr) {
            list.add(java.lang.Integer.valueOf(context.getResources().getColor(i)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public void setCircleColor(int i) {
        resetCircleColors();
        this.getHighResolutionOutputSizeshNQ4ISI.add(java.lang.Integer.valueOf(i));
    }

    public void resetCircleColors() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    public void setCircleHoleColor(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public int getCircleHoleColor() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDrawCircleHole(boolean z) {
        this.getInputFormats = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public boolean isDrawCircleHoleEnabled() {
        return this.getInputFormats;
    }

    public void setFillFormatter(com.github.mikephil.charting.formatter.IFillFormatter iFillFormatter) {
        if (iFillFormatter == null) {
            this.getHighSpeedVideoSizesFor = new com.github.mikephil.charting.formatter.DefaultFillFormatter();
        } else {
            this.getHighSpeedVideoSizesFor = iFillFormatter;
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public com.github.mikephil.charting.formatter.IFillFormatter getFillFormatter() {
        return this.getHighSpeedVideoSizesFor;
    }
}
