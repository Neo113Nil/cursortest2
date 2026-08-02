package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class CombinedHighlighter extends com.github.mikephil.charting.highlight.ChartHighlighter<com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected com.github.mikephil.charting.highlight.BarHighlighter barHighlighter;

    public CombinedHighlighter(com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider combinedDataProvider, com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider barDataProvider) {
        super(combinedDataProvider);
        this.barHighlighter = barDataProvider.getBarData() == null ? null : new com.github.mikephil.charting.highlight.BarHighlighter(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> getHighlightsAtXValue(float f, float f2, float f3) {
        this.mHighlightBuffer.clear();
        java.util.List<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> allData = ((com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider) this.mChart).getCombinedData().getAllData();
        for (int i = 0; i < allData.size(); i++) {
            com.github.mikephil.charting.data.BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = allData.get(i);
            com.github.mikephil.charting.highlight.BarHighlighter barHighlighter = this.barHighlighter;
            if (barHighlighter != null && (barLineScatterCandleBubbleData instanceof com.github.mikephil.charting.data.BarData)) {
                com.github.mikephil.charting.highlight.Highlight highlight = barHighlighter.getHighlight(f2, f3);
                if (highlight != null) {
                    highlight.setDataIndex(i);
                    this.mHighlightBuffer.add(highlight);
                }
            } else {
                int dataSetCount = barLineScatterCandleBubbleData.getDataSetCount();
                for (int i2 = 0; i2 < dataSetCount; i2++) {
                    com.github.mikephil.charting.interfaces.datasets.IDataSet dataSetByIndex = allData.get(i).getDataSetByIndex(i2);
                    if (dataSetByIndex.isHighlightEnabled()) {
                        for (com.github.mikephil.charting.highlight.Highlight highlight2 : buildHighlights(dataSetByIndex, i2, f, com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST)) {
                            highlight2.setDataIndex(i);
                            this.mHighlightBuffer.add(highlight2);
                        }
                    }
                }
            }
        }
        return this.mHighlightBuffer;
    }
}
