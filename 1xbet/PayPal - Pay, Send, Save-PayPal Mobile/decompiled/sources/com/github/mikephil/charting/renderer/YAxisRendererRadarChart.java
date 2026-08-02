package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class YAxisRendererRadarChart extends com.github.mikephil.charting.renderer.YAxisRenderer {
    private com.github.mikephil.charting.charts.RadarChart getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Path getHighSpeedVideoFpsRanges;

    public YAxisRendererRadarChart(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.YAxis yAxis, com.github.mikephil.charting.charts.RadarChart radarChart) {
        super(viewPortHandler, yAxis, null);
        this.getHighSpeedVideoFpsRanges = new android.graphics.Path();
        this.getHighResolutionOutputSizeshNQ4ISI = radarChart;
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float f, float f2) {
        int i;
        float f3 = f;
        int labelCount = this.mAxis.getLabelCount();
        double abs = java.lang.Math.abs(f2 - f3);
        if (labelCount == 0 || abs <= 0.0d || java.lang.Double.isInfinite(abs)) {
            this.mAxis.mEntries = new float[0];
            this.mAxis.mCenteredEntries = new float[0];
            this.mAxis.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(abs / labelCount);
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < this.mAxis.getGranularity()) {
            roundToNextSignificant = this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(java.lang.Math.pow(10.0d, (int) java.lang.Math.log10(roundToNextSignificant)));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = java.lang.Math.floor(roundToNextSignificant2 * 10.0d);
        }
        boolean isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f4 = ((float) abs) / (labelCount - 1);
            this.mAxis.mEntryCount = labelCount;
            if (this.mAxis.mEntries.length < labelCount) {
                this.mAxis.mEntries = new float[labelCount];
            }
            for (int i2 = 0; i2 < labelCount; i2++) {
                this.mAxis.mEntries[i2] = f3;
                f3 += f4;
            }
        } else {
            double ceil = roundToNextSignificant == 0.0d ? 0.0d : java.lang.Math.ceil(f3 / roundToNextSignificant) * roundToNextSignificant;
            if (isCenterAxisLabelsEnabled) {
                ceil -= roundToNextSignificant;
            }
            double nextUp = roundToNextSignificant == 0.0d ? 0.0d : com.github.mikephil.charting.utils.Utils.nextUp(java.lang.Math.floor(f2 / roundToNextSignificant) * roundToNextSignificant);
            if (roundToNextSignificant != 0.0d) {
                i = isCenterAxisLabelsEnabled ? 1 : 0;
                for (double d = ceil; d <= nextUp; d += roundToNextSignificant) {
                    i++;
                }
            } else {
                i = isCenterAxisLabelsEnabled ? 1 : 0;
            }
            int i3 = i + 1;
            this.mAxis.mEntryCount = i3;
            if (this.mAxis.mEntries.length < i3) {
                this.mAxis.mEntries = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                this.mAxis.mEntries[i4] = (float) ceil;
                ceil += roundToNextSignificant;
            }
            labelCount = i3;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) java.lang.Math.ceil(-java.lang.Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (isCenterAxisLabelsEnabled) {
            if (this.mAxis.mCenteredEntries.length < labelCount) {
                this.mAxis.mCenteredEntries = new float[labelCount];
            }
            float f5 = (this.mAxis.mEntries[1] - this.mAxis.mEntries[0]) / 2.0f;
            for (int i5 = 0; i5 < labelCount; i5++) {
                this.mAxis.mCenteredEntries[i5] = this.mAxis.mEntries[i5] + f5;
            }
        }
        this.mAxis.mAxisMinimum = this.mAxis.mEntries[0];
        this.mAxis.mAxisMaximum = this.mAxis.mEntries[labelCount - 1];
        this.mAxis.mAxisRange = java.lang.Math.abs(this.mAxis.mAxisMaximum - this.mAxis.mAxisMinimum);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            com.github.mikephil.charting.utils.MPPointF centerOffsets = this.getHighResolutionOutputSizeshNQ4ISI.getCenterOffsets();
            com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
            float factor = this.getHighResolutionOutputSizeshNQ4ISI.getFactor();
            int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
                com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (this.mYAxis.mEntries[i2] - this.mYAxis.mAxisMinimum) * factor, this.getHighResolutionOutputSizeshNQ4ISI.getRotationAngle(), mPPointF);
                canvas.drawText(this.mYAxis.getFormattedLabel(i2), mPPointF.x + 10.0f, mPPointF.y, this.mAxisLabelPaint);
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
        java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null) {
            return;
        }
        float sliceAngle = this.getHighResolutionOutputSizeshNQ4ISI.getSliceAngle();
        float factor = this.getHighResolutionOutputSizeshNQ4ISI.getFactor();
        com.github.mikephil.charting.utils.MPPointF centerOffsets = this.getHighResolutionOutputSizeshNQ4ISI.getCenterOffsets();
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        for (int i = 0; i < limitLines.size(); i++) {
            com.github.mikephil.charting.components.LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                float limit = limitLine.getLimit();
                float yChartMin = this.getHighResolutionOutputSizeshNQ4ISI.getYChartMin();
                android.graphics.Path path = this.getHighSpeedVideoFpsRanges;
                path.reset();
                for (int i2 = 0; i2 < ((com.github.mikephil.charting.data.RadarData) this.getHighResolutionOutputSizeshNQ4ISI.getData()).getMaxEntryCountSet().getEntryCount(); i2++) {
                    com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (limit - yChartMin) * factor, (i2 * sliceAngle) + this.getHighResolutionOutputSizeshNQ4ISI.getRotationAngle(), mPPointF);
                    if (i2 == 0) {
                        path.moveTo(mPPointF.x, mPPointF.y);
                    } else {
                        path.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                path.close();
                canvas.drawPath(path, this.mLimitLinePaint);
            }
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
    }
}
