package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class MPPointD extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> getHighSpeedVideoSizes;
    public double x = 0.0d;
    public double y = 0.0d;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> create = com.github.mikephil.charting.utils.ObjectPool.create(64, new com.github.mikephil.charting.utils.MPPointD());
        getHighSpeedVideoSizes = create;
        create.setReplenishPercentage(0.5f);
    }

    public static com.github.mikephil.charting.utils.MPPointD getInstance(double d, double d2) {
        com.github.mikephil.charting.utils.MPPointD mPPointD = getHighSpeedVideoSizes.get();
        mPPointD.x = d;
        mPPointD.y = d2;
        return mPPointD;
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.MPPointD mPPointD) {
        getHighSpeedVideoSizes.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD>) mPPointD);
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.MPPointD> list) {
        getHighSpeedVideoSizes.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.utils.MPPointD();
    }

    private MPPointD() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MPPointD, x: ");
        sb.append(this.x);
        sb.append(", y: ");
        sb.append(this.y);
        return sb.toString();
    }
}
