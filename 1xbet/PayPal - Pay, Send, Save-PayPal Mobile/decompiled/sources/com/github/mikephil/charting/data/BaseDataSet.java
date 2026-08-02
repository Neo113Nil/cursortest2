package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class BaseDataSet<T extends com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.IDataSet<T> {
    private java.lang.String Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private com.github.mikephil.charting.components.Legend.LegendForm getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private android.graphics.DashPathEffect getHighSpeedVideoSizes;
    protected com.github.mikephil.charting.components.YAxis.AxisDependency mAxisDependency;
    protected java.util.List<java.lang.Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    protected com.github.mikephil.charting.model.GradientColor mGradientColor;
    protected java.util.List<com.github.mikephil.charting.model.GradientColor> mGradientColors;
    protected boolean mHighlightEnabled;
    protected com.github.mikephil.charting.utils.MPPointF mIconsOffset;
    protected java.util.List<java.lang.Integer> mValueColors;
    protected transient com.github.mikephil.charting.formatter.ValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected android.graphics.Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
        this.mColors = null;
        this.mGradientColor = null;
        this.mGradientColors = null;
        this.mValueColors = null;
        this.Camera2StreamConfigurationMap = "DataSet";
        this.mAxisDependency = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.mDrawValues = true;
        this.mDrawIcons = true;
        this.mIconsOffset = new com.github.mikephil.charting.utils.MPPointF();
        this.mValueTextSize = 17.0f;
        this.mVisible = true;
        this.mColors = new java.util.ArrayList();
        this.mValueColors = new java.util.ArrayList();
        this.mColors.add(java.lang.Integer.valueOf(android.graphics.Color.rgb(140, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 255)));
        this.mValueColors.add(-16777216);
    }

    public BaseDataSet(java.lang.String str) {
        this();
        this.Camera2StreamConfigurationMap = str;
    }

    public void notifyDataSetChanged() {
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public java.util.List<java.lang.Integer> getColors() {
        return this.mColors;
    }

    public java.util.List<java.lang.Integer> getValueColors() {
        return this.mValueColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int i) {
        java.util.List<java.lang.Integer> list = this.mColors;
        return list.get(i % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.model.GradientColor getGradientColor() {
        return this.mGradientColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public java.util.List<com.github.mikephil.charting.model.GradientColor> getGradientColors() {
        return this.mGradientColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.model.GradientColor getGradientColor(int i) {
        java.util.List<com.github.mikephil.charting.model.GradientColor> list = this.mGradientColors;
        return list.get(i % list.size());
    }

    public void setColors(java.util.List<java.lang.Integer> list) {
        this.mColors = list;
    }

    public void setColors(int... iArr) {
        this.mColors = com.github.mikephil.charting.utils.ColorTemplate.createColors(iArr);
    }

    public void setColors(int[] iArr, android.content.Context context) {
        if (this.mColors == null) {
            this.mColors = new java.util.ArrayList();
        }
        this.mColors.clear();
        for (int i : iArr) {
            this.mColors.add(java.lang.Integer.valueOf(context.getResources().getColor(i)));
        }
    }

    public void addColor(int i) {
        if (this.mColors == null) {
            this.mColors = new java.util.ArrayList();
        }
        this.mColors.add(java.lang.Integer.valueOf(i));
    }

    public void setColor(int i) {
        resetColors();
        this.mColors.add(java.lang.Integer.valueOf(i));
    }

    public void setGradientColor(int i, int i2) {
        this.mGradientColor = new com.github.mikephil.charting.model.GradientColor(i, i2);
    }

    public void setGradientColors(java.util.List<com.github.mikephil.charting.model.GradientColor> list) {
        this.mGradientColors = list;
    }

    public void setColor(int i, int i2) {
        setColor(android.graphics.Color.argb(i2, android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i)));
    }

    public void setColors(int[] iArr, int i) {
        resetColors();
        for (int i2 : iArr) {
            addColor(android.graphics.Color.argb(i, android.graphics.Color.red(i2), android.graphics.Color.green(i2), android.graphics.Color.blue(i2)));
        }
    }

    public void resetColors() {
        if (this.mColors == null) {
            this.mColors = new java.util.ArrayList();
        }
        this.mColors.clear();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setLabel(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public java.lang.String getLabel() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setHighlightEnabled(boolean z) {
        this.mHighlightEnabled = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            return;
        }
        this.mValueFormatter = valueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.formatter.ValueFormatter getValueFormatter() {
        if (needsFormatter()) {
            return com.github.mikephil.charting.utils.Utils.getDefaultValueFormatter();
        }
        return this.mValueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean needsFormatter() {
        return this.mValueFormatter == null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColor(int i) {
        this.mValueColors.clear();
        this.mValueColors.add(java.lang.Integer.valueOf(i));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColors(java.util.List<java.lang.Integer> list) {
        this.mValueColors = list;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTypeface(android.graphics.Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextSize(float f) {
        this.mValueTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor(int i) {
        java.util.List<java.lang.Integer> list = this.mValueColors;
        return list.get(i % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public android.graphics.Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    public void setForm(com.github.mikephil.charting.components.Legend.LegendForm legendForm) {
        this.getHighSpeedVideoFpsRanges = legendForm;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.components.Legend.LegendForm getForm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setFormSize(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setFormLineWidth(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormLineWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setFormLineDashEffect(android.graphics.DashPathEffect dashPathEffect) {
        this.getHighSpeedVideoSizes = dashPathEffect;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public android.graphics.DashPathEffect getFormLineDashEffect() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawValues(boolean z) {
        this.mDrawValues = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawIcons(boolean z) {
        this.mDrawIcons = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawIconsEnabled() {
        return this.mDrawIcons;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setIconsOffset(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        this.mIconsOffset.x = mPPointF.x;
        this.mIconsOffset.y = mPPointF.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.utils.MPPointF getIconsOffset() {
        return this.mIconsOffset;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setVisible(boolean z) {
        this.mVisible = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getIndexInEntries(int i) {
        for (int i2 = 0; i2 < getEntryCount(); i2++) {
            if (i == getEntryForIndex(i2).getX()) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry((com.github.mikephil.charting.data.BaseDataSet<T>) getEntryForIndex(0));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry((com.github.mikephil.charting.data.BaseDataSet<T>) getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntryByXValue(float f) {
        return removeEntry((com.github.mikephil.charting.data.BaseDataSet<T>) getEntryForXValue(f, Float.NaN));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(int i) {
        return removeEntry((com.github.mikephil.charting.data.BaseDataSet<T>) getEntryForIndex(i));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean contains(T t) {
        for (int i = 0; i < getEntryCount(); i++) {
            if (getEntryForIndex(i).equals(t)) {
                return true;
            }
        }
        return false;
    }

    protected void copy(com.github.mikephil.charting.data.BaseDataSet baseDataSet) {
        baseDataSet.mAxisDependency = this.mAxisDependency;
        baseDataSet.mColors = this.mColors;
        baseDataSet.mDrawIcons = this.mDrawIcons;
        baseDataSet.mDrawValues = this.mDrawValues;
        baseDataSet.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        baseDataSet.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        baseDataSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        baseDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        baseDataSet.mGradientColor = this.mGradientColor;
        baseDataSet.mGradientColors = this.mGradientColors;
        baseDataSet.mHighlightEnabled = this.mHighlightEnabled;
        baseDataSet.mIconsOffset = this.mIconsOffset;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueFormatter = this.mValueFormatter;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueTextSize = this.mValueTextSize;
        baseDataSet.mVisible = this.mVisible;
    }
}
