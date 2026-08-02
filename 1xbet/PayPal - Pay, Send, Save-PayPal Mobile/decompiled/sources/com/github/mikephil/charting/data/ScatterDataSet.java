package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class ScatterDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.IScatterDataSet {
    private float getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    protected com.github.mikephil.charting.renderer.scatter.IShapeRenderer mShapeRenderer;

    public ScatterDataSet(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        super(list, str);
        this.getHighSpeedVideoFpsRangesFor = 15.0f;
        this.mShapeRenderer = new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer();
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.Entry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.ScatterDataSet scatterDataSet = new com.github.mikephil.charting.data.ScatterDataSet(arrayList, getLabel());
        copy(scatterDataSet);
        return scatterDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.ScatterDataSet scatterDataSet) {
        super.copy((com.github.mikephil.charting.data.LineScatterCandleRadarDataSet) scatterDataSet);
        scatterDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        scatterDataSet.mShapeRenderer = this.mShapeRenderer;
        scatterDataSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        scatterDataSet.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
    }

    public void setScatterShapeSize(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scatterShape) {
        this.mShapeRenderer = getRendererForShape(scatterShape);
    }

    public void setShapeRenderer(com.github.mikephil.charting.renderer.scatter.IShapeRenderer iShapeRenderer) {
        this.mShapeRenderer = iShapeRenderer;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public com.github.mikephil.charting.renderer.scatter.IShapeRenderer getShapeRenderer() {
        return this.mShapeRenderer;
    }

    public void setScatterShapeHoleRadius(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeHoleRadius() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setScatterShapeHoleColor(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public int getScatterShapeHoleColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: com.github.mikephil.charting.data.ScatterDataSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static com.github.mikephil.charting.renderer.scatter.IShapeRenderer getRendererForShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scatterShape) {
        switch (com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.getHighSpeedVideoFpsRangesFor[scatterShape.ordinal()]) {
            case 1:
                return new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer();
            case 2:
                return new com.github.mikephil.charting.renderer.scatter.CircleShapeRenderer();
            case 3:
                return new com.github.mikephil.charting.renderer.scatter.TriangleShapeRenderer();
            case 4:
                return new com.github.mikephil.charting.renderer.scatter.CrossShapeRenderer();
            case 5:
                return new com.github.mikephil.charting.renderer.scatter.XShapeRenderer();
            case 6:
                return new com.github.mikephil.charting.renderer.scatter.ChevronUpShapeRenderer();
            case 7:
                return new com.github.mikephil.charting.renderer.scatter.ChevronDownShapeRenderer();
            default:
                return null;
        }
    }
}
