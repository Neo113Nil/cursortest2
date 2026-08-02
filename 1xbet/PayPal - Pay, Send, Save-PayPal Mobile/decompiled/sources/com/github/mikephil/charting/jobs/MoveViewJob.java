package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public class MoveViewJob extends com.github.mikephil.charting.jobs.ViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob> getHighSpeedVideoFpsRangesFor;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob> create = com.github.mikephil.charting.utils.ObjectPool.create(2, new com.github.mikephil.charting.jobs.MoveViewJob(null, 0.0f, 0.0f, null, null));
        getHighSpeedVideoFpsRangesFor = create;
        create.setReplenishPercentage(0.5f);
    }

    public static com.github.mikephil.charting.jobs.MoveViewJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view) {
        com.github.mikephil.charting.jobs.MoveViewJob moveViewJob = getHighSpeedVideoFpsRangesFor.get();
        moveViewJob.mViewPortHandler = viewPortHandler;
        moveViewJob.xValue = f;
        moveViewJob.yValue = f2;
        moveViewJob.mTrans = transformer;
        moveViewJob.view = view;
        return moveViewJob;
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.MoveViewJob moveViewJob) {
        getHighSpeedVideoFpsRangesFor.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.MoveViewJob>) moveViewJob);
    }

    public MoveViewJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view) {
        super(viewPortHandler, f, f2, transformer, view);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.pts[0] = this.xValue;
        this.pts[1] = this.yValue;
        this.mTrans.pointValuesToPixel(this.pts);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
        recycleInstance(this);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.jobs.MoveViewJob(this.mViewPortHandler, this.xValue, this.yValue, this.mTrans, this.view);
    }
}
