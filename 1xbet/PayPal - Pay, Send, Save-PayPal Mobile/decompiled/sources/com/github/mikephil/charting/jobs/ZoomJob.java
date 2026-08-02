package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public class ZoomJob extends com.github.mikephil.charting.jobs.ViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob> getHighSpeedVideoSizes;
    protected com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency;
    protected android.graphics.Matrix mRunMatrixBuffer;
    protected float scaleX;
    protected float scaleY;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob> create = com.github.mikephil.charting.utils.ObjectPool.create(1, new com.github.mikephil.charting.jobs.ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        getHighSpeedVideoSizes = create;
        create.setReplenishPercentage(0.5f);
    }

    public static com.github.mikephil.charting.jobs.ZoomJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, float f3, float f4, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, android.view.View view) {
        com.github.mikephil.charting.jobs.ZoomJob zoomJob = getHighSpeedVideoSizes.get();
        zoomJob.xValue = f3;
        zoomJob.yValue = f4;
        zoomJob.scaleX = f;
        zoomJob.scaleY = f2;
        zoomJob.mViewPortHandler = viewPortHandler;
        zoomJob.mTrans = transformer;
        zoomJob.axisDependency = axisDependency;
        zoomJob.view = view;
        return zoomJob;
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.ZoomJob zoomJob) {
        getHighSpeedVideoSizes.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.ZoomJob>) zoomJob);
    }

    public ZoomJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, float f3, float f4, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, android.view.View view) {
        super(viewPortHandler, f3, f4, transformer, view);
        this.mRunMatrixBuffer = new android.graphics.Matrix();
        this.scaleX = f;
        this.scaleY = f2;
        this.axisDependency = axisDependency;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Matrix matrix = this.mRunMatrixBuffer;
        this.mViewPortHandler.zoom(this.scaleX, this.scaleY, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = ((com.github.mikephil.charting.charts.BarLineChartBase) this.view).getAxis(this.axisDependency).mAxisRange / this.mViewPortHandler.getScaleY();
        this.pts[0] = this.xValue - ((((com.github.mikephil.charting.charts.BarLineChartBase) this.view).getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f);
        this.pts[1] = this.yValue + (scaleY / 2.0f);
        this.mTrans.pointValuesToPixel(this.pts);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
        recycleInstance(this);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.jobs.ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }
}
