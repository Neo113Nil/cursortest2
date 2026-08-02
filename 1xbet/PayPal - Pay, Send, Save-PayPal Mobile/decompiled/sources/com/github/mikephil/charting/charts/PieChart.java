package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class PieChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.PieData> {
    private float[] Camera2StreamConfigurationMap;
    private android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoFpsRangesFor;
    private java.lang.CharSequence getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private float[] getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private float getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private float getOutputStallDurationlomOqCM;
    protected float mMaxAngle;
    protected float mTransparentCircleRadiusPercent;

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    public PieChart(android.content.Context context) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = new float[1];
        this.Camera2StreamConfigurationMap = new float[1];
        this.getOutputMinFrameDuration = true;
        this.getOutputSizeshNQ4ISI = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = "";
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getOutputStallDurationlomOqCM = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.getOutputFormats = true;
        this.getHighSpeedVideoFpsRanges = 100.0f;
        this.mMaxAngle = 360.0f;
        this.getOutputSizes = 0.0f;
    }

    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = new float[1];
        this.Camera2StreamConfigurationMap = new float[1];
        this.getOutputMinFrameDuration = true;
        this.getOutputSizeshNQ4ISI = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = "";
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getOutputStallDurationlomOqCM = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.getOutputFormats = true;
        this.getHighSpeedVideoFpsRanges = 100.0f;
        this.mMaxAngle = 360.0f;
        this.getOutputSizes = 0.0f;
    }

    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = new float[1];
        this.Camera2StreamConfigurationMap = new float[1];
        this.getOutputMinFrameDuration = true;
        this.getOutputSizeshNQ4ISI = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = "";
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.getOutputStallDurationlomOqCM = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.getOutputFormats = true;
        this.getHighSpeedVideoFpsRanges = 100.0f;
        this.mMaxAngle = 360.0f;
        this.getOutputSizes = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new com.github.mikephil.charting.highlight.PieHighlighter(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        float selectionShift = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSet().getSelectionShift();
        this.getHighResolutionOutputSizeshNQ4ISI.set((centerOffsets.x - diameter) + selectionShift, (centerOffsets.y - diameter) + selectionShift, (centerOffsets.x + diameter) - selectionShift, (centerOffsets.y + diameter) - selectionShift);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight highlight) {
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            f = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float rotationAngle = getRotationAngle();
        float f2 = this.getInputSizeshNQ4ISI[(int) highlight.getX()] / 2.0f;
        double d = radius - f;
        float cos = (float) ((java.lang.Math.cos(java.lang.Math.toRadians(((this.Camera2StreamConfigurationMap[r11] + rotationAngle) - f2) * this.mAnimator.getPhaseY())) * d) + centerCircleBox.x);
        float sin = (float) ((d * java.lang.Math.sin(java.lang.Math.toRadians(((rotationAngle + this.Camera2StreamConfigurationMap[r11]) - f2) * this.mAnimator.getPhaseY()))) + centerCircleBox.y);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        return new float[]{cos, sin};
    }

    public boolean needsHighlight(int i) {
        if (!valuesToHighlight()) {
            return false;
        }
        for (int i2 = 0; i2 < this.mIndicesToHighlight.length; i2++) {
            if (((int) this.mIndicesToHighlight[i2].getX()) == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @java.lang.Deprecated
    public com.github.mikephil.charting.components.XAxis getXAxis() {
        throw new java.lang.RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f) {
        float normalizedAngle = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.Camera2StreamConfigurationMap;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > normalizedAngle) {
                return i;
            }
            i++;
        }
    }

    public int getDataSetIndexForIndex(int i) {
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSets();
        for (int i2 = 0; i2 < dataSets.size(); i2++) {
            if (dataSets.get(i2).getEntryForXValue(i, Float.NaN) != null) {
                return i2;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.getInputSizeshNQ4ISI;
    }

    public float[] getAbsoluteAngles() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setHoleColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintHole().setColor(i);
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.getOutputSizeshNQ4ISI = z;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public boolean isDrawHoleEnabled() {
        return this.getOutputMinFrameDuration;
    }

    public void setCenterText(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            this.getHighSpeedVideoSizes = "";
        } else {
            this.getHighSpeedVideoSizes = charSequence;
        }
    }

    public java.lang.CharSequence getCenterText() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDrawCenterText(boolean z) {
        this.getOutputFormats = z;
    }

    public boolean isDrawCenterTextEnabled() {
        return this.getOutputFormats;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        if (rectF == null) {
            return 0.0f;
        }
        return java.lang.Math.min(rectF.width() / 2.0f, this.getHighResolutionOutputSizeshNQ4ISI.height() / 2.0f);
    }

    public android.graphics.RectF getCircleBox() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterCircleBox() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.centerX(), this.getHighResolutionOutputSizeshNQ4ISI.centerY());
    }

    public void setCenterTextTypeface(android.graphics.Typeface typeface) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setCenterTextSize(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(f);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        this.getHighSpeedVideoFpsRangesFor.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f2);
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterTextOffset() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(this.getHighSpeedVideoFpsRangesFor.x, this.getHighSpeedVideoFpsRangesFor.y);
    }

    public void setCenterTextColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.getOutputStallDurationlomOqCM = f;
    }

    public float getHoleRadius() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setTransparentCircleColor(int i) {
        android.graphics.Paint paintTransparentCircle = ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.mTransparentCircleRadiusPercent = f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    public void setTransparentCircleAlpha(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintTransparentCircle().setAlpha(i);
    }

    @java.lang.Deprecated
    public void setDrawSliceText(boolean z) {
        this.getInputFormats = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.getInputFormats = z;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.getInputFormats;
    }

    public void setEntryLabelColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setColor(i);
    }

    public void setEntryLabelTypeface(android.graphics.Typeface typeface) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
    }

    public void setEntryLabelTextSize(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f));
    }

    public void setDrawRoundedSlices(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setUsePercentValues(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setCenterTextRadiusPercent(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public float getCenterTextRadiusPercent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.mMaxAngle = f;
    }

    public float getMinAngleForSlices() {
        return this.getOutputSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMinAngleForSlices(float f) {
        float f2 = this.mMaxAngle / 2.0f;
        if (f <= f2) {
            f2 = 0.0f;
        }
        f = f2;
        this.getOutputSizes = f;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof com.github.mikephil.charting.renderer.PieChartRenderer)) {
            ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        int entryCount = ((com.github.mikephil.charting.data.PieData) this.mData).getEntryCount();
        if (this.getInputSizeshNQ4ISI.length != entryCount) {
            this.getInputSizeshNQ4ISI = new float[entryCount];
        } else {
            for (int i = 0; i < entryCount; i++) {
                this.getInputSizeshNQ4ISI[i] = 0.0f;
            }
        }
        if (this.Camera2StreamConfigurationMap.length != entryCount) {
            this.Camera2StreamConfigurationMap = new float[entryCount];
        } else {
            for (int i2 = 0; i2 < entryCount; i2++) {
                this.Camera2StreamConfigurationMap[i2] = 0.0f;
            }
        }
        float yValueSum = ((com.github.mikephil.charting.data.PieData) this.mData).getYValueSum();
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSets();
        float f = this.getOutputSizes;
        boolean z = f != 0.0f && ((float) entryCount) * f <= this.mMaxAngle;
        float[] fArr = new float[entryCount];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((com.github.mikephil.charting.data.PieData) this.mData).getDataSetCount(); i4++) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet = dataSets.get(i4);
            for (int i5 = 0; i5 < iPieDataSet.getEntryCount(); i5++) {
                float abs = (java.lang.Math.abs(iPieDataSet.getEntryForIndex(i5).getY()) / yValueSum) * this.mMaxAngle;
                if (z) {
                    float f4 = this.getOutputSizes;
                    float f5 = abs - f4;
                    if (f5 <= 0.0f) {
                        fArr[i3] = f4;
                        f3 += -f5;
                    } else {
                        fArr[i3] = abs;
                        f2 += f5;
                    }
                }
                this.getInputSizeshNQ4ISI[i3] = abs;
                if (i3 == 0) {
                    this.Camera2StreamConfigurationMap[i3] = abs;
                } else {
                    float[] fArr2 = this.Camera2StreamConfigurationMap;
                    fArr2[i3] = fArr2[i3 - 1] + abs;
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < entryCount; i6++) {
                float f6 = fArr[i6];
                float f7 = f6 - (((f6 - this.getOutputSizes) / f2) * f3);
                fArr[i6] = f7;
                if (i6 == 0) {
                    this.Camera2StreamConfigurationMap[0] = fArr[0];
                } else {
                    float[] fArr3 = this.Camera2StreamConfigurationMap;
                    fArr3[i6] = fArr3[i6 - 1] + f7;
                }
            }
            this.getInputSizeshNQ4ISI = fArr;
        }
    }
}
