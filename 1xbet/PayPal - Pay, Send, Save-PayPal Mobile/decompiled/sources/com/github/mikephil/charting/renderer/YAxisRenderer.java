package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class YAxisRenderer extends com.github.mikephil.charting.renderer.AxisRenderer {
    protected android.graphics.Path mDrawZeroLinePath;
    protected float[] mGetTransformedPositionsBuffer;
    protected android.graphics.RectF mGridClippingRect;
    protected android.graphics.RectF mLimitLineClippingRect;
    protected android.graphics.Path mRenderGridLinesPath;
    protected android.graphics.Path mRenderLimitLines;
    protected float[] mRenderLimitLinesBuffer;
    protected com.github.mikephil.charting.components.YAxis mYAxis;
    protected android.graphics.RectF mZeroLineClippingRect;
    protected android.graphics.Paint mZeroLinePaint;

    public YAxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.YAxis yAxis, com.github.mikephil.charting.utils.Transformer transformer) {
        super(viewPortHandler, transformer, yAxis);
        this.mRenderGridLinesPath = new android.graphics.Path();
        this.mGridClippingRect = new android.graphics.RectF();
        this.mGetTransformedPositionsBuffer = new float[2];
        this.mDrawZeroLinePath = new android.graphics.Path();
        this.mZeroLineClippingRect = new android.graphics.RectF();
        this.mRenderLimitLines = new android.graphics.Path();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new android.graphics.RectF();
        this.mYAxis = yAxis;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint.setColor(-16777216);
            this.mAxisLabelPaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f));
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.mZeroLinePaint = paint;
            paint.setColor(-7829368);
            this.mZeroLinePaint.setStrokeWidth(1.0f);
            this.mZeroLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        float contentRight;
        float contentRight2;
        float f;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            float xOffset = this.mYAxis.getXOffset();
            float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f;
            float yOffset = this.mYAxis.getYOffset();
            com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            com.github.mikephil.charting.components.YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                if (labelPosition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                    contentRight = this.mViewPortHandler.offsetLeft();
                    f = contentRight - xOffset;
                } else {
                    this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                    contentRight2 = this.mViewPortHandler.offsetLeft();
                    f = contentRight2 + xOffset;
                }
            } else if (labelPosition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                contentRight2 = this.mViewPortHandler.contentRight();
                f = contentRight2 + xOffset;
            } else {
                this.mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                contentRight = this.mViewPortHandler.contentRight();
                f = contentRight - xOffset;
            }
            drawYLabels(canvas, f, transformedPositions, calcTextHeight + yOffset);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(android.graphics.Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (this.mYAxis.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    protected void drawYLabels(android.graphics.Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), f, fArr[(i2 * 2) + 1] + f2, this.mAxisLabelPaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(android.graphics.Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int save = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                android.graphics.Path path = this.mRenderGridLinesPath;
                path.reset();
                for (int i = 0; i < transformedPositions.length; i += 2) {
                    canvas.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
        }
    }

    public android.graphics.RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    protected android.graphics.Path linePath(android.graphics.Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.mViewPortHandler.offsetLeft(), fArr[i2]);
        path.lineTo(this.mViewPortHandler.contentRight(), fArr[i2]);
        return path;
    }

    protected float[] getTransformedPositions() {
        if (this.mGetTransformedPositionsBuffer.length != this.mYAxis.mEntryCount * 2) {
            this.mGetTransformedPositionsBuffer = new float[this.mYAxis.mEntryCount * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i + 1] = this.mYAxis.mEntries[i / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    protected void drawZeroLine(android.graphics.Canvas canvas) {
        int save = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mZeroLineClippingRect.inset(0.0f, -this.mYAxis.getZeroLineWidth());
        canvas.clipRect(this.mZeroLineClippingRect);
        com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mTrans.getPixelForValues(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        android.graphics.Path path = this.mDrawZeroLinePath;
        path.reset();
        path.moveTo(this.mViewPortHandler.contentLeft(), (float) pixelForValues.y);
        path.lineTo(this.mViewPortHandler.contentRight(), (float) pixelForValues.y);
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(save);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
        java.util.List<com.github.mikephil.charting.components.LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        android.graphics.Path path = this.mRenderLimitLines;
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
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
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
