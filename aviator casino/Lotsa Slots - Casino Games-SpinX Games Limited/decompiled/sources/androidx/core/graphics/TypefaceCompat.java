package androidx.core.graphics;

/* loaded from: classes.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi29Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi28Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi26Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 24 && androidx.core.graphics.TypefaceCompatApi24Impl.isUsable()) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi24Impl();
        } else {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi21Impl();
        }
        sTypefaceCache = new androidx.collection.LruCache<>(16);
    }

    private TypefaceCompat() {
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return sTypefaceCache.get(createResourceUid(resources, i, str, i2, i3));
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(android.content.res.Resources resources, int i, int i2) {
        return findFromCache(resources, i, null, 0, i2);
    }

    private static java.lang.String createResourceUid(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    private static android.graphics.Typeface getSystemFontFamily(java.lang.String str) {
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

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        android.graphics.Typeface createFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) {
            androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            android.graphics.Typeface systemFontFamily = getSystemFontFamily(providerResourceEntry.getSystemFontFamilyName());
            if (systemFontFamily != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(systemFontFamily, handler);
                }
                return systemFontFamily;
            }
            createFromFontFamilyFilesResourceEntry = androidx.core.provider.FontsContractCompat.requestFont(context, providerResourceEntry.getRequest(), i3, !z ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0, z ? providerResourceEntry.getTimeout() : -1, androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(handler), new androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter(fontCallback));
        } else {
            createFromFontFamilyFilesResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i3);
            if (fontCallback != null) {
                if (createFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(createFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (createFromFontFamilyFilesResourceEntry != null) {
            sTypefaceCache.put(createResourceUid(resources, i, str, i2, i3), createFromFontFamilyFilesResourceEntry);
        }
        return createFromFontFamilyFilesResourceEntry;
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, android.content.res.Resources resources, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i, null, 0, i2, fontCallback, handler, z);
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        android.graphics.Typeface createFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i, str, i3);
        if (createFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i, str, i2, i3), createFromResourcesFontFile);
        }
        return createFromResourcesFontFile;
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        return createFromResourcesFontFile(context, resources, i, str, 0, i2);
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i);
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context context, android.graphics.Typeface typeface, int i) {
        androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl = sTypefaceCompatImpl;
        androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i);
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
        androidx.core.util.Preconditions.checkArgumentInRange(i, 1, 1000, com.helpshift.proactive.InAppViewConstants.WEIGHT);
        if (typeface == null) {
            typeface = android.graphics.Typeface.DEFAULT;
        }
        return sTypefaceCompatImpl.createWeightStyle(context, typeface, i, z);
    }

    public static void clearCache() {
        sTypefaceCache.evictAll();
    }

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) {
            this.mFontCallback = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface typeface) {
            androidx.core.content.res.ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.m4741x46c88379(typeface);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i) {
            androidx.core.content.res.ResourcesCompat.FontCallback fontCallback = this.mFontCallback;
            if (fontCallback != null) {
                fontCallback.m4740xb24343b7(i);
            }
        }
    }
}
