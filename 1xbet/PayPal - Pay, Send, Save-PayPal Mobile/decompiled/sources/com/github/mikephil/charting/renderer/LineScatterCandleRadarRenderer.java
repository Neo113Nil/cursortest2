package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public abstract class LineScatterCandleRadarRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private android.graphics.Path getHighResolutionOutputSizeshNQ4ISI;

    public LineScatterCandleRadarRenderer(com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Path();
    }

    protected void drawHighlightLines(android.graphics.Canvas canvas, float f, float f2, com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()) {
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            this.getHighResolutionOutputSizeshNQ4ISI.moveTo(f, this.mViewPortHandler.contentTop());
            this.getHighResolutionOutputSizeshNQ4ISI.lineTo(f, this.mViewPortHandler.contentBottom());
            canvas.drawPath(this.getHighResolutionOutputSizeshNQ4ISI, this.mHighlightPaint);
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            this.getHighResolutionOutputSizeshNQ4ISI.moveTo(this.mViewPortHandler.contentLeft(), f2);
            this.getHighResolutionOutputSizeshNQ4ISI.lineTo(this.mViewPortHandler.contentRight(), f2);
            canvas.drawPath(this.getHighResolutionOutputSizeshNQ4ISI, this.mHighlightPaint);
        }
    }
}
