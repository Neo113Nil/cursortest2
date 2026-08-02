package androidx.core.graphics;

/* loaded from: classes7.dex */
final class WeightTypefaceApi26 {
    private static final java.lang.reflect.Field Camera2StreamConfigurationMap;
    private static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.Object getHighSpeedVideoFpsRanges;
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> getHighSpeedVideoFpsRangesFor;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> getHighSpeedVideoSizes;

    static {
        java.lang.reflect.Field field;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<android.graphics.Typeface> constructor;
        try {
            field = android.graphics.Typeface.class.getDeclaredField("native_instance");
            method = android.graphics.Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", java.lang.Long.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method.setAccessible(true);
            constructor = android.graphics.Typeface.class.getDeclaredConstructor(java.lang.Long.TYPE);
            constructor.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
            field = null;
            method = null;
            constructor = null;
        }
        Camera2StreamConfigurationMap = field;
        getHighResolutionOutputSizeshNQ4ISI = method;
        getHighSpeedVideoFpsRangesFor = constructor;
        getHighSpeedVideoSizes = new androidx.collection.LongSparseArray<>(3);
        getHighSpeedVideoFpsRanges = new java.lang.Object();
    }

    private static boolean getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap != null;
    }

    static android.graphics.Typeface Camera2StreamConfigurationMap(android.graphics.Typeface typeface, int i, boolean z) {
        if (!getHighSpeedVideoFpsRanges()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (getHighSpeedVideoFpsRanges) {
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(typeface);
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> longSparseArray = getHighSpeedVideoSizes;
            android.util.SparseArray<android.graphics.Typeface> sparseArray = longSparseArray.get(highSpeedVideoFpsRangesFor);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>(4);
                longSparseArray.put(highSpeedVideoFpsRangesFor, sparseArray);
            } else {
                android.graphics.Typeface typeface2 = sparseArray.get(i2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            android.graphics.Typeface highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, i, z));
            sparseArray.put(i2, highSpeedVideoSizes);
            return highSpeedVideoSizes;
        }
    }

    private static long getHighSpeedVideoFpsRangesFor(android.graphics.Typeface typeface) {
        try {
            return Camera2StreamConfigurationMap.getLong(typeface);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static long getHighSpeedVideoFpsRangesFor(long j, int i, boolean z) {
        try {
            return ((java.lang.Long) getHighResolutionOutputSizeshNQ4ISI.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static android.graphics.Typeface getHighSpeedVideoSizes(long j) {
        try {
            return getHighSpeedVideoFpsRangesFor.newInstance(java.lang.Long.valueOf(j));
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private WeightTypefaceApi26() {
    }
}
