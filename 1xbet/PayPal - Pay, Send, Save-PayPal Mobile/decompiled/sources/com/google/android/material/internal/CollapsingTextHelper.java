package com.google.android.material.internal;

/* loaded from: classes8.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final android.graphics.Paint DEBUG_DRAW_PAINT = null;
    private static final java.lang.String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final java.lang.String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;
    private final android.graphics.Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private com.google.android.material.resources.CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private android.content.res.ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private android.content.res.ColorStateList collapsedTextColor;
    private float collapsedTextWidth;
    private android.graphics.Typeface collapsedTypeface;
    private android.graphics.Typeface collapsedTypefaceBold;
    private android.graphics.Typeface collapsedTypefaceDefault;
    private final android.graphics.RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private android.graphics.Typeface currentTypeface;
    private final android.graphics.Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private com.google.android.material.resources.CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private android.content.res.ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private android.content.res.ColorStateList expandedTextColor;
    private android.graphics.Bitmap expandedTitleTexture;
    private android.graphics.Typeface expandedTypeface;
    private android.graphics.Typeface expandedTypefaceBold;
    private android.graphics.Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private boolean isRtl;
    private android.animation.TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private java.lang.CharSequence text;
    private android.text.StaticLayout textLayout;
    private final android.text.TextPaint textPaint;
    private android.animation.TimeInterpolator textSizeInterpolator;
    private java.lang.CharSequence textToDraw;
    private java.lang.CharSequence textToDrawCollapsed;
    private android.graphics.Paint texturePaint;
    private final android.text.TextPaint tmpPaint;
    private boolean useTexture;
    private final android.view.View view;
    private int expandedTextGravity = 16;
    private int collapsedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private float collapsedTextSize = 15.0f;
    private android.text.TextUtils.TruncateAt titleTextEllipsize = android.text.TextUtils.TruncateAt.END;
    private boolean isRtlTextDirectionHeuristicsEnabled = true;
    private int maxLines = 1;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;

    public CollapsingTextHelper(android.view.View view) {
        this.view = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.textPaint = textPaint;
        this.tmpPaint = new android.text.TextPaint(textPaint);
        this.collapsedBounds = new android.graphics.Rect();
        this.expandedBounds = new android.graphics.Rect();
        this.currentBounds = new android.graphics.RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    public final void setTextSizeInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public final void setPositionInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public final android.animation.TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public final void setExpandedTextSize(float f) {
        if (this.expandedTextSize != f) {
            this.expandedTextSize = f;
            recalculate();
        }
    }

    public final void setCollapsedTextSize(float f) {
        if (this.collapsedTextSize != f) {
            this.collapsedTextSize = f;
            recalculate();
        }
    }

    public final void setCollapsedTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public final void setExpandedTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public final void setCollapsedAndExpandedTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.collapsedTextColor == colorStateList && this.expandedTextColor == colorStateList) {
            return;
        }
        this.collapsedTextColor = colorStateList;
        this.expandedTextColor = colorStateList;
        recalculate();
    }

    public final void setExpandedLetterSpacing(float f) {
        if (this.expandedLetterSpacing != f) {
            this.expandedLetterSpacing = f;
            recalculate();
        }
    }

    public final void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.expandedBounds, i, i2, i3, i4)) {
            return;
        }
        this.expandedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public final void setExpandedBounds(android.graphics.Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.collapsedBounds, i, i2, i3, i4)) {
            return;
        }
        this.collapsedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public final void setCollapsedBounds(android.graphics.Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void getCollapsedTextActualBounds(android.graphics.RectF rectF, int i, int i2) {
        this.isRtl = calculateIsRtl(this.text);
        rectF.left = java.lang.Math.max(getCollapsedTextLeftBound(i, i2), this.collapsedBounds.left);
        rectF.top = this.collapsedBounds.top;
        rectF.right = java.lang.Math.min(getCollapsedTextRightBound(rectF, i, i2), this.collapsedBounds.right);
        rectF.bottom = this.collapsedBounds.top + getCollapsedTextHeight();
    }

    private float getCollapsedTextLeftBound(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.collapsedTextWidth / 2.0f);
        }
        return ((i2 & androidx.core.view.GravityCompat.END) == 8388613 || (i2 & 5) == 5) ? this.isRtl ? this.collapsedBounds.left : this.collapsedBounds.right - this.collapsedTextWidth : this.isRtl ? this.collapsedBounds.right - this.collapsedTextWidth : this.collapsedBounds.left;
    }

    private float getCollapsedTextRightBound(android.graphics.RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (this.collapsedTextWidth / 2.0f);
        }
        return ((i2 & androidx.core.view.GravityCompat.END) == 8388613 || (i2 & 5) == 5) ? this.isRtl ? rectF.left + this.collapsedTextWidth : this.collapsedBounds.right : this.isRtl ? this.collapsedBounds.right : rectF.left + this.collapsedTextWidth;
    }

    public final float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public final float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public final float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public final void setCurrentOffsetY(int i) {
        this.currentOffsetY = i;
    }

    public final void setFadeModeStartFraction(float f) {
        this.fadeModeStartFraction = f;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    private float calculateFadeModeThresholdFraction() {
        float f = this.fadeModeStartFraction;
        return f + ((1.0f - f) * 0.5f);
    }

    public final void setFadeModeEnabled(boolean z) {
        this.fadeModeEnabled = z;
    }

    private void getTextPaintExpanded(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
    }

    private void getTextPaintCollapsed(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
    }

    public final void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate();
        }
    }

    public final int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public final void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate();
        }
    }

    public final int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public final void setCollapsedTextAppearance(int i) {
        com.google.android.material.resources.TextAppearance textAppearance = new com.google.android.material.resources.TextAppearance(this.view.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        if (textAppearance.shadowColor != null) {
            this.collapsedShadowColor = textAppearance.shadowColor;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        com.google.android.material.resources.CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new com.google.android.material.resources.CancelableFontCallback(new com.google.android.material.resources.CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(android.graphics.Typeface typeface) {
                com.google.android.material.internal.CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public final void setExpandedTextAppearance(int i) {
        com.google.android.material.resources.TextAppearance textAppearance = new com.google.android.material.resources.TextAppearance(this.view.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        if (textAppearance.shadowColor != null) {
            this.expandedShadowColor = textAppearance.shadowColor;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        com.google.android.material.resources.CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new com.google.android.material.resources.CancelableFontCallback(new com.google.android.material.resources.CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(android.graphics.Typeface typeface) {
                com.google.android.material.internal.CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public final void setTitleTextEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.titleTextEllipsize = truncateAt;
        recalculate();
    }

    public final android.text.TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public final void setCollapsedTypeface(android.graphics.Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public final void setExpandedTypeface(android.graphics.Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public final void setTypefaces(android.graphics.Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }

    private boolean setCollapsedTypefaceInternal(android.graphics.Typeface typeface) {
        com.google.android.material.resources.CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        android.graphics.Typeface maybeCopyWithFontWeightAdjustment = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypefaceBold = maybeCopyWithFontWeightAdjustment;
        if (maybeCopyWithFontWeightAdjustment == null) {
            maybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
        }
        this.collapsedTypeface = maybeCopyWithFontWeightAdjustment;
        return true;
    }

    private boolean setExpandedTypefaceInternal(android.graphics.Typeface typeface) {
        com.google.android.material.resources.CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        android.graphics.Typeface maybeCopyWithFontWeightAdjustment = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypefaceBold = maybeCopyWithFontWeightAdjustment;
        if (maybeCopyWithFontWeightAdjustment == null) {
            maybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
        }
        this.expandedTypeface = maybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final android.graphics.Typeface getCollapsedTypeface() {
        android.graphics.Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    public final android.graphics.Typeface getExpandedTypeface() {
        android.graphics.Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : android.graphics.Typeface.DEFAULT;
    }

    public final void maybeUpdateFontWeightAdjustment(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.graphics.Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            android.graphics.Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            android.graphics.Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            android.graphics.Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public final void setExpansionFraction(float f) {
        float clamp = androidx.core.math.MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.expandedFraction) {
            this.expandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.collapsedTextColor;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList2 = this.expandedTextColor;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    public final float getExpansionFraction() {
        return this.expandedFraction;
    }

    public final float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public final float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public final void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.isRtlTextDirectionHeuristicsEnabled = z;
    }

    public final boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private void calculateOffsets(float f) {
        float f2;
        interpolateBounds(f);
        if (!this.fadeModeEnabled) {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
            setInterpolatedTextSize(f);
            f2 = f;
        } else if (f < this.fadeModeThresholdFraction) {
            this.currentDrawX = this.expandedDrawX;
            this.currentDrawY = this.expandedDrawY;
            setInterpolatedTextSize(0.0f);
            f2 = 0.0f;
        } else {
            this.currentDrawX = this.collapsedDrawX;
            this.currentDrawY = this.collapsedDrawY - java.lang.Math.max(0, this.currentOffsetY);
            setInterpolatedTextSize(1.0f);
            f2 = 1.0f;
        }
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - f, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        setExpandedTextBlend(lerp(1.0f, 0.0f, f, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f2));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        float f3 = this.collapsedLetterSpacing;
        float f4 = this.expandedLetterSpacing;
        if (f3 != f4) {
            this.textPaint.setLetterSpacing(lerp(f4, f3, f, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        } else {
            this.textPaint.setLetterSpacing(f3);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f, null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, f, null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, f, null);
        int blendARGB = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f);
        this.currentShadowColor = blendARGB;
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, blendARGB);
        if (this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(f) * this.textPaint.getAlpha()));
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                android.text.TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private float calculateFadeModeTextAlpha(float f) {
        float f2 = this.fadeModeThresholdFraction;
        if (f <= f2) {
            return com.google.android.material.animation.AnimationUtils.lerp(1.0f, 0.0f, this.fadeModeStartFraction, f2, f);
        }
        return com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, f2, 1.0f, f);
    }

    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    public final int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    private int getCurrentColor(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private void calculateBaseOffsets(boolean z) {
        android.text.StaticLayout staticLayout;
        calculateUsingTextSize(1.0f, z);
        java.lang.CharSequence charSequence = this.textToDraw;
        if (charSequence != null && (staticLayout = this.textLayout) != null) {
            this.textToDrawCollapsed = android.text.TextUtils.ellipsize(charSequence, this.textPaint, staticLayout.getWidth(), this.titleTextEllipsize);
        }
        java.lang.CharSequence charSequence2 = this.textToDrawCollapsed;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, charSequence2);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.collapsedDrawY = this.collapsedBounds.top;
        } else if (i == 80) {
            this.collapsedDrawY = this.collapsedBounds.bottom + this.textPaint.ascent();
        } else {
            this.collapsedDrawY = this.collapsedBounds.centerY() - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.collapsedDrawX = this.collapsedBounds.centerX() - (this.collapsedTextWidth / 2.0f);
        } else if (i2 == 5) {
            this.collapsedDrawX = this.collapsedBounds.right - this.collapsedTextWidth;
        } else {
            this.collapsedDrawX = this.collapsedBounds.left;
        }
        calculateUsingTextSize(0.0f, z);
        float height = this.textLayout != null ? r10.getHeight() : 0.0f;
        android.text.StaticLayout staticLayout2 = this.textLayout;
        if (staticLayout2 != null && this.maxLines > 1) {
            f = staticLayout2.getWidth();
        } else {
            java.lang.CharSequence charSequence3 = this.textToDraw;
            if (charSequence3 != null) {
                f = measureTextWidth(this.textPaint, charSequence3);
            }
        }
        android.text.StaticLayout staticLayout3 = this.textLayout;
        this.expandedLineCount = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = androidx.core.view.GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.expandedDrawY = this.expandedBounds.top;
        } else if (i3 != 80) {
            this.expandedDrawY = this.expandedBounds.centerY() - (height / 2.0f);
        } else {
            this.expandedDrawY = (this.expandedBounds.bottom - height) + this.textPaint.descent();
        }
        int i4 = absoluteGravity2 & androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.expandedDrawX = this.expandedBounds.centerX() - (f / 2.0f);
        } else if (i4 == 5) {
            this.expandedDrawX = this.expandedBounds.right - f;
        } else {
            this.expandedDrawX = this.expandedBounds.left;
        }
        clearTexture();
        setInterpolatedTextSize(this.expandedFraction);
    }

    private float measureTextWidth(android.text.TextPaint textPaint, java.lang.CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void interpolateBounds(float f) {
        if (this.fadeModeEnabled) {
            this.currentBounds.set(f < this.fadeModeThresholdFraction ? this.expandedBounds : this.collapsedBounds);
            return;
        }
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f, this.positionInterpolator);
    }

    private void setCollapsedTextBlend(float f) {
        this.collapsedTextBlend = f;
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void setExpandedTextBlend(float f) {
        this.expandedTextBlend = f;
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public final void draw(android.graphics.Canvas canvas) {
        int save = canvas.save();
        if (this.textToDraw == null || this.currentBounds.width() <= 0.0f || this.currentBounds.height() <= 0.0f) {
            return;
        }
        this.textPaint.setTextSize(this.currentTextSize);
        float f = this.currentDrawX;
        float f2 = this.currentDrawY;
        boolean z = this.useTexture && this.expandedTitleTexture != null;
        float f3 = this.scale;
        if (f3 != 1.0f && !this.fadeModeEnabled) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.expandedTitleTexture, f, f2, this.texturePaint);
            canvas.restoreToCount(save);
            return;
        }
        if (shouldDrawMultiline() && (!this.fadeModeEnabled || this.expandedFraction > this.fadeModeThresholdFraction)) {
            drawMultilineTransition(canvas, this.currentDrawX - this.textLayout.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.textLayout.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    private boolean shouldDrawMultiline() {
        if (this.maxLines > 1) {
            return (!this.isRtl || this.fadeModeEnabled) && !this.useTexture;
        }
        return false;
    }

    private void drawMultilineTransition(android.graphics.Canvas canvas, float f, float f2) {
        int alpha = this.textPaint.getAlpha();
        canvas.translate(f, f2);
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.expandedTextBlend * alpha));
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                android.text.TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
            this.textLayout.draw(canvas);
        }
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.collapsedTextBlend * alpha));
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.text.TextPaint textPaint2 = this.textPaint;
            textPaint2.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint2.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        java.lang.CharSequence charSequence = this.textToDrawCollapsed;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.textPaint);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (this.fadeModeEnabled) {
            return;
        }
        java.lang.String trim = this.textToDrawCollapsed.toString().trim();
        if (trim.endsWith(ELLIPSIS_NORMAL)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        java.lang.String str = trim;
        this.textPaint.setAlpha(alpha);
        canvas.drawText(str, 0, java.lang.Math.min(this.textLayout.getLineEnd(0), str.length()), 0.0f, f3, (android.graphics.Paint) this.textPaint);
    }

    private boolean calculateIsRtl(java.lang.CharSequence charSequence) {
        boolean isDefaultIsRtl = isDefaultIsRtl();
        return this.isRtlTextDirectionHeuristicsEnabled ? isTextDirectionHeuristicsIsRtl(charSequence, isDefaultIsRtl) : isDefaultIsRtl;
    }

    private boolean isDefaultIsRtl() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this.view) == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(java.lang.CharSequence charSequence, boolean z) {
        androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (z) {
            textDirectionHeuristicCompat = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    private void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = USE_SCALING_TEXTURE && this.scale != 1.0f;
        this.useTexture = z;
        if (z) {
            ensureExpandedTexture();
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void calculateUsingTextSize(float f) {
        calculateUsingTextSize(f, false);
    }

    private void calculateUsingTextSize(float f, boolean z) {
        float f2;
        float f3;
        android.graphics.Typeface typeface;
        if (this.text != null) {
            float width = this.collapsedBounds.width();
            float width2 = this.expandedBounds.width();
            if (isClose(f, 1.0f)) {
                f2 = this.collapsedTextSize;
                f3 = this.collapsedLetterSpacing;
                this.scale = 1.0f;
                typeface = this.collapsedTypeface;
            } else {
                float f4 = this.expandedTextSize;
                float f5 = this.expandedLetterSpacing;
                android.graphics.Typeface typeface2 = this.expandedTypeface;
                if (isClose(f, 0.0f)) {
                    this.scale = 1.0f;
                } else {
                    this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator) / this.expandedTextSize;
                }
                float f6 = this.collapsedTextSize / this.expandedTextSize;
                width = (z || this.fadeModeEnabled || width2 * f6 <= width) ? width2 : java.lang.Math.min(width / f6, width2);
                f2 = f4;
                f3 = f5;
                typeface = typeface2;
            }
            if (width > 0.0f) {
                boolean z2 = this.currentTextSize != f2;
                boolean z3 = this.currentLetterSpacing != f3;
                boolean z4 = this.currentTypeface != typeface;
                android.text.StaticLayout staticLayout = this.textLayout;
                boolean z5 = z2 || z3 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.boundsChanged;
                this.currentTextSize = f2;
                this.currentLetterSpacing = f3;
                this.currentTypeface = typeface;
                this.boundsChanged = false;
                this.textPaint.setLinearText(this.scale != 1.0f);
                r5 = z5;
            }
            if (this.textToDraw == null || r5) {
                this.textPaint.setTextSize(this.currentTextSize);
                this.textPaint.setTypeface(this.currentTypeface);
                this.textPaint.setLetterSpacing(this.currentLetterSpacing);
                this.isRtl = calculateIsRtl(this.text);
                android.text.StaticLayout createStaticLayout = createStaticLayout(shouldDrawMultiline() ? this.maxLines : 1, width, this.isRtl);
                this.textLayout = createStaticLayout;
                this.textToDraw = createStaticLayout.getText();
            }
        }
    }

    private android.text.StaticLayout createStaticLayout(int i, float f, boolean z) {
        android.text.StaticLayout staticLayout;
        try {
            staticLayout = com.google.android.material.internal.StaticLayoutBuilderCompat.obtain(this.text, this.textPaint, (int) f).setEllipsize(this.titleTextEllipsize).setIsRtl(z).setAlignment(i == 1 ? android.text.Layout.Alignment.ALIGN_NORMAL : getMultilineTextLayoutAlignment()).setIncludePad(false).setMaxLines(i).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).setStaticLayoutBuilderConfigurer(this.staticLayoutBuilderConfigurer).build();
        } catch (com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            e.getCause().getMessage();
            staticLayout = null;
        }
        return (android.text.StaticLayout) androidx.core.util.Preconditions.checkNotNull(staticLayout);
    }

    private android.text.Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
        if (absoluteGravity != 1) {
            return absoluteGravity != 5 ? this.isRtl ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL : this.isRtl ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture != null || this.expandedBounds.isEmpty() || android.text.TextUtils.isEmpty(this.textToDraw)) {
            return;
        }
        calculateOffsets(0.0f);
        int width = this.textLayout.getWidth();
        int height = this.textLayout.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.expandedTitleTexture = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        this.textLayout.draw(new android.graphics.Canvas(this.expandedTitleTexture));
        if (this.texturePaint == null) {
            this.texturePaint = new android.graphics.Paint(3);
        }
    }

    public final void recalculate() {
        recalculate(false);
    }

    public final void recalculate(boolean z) {
        if ((this.view.getHeight() <= 0 || this.view.getWidth() <= 0) && !z) {
            return;
        }
        calculateBaseOffsets(z);
        calculateCurrentOffsets();
    }

    public final void setText(java.lang.CharSequence charSequence) {
        if (charSequence == null || !android.text.TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public final java.lang.CharSequence getText() {
        return this.text;
    }

    private void clearTexture() {
        android.graphics.Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    public final void setMaxLines(int i) {
        if (i != this.maxLines) {
            this.maxLines = i;
            clearTexture();
            recalculate();
        }
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getLineCount() {
        android.text.StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public final void setLineSpacingAdd(float f) {
        this.lineSpacingAdd = f;
    }

    public final float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    public final void setLineSpacingMultiplier(float f) {
        this.lineSpacingMultiplier = f;
    }

    public final float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public final void setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final void setStaticLayoutBuilderConfigurer(com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.staticLayoutBuilderConfigurer != staticLayoutBuilderConfigurer) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    private static boolean isClose(float f, float f2) {
        return java.lang.Math.abs(f - f2) < 1.0E-5f;
    }

    public final android.content.res.ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public final android.content.res.ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    private static int blendARGB(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb(java.lang.Math.round((android.graphics.Color.alpha(i) * f2) + (android.graphics.Color.alpha(i2) * f)), java.lang.Math.round((android.graphics.Color.red(i) * f2) + (android.graphics.Color.red(i2) * f)), java.lang.Math.round((android.graphics.Color.green(i) * f2) + (android.graphics.Color.green(i2) * f)), java.lang.Math.round((android.graphics.Color.blue(i) * f2) + (android.graphics.Color.blue(i2) * f)));
    }

    private static float lerp(float f, float f2, float f3, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return com.google.android.material.animation.AnimationUtils.lerp(f, f2, f3);
    }

    private static boolean rectEquals(android.graphics.Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
