package com.github.mikephil.charting.jobs;

/* loaded from: classes8.dex */
public abstract class ViewPortJob extends com.github.mikephil.charting.utils.ObjectPool.Poolable implements java.lang.Runnable {
    protected com.github.mikephil.charting.utils.Transformer mTrans;
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    protected float[] pts = new float[2];
    protected android.view.View view;
    protected float xValue;
    protected float yValue;

    public ViewPortJob(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, com.github.mikephil.charting.utils.Transformer transformer, android.view.View view) {
        this.mViewPortHandler = viewPortHandler;
        this.xValue = f;
        this.yValue = f2;
        this.mTrans = transformer;
        this.view = view;
    }

    public float getXValue() {
        return this.xValue;
    }

    public float getYValue() {
        return this.yValue;
    }
}
