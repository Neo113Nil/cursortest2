package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class PieDataSet extends com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> implements com.github.mikephil.charting.interfaces.datasets.IPieDataSet {
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private float getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private float getOutputMinFrameDuration;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition getOutputMinFrameDurationlomOqCM;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition getOutputStallDurationlomOqCM;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(java.util.List<com.github.mikephil.charting.data.PieEntry> list, java.lang.String str) {
        super(list, str);
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 18.0f;
        this.getOutputMinFrameDurationlomOqCM = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
        this.getOutputStallDurationlomOqCM = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = -16777216;
        this.getHighSpeedVideoSizesFor = 1.0f;
        this.getInputSizeshNQ4ISI = 75.0f;
        this.getOutputMinFrameDuration = 0.3f;
        this.getInputFormats = 0.4f;
        this.getOutputFormats = true;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.PieEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.PieDataSet pieDataSet = new com.github.mikephil.charting.data.PieDataSet(arrayList, getLabel());
        copy(pieDataSet);
        return pieDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.PieDataSet pieDataSet) {
        super.copy((com.github.mikephil.charting.data.DataSet) pieDataSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        calcMinMaxY(pieEntry);
    }

    public void setSliceSpace(float f) {
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSliceSpace() {
        return this.getHighSpeedVideoSizes;
    }

    public void setAutomaticallyDisableSliceSpacing(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setSelectionShift(float f) {
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSelectionShift() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getXValuePosition() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setXValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition) {
        this.getOutputMinFrameDurationlomOqCM = valuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getYValuePosition() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setYValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition) {
        this.getOutputStallDurationlomOqCM = valuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isUsingSliceColorAsValueLineColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setUsingSliceColorAsValueLineColor(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public int getValueLineColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setValueLineColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLineWidth() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setValueLineWidth(float f) {
        this.getHighSpeedVideoSizesFor = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1OffsetPercentage() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setValueLinePart1OffsetPercentage(float f) {
        this.getInputSizeshNQ4ISI = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1Length() {
        return this.getOutputMinFrameDuration;
    }

    public void setValueLinePart1Length(float f) {
        this.getOutputMinFrameDuration = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart2Length() {
        return this.getInputFormats;
    }

    public void setValueLinePart2Length(float f) {
        this.getInputFormats = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isValueLineVariableLength() {
        return this.getOutputFormats;
    }

    public void setValueLineVariableLength(boolean z) {
        this.getOutputFormats = z;
    }
}
