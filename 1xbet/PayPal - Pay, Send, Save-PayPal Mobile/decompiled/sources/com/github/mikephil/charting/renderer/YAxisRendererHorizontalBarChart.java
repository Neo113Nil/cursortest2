package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class YAxisRendererHorizontalBarChart extends com.github.mikephil.charting.renderer.YAxisRenderer {
    protected android.graphics.Path mDrawZeroLinePathBuffer;
    protected float[] mRenderLimitLinesBuffer;
    protected android.graphics.Path mRenderLimitLinesPathBuffer;

    public YAxisRendererHorizontalBarChart(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.YAxis yAxis, com.github.mikephil.charting.utils.Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.mDrawZeroLinePathBuffer = new android.graphics.Path();
        this.mRenderLimitLinesPathBuffer = new android.graphics.Path();
        this.mRenderLimitLinesBuffer = new float[4];
        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentHeight() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (!z) {
                f3 = (float) valuesByTouchPoint.x;
                d = valuesByTouchPoint2.x;
            } else {
                f3 = (float) valuesByTouchPoint2.x;
                d = valuesByTouchPoint.x;
            }
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        float contentBottom;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
            float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(2.5f);
            float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mAxisLabelPaint, com.visa.cbp.getEncExpo.updateVisuals);
            com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            this.mYAxis.getLabelPosition();
            if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                com.github.mikephil.charting.components.YAxis.YAxisLabelPosition yAxisLabelPosition = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                contentBottom = this.mViewPortHandler.contentTop() - convertDpToPixel;
            } else {
                com.github.mikephil.charting.components.YAxis.YAxisLabelPosition yAxisLabelPosition2 = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                contentBottom = this.mViewPortHandler.contentBottom() + calcTextHeight + convertDpToPixel;
            }
            drawYLabels(canvas, contentBottom, transformedPositions, this.mYAxis.getYOffset());
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (this.mYAxis.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected void drawYLabels(android.graphics.Canvas canvas, float f, float[] fArr, float f2) {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), fArr[i2 * 2], f - f2, this.mAxisLabelPaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected float[] getTransformedPositions() {
        if (this.mGetTransformedPositionsBuffer.length != this.mYAxis.mEntryCount * 2) {
            this.mGetTransformedPositionsBuffer = new float[this.mYAxis.mEntryCount * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i] = this.mYAxis.mEntries[i / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public android.graphics.RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected android.graphics.Path linePath(android.graphics.Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.mViewPortHandler.contentTop());
        path.lineTo(fArr[i], this.mViewPortHandler.contentBottom());
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected void drawZeroLine(android.graphics.Canvas canvas) {
        int save = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mZeroLineClippingRect.inset(-this.mYAxis.getZeroLineWidth(), 0.0f);
        canvas.clipRect(this.mLimitLineClippingRect);
        com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mTrans.getPixelForValues(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        android.graphics.Path path = this.mDrawZeroLinePathBuffer;
        path.reset();
        path.moveTo(((float) pixelForValues.x) - 1.0f, this.mViewPortHandler.contentTop());
        path.lineTo(((float) pixelForValues.x) - 1.0f, this.mViewPortHandler.contentBottom());
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(save);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
        java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c = 1;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        android.graphics.Path path = this.mRenderLimitLinesPathBuffer;
        path.reset();
        int i = 0;
        while (i < limitLines.size()) {
            com.github.mikephil.charting.components.LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int save = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(-limitLine.getLineWidth(), f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[0] = limitLine.getLimit();
                fArr[2] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                fArr[c] = this.mViewPortHandler.contentTop();
                fArr[3] = this.mViewPortHandler.contentBottom();
                path.moveTo(fArr[0], fArr[c]);
                path.lineTo(fArr[2], fArr[3]);
                this.mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                java.lang.String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float lineWidth = limitLine.getLineWidth() + limitLine.getXOffset();
                    float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(2.0f) + limitLine.getYOffset();
                    com.github.mikephil.charting.components.LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label);
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentTop() + convertDpToPixel + calcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentBottom() - convertDpToPixel, this.mLimitLinePaint);
                    } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentTop() + convertDpToPixel + com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentBottom() - convertDpToPixel, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(save);
            }
            i++;
            f = 0.0f;
            c = 1;
        }
    }
}
