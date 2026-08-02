package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public class AnimatedMoveViewJob extends com.github.mikephil.charting.jobs.AnimatedViewPortJob {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob> getHighResolutionOutputSizeshNQ4ISI;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob> create = com.github.mikephil.charting.utils.ObjectPool.create(4, new com.github.mikephil.charting.jobs.AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        getHighResolutionOutputSizeshNQ4ISI = create;
        create.setReplenishPercentage(0.5f);
    }

    public static com.github.mikephil.charting.jobs.AnimatedMoveViewJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view, float f3, float f4, long j) {
        com.github.mikephil.charting.jobs.AnimatedMoveViewJob animatedMoveViewJob = getHighResolutionOutputSizeshNQ4ISI.get();
        animatedMoveViewJob.mViewPortHandler = viewPortHandler;
        animatedMoveViewJob.xValue = f;
        animatedMoveViewJob.yValue = f2;
        animatedMoveViewJob.mTrans = transformer;
        animatedMoveViewJob.view = view;
        animatedMoveViewJob.xOrigin = f3;
        animatedMoveViewJob.yOrigin = f4;
        animatedMoveViewJob.animator.setDuration(j);
        return animatedMoveViewJob;
    }

    public static void recycleInstance(com.github.mikephil.charting.jobs.AnimatedMoveViewJob animatedMoveViewJob) {
        getHighResolutionOutputSizeshNQ4ISI.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedMoveViewJob>) animatedMoveViewJob);
    }

    public AnimatedMoveViewJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view, float f3, float f4, long j) {
        super(viewPortHandler, f, f2, transformer, view, f3, f4, j);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.pts[0] = this.xOrigin + ((this.xValue - this.xOrigin) * this.phase);
        this.pts[1] = this.yOrigin + ((this.yValue - this.yOrigin) * this.phase);
        this.mTrans.pointValuesToPixel(this.pts);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
        recycleInstance(this);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.jobs.AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }
}
