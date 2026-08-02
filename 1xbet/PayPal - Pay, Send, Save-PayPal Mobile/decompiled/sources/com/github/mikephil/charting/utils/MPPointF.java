package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class MPPointF extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    public static final android.os.Parcelable.Creator<com.github.mikephil.charting.utils.MPPointF> CREATOR;
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> getHighSpeedVideoSizes;
    public float x;
    public float y;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> create = com.github.mikephil.charting.utils.ObjectPool.create(32, new com.github.mikephil.charting.utils.MPPointF(0.0f, 0.0f));
        getHighSpeedVideoSizes = create;
        create.setReplenishPercentage(0.5f);
        CREATOR = new android.os.Parcelable.Creator<com.github.mikephil.charting.utils.MPPointF>() { // from class: com.github.mikephil.charting.utils.MPPointF.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.github.mikephil.charting.utils.MPPointF createFromParcel(android.os.Parcel parcel) {
                com.github.mikephil.charting.utils.MPPointF mPPointF = new com.github.mikephil.charting.utils.MPPointF(0.0f, 0.0f);
                mPPointF.my_readFromParcel(parcel);
                return mPPointF;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ com.github.mikephil.charting.utils.MPPointF[] newArray(int i) {
                return new com.github.mikephil.charting.utils.MPPointF[i];
            }
        };
    }

    public MPPointF() {
    }

    public MPPointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF = getHighSpeedVideoSizes.get();
        mPPointF.x = f;
        mPPointF.y = f2;
        return mPPointF;
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance() {
        return getHighSpeedVideoSizes.get();
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = getHighSpeedVideoSizes.get();
        mPPointF2.x = mPPointF.x;
        mPPointF2.y = mPPointF.y;
        return mPPointF2;
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        getHighSpeedVideoSizes.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF>) mPPointF);
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.MPPointF> list) {
        getHighSpeedVideoSizes.recycle(list);
    }

    public void my_readFromParcel(android.os.Parcel parcel) {
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.utils.MPPointF(0.0f, 0.0f);
    }
}
