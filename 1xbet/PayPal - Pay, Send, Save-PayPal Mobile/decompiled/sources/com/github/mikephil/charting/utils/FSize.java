package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public final class FSize extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> getHighSpeedVideoSizes;
    public float height;
    public float width;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> create = com.github.mikephil.charting.utils.ObjectPool.create(256, new com.github.mikephil.charting.utils.FSize(0.0f, 0.0f));
        getHighSpeedVideoSizes = create;
        create.setReplenishPercentage(0.5f);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected final com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.utils.FSize(0.0f, 0.0f);
    }

    public static com.github.mikephil.charting.utils.FSize getInstance(float f, float f2) {
        com.github.mikephil.charting.utils.FSize fSize = getHighSpeedVideoSizes.get();
        fSize.width = f;
        fSize.height = f2;
        return fSize;
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.FSize fSize) {
        getHighSpeedVideoSizes.recycle((com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize>) fSize);
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.FSize> list) {
        getHighSpeedVideoSizes.recycle(list);
    }

    public FSize() {
    }

    public FSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.github.mikephil.charting.utils.FSize) {
            com.github.mikephil.charting.utils.FSize fSize = (com.github.mikephil.charting.utils.FSize) obj;
            if (this.width == fSize.width && this.height == fSize.height) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.width);
        sb.append("x");
        sb.append(this.height);
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.width) ^ java.lang.Float.floatToIntBits(this.height);
    }
}
