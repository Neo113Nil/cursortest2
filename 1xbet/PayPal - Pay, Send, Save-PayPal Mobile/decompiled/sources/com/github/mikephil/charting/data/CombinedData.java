package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class CombinedData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>> {
    private com.github.mikephil.charting.data.BubbleData Camera2StreamConfigurationMap;
    private com.github.mikephil.charting.data.ScatterData getHighResolutionOutputSizeshNQ4ISI;
    private com.github.mikephil.charting.data.LineData getHighSpeedVideoFpsRanges;
    private com.github.mikephil.charting.data.CandleData getHighSpeedVideoFpsRangesFor;
    private com.github.mikephil.charting.data.BarData getHighSpeedVideoSizes;

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeDataSet(int i) {
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(float f, int i) {
        return false;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    @java.lang.Deprecated
    public boolean removeEntry(com.github.mikephil.charting.data.Entry entry, int i) {
        return false;
    }

    public void setData(com.github.mikephil.charting.data.LineData lineData) {
        this.getHighSpeedVideoFpsRanges = lineData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.BarData barData) {
        this.getHighSpeedVideoSizes = barData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.ScatterData scatterData) {
        this.getHighResolutionOutputSizeshNQ4ISI = scatterData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.CandleData candleData) {
        this.getHighSpeedVideoFpsRangesFor = candleData;
        notifyDataChanged();
    }

    public void setData(com.github.mikephil.charting.data.BubbleData bubbleData) {
        this.Camera2StreamConfigurationMap = bubbleData;
        notifyDataChanged();
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void calcMinMax() {
        if (this.mDataSets == null) {
            this.mDataSets = new java.util.ArrayList();
        }
        this.mDataSets.clear();
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        for (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData barLineScatterCandleBubbleData : getAllData()) {
            barLineScatterCandleBubbleData.calcMinMax();
            this.mDataSets.addAll(barLineScatterCandleBubbleData.getDataSets());
            if (barLineScatterCandleBubbleData.getYMax() > this.mYMax) {
                this.mYMax = barLineScatterCandleBubbleData.getYMax();
            }
            if (barLineScatterCandleBubbleData.getYMin() < this.mYMin) {
                this.mYMin = barLineScatterCandleBubbleData.getYMin();
            }
            if (barLineScatterCandleBubbleData.getXMax() > this.mXMax) {
                this.mXMax = barLineScatterCandleBubbleData.getXMax();
            }
            if (barLineScatterCandleBubbleData.getXMin() < this.mXMin) {
                this.mXMin = barLineScatterCandleBubbleData.getXMin();
            }
            if (barLineScatterCandleBubbleData.mLeftAxisMax > this.mLeftAxisMax) {
                this.mLeftAxisMax = barLineScatterCandleBubbleData.mLeftAxisMax;
            }
            if (barLineScatterCandleBubbleData.mLeftAxisMin < this.mLeftAxisMin) {
                this.mLeftAxisMin = barLineScatterCandleBubbleData.mLeftAxisMin;
            }
            if (barLineScatterCandleBubbleData.mRightAxisMax > this.mRightAxisMax) {
                this.mRightAxisMax = barLineScatterCandleBubbleData.mRightAxisMax;
            }
            if (barLineScatterCandleBubbleData.mRightAxisMin < this.mRightAxisMin) {
                this.mRightAxisMin = barLineScatterCandleBubbleData.mRightAxisMin;
            }
        }
    }

    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.github.mikephil.charting.data.LineData getLineData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.github.mikephil.charting.data.BarData getBarData() {
        return this.getHighSpeedVideoSizes;
    }

    public com.github.mikephil.charting.data.ScatterData getScatterData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.github.mikephil.charting.data.CandleData getCandleData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.List<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> getAllData() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.github.mikephil.charting.data.LineData lineData = this.getHighSpeedVideoFpsRanges;
        if (lineData != null) {
            arrayList.add(lineData);
        }
        com.github.mikephil.charting.data.BarData barData = this.getHighSpeedVideoSizes;
        if (barData != null) {
            arrayList.add(barData);
        }
        com.github.mikephil.charting.data.ScatterData scatterData = this.getHighResolutionOutputSizeshNQ4ISI;
        if (scatterData != null) {
            arrayList.add(scatterData);
        }
        com.github.mikephil.charting.data.CandleData candleData = this.getHighSpeedVideoFpsRangesFor;
        if (candleData != null) {
            arrayList.add(candleData);
        }
        com.github.mikephil.charting.data.BubbleData bubbleData = this.Camera2StreamConfigurationMap;
        if (bubbleData != null) {
            arrayList.add(bubbleData);
        }
        return arrayList;
    }

    public com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getDataByIndex(int i) {
        return getAllData().get(i);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public void notifyDataChanged() {
        com.github.mikephil.charting.data.LineData lineData = this.getHighSpeedVideoFpsRanges;
        if (lineData != null) {
            lineData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.BarData barData = this.getHighSpeedVideoSizes;
        if (barData != null) {
            barData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.CandleData candleData = this.getHighSpeedVideoFpsRangesFor;
        if (candleData != null) {
            candleData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.ScatterData scatterData = this.getHighResolutionOutputSizeshNQ4ISI;
        if (scatterData != null) {
            scatterData.notifyDataChanged();
        }
        com.github.mikephil.charting.data.BubbleData bubbleData = this.Camera2StreamConfigurationMap;
        if (bubbleData != null) {
            bubbleData.notifyDataChanged();
        }
        calcMinMax();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    @Override // com.github.mikephil.charting.data.ChartData
    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        if (highlight.getDataIndex() >= getAllData().size()) {
            return null;
        }
        com.github.mikephil.charting.data.BarLineScatterCandleBubbleData dataByIndex = getDataByIndex(highlight.getDataIndex());
        if (highlight.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        for (com.github.mikephil.charting.data.Entry entry : dataByIndex.getDataSetByIndex(highlight.getDataSetIndex()).getEntriesForXValue(highlight.getX())) {
            if (entry.getY() == highlight.getY() || java.lang.Float.isNaN(highlight.getY())) {
                return entry;
            }
        }
        return null;
    }

    public com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> getDataSetByHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        if (highlight.getDataIndex() >= getAllData().size()) {
            return null;
        }
        com.github.mikephil.charting.data.BarLineScatterCandleBubbleData dataByIndex = getDataByIndex(highlight.getDataIndex());
        if (highlight.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        return (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) dataByIndex.getDataSets().get(highlight.getDataSetIndex());
    }

    public int getDataIndex(com.github.mikephil.charting.data.ChartData chartData) {
        return getAllData().indexOf(chartData);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public boolean removeDataSet(com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> iBarLineScatterCandleBubbleDataSet) {
        java.util.Iterator<com.github.mikephil.charting.data.BarLineScatterCandleBubbleData> it = getAllData().iterator();
        boolean z = false;
        while (it.hasNext() && !(z = it.next().removeDataSet((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) iBarLineScatterCandleBubbleDataSet))) {
        }
        return z;
    }
}
