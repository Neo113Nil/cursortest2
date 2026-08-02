package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class ResourceManagerInternal {
    private static androidx.appcompat.widget.ResourceManagerInternal getHighSpeedVideoFpsRanges;
    private androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> Camera2StreamConfigurationMap;
    androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks getHighSpeedVideoFpsRangesFor;
    private java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> getHighSpeedVideoSizesFor;
    private final java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> getInputFormats = new java.util.WeakHashMap<>(0);
    private androidx.collection.SparseArrayCompat<java.lang.String> getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private android.util.TypedValue getOutputMinFrameDuration;
    private static final android.graphics.PorterDuff.Mode getHighSpeedVideoSizes = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache();

    interface InflateDelegate {
        android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme);
    }

    public interface ResourceManagerHooks {
        android.graphics.drawable.Drawable createDrawableFor(androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal, android.content.Context context, int i);

        android.content.res.ColorStateList getTintListForDrawableRes(android.content.Context context, int i);

        android.graphics.PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(android.content.Context context, int i, android.graphics.drawable.Drawable drawable);

        boolean tintDrawableUsingColorFilter(android.content.Context context, int i, android.graphics.drawable.Drawable drawable);
    }

    public static androidx.appcompat.widget.ResourceManagerInternal get() {
        androidx.appcompat.widget.ResourceManagerInternal resourceManagerInternal;
        synchronized (androidx.appcompat.widget.ResourceManagerInternal.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new androidx.appcompat.widget.ResourceManagerInternal();
            }
            resourceManagerInternal = getHighSpeedVideoFpsRanges;
        }
        return resourceManagerInternal;
    }

    public final void setHooks(androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor = resourceManagerHooks;
        }
    }

    public final android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
        synchronized (this) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, i, false);
        }
        return Camera2StreamConfigurationMap;
    }

    public final void onConfigurationChanged(android.content.Context context) {
        synchronized (this) {
            androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.getInputFormats.get(context);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    private android.graphics.drawable.Drawable getHighSpeedVideoSizes(android.content.Context context, int i, boolean z, android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks;
        android.content.res.ColorStateList Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, i);
        if (Camera2StreamConfigurationMap != null) {
            android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
            androidx.core.graphics.drawable.DrawableCompat.setTintList(wrap, Camera2StreamConfigurationMap);
            androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks2 = this.getHighSpeedVideoFpsRangesFor;
            android.graphics.PorterDuff.Mode tintModeForDrawableRes = resourceManagerHooks2 != null ? resourceManagerHooks2.getTintModeForDrawableRes(i) : null;
            if (tintModeForDrawableRes != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(wrap, tintModeForDrawableRes);
            }
            return wrap;
        }
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks3 = this.getHighSpeedVideoFpsRangesFor;
        if ((resourceManagerHooks3 == null || !resourceManagerHooks3.tintDrawable(context, i, drawable)) && (((resourceManagerHooks = this.getHighSpeedVideoFpsRangesFor) == null || !resourceManagerHooks.tintDrawableUsingColorFilter(context, i, drawable)) && z)) {
            return null;
        }
        return drawable;
    }

    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor(android.content.Context context, int i) {
        int next;
        androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> simpleArrayMap = this.Camera2StreamConfigurationMap;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        androidx.collection.SparseArrayCompat<java.lang.String> sparseArrayCompat = this.getInputSizeshNQ4ISI;
        if (sparseArrayCompat != null) {
            java.lang.String str = sparseArrayCompat.get(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.Camera2StreamConfigurationMap.get(str) == null)) {
                return null;
            }
        } else {
            this.getInputSizeshNQ4ISI = new androidx.collection.SparseArrayCompat<>();
        }
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.getOutputMinFrameDuration;
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        android.graphics.drawable.Drawable highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, j);
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                android.content.res.XmlResourceParser xml = resources.getXml(i);
                android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                }
                java.lang.String name2 = xml.getName();
                this.getInputSizeshNQ4ISI.append(i, name2);
                androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate inflateDelegate = this.Camera2StreamConfigurationMap.get(name2);
                if (inflateDelegate != null) {
                    highSpeedVideoFpsRangesFor = inflateDelegate.getHighResolutionOutputSizeshNQ4ISI(context, xml, asAttributeSet, context.getTheme());
                }
                if (highSpeedVideoFpsRangesFor != null) {
                    highSpeedVideoFpsRangesFor.setChangingConfigurations(typedValue.changingConfigurations);
                    getHighSpeedVideoFpsRanges(context, j, highSpeedVideoFpsRangesFor);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (highSpeedVideoFpsRangesFor == null) {
            this.getInputSizeshNQ4ISI.append(i, "appcompat_skip_skip");
        }
        return highSpeedVideoFpsRangesFor;
    }

    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor(android.content.Context context, long j) {
        synchronized (this) {
            androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.getInputFormats.get(context);
            if (longSparseArray == null) {
                return null;
            }
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState> weakReference = longSparseArray.get(j);
            if (weakReference != null) {
                android.graphics.drawable.Drawable.ConstantState constantState = weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                longSparseArray.remove(j);
            }
            return null;
        }
    }

    private boolean getHighSpeedVideoFpsRanges(android.content.Context context, long j, android.graphics.drawable.Drawable drawable) {
        synchronized (this) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>> longSparseArray = this.getInputFormats.get(context);
            if (longSparseArray == null) {
                longSparseArray = new androidx.collection.LongSparseArray<>();
                this.getInputFormats.put(context, longSparseArray);
            }
            longSparseArray.put(j, new java.lang.ref.WeakReference<>(constantState));
            return true;
        }
    }

    final android.graphics.drawable.Drawable getHighSpeedVideoSizes(android.content.Context context, androidx.appcompat.widget.VectorEnabledTintResources vectorEnabledTintResources, int i) {
        synchronized (this) {
            android.graphics.drawable.Drawable highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, i);
            if (highSpeedVideoFpsRangesFor == null) {
                highSpeedVideoFpsRangesFor = vectorEnabledTintResources.Camera2StreamConfigurationMap(i);
            }
            if (highSpeedVideoFpsRangesFor == null) {
                return null;
            }
            return getHighSpeedVideoSizes(context, i, false, highSpeedVideoFpsRangesFor);
        }
    }

    static class ColorFilterLruCache extends androidx.collection.LruCache<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public ColorFilterLruCache() {
            super(6);
        }

        static int getHighResolutionOutputSizeshNQ4ISI(int i, android.graphics.PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            if (tintInfo.mHasTintList || tintInfo.mHasTintMode) {
                android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
                android.content.res.ColorStateList colorStateList = tintInfo.mHasTintList ? tintInfo.mTintList : null;
                android.graphics.PorterDuff.Mode mode = tintInfo.mHasTintMode ? tintInfo.mTintMode : getHighSpeedVideoSizes;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    public static android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (androidx.appcompat.widget.ResourceManagerInternal.class) {
            androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache colorFilterLruCache = getHighResolutionOutputSizeshNQ4ISI;
            porterDuffColorFilter = colorFilterLruCache.get(java.lang.Integer.valueOf(androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache.getHighResolutionOutputSizeshNQ4ISI(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i, mode);
                colorFilterLruCache.put(java.lang.Integer.valueOf(androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache.getHighResolutionOutputSizeshNQ4ISI(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* loaded from: classes5.dex */
    static class VdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        VdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    static class AvdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AvdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    static class AsldcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AsldcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    static class DrawableDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        DrawableDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(android.graphics.drawable.Drawable.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                androidx.appcompat.resources.Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    final android.graphics.drawable.Drawable Camera2StreamConfigurationMap(android.content.Context context, int i, boolean z) {
        android.graphics.drawable.Drawable highSpeedVideoFpsRangesFor;
        synchronized (this) {
            if (!this.getOutputFormats) {
                this.getOutputFormats = true;
                android.graphics.drawable.Drawable drawable = getDrawable(context, androidx.appcompat.resources.R.drawable.abc_vector_test);
                if (drawable == null || (!(drawable instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName()))) {
                    this.getOutputFormats = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, i);
            if (highSpeedVideoFpsRangesFor == null) {
                if (this.getOutputMinFrameDuration == null) {
                    this.getOutputMinFrameDuration = new android.util.TypedValue();
                }
                android.util.TypedValue typedValue = this.getOutputMinFrameDuration;
                context.getResources().getValue(i, typedValue, true);
                long j = (typedValue.assetCookie << 32) | typedValue.data;
                android.graphics.drawable.Drawable highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(context, j);
                if (highSpeedVideoFpsRangesFor2 == null) {
                    androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.getHighSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor2 = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i);
                    if (highSpeedVideoFpsRangesFor2 != null) {
                        highSpeedVideoFpsRangesFor2.setChangingConfigurations(typedValue.changingConfigurations);
                        getHighSpeedVideoFpsRanges(context, j, highSpeedVideoFpsRangesFor2);
                    }
                }
                highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
            }
            if (highSpeedVideoFpsRangesFor == null) {
                highSpeedVideoFpsRangesFor = androidx.core.content.ContextCompat.getDrawable(context, i);
            }
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoSizes(context, i, z, highSpeedVideoFpsRangesFor);
            }
            if (highSpeedVideoFpsRangesFor != null) {
                androidx.appcompat.widget.DrawableUtils.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
            }
        }
        return highSpeedVideoFpsRangesFor;
    }

    final android.content.res.ColorStateList Camera2StreamConfigurationMap(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateList;
        androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> sparseArrayCompat;
        synchronized (this) {
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> weakHashMap = this.getHighSpeedVideoSizesFor;
            android.content.res.ColorStateList colorStateList2 = null;
            colorStateList = (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) ? null : sparseArrayCompat.get(i);
            if (colorStateList == null) {
                androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = this.getHighSpeedVideoFpsRangesFor;
                if (resourceManagerHooks != null) {
                    colorStateList2 = resourceManagerHooks.getTintListForDrawableRes(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.getHighSpeedVideoSizesFor == null) {
                        this.getHighSpeedVideoSizesFor = new java.util.WeakHashMap<>();
                    }
                    androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> sparseArrayCompat2 = this.getHighSpeedVideoSizesFor.get(context);
                    if (sparseArrayCompat2 == null) {
                        sparseArrayCompat2 = new androidx.collection.SparseArrayCompat<>();
                        this.getHighSpeedVideoSizesFor.put(context, sparseArrayCompat2);
                    }
                    sparseArrayCompat2.append(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        }
        return colorStateList;
    }
}
