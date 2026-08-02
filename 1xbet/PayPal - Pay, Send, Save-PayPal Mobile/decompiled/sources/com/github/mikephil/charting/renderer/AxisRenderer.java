package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public abstract class AxisRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected com.github.mikephil.charting.components.AxisBase mAxis;
    protected android.graphics.Paint mAxisLabelPaint;
    protected android.graphics.Paint mAxisLinePaint;
    protected android.graphics.Paint mGridPaint;
    protected android.graphics.Paint mLimitLinePaint;
    protected com.github.mikephil.charting.utils.Transformer mTrans;

    public abstract void renderAxisLabels(android.graphics.Canvas canvas);

    public abstract void renderAxisLine(android.graphics.Canvas canvas);

    public abstract void renderGridLines(android.graphics.Canvas canvas);

    public abstract void renderLimitLines(android.graphics.Canvas canvas);

    public AxisRenderer(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.components.AxisBase axisBase) {
        super(viewPortHandler);
        this.mTrans = transformer;
        this.mAxis = axisBase;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new android.graphics.Paint(1);
            android.graphics.Paint paint = new android.graphics.Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            this.mGridPaint.setStyle(android.graphics.Paint.Style.STROKE);
            this.mGridPaint.setAlpha(90);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.mAxisLinePaint = paint2;
            paint2.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint3 = new android.graphics.Paint(1);
            this.mLimitLinePaint = paint3;
            paint3.setStyle(android.graphics.Paint.Style.STROKE);
        }
    }

    public android.graphics.Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public android.graphics.Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public android.graphics.Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public com.github.mikephil.charting.utils.Transformer getTransformer() {
        return this.mTrans;
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler != null && this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (!z) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    protected void computeAxisValues(float f, float f2) {
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
        int isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            roundToNextSignificant = ((float) abs) / (labelCount - 1);
            this.mAxis.mEntryCount = labelCount;
            if (this.mAxis.mEntries.length < labelCount) {
                this.mAxis.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f3;
                f3 = (float) (f3 + roundToNextSignificant);
            }
        } else {
            double ceil = roundToNextSignificant == 0.0d ? 0.0d : java.lang.Math.ceil(f3 / roundToNextSignificant) * roundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                ceil -= roundToNextSignificant;
            }
            double nextUp = roundToNextSignificant == 0.0d ? 0.0d : com.github.mikephil.charting.utils.Utils.nextUp(java.lang.Math.floor(f2 / roundToNextSignificant) * roundToNextSignificant);
            if (roundToNextSignificant != 0.0d) {
                double d = ceil;
                isCenterAxisLabelsEnabled = isCenterAxisLabelsEnabled;
                while (d <= nextUp) {
                    d += roundToNextSignificant;
                    isCenterAxisLabelsEnabled++;
                }
            }
            this.mAxis.mEntryCount = isCenterAxisLabelsEnabled;
            if (this.mAxis.mEntries.length < isCenterAxisLabelsEnabled) {
                this.mAxis.mEntries = new float[isCenterAxisLabelsEnabled];
            }
            for (int i2 = 0; i2 < isCenterAxisLabelsEnabled; i2++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                this.mAxis.mEntries[i2] = (float) ceil;
                ceil += roundToNextSignificant;
            }
            labelCount = isCenterAxisLabelsEnabled;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) java.lang.Math.ceil(-java.lang.Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            if (this.mAxis.mCenteredEntries.length < labelCount) {
                this.mAxis.mCenteredEntries = new float[labelCount];
            }
            float f4 = ((float) roundToNextSignificant) / 2.0f;
            for (int i3 = 0; i3 < labelCount; i3++) {
                this.mAxis.mCenteredEntries[i3] = this.mAxis.mEntries[i3] + f4;
            }
        }
    }
}
