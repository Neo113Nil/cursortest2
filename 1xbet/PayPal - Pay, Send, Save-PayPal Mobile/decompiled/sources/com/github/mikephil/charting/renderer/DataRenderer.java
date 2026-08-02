package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public abstract class DataRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected com.github.mikephil.charting.animation.ChartAnimator mAnimator;
    protected android.graphics.Paint mDrawPaint;
    protected android.graphics.Paint mHighlightPaint;
    protected android.graphics.Paint mRenderPaint;
    protected android.graphics.Paint mValuePaint;

    public abstract void drawData(android.graphics.Canvas canvas);

    public abstract void drawExtras(android.graphics.Canvas canvas);

    public abstract void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr);

    public abstract void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i);

    public abstract void drawValues(android.graphics.Canvas canvas);

    public abstract void initBuffers();

    public DataRenderer(com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(viewPortHandler);
        this.mAnimator = chartAnimator;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mRenderPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mDrawPaint = new android.graphics.Paint(4);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mValuePaint = paint2;
        paint2.setColor(android.graphics.Color.rgb(63, 63, 63));
        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mValuePaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(9.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.mHighlightPaint = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(android.graphics.Color.rgb(255, 187, 115));
    }

    protected boolean isDrawingValuesAllowed(com.github.mikephil.charting.interfaces.dataprovider.ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleX();
    }

    public android.graphics.Paint getPaintValues() {
        return this.mValuePaint;
    }

    public android.graphics.Paint getPaintHighlight() {
        return this.mHighlightPaint;
    }

    public android.graphics.Paint getPaintRender() {
        return this.mRenderPaint;
    }

    protected void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet iDataSet) {
        this.mValuePaint.setTypeface(iDataSet.getValueTypeface());
        this.mValuePaint.setTextSize(iDataSet.getValueTextSize());
    }
}
