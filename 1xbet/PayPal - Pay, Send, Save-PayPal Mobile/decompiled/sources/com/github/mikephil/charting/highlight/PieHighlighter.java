package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class PieHighlighter extends com.github.mikephil.charting.highlight.PieRadarHighlighter<com.github.mikephil.charting.charts.PieChart> {
    public PieHighlighter(com.github.mikephil.charting.charts.PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    protected com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int i, float f, float f2) {
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet dataSet = ((com.github.mikephil.charting.data.PieData) ((com.github.mikephil.charting.charts.PieChart) this.mChart).getData()).getDataSet();
        return new com.github.mikephil.charting.highlight.Highlight(i, dataSet.getEntryForIndex(i).getY(), f, f2, 0, dataSet.getAxisDependency());
    }
}
