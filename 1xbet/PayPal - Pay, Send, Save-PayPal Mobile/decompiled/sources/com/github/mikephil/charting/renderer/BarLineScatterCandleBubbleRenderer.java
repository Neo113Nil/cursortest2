package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public abstract class BarLineScatterCandleBubbleRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds mXBounds;

    public BarLineScatterCandleBubbleRenderer(com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mXBounds = new com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds();
    }

    protected boolean shouldDrawValues(com.github.mikephil.charting.interfaces.datasets.IDataSet iDataSet) {
        if (iDataSet.isVisible()) {
            return iDataSet.isDrawValuesEnabled() || iDataSet.isDrawIconsEnabled();
        }
        return false;
    }

    protected boolean isInBoundsX(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
        if (entry == null) {
            return false;
        }
        return entry != null && ((float) iBarLineScatterCandleBubbleDataSet.getEntryIndex(entry)) < ((float) iBarLineScatterCandleBubbleDataSet.getEntryCount()) * this.mAnimator.getPhaseX();
    }

    protected class XBounds {
        public int max;
        public int min;
        public int range;

        protected XBounds() {
        }

        public void set(com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.this.mAnimator.getPhaseX()));
            float lowestVisibleX = barLineScatterCandleBubbleDataProvider.getLowestVisibleX();
            float highestVisibleX = barLineScatterCandleBubbleDataProvider.getHighestVisibleX();
            T entryForXValue = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(lowestVisibleX, Float.NaN, com.github.mikephil.charting.data.DataSet.Rounding.DOWN);
            T entryForXValue2 = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(highestVisibleX, Float.NaN, com.github.mikephil.charting.data.DataSet.Rounding.UP);
            this.min = entryForXValue == 0 ? 0 : iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue);
            this.max = entryForXValue2 != 0 ? iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue2) : 0;
            this.range = (int) ((r2 - this.min) * max);
        }
    }
}
