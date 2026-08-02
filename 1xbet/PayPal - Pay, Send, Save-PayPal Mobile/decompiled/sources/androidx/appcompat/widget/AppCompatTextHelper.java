package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatTextHelper {
    private boolean Camera2StreamConfigurationMap;
    private androidx.appcompat.widget.TintInfo getHighResolutionOutputSizeshNQ4ISI;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoFpsRanges;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper getHighSpeedVideoFpsRangesFor;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoSizes;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoSizesFor;
    private androidx.appcompat.widget.TintInfo getInputFormats;
    private androidx.appcompat.widget.TintInfo getInputSizeshNQ4ISI;
    private androidx.appcompat.widget.TintInfo getOutputFormats;
    private android.graphics.Typeface getOutputMinFrameDuration;
    private final android.widget.TextView getOutputSizes;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private int getOutputStallDurationlomOqCM = -1;

    AppCompatTextHelper(android.widget.TextView textView) {
        this.getOutputSizes = textView;
        this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper(textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getHighSpeedVideoFpsRanges(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        java.lang.String str;
        java.lang.String str2;
        float f;
        int i2;
        android.content.Context context = this.getOutputSizes.getContext();
        androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager = androidx.appcompat.widget.AppCompatDrawableManager.get();
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.AppCompatTextHelper, i, 0);
        android.widget.TextView textView = this.getOutputSizes;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), androidx.appcompat.R.styleable.AppCompatTextHelper, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.getInputFormats = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.getOutputFormats = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z3 = this.getOutputSizes.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        boolean z4 = true;
        if (resourceId != -1) {
            androidx.appcompat.widget.TintTypedArray obtainStyledAttributes2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, resourceId, androidx.appcompat.R.styleable.TextAppearance);
            if (z3 || !obtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = obtainStyledAttributes2.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            getHighSpeedVideoSizes(context, obtainStyledAttributes2);
            str = obtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_textLocale) ? obtainStyledAttributes2.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale) : null;
            str2 = obtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings) ? obtainStyledAttributes2.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings) : null;
            obtainStyledAttributes2.recycle();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.TextAppearance, i, 0);
        if (z3 || !obtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = obtainStyledAttributes3.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false);
        }
        if (obtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_textLocale)) {
            str = obtainStyledAttributes3.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale);
        }
        if (obtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings)) {
            str2 = obtainStyledAttributes3.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && obtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes3.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.getOutputSizes.setTextSize(0, 0.0f);
        }
        getHighSpeedVideoSizes(context, obtainStyledAttributes3);
        obtainStyledAttributes3.recycle();
        if (!z3 && z4) {
            getHighResolutionOutputSizeshNQ4ISI(z);
        }
        android.graphics.Typeface typeface = this.getOutputMinFrameDuration;
        if (typeface != null) {
            if (this.getOutputStallDurationlomOqCM == -1) {
                this.getOutputSizes.setTypeface(typeface, this.getOutputMinFrameDurationlomOqCM);
            } else {
                this.getOutputSizes.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getHighSpeedVideoFpsRanges(this.getOutputSizes, str2);
        }
        if (str != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.Camera2StreamConfigurationMap(this.getOutputSizes, androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.getHighSpeedVideoFpsRanges(str));
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(attributeSet, i);
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRangesFor.getOutputFormats() != 0) {
            int[] Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap.length > 0) {
                if (androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.Camera2StreamConfigurationMap(this.getOutputSizes) != -1.0f) {
                    androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(), 0);
                } else {
                    androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.Camera2StreamConfigurationMap(this.getOutputSizes, Camera2StreamConfigurationMap, 0);
                }
            }
        }
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.AppCompatTextView);
        int resourceId2 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        android.graphics.drawable.Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
        int resourceId3 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat, -1);
        android.graphics.drawable.Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat, -1);
        android.graphics.drawable.Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        android.graphics.drawable.Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat, -1);
        android.graphics.drawable.Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat, -1);
        Camera2StreamConfigurationMap(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null);
        if (obtainStyledAttributes4.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_drawableTint)) {
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(this.getOutputSizes, obtainStyledAttributes4.getColorStateList(androidx.appcompat.R.styleable.AppCompatTextView_drawableTint));
        }
        if (obtainStyledAttributes4.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode)) {
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(this.getOutputSizes, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes4.getInt(androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (obtainStyledAttributes4.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_lineHeight)) {
            android.util.TypedValue peekValue = obtainStyledAttributes4.peekValue(androidx.appcompat.R.styleable.AppCompatTextView_lineHeight);
            if (peekValue != null && peekValue.type == 5) {
                i2 = androidx.core.util.TypedValueCompat.getUnitFromComplexDimension(peekValue.data);
                f = android.util.TypedValue.complexToFloat(peekValue.data);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(this.getOutputSizes, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(this.getOutputSizes, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i2 == -1) {
                        androidx.core.widget.TextViewCompat.setLineHeight(this.getOutputSizes, (int) f);
                        return;
                    } else {
                        androidx.core.widget.TextViewCompat.setLineHeight(this.getOutputSizes, i2, f);
                        return;
                    }
                }
                return;
            }
            f = obtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_lineHeight, -1);
        } else {
            f = -1.0f;
        }
        i2 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f == -1.0f) {
        }
    }

    private void getHighSpeedVideoSizes(android.content.Context context, androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        int i;
        java.lang.String string;
        this.getOutputMinFrameDurationlomOqCM = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, this.getOutputMinFrameDurationlomOqCM);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            int i2 = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight, -1);
            this.getOutputStallDurationlomOqCM = i2;
            if (i2 != -1) {
                this.getOutputMinFrameDurationlomOqCM &= 2;
            }
        }
        if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_fontFamily) || tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontFamily)) {
            this.getOutputMinFrameDuration = null;
            if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontFamily)) {
                i = androidx.appcompat.R.styleable.TextAppearance_fontFamily;
            } else {
                i = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily;
            }
            final int i3 = this.getOutputStallDurationlomOqCM;
            final int i4 = this.getOutputMinFrameDurationlomOqCM;
            if (!context.isRestricted()) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.getOutputSizes);
                try {
                    android.graphics.Typeface font = tintTypedArray.getFont(i, this.getOutputMinFrameDurationlomOqCM, new androidx.core.content.res.ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        /* renamed from: onFontRetrievalFailed */
                        public void m9059xb24343b7(int i5) {
                        }

                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        /* renamed from: onFontRetrieved */
                        public void m9060x46c88379(android.graphics.Typeface typeface) {
                            int i5;
                            if (android.os.Build.VERSION.SDK_INT >= 28 && (i5 = i3) != -1) {
                                typeface = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.Camera2StreamConfigurationMap(typeface, i5, (i4 & 2) != 0);
                            }
                            androidx.appcompat.widget.AppCompatTextHelper.this.getHighSpeedVideoSizes(weakReference, typeface);
                        }
                    });
                    if (font != null) {
                        if (android.os.Build.VERSION.SDK_INT >= 28 && this.getOutputStallDurationlomOqCM != -1) {
                            this.getOutputMinFrameDuration = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.Camera2StreamConfigurationMap(android.graphics.Typeface.create(font, 0), this.getOutputStallDurationlomOqCM, (this.getOutputMinFrameDurationlomOqCM & 2) != 0);
                        } else {
                            this.getOutputMinFrameDuration = font;
                        }
                    }
                    this.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration == null;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
                }
            }
            if (this.getOutputMinFrameDuration != null || (string = tintTypedArray.getString(i)) == null) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && this.getOutputStallDurationlomOqCM != -1) {
                this.getOutputMinFrameDuration = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.Camera2StreamConfigurationMap(android.graphics.Typeface.create(string, 0), this.getOutputStallDurationlomOqCM, (this.getOutputMinFrameDurationlomOqCM & 2) != 0);
                return;
            } else {
                this.getOutputMinFrameDuration = android.graphics.Typeface.create(string, this.getOutputMinFrameDurationlomOqCM);
                return;
            }
        }
        if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_typeface)) {
            this.Camera2StreamConfigurationMap = false;
            int i5 = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, 1);
            if (i5 == 1) {
                this.getOutputMinFrameDuration = android.graphics.Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.getOutputMinFrameDuration = android.graphics.Typeface.SERIF;
            } else if (i5 == 3) {
                this.getOutputMinFrameDuration = android.graphics.Typeface.MONOSPACE;
            }
        }
    }

    void getHighSpeedVideoSizes(java.lang.ref.WeakReference<android.widget.TextView> weakReference, final android.graphics.Typeface typeface) {
        if (this.Camera2StreamConfigurationMap) {
            this.getOutputMinFrameDuration = typeface;
            final android.widget.TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    final int i = this.getOutputMinFrameDurationlomOqCM;
                    textView.post(new java.lang.Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, this.getOutputMinFrameDurationlomOqCM);
                }
            }
        }
    }

    void getHighSpeedVideoFpsRangesFor(android.content.Context context, int i) {
        java.lang.String string;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, i, androidx.appcompat.R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
            getHighResolutionOutputSizeshNQ4ISI(obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false));
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.getOutputSizes.setTextSize(0, 0.0f);
        }
        getHighSpeedVideoSizes(context, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings)) != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getHighSpeedVideoFpsRanges(this.getOutputSizes, string);
        }
        obtainStyledAttributes.recycle();
        android.graphics.Typeface typeface = this.getOutputMinFrameDuration;
        if (typeface != null) {
            this.getOutputSizes.setTypeface(typeface, this.getOutputMinFrameDurationlomOqCM);
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getOutputSizes.setAllCaps(z);
    }

    void getOutputStallDuration() {
        getHighSpeedVideoFpsRanges();
    }

    void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges != null || this.getInputFormats != null || this.getHighSpeedVideoSizesFor != null || this.getHighSpeedVideoSizes != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.getOutputSizes.getCompoundDrawables();
            getHighResolutionOutputSizeshNQ4ISI(compoundDrawables[0], this.getHighSpeedVideoFpsRanges);
            getHighResolutionOutputSizeshNQ4ISI(compoundDrawables[1], this.getInputFormats);
            getHighResolutionOutputSizeshNQ4ISI(compoundDrawables[2], this.getHighSpeedVideoSizesFor);
            getHighResolutionOutputSizeshNQ4ISI(compoundDrawables[3], this.getHighSpeedVideoSizes);
        }
        if (this.getOutputFormats == null && this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.getOutputSizes.getCompoundDrawablesRelative();
        getHighResolutionOutputSizeshNQ4ISI(compoundDrawablesRelative[0], this.getOutputFormats);
        getHighResolutionOutputSizeshNQ4ISI(compoundDrawablesRelative[2], this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(drawable, tintInfo, this.getOutputSizes.getDrawableState());
    }

    private static androidx.appcompat.widget.TintInfo Camera2StreamConfigurationMap(android.content.Context context, androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager, int i) {
        android.content.res.ColorStateList highSpeedVideoFpsRangesFor = appCompatDrawableManager.getHighSpeedVideoFpsRangesFor(context, i);
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        androidx.appcompat.widget.TintInfo tintInfo = new androidx.appcompat.widget.TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = highSpeedVideoFpsRangesFor;
        return tintInfo;
    }

    void getHighSpeedVideoFpsRanges(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        Camera2StreamConfigurationMap();
    }

    void getHighSpeedVideoFpsRangesFor(int i, float f) {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor || getInputFormats()) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(i, f);
    }

    void Camera2StreamConfigurationMap() {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
    }

    boolean getInputFormats() {
        return this.getHighSpeedVideoFpsRangesFor.getInputFormats();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, float f) {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(i, f);
    }

    void getHighSpeedVideoFpsRanges(int i) {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    void getHighSpeedVideoSizes(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(i, i2, i3, i4);
    }

    void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(iArr, i);
    }

    int getOutputFormats() {
        return this.getHighSpeedVideoFpsRangesFor.getOutputFormats();
    }

    int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
    }

    int getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
    }

    int getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
    }

    int[] getHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
    }

    android.content.res.ColorStateList getInputSizeshNQ4ISI() {
        androidx.appcompat.widget.TintInfo tintInfo = this.getInputSizeshNQ4ISI;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void Camera2StreamConfigurationMap(android.content.res.ColorStateList colorStateList) {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new androidx.appcompat.widget.TintInfo();
        }
        this.getInputSizeshNQ4ISI.mTintList = colorStateList;
        this.getInputSizeshNQ4ISI.mHasTintList = colorStateList != null;
        getOutputMinFrameDurationlomOqCM();
    }

    android.graphics.PorterDuff.Mode getOutputMinFrameDuration() {
        androidx.appcompat.widget.TintInfo tintInfo = this.getInputSizeshNQ4ISI;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void getHighSpeedVideoFpsRangesFor(android.graphics.PorterDuff.Mode mode) {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new androidx.appcompat.widget.TintInfo();
        }
        this.getInputSizeshNQ4ISI.mTintMode = mode;
        this.getInputSizeshNQ4ISI.mHasTintMode = mode != null;
        getOutputMinFrameDurationlomOqCM();
    }

    private void getOutputMinFrameDurationlomOqCM() {
        androidx.appcompat.widget.TintInfo tintInfo = this.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = tintInfo;
        this.getInputFormats = tintInfo;
        this.getHighSpeedVideoSizesFor = tintInfo;
        this.getHighSpeedVideoSizes = tintInfo;
        this.getOutputFormats = tintInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = tintInfo;
    }

    private void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4, android.graphics.drawable.Drawable drawable5, android.graphics.drawable.Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.getOutputSizes.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            android.widget.TextView textView = this.getOutputSizes;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = this.getOutputSizes.getCompoundDrawablesRelative();
        android.graphics.drawable.Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.getOutputSizes.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawables = this.getOutputSizes.getCompoundDrawables();
        android.widget.TextView textView2 = this.getOutputSizes;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    void getHighSpeedVideoFpsRangesFor(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.widget.TextView textView, java.lang.String str) {
            return textView.setFontVariationSettings(str);
        }

        static int Camera2StreamConfigurationMap(android.widget.TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void Camera2StreamConfigurationMap(android.widget.TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void Camera2StreamConfigurationMap(android.widget.TextView textView, android.os.LocaleList localeList) {
            textView.setTextLocales(localeList);
        }

        static android.os.LocaleList getHighSpeedVideoFpsRanges(java.lang.String str) {
            return android.os.LocaleList.forLanguageTags(str);
        }
    }

    /* loaded from: classes5.dex */
    static class Api21Impl {
        private Api21Impl() {
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.graphics.Typeface Camera2StreamConfigurationMap(android.graphics.Typeface typeface, int i, boolean z) {
            return android.graphics.Typeface.create(typeface, i, z);
        }
    }
}
