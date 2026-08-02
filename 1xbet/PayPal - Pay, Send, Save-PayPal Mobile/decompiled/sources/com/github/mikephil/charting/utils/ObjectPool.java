package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class ObjectPool<T extends com.github.mikephil.charting.utils.ObjectPool.Poolable> {
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.Object[] Camera2StreamConfigurationMap;
    private T getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;
    private float getInputFormats;
    private int getInputSizeshNQ4ISI;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int getHighSpeedVideoFpsRanges = NO_OWNER;

        protected abstract com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate();
    }

    public int getPoolId() {
        return this.getInputSizeshNQ4ISI;
    }

    public static com.github.mikephil.charting.utils.ObjectPool create(int i, com.github.mikephil.charting.utils.ObjectPool.Poolable poolable) {
        com.github.mikephil.charting.utils.ObjectPool objectPool;
        synchronized (com.github.mikephil.charting.utils.ObjectPool.class) {
            objectPool = new com.github.mikephil.charting.utils.ObjectPool(i, poolable);
            int i2 = getHighSpeedVideoFpsRangesFor;
            objectPool.getInputSizeshNQ4ISI = i2;
            getHighSpeedVideoFpsRangesFor = i2 + 1;
        }
        return objectPool;
    }

    private ObjectPool(int i, T t) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = new java.lang.Object[i];
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getInputFormats = 1.0f;
        getHighSpeedVideoFpsRanges(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setReplenishPercentage(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        this.getInputFormats = f;
    }

    public float getReplenishPercentage() {
        return this.getInputFormats;
    }

    private void getHighSpeedVideoFpsRanges(float f) {
        int i = this.getHighSpeedVideoSizes;
        int i2 = (int) (i * f);
        if (i2 <= 0) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.Camera2StreamConfigurationMap[i3] = this.getHighResolutionOutputSizeshNQ4ISI.instantiate();
        }
        this.getHighSpeedVideoFpsRanges = i - 1;
    }

    public T get() {
        T t;
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges == -1) {
                float f = this.getInputFormats;
                if (f > 0.0f) {
                    getHighSpeedVideoFpsRanges(f);
                }
            }
            t = (T) this.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRanges];
            t.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER;
            this.getHighSpeedVideoFpsRanges--;
        }
        return t;
    }

    public void recycle(T t) {
        synchronized (this) {
            if (t.getHighSpeedVideoFpsRanges != com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER) {
                if (t.getHighSpeedVideoFpsRanges == this.getInputSizeshNQ4ISI) {
                    throw new java.lang.IllegalArgumentException("The object passed is already stored in this pool!");
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The object to recycle already belongs to poolId ");
                sb.append(t.getHighSpeedVideoFpsRanges);
                sb.append(".  Object cannot belong to two different pool instances simultaneously!");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int i = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = i;
            if (i >= this.Camera2StreamConfigurationMap.length) {
                Camera2StreamConfigurationMap();
            }
            t.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRanges] = t;
        }
    }

    public void recycle(java.util.List<T> list) {
        synchronized (this) {
            while (list.size() + this.getHighSpeedVideoFpsRanges + 1 > this.getHighSpeedVideoSizes) {
                Camera2StreamConfigurationMap();
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                T t = list.get(i);
                if (t.getHighSpeedVideoFpsRanges != com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER) {
                    if (t.getHighSpeedVideoFpsRanges == this.getInputSizeshNQ4ISI) {
                        throw new java.lang.IllegalArgumentException("The object passed is already stored in this pool!");
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("The object to recycle already belongs to poolId ");
                    sb.append(t.getHighSpeedVideoFpsRanges);
                    sb.append(".  Object cannot belong to two different pool instances simultaneously!");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                t.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRanges + 1 + i] = t;
            }
            this.getHighSpeedVideoFpsRanges += size;
        }
    }

    private void Camera2StreamConfigurationMap() {
        int i = this.getHighSpeedVideoSizes;
        int i2 = i * 2;
        this.getHighSpeedVideoSizes = i2;
        java.lang.Object[] objArr = new java.lang.Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.Camera2StreamConfigurationMap[i3];
        }
        this.Camera2StreamConfigurationMap = objArr;
    }

    public int getPoolCapacity() {
        return this.Camera2StreamConfigurationMap.length;
    }

    public int getPoolCount() {
        return this.getHighSpeedVideoFpsRanges + 1;
    }
}
