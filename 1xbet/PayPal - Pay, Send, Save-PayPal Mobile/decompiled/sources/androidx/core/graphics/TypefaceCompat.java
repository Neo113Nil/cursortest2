package androidx.core.graphics;

/* loaded from: classes3.dex */
public class TypefaceCompat {
    private static final androidx.core.graphics.TypefaceCompatBaseImpl Camera2StreamConfigurationMap;
    public static final boolean DOWNLOADABLE_FALLBACK_DEBUG = false;
    public static final boolean DOWNLOADABLE_FONT_TRACING = true;
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> getHighResolutionOutputSizeshNQ4ISI;
    private static android.graphics.Paint getHighSpeedVideoFpsRanges;

    static {
        androidx.tracing.Trace.beginSection("TypefaceCompat static init");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            Camera2StreamConfigurationMap = new androidx.core.graphics.TypefaceCompatApi31Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            Camera2StreamConfigurationMap = new androidx.core.graphics.TypefaceCompatApi29Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            Camera2StreamConfigurationMap = new androidx.core.graphics.TypefaceCompatApi28Impl();
        } else {
            Camera2StreamConfigurationMap = new androidx.core.graphics.TypefaceCompatApi26Impl();
        }
        getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.LruCache<>(16);
        getHighSpeedVideoFpsRanges = null;
        androidx.tracing.Trace.endSection();
    }

    private TypefaceCompat() {
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return getHighResolutionOutputSizeshNQ4ISI.get(getHighSpeedVideoFpsRanges(resources, i, str, i2, i3));
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(android.content.res.Resources resources, int i, int i2) {
        return findFromCache(resources, i, null, 0, i2);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }

    public static android.graphics.fonts.Font guessPrimaryFont(android.graphics.Typeface typeface) {
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = new android.graphics.Paint();
        }
        getHighSpeedVideoFpsRanges.setTextSize(10.0f);
        getHighSpeedVideoFpsRanges.setTypeface(typeface);
        android.graphics.text.PositionedGlyphs shapeTextRun = android.graphics.text.TextRunShaper.shapeTextRun((java.lang.CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, getHighSpeedVideoFpsRanges);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }

    public static android.graphics.Typeface getSystemFontFamily(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        android.graphics.Typeface create = android.graphics.Typeface.create(str, 0);
        android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    private static android.graphics.Typeface getHighSpeedVideoSizes(androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry) {
        android.graphics.fonts.FontFamily build;
        android.graphics.Typeface systemFontFamily;
        java.lang.String systemFontFamilyName = providerResourceEntry.getSystemFontFamilyName();
        if (!android.text.TextUtils.isEmpty(systemFontFamilyName) && (systemFontFamily = getSystemFontFamily(systemFontFamilyName)) != null) {
            return systemFontFamily;
        }
        java.util.List<androidx.core.provider.FontRequest> requests = providerResourceEntry.getRequests();
        int i = 0;
        if (requests.size() == 1) {
            return getSystemFontFamily(requests.get(0).getSystemFont());
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i2 = 0; i2 < requests.size(); i2++) {
            if (getSystemFontFamily(requests.get(i2).getSystemFont()) == null) {
                return null;
            }
        }
        android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        while (true) {
            if (i >= requests.size()) {
                break;
            }
            androidx.core.provider.FontRequest fontRequest = requests.get(i);
            if (i == requests.size() - 1 && android.text.TextUtils.isEmpty(fontRequest.getVariationSettings())) {
                customFallbackBuilder.setSystemFallback(fontRequest.getSystemFont());
                break;
            }
            android.graphics.fonts.Font guessPrimaryFont = guessPrimaryFont(getSystemFontFamily(fontRequest.getSystemFont()));
            if (guessPrimaryFont == null) {
                fontRequest.getSystemFont();
                return null;
            }
            if (!android.text.TextUtils.isEmpty(fontRequest.getVariationSettings())) {
                try {
                    build = new android.graphics.fonts.FontFamily.Builder(new android.graphics.fonts.Font.Builder(guessPrimaryFont).setFontVariationSettings(fontRequest.getVariationSettings()).build()).build();
                } catch (java.io.IOException unused) {
                    return null;
                }
            } else {
                build = new android.graphics.fonts.FontFamily.Builder(guessPrimaryFont).build();
            }
            if (customFallbackBuilder == null) {
                customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(build);
            } else {
                customFallbackBuilder.addCustomFallback(build);
            }
            i++;
        }
        return customFallbackBuilder.build();
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        android.graphics.Typeface createFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) {
            androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            android.graphics.Typeface highSpeedVideoSizes = getHighSpeedVideoSizes(providerResourceEntry);
            if (highSpeedVideoSizes != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(highSpeedVideoSizes, handler);
                }
                getHighResolutionOutputSizeshNQ4ISI.put(getHighSpeedVideoFpsRanges(resources, i, str, i2, i3), highSpeedVideoSizes);
                return highSpeedVideoSizes;
            }
            boolean z2 = !z ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0;
            int timeout = z ? providerResourceEntry.getTimeout() : -1;
            createFromFontFamilyFilesResourceEntry = androidx.core.provider.FontsContractCompat.requestFont(context, providerResourceEntry.getRequests(), i3, z2, timeout, androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(handler), new androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter(fontCallback));
        } else {
            createFromFontFamilyFilesResourceEntry = Camera2StreamConfigurationMap.createFromFontFamilyFilesResourceEntry(context, (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i3);
            if (fontCallback != null) {
                if (createFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(createFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (createFromFontFamilyFilesResourceEntry != null) {
            getHighResolutionOutputSizeshNQ4ISI.put(getHighSpeedVideoFpsRanges(resources, i, str, i2, i3), createFromFontFamilyFilesResourceEntry);
        }
        return createFromFontFamilyFilesResourceEntry;
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, android.content.res.Resources resources, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i, null, 0, i2, fontCallback, handler, z);
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        android.graphics.Typeface createFromResourcesFontFile = Camera2StreamConfigurationMap.createFromResourcesFontFile(context, resources, i, str, i3);
        if (createFromResourcesFontFile != null) {
            getHighResolutionOutputSizeshNQ4ISI.put(getHighSpeedVideoFpsRanges(resources, i, str, i2, i3), createFromResourcesFontFile);
        }
        return createFromResourcesFontFile;
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        return createFromResourcesFontFile(context, resources, i, str, 0, i2);
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        androidx.tracing.Trace.beginSection("TypefaceCompat.createFromFontInfo");
        try {
            return Camera2StreamConfigurationMap.createFromFontInfo(context, cancellationSignal, fontInfoArr, i);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    public static android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context context, android.os.CancellationSignal cancellationSignal, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> list, int i) {
        androidx.tracing.Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return Camera2StreamConfigurationMap.createFromFontInfoWithFallback(context, cancellationSignal, list, i);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    public static android.graphics.Typeface create(android.content.Context context, android.graphics.Typeface typeface, int i) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context cannot be null");
        }
        return android.graphics.Typeface.create(typeface, i);
    }

    public static android.graphics.Typeface create(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context cannot be null");
        }
        androidx.core.util.Preconditions.checkArgumentInRange(i, 1, 1000, "weight");
        if (typeface == null) {
            typeface = android.graphics.Typeface.DEFAULT;
        }
        return Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(context, typeface, i, z);
    }

    public static void clearCache() {
        getHighResolutionOutputSizeshNQ4ISI.evictAll();
    }

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback getHighResolutionOutputSizeshNQ4ISI;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface typeface) {
            androidx.core.content.res.ResourcesCompat.FontCallback fontCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            if (fontCallback != null) {
                fontCallback.m9060x46c88379(typeface);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i) {
            androidx.core.content.res.ResourcesCompat.FontCallback fontCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            if (fontCallback != null) {
                fontCallback.m9059xb24343b7(i);
            }
        }
    }
}
