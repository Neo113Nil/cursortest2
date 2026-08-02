package androidx.core.graphics;

/* loaded from: classes3.dex */
class TypefaceCompatApi21Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static java.lang.reflect.Method Camera2StreamConfigurationMap = null;
    private static java.lang.reflect.Constructor<?> getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static java.lang.Class<?> getHighSpeedVideoSizes;

    TypefaceCompatApi21Impl() {
    }

    private static void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        if (getHighSpeedVideoFpsRanges) {
            return;
        }
        getHighSpeedVideoFpsRanges = true;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = constructor;
        getHighSpeedVideoSizes = cls;
        Camera2StreamConfigurationMap = method2;
        getHighSpeedVideoFpsRangesFor = method;
    }

    private java.io.File getHighResolutionOutputSizeshNQ4ISI(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            java.lang.String readlink = android.system.Os.readlink(sb.toString());
            if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                return new java.io.File(readlink);
            }
            return null;
        } catch (android.system.ErrnoException unused) {
            return null;
        }
    }

    private static java.lang.Object Camera2StreamConfigurationMap() {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            return getHighResolutionOutputSizeshNQ4ISI.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static android.graphics.Typeface getHighSpeedVideoSizes(java.lang.Object obj) {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(getHighSpeedVideoSizes, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) getHighSpeedVideoFpsRangesFor.invoke(null, newInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.String str, int i, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            return ((java.lang.Boolean) Camera2StreamConfigurationMap.invoke(obj, str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        java.io.FileInputStream fileInputStream;
        android.graphics.Typeface createFromInputStream;
        if (fontInfoArr.length <= 0) {
            return null;
        }
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
                java.io.File highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(openFileDescriptor);
                try {
                    if (highResolutionOutputSizeshNQ4ISI != null && highResolutionOutputSizeshNQ4ISI.canRead()) {
                        createFromInputStream = android.graphics.Typeface.createFromFile(highResolutionOutputSizeshNQ4ISI);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromInputStream;
                    }
                    createFromInputStream = super.createFromInputStream(context, fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor == null) {
                        return createFromInputStream;
                    }
                    openFileDescriptor.close();
                    return createFromInputStream;
                } finally {
                }
                fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
            if (tempFile == null) {
                return null;
            }
            try {
                if (!androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, resources, fontFileResourceEntry.getResourceId())) {
                    return null;
                }
                if (!getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2, tempFile.getPath(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                    return null;
                }
                tempFile.delete();
            } catch (java.lang.RuntimeException unused) {
                return null;
            } finally {
                tempFile.delete();
            }
        }
        return getHighSpeedVideoSizes(Camera2StreamConfigurationMap2);
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
