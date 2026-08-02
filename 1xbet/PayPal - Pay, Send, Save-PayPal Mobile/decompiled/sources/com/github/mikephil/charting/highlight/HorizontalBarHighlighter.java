package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class HorizontalBarHighlighter extends com.github.mikephil.charting.highlight.BarHighlighter {
    public HorizontalBarHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float f, float f2) {
        com.github.mikephil.charting.data.BarData barData = ((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) this.mChart).getBarData();
        com.github.mikephil.charting.utils.MPPointD valsForTouch = getValsForTouch(f2, f);
        com.github.mikephil.charting.highlight.Highlight highlightForX = getHighlightForX((float) valsForTouch.y, f2, f);
        if (highlightForX == null) {
            return null;
        }
        com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) barData.getDataSetByIndex(highlightForX.getDataSetIndex());
        if (iBarDataSet.isStacked()) {
            return getStackedHighlight(highlightForX, iBarDataSet, (float) valsForTouch.y, (float) valsForTouch.x);
        }
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valsForTouch);
        return highlightForX;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> buildHighlights(com.github.mikephil.charting.interfaces.datasets.IDataSet iDataSet, int i, float f, com.github.mikephil.charting.data.DataSet.Rounding rounding) {
        com.github.mikephil.charting.data.Entry entryForXValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.github.mikephil.charting.data.Entry> entriesForXValue = iDataSet.getEntriesForXValue(f);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() != 0) {
            for (com.github.mikephil.charting.data.Entry entry : entriesForXValue) {
                com.github.mikephil.charting.utils.MPPointD pixelForValues = ((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) this.mChart).getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getY(), entry.getX());
                arrayList.add(new com.github.mikephil.charting.highlight.Highlight(entry.getX(), entry.getY(), (float) pixelForValues.x, (float) pixelForValues.y, i, iDataSet.getAxisDependency()));
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter
    protected float getDistance(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(f2 - f4);
    }
}
