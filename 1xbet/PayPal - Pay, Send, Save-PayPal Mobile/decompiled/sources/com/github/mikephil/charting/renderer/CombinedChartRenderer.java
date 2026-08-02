package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class CombinedChartRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer;
    protected java.util.List<com.github.mikephil.charting.renderer.DataRenderer> mRenderers;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
    }

    public CombinedChartRenderer(com.github.mikephil.charting.charts.CombinedChart combinedChart, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mRenderers = new java.util.ArrayList(5);
        this.mHighlightBuffer = new java.util.ArrayList();
        this.mChart = new java.lang.ref.WeakReference<>(combinedChart);
        createRenderers();
    }

    public void createRenderers() {
        this.mRenderers.clear();
        com.github.mikephil.charting.charts.CombinedChart combinedChart = (com.github.mikephil.charting.charts.CombinedChart) this.mChart.get();
        if (combinedChart != null) {
            for (com.github.mikephil.charting.charts.CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
                int i = com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.getHighSpeedVideoSizes[drawOrder.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (combinedChart.getCandleData() != null) {
                                    this.mRenderers.add(new com.github.mikephil.charting.renderer.CandleStickChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                                }
                            } else if (i == 5 && combinedChart.getScatterData() != null) {
                                this.mRenderers.add(new com.github.mikephil.charting.renderer.ScatterChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                            }
                        } else if (combinedChart.getLineData() != null) {
                            this.mRenderers.add(new com.github.mikephil.charting.renderer.LineChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        this.mRenderers.add(new com.github.mikephil.charting.renderer.BubbleChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                    }
                } else if (combinedChart.getBarData() != null) {
                    this.mRenderers.add(new com.github.mikephil.charting.renderer.BarChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler));
                }
            }
        }
    }

    /* renamed from: com.github.mikephil.charting.renderer.CombinedChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        java.util.Iterator<com.github.mikephil.charting.renderer.DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().initBuffers();
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        java.util.Iterator<com.github.mikephil.charting.renderer.DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawData(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        java.util.Iterator<com.github.mikephil.charting.renderer.DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        java.util.Iterator<com.github.mikephil.charting.renderer.DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawExtras(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        java.lang.Object bubbleData;
        com.github.mikephil.charting.charts.Chart chart = this.mChart.get();
        if (chart != null) {
            for (com.github.mikephil.charting.renderer.DataRenderer dataRenderer : this.mRenderers) {
                if (dataRenderer instanceof com.github.mikephil.charting.renderer.BarChartRenderer) {
                    bubbleData = ((com.github.mikephil.charting.renderer.BarChartRenderer) dataRenderer).mChart.getBarData();
                } else if (dataRenderer instanceof com.github.mikephil.charting.renderer.LineChartRenderer) {
                    bubbleData = ((com.github.mikephil.charting.renderer.LineChartRenderer) dataRenderer).mChart.getLineData();
                } else if (dataRenderer instanceof com.github.mikephil.charting.renderer.CandleStickChartRenderer) {
                    bubbleData = ((com.github.mikephil.charting.renderer.CandleStickChartRenderer) dataRenderer).mChart.getCandleData();
                } else if (dataRenderer instanceof com.github.mikephil.charting.renderer.ScatterChartRenderer) {
                    bubbleData = ((com.github.mikephil.charting.renderer.ScatterChartRenderer) dataRenderer).mChart.getScatterData();
                } else {
                    bubbleData = dataRenderer instanceof com.github.mikephil.charting.renderer.BubbleChartRenderer ? ((com.github.mikephil.charting.renderer.BubbleChartRenderer) dataRenderer).mChart.getBubbleData() : null;
                }
                int indexOf = bubbleData == null ? -1 : ((com.github.mikephil.charting.data.CombinedData) chart.getData()).getAllData().indexOf(bubbleData);
                this.mHighlightBuffer.clear();
                for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
                    if (highlight.getDataIndex() == indexOf || highlight.getDataIndex() == -1) {
                        this.mHighlightBuffer.add(highlight);
                    }
                }
                java.util.List<com.github.mikephil.charting.highlight.Highlight> list = this.mHighlightBuffer;
                dataRenderer.drawHighlighted(canvas, (com.github.mikephil.charting.highlight.Highlight[]) list.toArray(new com.github.mikephil.charting.highlight.Highlight[list.size()]));
            }
        }
    }

    public com.github.mikephil.charting.renderer.DataRenderer getSubRenderer(int i) {
        if (i >= this.mRenderers.size() || i < 0) {
            return null;
        }
        return this.mRenderers.get(i);
    }

    public java.util.List<com.github.mikephil.charting.renderer.DataRenderer> getSubRenderers() {
        return this.mRenderers;
    }

    public void setSubRenderers(java.util.List<com.github.mikephil.charting.renderer.DataRenderer> list) {
        this.mRenderers = list;
    }
}
