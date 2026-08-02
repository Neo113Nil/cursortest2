package androidx.core.graphics;

/* loaded from: classes3.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public /* bridge */ /* synthetic */ android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context context, android.os.CancellationSignal cancellationSignal, java.util.List list, int i) {
        return super.createFromFontInfoWithFallback(context, cancellationSignal, list, i);
    }

    public TypefaceCompatApi26Impl() {
        java.lang.Class<?> cls;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        try {
            cls = obtainFontFamily();
            constructor = obtainFontFamilyCtor(cls);
            method = obtainAddFontFromAssetManagerMethod(cls);
            method2 = obtainAddFontFromBufferMethod(cls);
            method3 = obtainFreezeMethod(cls);
            method4 = obtainAbortCreationMethod(cls);
            method5 = obtainCreateFromFamiliesWithDefaultMethod(cls);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.mFontFamily = cls;
        this.mFontFamilyCtor = constructor;
        this.mAddFontFromAssetManager = method;
        this.mAddFontFromBuffer = method2;
        this.mFreeze = method3;
        this.mAbortCreation = method4;
        this.mCreateFromFamiliesWithDefault = method5;
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        return this.mAddFontFromAssetManager != null;
    }

    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI() {
        try {
            return this.mFontFamilyCtor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.mAddFontFromAssetManager.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((java.lang.Boolean) this.mAddFontFromBuffer.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i), null, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(this.mFontFamily, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.mFreeze.invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private void Camera2StreamConfigurationMap(java.lang.Object obj) {
        try {
            this.mAbortCreation.invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        if (!getHighSpeedVideoFpsRangesFor()) {
            return super.createFromFontFamilyFilesResourceEntry(context, fontFamilyFilesResourceEntry, resources, i);
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            if (!getHighResolutionOutputSizeshNQ4ISI(context, highResolutionOutputSizeshNQ4ISI, fontFileResourceEntry.getFileName(), fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic() ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.getVariationSettings()))) {
                Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
                return null;
            }
        }
        if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI)) {
            return createFromFamiliesWithDefault(highResolutionOutputSizeshNQ4ISI);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        android.graphics.Typeface createFromFamiliesWithDefault;
        if (fontInfoArr.length <= 0) {
            return null;
        }
        if (!getHighSpeedVideoFpsRangesFor()) {
            androidx.core.provider.FontsContractCompat.FontInfo findBestInfo = findBestInfo(fontInfoArr, i);
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(findBestInfo.getUri(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(findBestInfo.getWeight()).setItalic(findBestInfo.isItalic()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } finally {
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.Map<android.net.Uri, java.nio.ByteBuffer> readFontInfoIntoByteBuffer = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        boolean z = false;
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            java.nio.ByteBuffer byteBuffer = readFontInfoIntoByteBuffer.get(fontInfo.getUri());
            if (byteBuffer != null) {
                if (!getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, byteBuffer, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic() ? 1 : 0)) {
                    Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
            return null;
        }
        if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI) && (createFromFamiliesWithDefault = createFromFamiliesWithDefault(highResolutionOutputSizeshNQ4ISI)) != null) {
            return android.graphics.Typeface.create(createFromFamiliesWithDefault, i);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        if (!getHighSpeedVideoFpsRangesFor()) {
            return super.createFromResourcesFontFile(context, resources, i, str, i2);
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(context, highResolutionOutputSizeshNQ4ISI, str, 0, -1, -1, null)) {
            Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
            return null;
        }
        if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI)) {
            return createFromFamiliesWithDefault(highResolutionOutputSizeshNQ4ISI);
        }
        return null;
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("android.graphics.FontFamily");
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getConstructor(new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class);
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, java.lang.Integer.TYPE, android.graphics.fonts.FontVariationAxis[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod("freeze", new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        return cls.getMethod("abortCreation", new java.lang.Class[0]);
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> cls) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass(), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typeface2;
        try {
            typeface2 = androidx.core.graphics.WeightTypefaceApi26.Camera2StreamConfigurationMap(typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.Camera2StreamConfigurationMap(context, typeface, i, z) : typeface2;
    }
}
