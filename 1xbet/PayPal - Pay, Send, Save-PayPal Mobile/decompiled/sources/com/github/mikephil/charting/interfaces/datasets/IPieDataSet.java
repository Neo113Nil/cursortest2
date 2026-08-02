package com.github.mikephil.charting.interfaces.datasets;

/* loaded from: classes8.dex */
public interface IPieDataSet extends com.github.mikephil.charting.interfaces.datasets.IDataSet<com.github.mikephil.charting.data.PieEntry> {
    float getSelectionShift();

    float getSliceSpace();

    int getValueLineColor();

    float getValueLinePart1Length();

    float getValueLinePart1OffsetPercentage();

    float getValueLinePart2Length();

    float getValueLineWidth();

    com.github.mikephil.charting.data.PieDataSet.ValuePosition getXValuePosition();

    com.github.mikephil.charting.data.PieDataSet.ValuePosition getYValuePosition();

    boolean isAutomaticallyDisableSliceSpacingEnabled();

    boolean isUsingSliceColorAsValueLineColor();

    boolean isValueLineVariableLength();
}
