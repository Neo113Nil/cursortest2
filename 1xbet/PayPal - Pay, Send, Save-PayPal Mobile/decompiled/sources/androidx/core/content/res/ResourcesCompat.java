package androidx.core.content.res;

/* loaded from: classes3.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.ThreadLocal<android.util.TypedValue> getHighSpeedVideoFpsRanges = new java.lang.ThreadLocal<>();
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> getHighSpeedVideoSizes = new java.util.WeakHashMap<>(0);
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    public static void clearCachesForTheme(android.content.res.Resources.Theme theme) {
        synchronized (Camera2StreamConfigurationMap) {
            java.util.Iterator<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey> it = getHighSpeedVideoSizes.keySet().iterator();
            while (it.hasNext()) {
                androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey next = it.next();
                if (next != null && theme.equals(next.getHighSpeedVideoSizes)) {
                    it.remove();
                }
            }
        }
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return resources.getDrawable(i, theme);
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    public static int getColor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return resources.getColor(i, theme);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = new androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey(resources, theme);
        android.content.res.ColorStateList highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(colorStateListCacheKey, i);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        android.content.res.ColorStateList highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(resources, i, theme);
        if (highSpeedVideoFpsRangesFor != null) {
            getHighResolutionOutputSizeshNQ4ISI(colorStateListCacheKey, i, highSpeedVideoFpsRangesFor, theme);
            return highSpeedVideoFpsRangesFor;
        }
        return resources.getColorStateList(i, theme);
    }

    private static android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        if (Camera2StreamConfigurationMap(resources, i)) {
            return null;
        }
        try {
            return androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static android.content.res.ColorStateList getHighResolutionOutputSizeshNQ4ISI(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i) {
        androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (Camera2StreamConfigurationMap) {
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = getHighSpeedVideoSizes.get(colorStateListCacheKey);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i)) != null) {
                if (colorStateListCacheEntry.Camera2StreamConfigurationMap.equals(colorStateListCacheKey.getHighSpeedVideoFpsRangesFor.getConfiguration()) && ((colorStateListCacheKey.getHighSpeedVideoSizes == null && colorStateListCacheEntry.getHighResolutionOutputSizeshNQ4ISI == 0) || (colorStateListCacheKey.getHighSpeedVideoSizes != null && colorStateListCacheEntry.getHighResolutionOutputSizeshNQ4ISI == colorStateListCacheKey.getHighSpeedVideoSizes.hashCode()))) {
                    return colorStateListCacheEntry.getHighSpeedVideoSizes;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey, int i, android.content.res.ColorStateList colorStateList, android.content.res.Resources.Theme theme) {
        synchronized (Camera2StreamConfigurationMap) {
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> weakHashMap = getHighSpeedVideoSizes;
            android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new android.util.SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i, new androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.getHighSpeedVideoFpsRangesFor.getConfiguration(), theme));
        }
    }

    private static boolean Camera2StreamConfigurationMap(android.content.res.Resources resources, int i) {
        android.util.TypedValue highSpeedVideoSizes = getHighSpeedVideoSizes();
        resources.getValue(i, highSpeedVideoSizes, true);
        return highSpeedVideoSizes.type >= 28 && highSpeedVideoSizes.type <= 31;
    }

    private static android.util.TypedValue getHighSpeedVideoSizes() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = getHighSpeedVideoFpsRanges;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    static final class ColorStateListCacheKey {
        final android.content.res.Resources getHighSpeedVideoFpsRangesFor;
        final android.content.res.Resources.Theme getHighSpeedVideoSizes;

        ColorStateListCacheKey(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            this.getHighSpeedVideoFpsRangesFor = resources;
            this.getHighSpeedVideoSizes = theme;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey colorStateListCacheKey = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) obj;
            return this.getHighSpeedVideoFpsRangesFor.equals(colorStateListCacheKey.getHighSpeedVideoFpsRangesFor) && androidx.core.util.ObjectsCompat.equals(this.getHighSpeedVideoSizes, colorStateListCacheKey.getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }
    }

    static class ColorStateListCacheEntry {
        final android.content.res.Configuration Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final android.content.res.ColorStateList getHighSpeedVideoSizes;

        ColorStateListCacheEntry(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
            this.getHighSpeedVideoSizes = colorStateList;
            this.Camera2StreamConfigurationMap = configuration;
            this.getHighResolutionOutputSizeshNQ4ISI = theme == null ? 0 : theme.hashCode();
        }
    }

    public static float getFloat(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.content.res.ResourcesCompat.Api29Impl.getHighSpeedVideoSizes(resources, i);
        }
        android.util.TypedValue highSpeedVideoSizes = getHighSpeedVideoSizes();
        resources.getValue(i, highSpeedVideoSizes, true);
        if (highSpeedVideoSizes.type == 4) {
            return highSpeedVideoSizes.getFloat();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource ID #0x");
        sb.append(java.lang.Integer.toHexString(i));
        sb.append(" type #0x");
        sb.append(java.lang.Integer.toHexString(highSpeedVideoSizes.type));
        sb.append(" is not valid");
        throw new android.content.res.Resources.NotFoundException(sb.toString());
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return getHighSpeedVideoFpsRangesFor(context, i, new android.util.TypedValue(), 0, null, null, false, false);
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return getHighSpeedVideoFpsRangesFor(context, i, new android.util.TypedValue(), 0, null, null, false, true);
    }

    public static abstract class FontCallback {
        /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void m9059xb24343b7(int i);

        /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void m9060x46c88379(android.graphics.Typeface typeface);

        public final void callbackSuccessAsync(final android.graphics.Typeface typeface, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.m9060x46c88379(typeface);
                }
            });
        }

        public final void callbackFailAsync(final int i, android.os.Handler handler) {
            getHandler(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.m9059xb24343b7(i);
                }
            });
        }

        public static android.os.Handler getHandler(android.os.Handler handler) {
            return handler == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler;
        }
    }

    public static void getFont(android.content.Context context, int i, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler) throws android.content.res.Resources.NotFoundException {
        androidx.core.util.Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            getHighSpeedVideoFpsRangesFor(context, i, new android.util.TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return getHighSpeedVideoFpsRangesFor(context, i, typedValue, i2, fontCallback, null, true, false);
    }

    private static android.graphics.Typeface getHighSpeedVideoFpsRangesFor(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, boolean z2) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (highSpeedVideoFpsRangesFor != null || fontCallback != null || z2) {
            return highSpeedVideoFpsRangesFor;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Font resource ID #0x");
        sb.append(java.lang.Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new android.content.res.Resources.NotFoundException(sb.toString());
    }

    private static android.graphics.Typeface getHighSpeedVideoFpsRangesFor(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, boolean z2) {
        if (typedValue.string == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new android.content.res.Resources.NotFoundException(sb.toString());
        }
        java.lang.String obj = typedValue.string.toString();
        if (!obj.startsWith("res/")) {
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
        android.graphics.Typeface findFromCache = androidx.core.graphics.TypefaceCompat.findFromCache(resources, i, obj, typedValue.assetCookie, i2);
        if (findFromCache != null) {
            if (fontCallback != null) {
                fontCallback.callbackSuccessAsync(findFromCache, handler);
            }
            return findFromCache;
        }
        if (z2) {
            return null;
        }
        try {
            if (obj.toLowerCase().endsWith(".xml")) {
                androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse = androidx.core.content.res.FontResourcesParserCompat.parse(resources.getXml(i), resources);
                if (parse != null) {
                    return androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(context, parse, resources, i, obj, typedValue.assetCookie, i2, fontCallback, handler, z);
                }
                if (fontCallback != null) {
                    fontCallback.callbackFailAsync(-3, handler);
                }
                return null;
            }
            android.graphics.Typeface createFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, i, obj, typedValue.assetCookie, i2);
            if (fontCallback != null) {
                if (createFromResourcesFontFile != null) {
                    fontCallback.callbackSuccessAsync(createFromResourcesFontFile, handler);
                    return createFromResourcesFontFile;
                }
                fontCallback.callbackFailAsync(-3, handler);
            }
            return createFromResourcesFontFile;
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static float getHighSpeedVideoSizes(android.content.res.Resources resources, int i) {
            return resources.getFloat(i);
        }
    }

    private ResourcesCompat() {
    }

    public static final class ThemeCompat {
        private ThemeCompat() {
        }

        public static void rebase(android.content.res.Resources.Theme theme) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(theme);
            } else {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.Camera2StreamConfigurationMap(theme);
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources.Theme theme) {
                theme.rebase();
            }
        }

        static class Api23Impl {
            private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
            private static boolean getHighResolutionOutputSizeshNQ4ISI;
            private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;

            private Api23Impl() {
            }

            static void Camera2StreamConfigurationMap(android.content.res.Resources.Theme theme) {
                synchronized (Camera2StreamConfigurationMap) {
                    if (!getHighResolutionOutputSizeshNQ4ISI) {
                        try {
                            java.lang.reflect.Method declaredMethod = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", new java.lang.Class[0]);
                            getHighSpeedVideoFpsRanges = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (java.lang.NoSuchMethodException unused) {
                        }
                        getHighResolutionOutputSizeshNQ4ISI = true;
                    }
                    java.lang.reflect.Method method = getHighSpeedVideoFpsRanges;
                    if (method != null) {
                        try {
                            method.invoke(theme, new java.lang.Object[0]);
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                            getHighSpeedVideoFpsRanges = null;
                        }
                    }
                }
            }
        }
    }
}
