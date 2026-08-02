package androidx.core.graphics;

/* loaded from: classes7.dex */
final class WeightTypefaceApi14 {
    private static final java.lang.reflect.Field Camera2StreamConfigurationMap;
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> getHighSpeedVideoSizes;

    static {
        java.lang.reflect.Field field;
        try {
            field = android.graphics.Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (java.lang.Exception unused) {
            field = null;
        }
        Camera2StreamConfigurationMap = field;
        getHighSpeedVideoSizes = new androidx.collection.LongSparseArray<>(3);
        getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    }

    private static boolean getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap != null;
    }

    static android.graphics.Typeface Camera2StreamConfigurationMap(androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl, android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        if (!getHighSpeedVideoFpsRanges()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (getHighSpeedVideoFpsRangesFor) {
            long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(typeface);
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> longSparseArray = getHighSpeedVideoSizes;
            android.util.SparseArray<android.graphics.Typeface> sparseArray = longSparseArray.get(Camera2StreamConfigurationMap2);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>(4);
                longSparseArray.put(Camera2StreamConfigurationMap2, sparseArray);
            } else {
                android.graphics.Typeface typeface2 = sparseArray.get(i2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            android.graphics.Typeface highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typefaceCompatBaseImpl, context, typeface, i, z);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                highResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(typeface, i, z);
            }
            sparseArray.put(i2, highResolutionOutputSizeshNQ4ISI);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }

    private static android.graphics.Typeface getHighSpeedVideoSizes(android.graphics.Typeface typeface, int i, boolean z) {
        int i2 = 1;
        boolean z2 = i >= 600;
        if (!z2 && !z) {
            i2 = 0;
        } else if (!z2) {
            i2 = 2;
        } else if (z) {
            i2 = 3;
        }
        return android.graphics.Typeface.create(typeface, i2);
    }

    private static android.graphics.Typeface getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl, android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry highSpeedVideoFpsRanges = typefaceCompatBaseImpl.getHighSpeedVideoFpsRanges(typeface);
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        return typefaceCompatBaseImpl.getHighSpeedVideoSizes(context, highSpeedVideoFpsRanges, context.getResources(), i, z);
    }

    private static long Camera2StreamConfigurationMap(android.graphics.Typeface typeface) {
        try {
            return ((java.lang.Number) Camera2StreamConfigurationMap.get(typeface)).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private WeightTypefaceApi14() {
    }
}
