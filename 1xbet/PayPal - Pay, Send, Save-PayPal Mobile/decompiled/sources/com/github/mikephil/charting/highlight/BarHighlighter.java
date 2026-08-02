package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class BarHighlighter extends com.github.mikephil.charting.highlight.ChartHighlighter<com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider> {
    public BarHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float f, float f2) {
        com.github.mikephil.charting.highlight.Highlight highlight = super.getHighlight(f, f2);
        if (highlight == null) {
            return null;
        }
        com.github.mikephil.charting.utils.MPPointD valsForTouch = getValsForTouch(f, f2);
        com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) ((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlight, iBarDataSet, (float) valsForTouch.x, (float) valsForTouch.y);
        }
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valsForTouch);
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.github.mikephil.charting.highlight.Highlight getStackedHighlight(com.github.mikephil.charting.highlight.Highlight highlight, com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet, float f, float f2) {
        com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForXValue(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return highlight;
        }
        com.github.mikephil.charting.highlight.Range[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int closestStackIndex = getClosestStackIndex(ranges, f2);
        com.github.mikephil.charting.utils.MPPointD pixelForValues = ((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) this.mChart).getTransformer(iBarDataSet.getAxisDependency()).getPixelForValues(highlight.getX(), ranges[closestStackIndex].to);
        com.github.mikephil.charting.highlight.Highlight highlight2 = new com.github.mikephil.charting.highlight.Highlight(barEntry.getX(), barEntry.getY(), (float) pixelForValues.x, (float) pixelForValues.y, highlight.getDataSetIndex(), closestStackIndex, highlight.getAxis());
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(pixelForValues);
        return highlight2;
    }

    protected int getClosestStackIndex(com.github.mikephil.charting.highlight.Range[] rangeArr, float f) {
        if (rangeArr != null && rangeArr.length != 0) {
            int i = 0;
            for (com.github.mikephil.charting.highlight.Range range : rangeArr) {
                if (range.contains(f)) {
                    return i;
                }
                i++;
            }
            int max = java.lang.Math.max(rangeArr.length - 1, 0);
            if (f > rangeArr[max].to) {
                return max;
            }
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(f - f3);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
        return ((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) this.mChart).getBarData();
    }
}
