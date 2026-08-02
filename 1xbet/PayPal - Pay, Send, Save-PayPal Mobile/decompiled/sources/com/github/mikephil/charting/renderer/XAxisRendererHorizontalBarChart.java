package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class XAxisRendererHorizontalBarChart extends com.github.mikephil.charting.renderer.XAxisRenderer {
    protected com.github.mikephil.charting.charts.BarChart mChart;
    protected android.graphics.Path mRenderLimitLinesPathBuffer;

    public XAxisRendererHorizontalBarChart(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.XAxis xAxis, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.charts.BarChart barChart) {
        super(viewPortHandler, xAxis, transformer);
        this.mRenderLimitLinesPathBuffer = new android.graphics.Path();
        this.mChart = barChart;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            if (z) {
                f3 = (float) valuesByTouchPoint2.y;
                d = valuesByTouchPoint.y;
            } else {
                f3 = (float) valuesByTouchPoint.y;
                d = valuesByTouchPoint2.y;
            }
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void computeSize() {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        com.github.mikephil.charting.utils.FSize calcTextSize = com.github.mikephil.charting.utils.Utils.calcTextSize(this.mAxisLabelPaint, this.mXAxis.getLongestLabel());
        float xOffset = (int) (calcTextSize.width + (this.mXAxis.getXOffset() * 3.5f));
        float f = calcTextSize.height;
        com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = com.github.mikephil.charting.utils.Utils.getSizeOfRotatedRectangleByDegrees(calcTextSize.width, f, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = java.lang.Math.round(xOffset);
        this.mXAxis.mLabelHeight = java.lang.Math.round(f);
        this.mXAxis.mLabelRotatedWidth = (int) (sizeOfRotatedRectangleByDegrees.width + (this.mXAxis.getXOffset() * 3.5f));
        this.mXAxis.mLabelRotatedHeight = java.lang.Math.round(sizeOfRotatedRectangleByDegrees.height);
        com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float xOffset = this.mXAxis.getXOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP) {
                mPPointF.x = 0.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE) {
                mPPointF.x = 1.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() - xOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM) {
                mPPointF.x = 1.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE) {
                mPPointF.x = 1.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() + xOffset, mPPointF);
            } else {
                mPPointF.x = 0.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, mPPointF);
                mPPointF.x = 1.0f;
                mPPointF.y = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, mPPointF);
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void drawLabels(android.graphics.Canvas canvas, float f, com.github.mikephil.charting.utils.MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean isCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (isCenterAxisLabelsEnabled) {
                fArr[i2 + 1] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2 + 1] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.mViewPortHandler.isInBoundsY(f2)) {
                drawLabel(canvas, this.mXAxis.getValueFormatter().getAxisLabel(this.mXAxis.mEntries[i3 / 2], this.mXAxis), f, f2, mPPointF, labelRotationAngle);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public android.graphics.RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    protected void drawGridLine(android.graphics.Canvas canvas, float f, float f2, android.graphics.Path path) {
        path.moveTo(this.mViewPortHandler.contentRight(), f2);
        path.lineTo(this.mViewPortHandler.contentLeft(), f2);
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
        java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        android.graphics.Path path = this.mRenderLimitLinesPathBuffer;
        path.reset();
        for (int i = 0; i < limitLines.size(); i++) {
            com.github.mikephil.charting.components.LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int save = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.mLimitLineClippingRect);
                this.mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                java.lang.String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label);
                    float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f) + limitLine.getXOffset();
                    float lineWidth = limitLine.getLineWidth() + calcTextHeight + limitLine.getYOffset();
                    com.github.mikephil.charting.components.LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - convertDpToPixel, (fArr[1] - lineWidth) + calcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - convertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.contentLeft() + convertDpToPixel, (fArr[1] - lineWidth) + calcTextHeight, this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.offsetLeft() + convertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
