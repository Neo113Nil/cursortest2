package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class ChartHighlighter<T extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected T mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer = new java.util.ArrayList();

    public ChartHighlighter(T t) {
        this.mChart = t;
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointD valsForTouch = getValsForTouch(f, f2);
        float f3 = (float) valsForTouch.x;
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valsForTouch);
        return getHighlightForX(f3, f, f2);
    }

    protected com.github.mikephil.charting.utils.MPPointD getValsForTouch(float f, float f2) {
        return this.mChart.getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f, f2);
    }

    protected com.github.mikephil.charting.highlight.Highlight getHighlightForX(float f, float f2, float f3) {
        java.util.List<com.github.mikephil.charting.highlight.Highlight> highlightsAtXValue = getHighlightsAtXValue(f, f2, f3);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        return getClosestHighlightByPixel(highlightsAtXValue, f2, f3, getMinimumDistance(highlightsAtXValue, f3, com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) < getMinimumDistance(highlightsAtXValue, f3, com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT) ? com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT : com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT, this.mChart.getMaxHighlightDistance());
    }

    protected float getMinimumDistance(java.util.List<com.github.mikephil.charting.highlight.Highlight> list, float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            com.github.mikephil.charting.highlight.Highlight highlight = list.get(i);
            if (highlight.getAxis() == axisDependency) {
                float abs = java.lang.Math.abs(getHighlightPos(highlight) - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    protected float getHighlightPos(com.github.mikephil.charting.highlight.Highlight highlight) {
        return highlight.getYPx();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtXValue(float f, float f2, float f3) {
        this.mHighlightBuffer.clear();
        com.github.mikephil.charting.data.BarLineScatterCandleBubbleData data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i = 0; i < dataSetCount; i++) {
            ?? dataSetByIndex = data.getDataSetByIndex(i);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i, f, com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> buildHighlights(com.github.mikephil.charting.interfaces.datasets.IDataSet iDataSet, int i, float f, com.github.mikephil.charting.data.DataSet.Rounding rounding) {
        com.github.mikephil.charting.data.Entry entryForXValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.github.mikephil.charting.data.Entry> entriesForXValue = iDataSet.getEntriesForXValue(f);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() != 0) {
            for (com.github.mikephil.charting.data.Entry entry : entriesForXValue) {
                com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
                arrayList.add(new com.github.mikephil.charting.highlight.Highlight(entry.getX(), entry.getY(), (float) pixelForValues.x, (float) pixelForValues.y, i, iDataSet.getAxisDependency()));
            }
        }
        return arrayList;
    }

    public com.github.mikephil.charting.highlight.Highlight getClosestHighlightByPixel(java.util.List<com.github.mikephil.charting.highlight.Highlight> list, float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, float f3) {
        com.github.mikephil.charting.highlight.Highlight highlight = null;
        for (int i = 0; i < list.size(); i++) {
            com.github.mikephil.charting.highlight.Highlight highlight2 = list.get(i);
            if (axisDependency == null || highlight2.getAxis() == axisDependency) {
                float distance = getDistance(f, f2, highlight2.getXPx(), highlight2.getYPx());
                if (distance < f3) {
                    highlight = highlight2;
                    f3 = distance;
                }
            }
        }
        return highlight;
    }

    protected float getDistance(float f, float f2, float f3, float f4) {
        return (float) java.lang.Math.hypot(f - f3, f2 - f4);
    }

    protected com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
        return this.mChart.getData();
    }
}
