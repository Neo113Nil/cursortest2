package androidx.core.graphics;

/* loaded from: classes7.dex */
class TypefaceCompatApi24Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.reflect.Method Camera2StreamConfigurationMap;
    private static final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static final java.lang.reflect.Constructor<?> getHighSpeedVideoSizes;

    TypefaceCompatApi24Impl() {
    }

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", java.nio.ByteBuffer.class, java.lang.Integer.TYPE, java.util.List.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        getHighSpeedVideoSizes = constructor;
        getHighResolutionOutputSizeshNQ4ISI = cls;
        Camera2StreamConfigurationMap = method2;
        getHighSpeedVideoFpsRanges = method;
    }

    private static java.lang.Object getHighSpeedVideoSizes() {
        try {
            return getHighSpeedVideoSizes.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((java.lang.Boolean) Camera2StreamConfigurationMap.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private static android.graphics.Typeface getHighSpeedVideoSizes(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(getHighResolutionOutputSizeshNQ4ISI, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) getHighSpeedVideoFpsRanges.invoke(null, newInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return null;
        }
        androidx.collection.SimpleArrayMap simpleArrayMap = new androidx.collection.SimpleArrayMap();
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            android.net.Uri uri = fontInfo.getUri();
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) simpleArrayMap.get(uri);
            if (byteBuffer == null) {
                byteBuffer = androidx.core.graphics.TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
                simpleArrayMap.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !getHighSpeedVideoFpsRanges(highSpeedVideoSizes, byteBuffer, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic())) {
                return null;
            }
        }
        android.graphics.Typeface highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoSizes);
        if (highSpeedVideoSizes2 == null) {
            return null;
        }
        return android.graphics.Typeface.create(highSpeedVideoSizes2, i);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return null;
        }
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            java.nio.ByteBuffer copyToDirectBuffer = androidx.core.graphics.TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontFileResourceEntry.getResourceId());
            if (copyToDirectBuffer == null || !getHighSpeedVideoFpsRanges(highSpeedVideoSizes, copyToDirectBuffer, fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                return null;
            }
        }
        return getHighSpeedVideoSizes(highSpeedVideoSizes);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typeface2;
        try {
            typeface2 = androidx.core.graphics.WeightTypefaceApi21.getHighSpeedVideoFpsRangesFor(typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.Camera2StreamConfigurationMap(context, typeface, i, z) : typeface2;
    }
}
