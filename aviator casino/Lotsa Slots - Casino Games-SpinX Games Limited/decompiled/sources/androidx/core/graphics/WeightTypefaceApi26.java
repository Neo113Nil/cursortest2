package androidx.core.graphics;

/* loaded from: classes.dex */
final class WeightTypefaceApi26 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor;
    private static final java.lang.reflect.Method sNativeCreateFromTypefaceWithExactStyle;
    private static final java.lang.reflect.Field sNativeInstance;
    private static final java.lang.Object sWeightCacheLock;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache;

    static {
        java.lang.reflect.Field field;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<android.graphics.Typeface> constructor;
        try {
            field = android.graphics.Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            method = android.graphics.Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD, java.lang.Long.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method.setAccessible(true);
            constructor = android.graphics.Typeface.class.getDeclaredConstructor(java.lang.Long.TYPE);
            constructor.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, e.getClass().getName(), e);
            field = null;
            method = null;
            constructor = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypefaceWithExactStyle = method;
        sConstructor = constructor;
        sWeightTypefaceCache = new androidx.collection.LongSparseArray<>(3);
        sWeightCacheLock = new java.lang.Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static android.graphics.Typeface createWeightStyle(android.graphics.Typeface typeface, int i, boolean z) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> longSparseArray = sWeightTypefaceCache;
            android.util.SparseArray<android.graphics.Typeface> sparseArray = longSparseArray.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>(4);
                longSparseArray.put(nativeInstance, sparseArray);
            } else {
                android.graphics.Typeface typeface2 = sparseArray.get(i2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            android.graphics.Typeface create = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
            sparseArray.put(i2, create);
            return create;
        }
    }

    private static long getNativeInstance(android.graphics.Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            return ((java.lang.Long) sNativeCreateFromTypefaceWithExactStyle.invoke(null, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).longValue();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static android.graphics.Typeface create(long j) {
        try {
            return sConstructor.newInstance(java.lang.Long.valueOf(j));
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private WeightTypefaceApi26() {
    }
}
