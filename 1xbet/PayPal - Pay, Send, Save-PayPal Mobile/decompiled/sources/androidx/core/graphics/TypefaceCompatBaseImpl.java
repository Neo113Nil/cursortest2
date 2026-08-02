package androidx.core.graphics;

/* loaded from: classes3.dex */
class TypefaceCompatBaseImpl {
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();

    interface StyleExtractor<T> {
        int Camera2StreamConfigurationMap(T t);

        boolean getHighSpeedVideoSizes(T t);
    }

    TypefaceCompatBaseImpl() {
    }

    private static <T> T getHighResolutionOutputSizeshNQ4ISI(T[] tArr, int i, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> styleExtractor) {
        return (T) getHighSpeedVideoFpsRanges(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, styleExtractor);
    }

    private static <T> T getHighSpeedVideoFpsRanges(T[] tArr, int i, boolean z, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> styleExtractor) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (java.lang.Math.abs(styleExtractor.Camera2StreamConfigurationMap(t2) - i) * 2) + (styleExtractor.getHighSpeedVideoSizes(t2) == z ? 0 : 1);
            if (t == null || i2 > abs) {
                t = t2;
                i2 = abs;
            }
        }
        return t;
    }

    private static long getHighSpeedVideoSizes(android.graphics.Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            java.lang.reflect.Field declaredField = android.graphics.Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((java.lang.Number) declaredField.get(typeface)).longValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            return 0L;
        }
    }

    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return (androidx.core.provider.FontsContractCompat.FontInfo) getHighResolutionOutputSizeshNQ4ISI(fontInfoArr, i, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.provider.FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public int Camera2StreamConfigurationMap(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public boolean getHighSpeedVideoSizes(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.isItalic();
            }
        });
    }

    protected android.graphics.Typeface createFromInputStream(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return android.graphics.Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        if (fontInfoArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(findBestInfo(fontInfoArr, i).getUri());
        } catch (java.io.IOException unused) {
            inputStream = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            android.graphics.Typeface createFromInputStream = createFromInputStream(context, inputStream);
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStream);
            return createFromInputStream;
        } catch (java.io.IOException unused2) {
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStream);
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(inputStream2);
            throw th;
        }
    }

    public android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context context, android.os.CancellationSignal cancellationSignal, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> list, int i) {
        throw new java.lang.IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry getHighResolutionOutputSizeshNQ4ISI(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i) {
        return (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) getHighResolutionOutputSizeshNQ4ISI(fontFamilyFilesResourceEntry.getEntries(), i, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public int Camera2StreamConfigurationMap(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public boolean getHighSpeedVideoSizes(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry getHighSpeedVideoSizes(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i, boolean z) {
        return (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) getHighSpeedVideoFpsRanges(fontFamilyFilesResourceEntry.getEntries(), i, z, new androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.3
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public int Camera2StreamConfigurationMap(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.getWeight();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public boolean getHighSpeedVideoSizes(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.isItalic();
            }
        });
    }

    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fontFamilyFilesResourceEntry, i);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        android.graphics.Typeface createFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, highResolutionOutputSizeshNQ4ISI.getResourceId(), highResolutionOutputSizeshNQ4ISI.getFileName(), 0, i);
        Camera2StreamConfigurationMap(createFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return createFromResourcesFontFile;
    }

    android.graphics.Typeface getHighSpeedVideoSizes(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i, boolean z) {
        androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry highSpeedVideoSizes = getHighSpeedVideoSizes(fontFamilyFilesResourceEntry, i, z);
        if (highSpeedVideoSizes == null) {
            return null;
        }
        android.graphics.Typeface createFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, highSpeedVideoSizes.getResourceId(), highSpeedVideoSizes.getFileName(), 0, 0);
        Camera2StreamConfigurationMap(createFromResourcesFontFile, fontFamilyFilesResourceEntry);
        return createFromResourcesFontFile;
    }

    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        java.io.File tempFile = androidx.core.graphics.TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.TypefaceCompatUtil.copyToFile(tempFile, resources, i)) {
                return android.graphics.Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        android.graphics.Typeface typeface2;
        try {
            typeface2 = androidx.core.graphics.WeightTypefaceApi14.Camera2StreamConfigurationMap(this, context, typeface, i, z);
        } catch (java.lang.RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 != null ? typeface2 : typeface;
    }

    androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry getHighSpeedVideoFpsRanges(android.graphics.Typeface typeface) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(typeface);
        if (highSpeedVideoSizes == 0) {
            return null;
        }
        return this.getHighSpeedVideoSizes.get(java.lang.Long.valueOf(highSpeedVideoSizes));
    }

    private void Camera2StreamConfigurationMap(android.graphics.Typeface typeface, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(typeface);
        if (highSpeedVideoSizes != 0) {
            this.getHighSpeedVideoSizes.put(java.lang.Long.valueOf(highSpeedVideoSizes), fontFamilyFilesResourceEntry);
        }
    }
}
