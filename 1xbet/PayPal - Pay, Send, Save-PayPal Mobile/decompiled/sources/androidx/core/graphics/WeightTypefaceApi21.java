package androidx.core.graphics;

/* loaded from: classes7.dex */
final class WeightTypefaceApi21 {
    private static final java.lang.Object Camera2StreamConfigurationMap;
    private static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> getHighSpeedVideoFpsRangesFor;
    private static final java.lang.reflect.Field getHighSpeedVideoSizes;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> getInputSizeshNQ4ISI;

    static {
        java.lang.reflect.Field field;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Constructor<android.graphics.Typeface> constructor;
        try {
            field = android.graphics.Typeface.class.getDeclaredField("native_instance");
            method2 = android.graphics.Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", java.lang.Long.TYPE, java.lang.Integer.TYPE);
            method2.setAccessible(true);
            method = android.graphics.Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", java.lang.Long.TYPE, java.lang.Integer.TYPE);
            method.setAccessible(true);
            constructor = android.graphics.Typeface.class.getDeclaredConstructor(java.lang.Long.TYPE);
            constructor.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
            field = null;
            method = null;
            method2 = null;
            constructor = null;
        }
        getHighSpeedVideoSizes = field;
        getHighResolutionOutputSizeshNQ4ISI = method2;
        getHighSpeedVideoFpsRanges = method;
        getHighSpeedVideoFpsRangesFor = constructor;
        getInputSizeshNQ4ISI = new androidx.collection.LongSparseArray<>(3);
        Camera2StreamConfigurationMap = new java.lang.Object();
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoSizes != null;
    }

    static android.graphics.Typeface getHighSpeedVideoFpsRangesFor(android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface highSpeedVideoFpsRangesFor;
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (Camera2StreamConfigurationMap) {
            long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typeface);
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> longSparseArray = getInputSizeshNQ4ISI;
            android.util.SparseArray<android.graphics.Typeface> sparseArray = longSparseArray.get(highResolutionOutputSizeshNQ4ISI);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>(4);
                longSparseArray.put(highResolutionOutputSizeshNQ4ISI, sparseArray);
            } else {
                android.graphics.Typeface typeface2 = sparseArray.get(i2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            if (z == typeface.isItalic()) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, i));
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, i, z));
            }
            sparseArray.put(i2, highSpeedVideoFpsRangesFor);
            return highSpeedVideoFpsRangesFor;
        }
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(android.graphics.Typeface typeface) {
        try {
            return getHighSpeedVideoSizes.getLong(typeface);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static long getHighSpeedVideoSizes(long j, int i, boolean z) {
        try {
            return ((java.lang.Long) getHighSpeedVideoFpsRanges.invoke(null, java.lang.Long.valueOf(((java.lang.Long) getHighResolutionOutputSizeshNQ4ISI.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(z ? 2 : 0))).longValue()), java.lang.Integer.valueOf(i))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(long j, int i) {
        try {
            return ((java.lang.Long) getHighSpeedVideoFpsRanges.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static android.graphics.Typeface getHighSpeedVideoFpsRangesFor(long j) {
        try {
            return getHighSpeedVideoFpsRangesFor.newInstance(java.lang.Long.valueOf(j));
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private WeightTypefaceApi21() {
    }
}
