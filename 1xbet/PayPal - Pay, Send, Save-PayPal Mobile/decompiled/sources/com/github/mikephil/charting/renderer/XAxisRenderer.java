package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class XAxisRenderer extends com.github.mikephil.charting.renderer.AxisRenderer {
    private android.graphics.Path getHighSpeedVideoFpsRangesFor;
    float[] getHighSpeedVideoSizes;
    protected android.graphics.RectF mGridClippingRect;
    protected android.graphics.RectF mLimitLineClippingRect;
    protected float[] mRenderGridLinesBuffer;
    protected android.graphics.Path mRenderGridLinesPath;
    protected float[] mRenderLimitLinesBuffer;
    protected com.github.mikephil.charting.components.XAxis mXAxis;

    public XAxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.XAxis xAxis, com.github.mikephil.charting.utils.Transformer transformer) {
        super(viewPortHandler, transformer, xAxis);
        this.mRenderGridLinesPath = new android.graphics.Path();
        this.mRenderGridLinesBuffer = new float[2];
        this.mGridClippingRect = new android.graphics.RectF();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new android.graphics.RectF();
        this.getHighSpeedVideoSizes = new float[4];
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Path();
        this.mXAxis = xAxis;
        this.mAxisLabelPaint.setColor(-16777216);
        this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mAxisLabelPaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f));
    }

    protected void setupGridPaint() {
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (z) {
                f3 = (float) valuesByTouchPoint2.x;
                d = valuesByTouchPoint.x;
            } else {
                f3 = (float) valuesByTouchPoint.x;
                d = valuesByTouchPoint2.x;
            }
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
            com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float f, float f2) {
        super.computeAxisValues(f, f2);
        computeSize();
    }

    protected void computeSize() {
        java.lang.String longestLabel = this.mXAxis.getLongestLabel();
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        com.github.mikephil.charting.utils.FSize calcTextSize = com.github.mikephil.charting.utils.Utils.calcTextSize(this.mAxisLabelPaint, longestLabel);
        float f = calcTextSize.width;
        float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mAxisLabelPaint, com.visa.cbp.getEncExpo.updateVisuals);
        com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = com.github.mikephil.charting.utils.Utils.getSizeOfRotatedRectangleByDegrees(f, calcTextHeight, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = java.lang.Math.round(f);
        this.mXAxis.mLabelHeight = java.lang.Math.round(calcTextHeight);
        this.mXAxis.mLabelRotatedWidth = java.lang.Math.round(sizeOfRotatedRectangleByDegrees.width);
        this.mXAxis.mLabelRotatedHeight = java.lang.Math.round(sizeOfRotatedRectangleByDegrees.height);
        com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
        com.github.mikephil.charting.utils.FSize.recycleInstance(calcTextSize);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.getYOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP) {
                mPPointF.x = 0.5f;
                mPPointF.y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() - yOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE) {
                mPPointF.x = 0.5f;
                mPPointF.y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() + yOffset + this.mXAxis.mLabelRotatedHeight, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM) {
                mPPointF.x = 0.5f;
                mPPointF.y = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE) {
                mPPointF.x = 0.5f;
                mPPointF.y = 0.0f;
                drawLabels(canvas, (this.mViewPortHandler.contentBottom() - yOffset) - this.mXAxis.mLabelRotatedHeight, mPPointF);
            } else {
                mPPointF.x = 0.5f;
                mPPointF.y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() - yOffset, mPPointF);
                mPPointF.x = 0.5f;
                mPPointF.y = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, mPPointF);
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    protected void drawLabels(android.graphics.Canvas canvas, float f, com.github.mikephil.charting.utils.MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean isCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (isCenterAxisLabelsEnabled) {
                fArr[i2] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (this.mViewPortHandler.isInBoundsX(f2)) {
                int i4 = i3 / 2;
                java.lang.String axisLabel = this.mXAxis.getValueFormatter().getAxisLabel(this.mXAxis.mEntries[i4], this.mXAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (i4 == this.mXAxis.mEntryCount - 1 && this.mXAxis.mEntryCount > 1) {
                        float calcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        if (calcTextWidth > this.mViewPortHandler.offsetRight() * 2.0f && f2 + calcTextWidth > this.mViewPortHandler.getChartWidth()) {
                            f2 -= calcTextWidth / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel) / 2.0f;
                    }
                }
                drawLabel(canvas, axisLabel, f2, f, mPPointF, labelRotationAngle);
            }
        }
    }

    protected void drawLabel(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        com.github.mikephil.charting.utils.Utils.drawXAxisValue(canvas, str, f, f2, this.mAxisLabelPaint, mPPointF, f3);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(android.graphics.Canvas canvas) {
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int save = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i = 0; i < fArr.length; i += 2) {
                int i2 = i / 2;
                fArr[i] = this.mXAxis.mEntries[i2];
                fArr[i + 1] = this.mXAxis.mEntries[i2];
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            android.graphics.Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                drawGridLine(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    public android.graphics.RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    protected void drawGridLine(android.graphics.Canvas canvas, float f, float f2, android.graphics.Path path) {
        path.moveTo(f, this.mViewPortHandler.contentBottom());
        path.lineTo(f, this.mViewPortHandler.contentTop());
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
        java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i = 0; i < limitLines.size(); i++) {
            com.github.mikephil.charting.components.LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int save = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(-limitLine.getLineWidth(), 0.0f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[0] = limitLine.getLimit();
                fArr[1] = 0.0f;
                this.mTrans.pointValuesToPixel(fArr);
                renderLimitLineLine(canvas, limitLine, fArr);
                renderLimitLineLabel(canvas, limitLine, fArr, limitLine.getYOffset() + 2.0f);
                canvas.restoreToCount(save);
            }
        }
    }

    public void renderLimitLineLine(android.graphics.Canvas canvas, com.github.mikephil.charting.components.LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.getHighSpeedVideoSizes;
        fArr2[0] = fArr[0];
        fArr2[1] = this.mViewPortHandler.contentTop();
        float[] fArr3 = this.getHighSpeedVideoSizes;
        fArr3[2] = fArr[0];
        fArr3[3] = this.mViewPortHandler.contentBottom();
        this.getHighSpeedVideoFpsRangesFor.reset();
        android.graphics.Path path = this.getHighSpeedVideoFpsRangesFor;
        float[] fArr4 = this.getHighSpeedVideoSizes;
        path.moveTo(fArr4[0], fArr4[1]);
        android.graphics.Path path2 = this.getHighSpeedVideoFpsRangesFor;
        float[] fArr5 = this.getHighSpeedVideoSizes;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mLimitLinePaint.setColor(limitLine.getLineColor());
        this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
        this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
        canvas.drawPath(this.getHighSpeedVideoFpsRangesFor, this.mLimitLinePaint);
    }

    public void renderLimitLineLabel(android.graphics.Canvas canvas, com.github.mikephil.charting.components.LimitLine limitLine, float[] fArr, float f) {
        java.lang.String label = limitLine.getLabel();
        if (label == null || label.equals("")) {
            return;
        }
        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(0.5f);
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        float lineWidth = limitLine.getLineWidth() + limitLine.getXOffset();
        com.github.mikephil.charting.components.LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
        if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP) {
            float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label);
            this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
            canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentTop() + f + calcTextHeight, this.mLimitLinePaint);
        } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
            this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
            canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentBottom() - f, this.mLimitLinePaint);
        } else if (labelPosition == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP) {
            this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
            canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentTop() + f + com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
        } else {
            this.mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
            canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentBottom() - f, this.mLimitLinePaint);
        }
    }
}
