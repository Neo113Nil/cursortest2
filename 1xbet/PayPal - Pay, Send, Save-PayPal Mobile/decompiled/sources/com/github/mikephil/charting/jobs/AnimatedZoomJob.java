package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public class AnimatedZoomJob extends com.github.mikephil.charting.jobs.AnimatedViewPortJob implements android.animation.Animator.AnimatorListener {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.jobs.AnimatedZoomJob> getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.ObjectPool.create(8, new com.github.mikephil.charting.jobs.AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    protected android.graphics.Matrix mOnAnimationUpdateMatrixBuffer;
    protected float xAxisRange;
    protected com.github.mikephil.charting.components.YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
    }

    public static com.github.mikephil.charting.jobs.AnimatedZoomJob getInstance(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, android.view.View view, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.components.YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        com.github.mikephil.charting.jobs.AnimatedZoomJob animatedZoomJob = getHighSpeedVideoFpsRangesFor.get();
        animatedZoomJob.mViewPortHandler = viewPortHandler;
        animatedZoomJob.xValue = f2;
        animatedZoomJob.yValue = f3;
        animatedZoomJob.mTrans = transformer;
        animatedZoomJob.view = view;
        animatedZoomJob.xOrigin = f4;
        animatedZoomJob.yOrigin = f5;
        animatedZoomJob.yAxis = yAxis;
        animatedZoomJob.xAxisRange = f;
        animatedZoomJob.resetAnimator();
        animatedZoomJob.animator.setDuration(j);
        return animatedZoomJob;
    }

    public AnimatedZoomJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, android.view.View view, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.components.YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        super(viewPortHandler, f2, f3, transformer, view, f4, f5, j);
        this.mOnAnimationUpdateMatrixBuffer = new android.graphics.Matrix();
        this.zoomCenterX = f6;
        this.zoomCenterY = f7;
        this.zoomOriginX = f8;
        this.zoomOriginY = f9;
        this.animator.addListener(this);
        this.yAxis = yAxis;
        this.xAxisRange = f;
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f = this.xOrigin;
        float f2 = this.xValue;
        float f3 = this.xOrigin;
        float f4 = this.phase;
        float f5 = this.yOrigin;
        float f6 = this.yValue;
        float f7 = this.yOrigin;
        float f8 = this.phase;
        android.graphics.Matrix matrix = this.mOnAnimationUpdateMatrixBuffer;
        this.mViewPortHandler.setZoom(f + ((f2 - f3) * f4), f5 + ((f6 - f7) * f8), matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f9 = this.zoomOriginX;
        fArr[0] = f9 + (((this.zoomCenterX - (scaleX / 2.0f)) - f9) * this.phase);
        float[] fArr2 = this.pts;
        float f10 = this.zoomOriginY;
        fArr2[1] = f10 + (((this.zoomCenterY + (scaleY / 2.0f)) - f10) * this.phase);
        this.mTrans.pointValuesToPixel(this.pts);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, true);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.jobs.AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }
}
