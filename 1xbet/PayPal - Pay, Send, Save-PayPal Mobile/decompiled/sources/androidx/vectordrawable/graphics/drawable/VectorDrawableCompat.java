package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes3.dex */
public class VectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon {
    static final android.graphics.PorterDuff.Mode getHighSpeedVideoSizes = android.graphics.PorterDuff.Mode.SRC_IN;
    private android.graphics.ColorFilter Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final android.graphics.Rect getHighSpeedVideoSizesFor;
    private final android.graphics.Matrix getInputFormats;
    private androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState getInputSizeshNQ4ISI;
    private android.graphics.PorterDuffColorFilter getOutputFormats;
    private final float[] getOutputMinFrameDuration;

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    VectorDrawableCompat() {
        this.getHighSpeedVideoFpsRanges = true;
        this.getOutputMinFrameDuration = new float[9];
        this.getInputFormats = new android.graphics.Matrix();
        this.getHighSpeedVideoSizesFor = new android.graphics.Rect();
        this.getInputSizeshNQ4ISI = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState();
    }

    VectorDrawableCompat(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState) {
        this.getHighSpeedVideoFpsRanges = true;
        this.getOutputMinFrameDuration = new float[9];
        this.getInputFormats = new android.graphics.Matrix();
        this.getHighSpeedVideoSizesFor = new android.graphics.Rect();
        this.getInputSizeshNQ4ISI = vectorDrawableCompatState;
        this.getOutputFormats = getHighSpeedVideoSizes(this.getOutputFormats, vectorDrawableCompatState.getInputSizeshNQ4ISI, vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.mutate();
            return this;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI && super.mutate() == this) {
            this.getInputSizeshNQ4ISI = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState(this.getInputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        return this;
    }

    java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str) {
        return this.getInputSizeshNQ4ISI.getOutputSizes.getOutputFormats.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableDelegateState(this.getHighSpeedVideoFpsRangesFor.getConstantState());
        }
        this.getInputSizeshNQ4ISI.getOutputFormats = getChangingConfigurations();
        return this.getInputSizeshNQ4ISI;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.draw(canvas);
            return;
        }
        copyBounds(this.getHighSpeedVideoSizesFor);
        if (this.getHighSpeedVideoSizesFor.width() <= 0 || this.getHighSpeedVideoSizesFor.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.Camera2StreamConfigurationMap;
        if (colorFilter == null) {
            colorFilter = this.getOutputFormats;
        }
        canvas.getMatrix(this.getInputFormats);
        this.getInputFormats.getValues(this.getOutputMinFrameDuration);
        float abs = java.lang.Math.abs(this.getOutputMinFrameDuration[0]);
        float abs2 = java.lang.Math.abs(this.getOutputMinFrameDuration[4]);
        float abs3 = java.lang.Math.abs(this.getOutputMinFrameDuration[1]);
        float abs4 = java.lang.Math.abs(this.getOutputMinFrameDuration[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = java.lang.Math.min(2048, (int) (this.getHighSpeedVideoSizesFor.width() * abs));
        int min2 = java.lang.Math.min(2048, (int) (this.getHighSpeedVideoSizesFor.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.getHighSpeedVideoSizesFor.left, this.getHighSpeedVideoSizesFor.top);
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            canvas.translate(this.getHighSpeedVideoSizesFor.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.getHighSpeedVideoSizesFor.offsetTo(0, 0);
        this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(min, min2);
        if (!this.getHighSpeedVideoFpsRanges) {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(min, min2);
        } else if (!this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI()) {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(min, min2);
            this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        }
        this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(canvas, colorFilter, this.getHighSpeedVideoSizesFor);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getAlpha(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getInputSizeshNQ4ISI.getOutputSizes.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setAlpha(i);
        } else if (this.getInputSizeshNQ4ISI.getOutputSizes.getRootAlpha() != i) {
            this.getInputSizeshNQ4ISI.getOutputSizes.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        } else {
            this.Camera2StreamConfigurationMap = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getColorFilter(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.Camera2StreamConfigurationMap;
    }

    android.graphics.PorterDuffColorFilter getHighSpeedVideoSizes(android.graphics.PorterDuffColorFilter porterDuffColorFilter, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(this.getHighSpeedVideoFpsRangesFor, i);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(this.getHighSpeedVideoFpsRangesFor, colorStateList);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        if (vectorDrawableCompatState.getInputSizeshNQ4ISI != colorStateList) {
            vectorDrawableCompatState.getInputSizeshNQ4ISI = colorStateList;
            this.getOutputFormats = getHighSpeedVideoSizes(this.getOutputFormats, colorStateList, vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.getHighSpeedVideoFpsRangesFor, mode);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        if (vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM != mode) {
            vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM = mode;
            this.getOutputFormats = getHighSpeedVideoSizes(this.getOutputFormats, vectorDrawableCompatState.getInputSizeshNQ4ISI, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        if (vectorDrawableCompatState.getHighSpeedVideoFpsRanges()) {
            return true;
        }
        return this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI != null && this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.setState(iArr);
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        if (vectorDrawableCompatState.getInputSizeshNQ4ISI == null || vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM == null) {
            z = false;
        } else {
            this.getOutputFormats = getHighSpeedVideoSizes(this.getOutputFormats, vectorDrawableCompatState.getInputSizeshNQ4ISI, vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM);
            invalidateSelf();
            z = true;
        }
        if (!vectorDrawableCompatState.getHighSpeedVideoFpsRanges() || !vectorDrawableCompatState.getHighSpeedVideoFpsRangesFor(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getIntrinsicWidth();
        }
        return (int) this.getInputSizeshNQ4ISI.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getIntrinsicHeight();
        }
        return (int) this.getInputSizeshNQ4ISI.getOutputSizes.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return false;
        }
        androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(this.getHighSpeedVideoFpsRangesFor);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.getHighSpeedVideoFpsRangesFor, z);
        } else {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes = z;
        }
    }

    public float getPixelSize() {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        if (vectorDrawableCompatState == null || vectorDrawableCompatState.getOutputSizes == null || this.getInputSizeshNQ4ISI.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI == 0.0f || this.getInputSizeshNQ4ISI.getOutputSizes.getHighSpeedVideoFpsRangesFor == 0.0f || this.getInputSizeshNQ4ISI.getOutputSizes.getInputSizeshNQ4ISI == 0.0f || this.getInputSizeshNQ4ISI.getOutputSizes.getOutputSizeshNQ4ISI == 0.0f) {
            return 1.0f;
        }
        float f = this.getInputSizeshNQ4ISI.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
        float f2 = this.getInputSizeshNQ4ISI.getOutputSizes.getHighSpeedVideoFpsRangesFor;
        return java.lang.Math.min(this.getInputSizeshNQ4ISI.getOutputSizes.getOutputSizeshNQ4ISI / f, this.getInputSizeshNQ4ISI.getOutputSizes.getInputSizeshNQ4ISI / f2);
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
        vectorDrawableCompat.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.ResourcesCompat.getDrawable(resources, i, theme);
        return vectorDrawableCompat;
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, float f) {
        return (((int) (android.graphics.Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.core.graphics.drawable.DrawableCompat.inflate(this.getHighSpeedVideoFpsRangesFor, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        vectorDrawableCompatState.getOutputSizes = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer();
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getOutputStallDuration);
        getHighSpeedVideoFpsRanges(obtainAttributes, xmlPullParser, theme);
        obtainAttributes.recycle();
        vectorDrawableCompatState.getOutputFormats = getChangingConfigurations();
        vectorDrawableCompatState.Camera2StreamConfigurationMap = true;
        getHighSpeedVideoFpsRanges(resources, xmlPullParser, attributeSet, theme);
        this.getOutputFormats = getHighSpeedVideoSizes(this.getOutputFormats, vectorDrawableCompatState.getInputSizeshNQ4ISI, vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM);
    }

    private static android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRanges(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void getHighSpeedVideoFpsRanges(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer = vectorDrawableCompatState.getOutputSizes;
        vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRanges(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        android.content.res.ColorStateList namedColorStateList = androidx.core.content.res.TypedArrayUtils.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            vectorDrawableCompatState.getInputSizeshNQ4ISI = namedColorStateList;
        }
        vectorDrawableCompatState.getHighSpeedVideoSizes = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.getHighSpeedVideoSizes);
        vPathRenderer.getOutputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.getOutputSizeshNQ4ISI);
        vPathRenderer.getInputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.getInputSizeshNQ4ISI);
        if (vPathRenderer.getOutputSizeshNQ4ISI <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
        }
        if (vPathRenderer.getInputSizeshNQ4ISI <= 0.0f) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new org.xmlpull.v1.XmlPullParserException(sb2.toString());
        }
        vPathRenderer.getHighResolutionOutputSizeshNQ4ISI = typedArray.getDimension(3, vPathRenderer.getHighResolutionOutputSizeshNQ4ISI);
        vPathRenderer.getHighSpeedVideoFpsRangesFor = typedArray.getDimension(2, vPathRenderer.getHighSpeedVideoFpsRangesFor);
        if (vPathRenderer.getHighResolutionOutputSizeshNQ4ISI <= 0.0f) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(typedArray.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new org.xmlpull.v1.XmlPullParserException(sb3.toString());
        }
        if (vPathRenderer.getHighSpeedVideoFpsRangesFor <= 0.0f) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires height > 0");
            throw new org.xmlpull.v1.XmlPullParserException(sb4.toString());
        }
        vPathRenderer.setAlpha(androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
        java.lang.String string = typedArray.getString(0);
        if (string != null) {
            vPathRenderer.getOutputMinFrameDuration = string;
            vPathRenderer.getOutputFormats.put(string, vPathRenderer);
        }
    }

    private void getHighSpeedVideoFpsRanges(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.getInputSizeshNQ4ISI;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer = vectorDrawableCompatState.getOutputSizes;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(vPathRenderer.getHighSpeedVideoSizesFor);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name2 = xmlPullParser.getName();
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) arrayDeque.peek();
                if (vGroup != null) {
                    if ("path".equals(name2)) {
                        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath();
                        vFullPath.getHighSpeedVideoFpsRanges(resources, attributeSet, theme, xmlPullParser);
                        vGroup.getHighSpeedVideoFpsRanges.add(vFullPath);
                        if (vFullPath.getPathName() != null) {
                            vPathRenderer.getOutputFormats.put(vFullPath.getPathName(), vFullPath);
                        }
                        vectorDrawableCompatState.getOutputFormats = vFullPath.getOutputStallDuration | vectorDrawableCompatState.getOutputFormats;
                        z = false;
                    } else if ("clip-path".equals(name2)) {
                        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath();
                        vClipPath.getHighSpeedVideoSizes(resources, attributeSet, theme, xmlPullParser);
                        vGroup.getHighSpeedVideoFpsRanges.add(vClipPath);
                        if (vClipPath.getPathName() != null) {
                            vPathRenderer.getOutputFormats.put(vClipPath.getPathName(), vClipPath);
                        }
                        vectorDrawableCompatState.getOutputFormats = vClipPath.getOutputStallDuration | vectorDrawableCompatState.getOutputFormats;
                    } else if ("group".equals(name2)) {
                        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup2 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup();
                        vGroup2.getHighResolutionOutputSizeshNQ4ISI(resources, attributeSet, theme, xmlPullParser);
                        vGroup.getHighSpeedVideoFpsRanges.add(vGroup2);
                        arrayDeque.push(vGroup2);
                        if (vGroup2.getGroupName() != null) {
                            vPathRenderer.getOutputFormats.put(vGroup2.getGroupName(), vGroup2);
                        }
                        vectorDrawableCompatState.getOutputFormats = vGroup2.getHighResolutionOutputSizeshNQ4ISI | vectorDrawableCompatState.getOutputFormats;
                    }
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new org.xmlpull.v1.XmlPullParserException("no path defined");
        }
    }

    void getHighSpeedVideoSizes(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        return isAutoMirrored() && androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.getInputSizeshNQ4ISI.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable runnable, long j) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable runnable) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    static class VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState getHighResolutionOutputSizeshNQ4ISI;

        VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.getHighResolutionOutputSizeshNQ4ISI = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.getHighSpeedVideoFpsRangesFor = (android.graphics.drawable.VectorDrawable) this.getHighResolutionOutputSizeshNQ4ISI.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.getHighSpeedVideoFpsRangesFor = (android.graphics.drawable.VectorDrawable) this.getHighResolutionOutputSizeshNQ4ISI.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.getHighSpeedVideoFpsRangesFor = (android.graphics.drawable.VectorDrawable) this.getHighResolutionOutputSizeshNQ4ISI.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.getHighResolutionOutputSizeshNQ4ISI.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getChangingConfigurations();
        }
    }

    static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        boolean Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Bitmap getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        android.graphics.Paint getHighSpeedVideoSizesFor;
        android.content.res.ColorStateList getInputFormats;
        android.content.res.ColorStateList getInputSizeshNQ4ISI;
        int getOutputFormats;
        android.graphics.PorterDuff.Mode getOutputMinFrameDuration;
        android.graphics.PorterDuff.Mode getOutputMinFrameDurationlomOqCM;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer getOutputSizes;

        VectorDrawableCompatState(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState) {
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.getHighSpeedVideoSizes;
            if (vectorDrawableCompatState != null) {
                this.getOutputFormats = vectorDrawableCompatState.getOutputFormats;
                this.getOutputSizes = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer(vectorDrawableCompatState.getOutputSizes);
                if (vectorDrawableCompatState.getOutputSizes.Camera2StreamConfigurationMap != null) {
                    this.getOutputSizes.Camera2StreamConfigurationMap = new android.graphics.Paint(vectorDrawableCompatState.getOutputSizes.Camera2StreamConfigurationMap);
                }
                if (vectorDrawableCompatState.getOutputSizes.getInputFormats != null) {
                    this.getOutputSizes.getInputFormats = new android.graphics.Paint(vectorDrawableCompatState.getOutputSizes.getInputFormats);
                }
                this.getInputSizeshNQ4ISI = vectorDrawableCompatState.getInputSizeshNQ4ISI;
                this.getOutputMinFrameDurationlomOqCM = vectorDrawableCompatState.getOutputMinFrameDurationlomOqCM;
                this.getHighSpeedVideoSizes = vectorDrawableCompatState.getHighSpeedVideoSizes;
            }
        }

        public void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas, android.graphics.ColorFilter colorFilter, android.graphics.Rect rect) {
            canvas.drawBitmap(this.getHighSpeedVideoFpsRanges, (android.graphics.Rect) null, rect, Camera2StreamConfigurationMap(colorFilter));
        }

        public boolean getHighSpeedVideoFpsRangesFor() {
            return this.getOutputSizes.getRootAlpha() < 255;
        }

        public android.graphics.Paint Camera2StreamConfigurationMap(android.graphics.ColorFilter colorFilter) {
            if (!getHighSpeedVideoFpsRangesFor() && colorFilter == null) {
                return null;
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.getHighSpeedVideoSizesFor = paint;
                paint.setFilterBitmap(true);
            }
            this.getHighSpeedVideoSizesFor.setAlpha(this.getOutputSizes.getRootAlpha());
            this.getHighSpeedVideoSizesFor.setColorFilter(colorFilter);
            return this.getHighSpeedVideoSizesFor;
        }

        public void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            this.getHighSpeedVideoFpsRanges.eraseColor(0);
            this.getOutputSizes.Camera2StreamConfigurationMap(new android.graphics.Canvas(this.getHighSpeedVideoFpsRanges), i, i2, null);
        }

        public void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            if (this.getHighSpeedVideoFpsRanges == null || !getHighSpeedVideoSizes(i, i2)) {
                this.getHighSpeedVideoFpsRanges = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
                this.Camera2StreamConfigurationMap = true;
            }
        }

        public boolean getHighSpeedVideoSizes(int i, int i2) {
            return i == this.getHighSpeedVideoFpsRanges.getWidth() && i2 == this.getHighSpeedVideoFpsRanges.getHeight();
        }

        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return !this.Camera2StreamConfigurationMap && this.getInputFormats == this.getInputSizeshNQ4ISI && this.getOutputMinFrameDuration == this.getOutputMinFrameDurationlomOqCM && this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == this.getOutputSizes.getRootAlpha();
        }

        public void Camera2StreamConfigurationMap() {
            this.getInputFormats = this.getInputSizeshNQ4ISI;
            this.getOutputMinFrameDuration = this.getOutputMinFrameDurationlomOqCM;
            this.getHighSpeedVideoFpsRangesFor = this.getOutputSizes.getRootAlpha();
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = false;
        }

        VectorDrawableCompatState() {
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.getHighSpeedVideoSizes;
            this.getOutputSizes = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.getOutputFormats;
        }

        public boolean getHighSpeedVideoFpsRanges() {
            return this.getOutputSizes.getHighSpeedVideoSizes();
        }

        public boolean getHighSpeedVideoFpsRangesFor(int[] iArr) {
            boolean highResolutionOutputSizeshNQ4ISI = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI(iArr);
            this.Camera2StreamConfigurationMap |= highResolutionOutputSizeshNQ4ISI;
            return highResolutionOutputSizeshNQ4ISI;
        }
    }

    static class VPathRenderer {
        private static final android.graphics.Matrix getOutputStallDuration = new android.graphics.Matrix();
        android.graphics.Paint Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        java.lang.Boolean getHighSpeedVideoSizes;
        final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup getHighSpeedVideoSizesFor;
        android.graphics.Paint getInputFormats;
        float getInputSizeshNQ4ISI;
        final androidx.collection.ArrayMap<java.lang.String, java.lang.Object> getOutputFormats;
        java.lang.String getOutputMinFrameDuration;
        private final android.graphics.Path getOutputMinFrameDurationlomOqCM;
        private int getOutputSizes;
        float getOutputSizeshNQ4ISI;
        private final android.graphics.Matrix getOutputStallDurationlomOqCM;
        private android.graphics.PathMeasure isOutputSupportedFor;
        private final android.graphics.Path toString;

        private static float getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        VPathRenderer() {
            this.getOutputStallDurationlomOqCM = new android.graphics.Matrix();
            this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
            this.getHighSpeedVideoFpsRangesFor = 0.0f;
            this.getOutputSizeshNQ4ISI = 0.0f;
            this.getInputSizeshNQ4ISI = 0.0f;
            this.getHighSpeedVideoFpsRanges = 255;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = null;
            this.getOutputFormats = new androidx.collection.ArrayMap<>();
            this.getHighSpeedVideoSizesFor = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup();
            this.getOutputMinFrameDurationlomOqCM = new android.graphics.Path();
            this.toString = new android.graphics.Path();
        }

        public void setRootAlpha(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public int getRootAlpha() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        VPathRenderer(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer) {
            this.getOutputStallDurationlomOqCM = new android.graphics.Matrix();
            this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
            this.getHighSpeedVideoFpsRangesFor = 0.0f;
            this.getOutputSizeshNQ4ISI = 0.0f;
            this.getInputSizeshNQ4ISI = 0.0f;
            this.getHighSpeedVideoFpsRanges = 255;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = null;
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> arrayMap = new androidx.collection.ArrayMap<>();
            this.getOutputFormats = arrayMap;
            this.getHighSpeedVideoSizesFor = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup(vPathRenderer.getHighSpeedVideoSizesFor, arrayMap);
            this.getOutputMinFrameDurationlomOqCM = new android.graphics.Path(vPathRenderer.getOutputMinFrameDurationlomOqCM);
            this.toString = new android.graphics.Path(vPathRenderer.toString);
            this.getHighResolutionOutputSizeshNQ4ISI = vPathRenderer.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = vPathRenderer.getHighSpeedVideoFpsRangesFor;
            this.getOutputSizeshNQ4ISI = vPathRenderer.getOutputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = vPathRenderer.getInputSizeshNQ4ISI;
            this.getOutputSizes = vPathRenderer.getOutputSizes;
            this.getHighSpeedVideoFpsRanges = vPathRenderer.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = vPathRenderer.getOutputMinFrameDuration;
            java.lang.String str = vPathRenderer.getOutputMinFrameDuration;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.getHighSpeedVideoSizes = vPathRenderer.getHighSpeedVideoSizes;
        }

        private void getHighSpeedVideoSizes(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            vGroup.getHighSpeedVideoSizes.set(matrix);
            vGroup.getHighSpeedVideoSizes.preConcat(vGroup.Camera2StreamConfigurationMap);
            canvas.save();
            for (int i3 = 0; i3 < vGroup.getHighSpeedVideoFpsRanges.size(); i3++) {
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject vObject = vGroup.getHighSpeedVideoFpsRanges.get(i3);
                if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) {
                    getHighSpeedVideoSizes((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) vObject, vGroup.getHighSpeedVideoSizes, canvas, i, i2, colorFilter);
                } else if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) {
                    Camera2StreamConfigurationMap(vGroup, (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) vObject, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void Camera2StreamConfigurationMap(android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, getOutputStallDuration, canvas, i, i2, colorFilter);
        }

        private void Camera2StreamConfigurationMap(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vPath, android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            float f;
            float f2 = i / this.getOutputSizeshNQ4ISI;
            float f3 = i2 / this.getInputSizeshNQ4ISI;
            float min = java.lang.Math.min(f2, f3);
            android.graphics.Matrix matrix = vGroup.getHighSpeedVideoSizes;
            this.getOutputStallDurationlomOqCM.set(matrix);
            this.getOutputStallDurationlomOqCM.postScale(f2, f3);
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(matrix);
            if (highResolutionOutputSizeshNQ4ISI != 0.0f) {
                vPath.getHighSpeedVideoSizes(this.getOutputMinFrameDurationlomOqCM);
                android.graphics.Path path = this.getOutputMinFrameDurationlomOqCM;
                this.toString.reset();
                if (vPath.getHighSpeedVideoSizes()) {
                    this.toString.setFillType(vPath.getOutputSizes == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                    this.toString.addPath(path, this.getOutputStallDurationlomOqCM);
                    canvas.clipPath(this.toString);
                    return;
                }
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) vPath;
                if (vFullPath.getOutputStallDurationlomOqCM != 0.0f || vFullPath.getInputSizeshNQ4ISI != 1.0f) {
                    float f4 = vFullPath.getOutputStallDurationlomOqCM;
                    float f5 = vFullPath.getInputFormats;
                    float f6 = vFullPath.getInputSizeshNQ4ISI;
                    float f7 = vFullPath.getInputFormats;
                    if (this.isOutputSupportedFor == null) {
                        this.isOutputSupportedFor = new android.graphics.PathMeasure();
                    }
                    this.isOutputSupportedFor.setPath(this.getOutputMinFrameDurationlomOqCM, false);
                    float length = this.isOutputSupportedFor.getLength();
                    float f8 = ((f4 + f5) % 1.0f) * length;
                    float f9 = ((f6 + f7) % 1.0f) * length;
                    path.reset();
                    if (f8 > f9) {
                        this.isOutputSupportedFor.getSegment(f8, length, path, true);
                        f = 0.0f;
                        this.isOutputSupportedFor.getSegment(0.0f, f9, path, true);
                    } else {
                        f = 0.0f;
                        this.isOutputSupportedFor.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(f, f);
                }
                this.toString.addPath(path, this.getOutputStallDurationlomOqCM);
                if (vFullPath.getHighResolutionOutputSizeshNQ4ISI.willDraw()) {
                    androidx.core.content.res.ComplexColorCompat complexColorCompat = vFullPath.getHighResolutionOutputSizeshNQ4ISI;
                    if (this.Camera2StreamConfigurationMap == null) {
                        android.graphics.Paint paint = new android.graphics.Paint(1);
                        this.Camera2StreamConfigurationMap = paint;
                        paint.setStyle(android.graphics.Paint.Style.FILL);
                    }
                    android.graphics.Paint paint2 = this.Camera2StreamConfigurationMap;
                    if (complexColorCompat.isGradient()) {
                        android.graphics.Shader shader = complexColorCompat.getShader();
                        shader.setLocalMatrix(this.getOutputStallDurationlomOqCM);
                        paint2.setShader(shader);
                        paint2.setAlpha(java.lang.Math.round(vFullPath.getHighSpeedVideoSizes * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.getHighSpeedVideoFpsRangesFor(complexColorCompat.getColor(), vFullPath.getHighSpeedVideoSizes));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.toString.setFillType(vFullPath.getOutputSizes == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.toString, paint2);
                }
                if (vFullPath.Camera2StreamConfigurationMap.willDraw()) {
                    androidx.core.content.res.ComplexColorCompat complexColorCompat2 = vFullPath.Camera2StreamConfigurationMap;
                    if (this.getInputFormats == null) {
                        android.graphics.Paint paint3 = new android.graphics.Paint(1);
                        this.getInputFormats = paint3;
                        paint3.setStyle(android.graphics.Paint.Style.STROKE);
                    }
                    android.graphics.Paint paint4 = this.getInputFormats;
                    if (vFullPath.getHighSpeedVideoSizesFor != null) {
                        paint4.setStrokeJoin(vFullPath.getHighSpeedVideoSizesFor);
                    }
                    if (vFullPath.getHighSpeedVideoFpsRangesFor != null) {
                        paint4.setStrokeCap(vFullPath.getHighSpeedVideoFpsRangesFor);
                    }
                    paint4.setStrokeMiter(vFullPath.getOutputMinFrameDuration);
                    if (complexColorCompat2.isGradient()) {
                        android.graphics.Shader shader2 = complexColorCompat2.getShader();
                        shader2.setLocalMatrix(this.getOutputStallDurationlomOqCM);
                        paint4.setShader(shader2);
                        paint4.setAlpha(java.lang.Math.round(vFullPath.getHighSpeedVideoFpsRanges * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.getHighSpeedVideoFpsRangesFor(complexColorCompat2.getColor(), vFullPath.getHighSpeedVideoFpsRanges));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(vFullPath.getOutputFormats * min * highResolutionOutputSizeshNQ4ISI);
                    canvas.drawPath(this.toString, paint4);
                }
            }
        }

        private float getHighResolutionOutputSizeshNQ4ISI(android.graphics.Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) java.lang.Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) java.lang.Math.hypot(fArr[2], fArr[3]);
            float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = java.lang.Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return java.lang.Math.abs(highSpeedVideoFpsRanges) / max;
            }
            return 0.0f;
        }

        public boolean getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = java.lang.Boolean.valueOf(this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap());
            }
            return this.getHighSpeedVideoSizes.booleanValue();
        }

        public boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
            return this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI(iArr);
        }
    }

    static abstract class VObject {
        public boolean Camera2StreamConfigurationMap() {
            return false;
        }

        public boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
            return false;
        }

        private VObject() {
        }
    }

    static class VGroup extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        final android.graphics.Matrix Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        final android.graphics.Matrix getHighSpeedVideoSizes;
        private float getHighSpeedVideoSizesFor;
        private java.lang.String getInputFormats;
        private float getInputSizeshNQ4ISI;
        private float getOutputFormats;
        private float getOutputMinFrameDuration;
        private int[] getOutputMinFrameDurationlomOqCM;
        private float getOutputSizes;
        private float getOutputStallDurationlomOqCM;

        VGroup(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, androidx.collection.ArrayMap<java.lang.String, java.lang.Object> arrayMap) {
            super();
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vClipPath;
            this.getHighSpeedVideoSizes = new android.graphics.Matrix();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRangesFor = 0.0f;
            this.getOutputFormats = 0.0f;
            this.getHighSpeedVideoSizesFor = 0.0f;
            this.getOutputMinFrameDuration = 1.0f;
            this.getInputSizeshNQ4ISI = 1.0f;
            this.getOutputSizes = 0.0f;
            this.getOutputStallDurationlomOqCM = 0.0f;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.Camera2StreamConfigurationMap = matrix;
            this.getInputFormats = null;
            this.getHighSpeedVideoFpsRangesFor = vGroup.getHighSpeedVideoFpsRangesFor;
            this.getOutputFormats = vGroup.getOutputFormats;
            this.getHighSpeedVideoSizesFor = vGroup.getHighSpeedVideoSizesFor;
            this.getOutputMinFrameDuration = vGroup.getOutputMinFrameDuration;
            this.getInputSizeshNQ4ISI = vGroup.getInputSizeshNQ4ISI;
            this.getOutputSizes = vGroup.getOutputSizes;
            this.getOutputStallDurationlomOqCM = vGroup.getOutputStallDurationlomOqCM;
            this.getOutputMinFrameDurationlomOqCM = vGroup.getOutputMinFrameDurationlomOqCM;
            java.lang.String str = vGroup.getInputFormats;
            this.getInputFormats = str;
            this.getHighResolutionOutputSizeshNQ4ISI = vGroup.getHighResolutionOutputSizeshNQ4ISI;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.Camera2StreamConfigurationMap);
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> arrayList = vGroup.getHighSpeedVideoFpsRanges;
            for (int i = 0; i < arrayList.size(); i++) {
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject vObject = arrayList.get(i);
                if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) {
                    this.getHighSpeedVideoFpsRanges.add(new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) vObject, arrayMap));
                } else {
                    if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) {
                        vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) vObject);
                    } else if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) {
                        vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) vObject);
                    } else {
                        throw new java.lang.IllegalStateException("Unknown object in the tree!");
                    }
                    this.getHighSpeedVideoFpsRanges.add(vClipPath);
                    if (vClipPath.getOutputMinFrameDurationlomOqCM != null) {
                        arrayMap.put(vClipPath.getOutputMinFrameDurationlomOqCM, vClipPath);
                    }
                }
            }
        }

        VGroup() {
            super();
            this.getHighSpeedVideoSizes = new android.graphics.Matrix();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRangesFor = 0.0f;
            this.getOutputFormats = 0.0f;
            this.getHighSpeedVideoSizesFor = 0.0f;
            this.getOutputMinFrameDuration = 1.0f;
            this.getInputSizeshNQ4ISI = 1.0f;
            this.getOutputSizes = 0.0f;
            this.getOutputStallDurationlomOqCM = 0.0f;
            this.Camera2StreamConfigurationMap = new android.graphics.Matrix();
            this.getInputFormats = null;
        }

        public java.lang.String getGroupName() {
            return this.getInputFormats;
        }

        public android.graphics.Matrix getLocalMatrix() {
            return this.Camera2StreamConfigurationMap;
        }

        public void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getOutputMinFrameDuration);
            getHighSpeedVideoFpsRangesFor(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        private void getHighSpeedVideoFpsRangesFor(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, androidx.constraintlayout.motion.widget.Key.ROTATION, 5, this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats = typedArray.getFloat(1, this.getOutputFormats);
            this.getHighSpeedVideoSizesFor = typedArray.getFloat(2, this.getHighSpeedVideoSizesFor);
            this.getOutputMinFrameDuration = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.getOutputMinFrameDuration);
            this.getInputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.getInputSizeshNQ4ISI);
            this.getOutputSizes = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.getOutputSizes);
            this.getOutputStallDurationlomOqCM = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.getOutputStallDurationlomOqCM);
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.getInputFormats = string;
            }
            getHighSpeedVideoSizes();
        }

        private void getHighSpeedVideoSizes() {
            this.Camera2StreamConfigurationMap.reset();
            this.Camera2StreamConfigurationMap.postTranslate(-this.getOutputFormats, -this.getHighSpeedVideoSizesFor);
            this.Camera2StreamConfigurationMap.postScale(this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap.postRotate(this.getHighSpeedVideoFpsRangesFor, 0.0f, 0.0f);
            this.Camera2StreamConfigurationMap.postTranslate(this.getOutputSizes + this.getOutputFormats, this.getOutputStallDurationlomOqCM + this.getHighSpeedVideoSizesFor);
        }

        public float getRotation() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public void setRotation(float f) {
            if (f != this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getPivotX() {
            return this.getOutputFormats;
        }

        public void setPivotX(float f) {
            if (f != this.getOutputFormats) {
                this.getOutputFormats = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getPivotY() {
            return this.getHighSpeedVideoSizesFor;
        }

        public void setPivotY(float f) {
            if (f != this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizesFor = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getScaleX() {
            return this.getOutputMinFrameDuration;
        }

        public void setScaleX(float f) {
            if (f != this.getOutputMinFrameDuration) {
                this.getOutputMinFrameDuration = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getScaleY() {
            return this.getInputSizeshNQ4ISI;
        }

        public void setScaleY(float f) {
            if (f != this.getInputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getTranslateX() {
            return this.getOutputSizes;
        }

        public void setTranslateX(float f) {
            if (f != this.getOutputSizes) {
                this.getOutputSizes = f;
                getHighSpeedVideoSizes();
            }
        }

        public float getTranslateY() {
            return this.getOutputStallDurationlomOqCM;
        }

        public void setTranslateY(float f) {
            if (f != this.getOutputStallDurationlomOqCM) {
                this.getOutputStallDurationlomOqCM = f;
                getHighSpeedVideoSizes();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean Camera2StreamConfigurationMap() {
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                if (this.getHighSpeedVideoFpsRanges.get(i).Camera2StreamConfigurationMap()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                z |= this.getHighSpeedVideoFpsRanges.get(i).getHighResolutionOutputSizeshNQ4ISI(iArr);
            }
            return z;
        }
    }

    static abstract class VPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        java.lang.String getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        protected androidx.core.graphics.PathParser.PathDataNode[] getOutputSizeshNQ4ISI;
        int getOutputStallDuration;

        public boolean getHighSpeedVideoSizes() {
            return false;
        }

        VPath() {
            super();
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputSizes = 0;
        }

        VPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vPath) {
            super();
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputSizes = 0;
            this.getOutputMinFrameDurationlomOqCM = vPath.getOutputMinFrameDurationlomOqCM;
            this.getOutputStallDuration = vPath.getOutputStallDuration;
            this.getOutputSizeshNQ4ISI = androidx.core.graphics.PathParser.deepCopyNodes(vPath.getOutputSizeshNQ4ISI);
        }

        public void getHighSpeedVideoSizes(android.graphics.Path path) {
            path.reset();
            androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr = this.getOutputSizeshNQ4ISI;
            if (pathDataNodeArr != null) {
                androidx.core.graphics.PathParser.nodesToPath(pathDataNodeArr, path);
            }
        }

        public java.lang.String getPathName() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public androidx.core.graphics.PathParser.PathDataNode[] getPathData() {
            return this.getOutputSizeshNQ4ISI;
        }

        public void setPathData(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr) {
            if (!androidx.core.graphics.PathParser.canMorph(this.getOutputSizeshNQ4ISI, pathDataNodeArr)) {
                this.getOutputSizeshNQ4ISI = androidx.core.graphics.PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                androidx.core.graphics.PathParser.updateNodes(this.getOutputSizeshNQ4ISI, pathDataNodeArr);
            }
        }
    }

    static class VClipPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean getHighSpeedVideoSizes() {
            return true;
        }

        VClipPath() {
        }

        VClipPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath vClipPath) {
            super(vClipPath);
        }

        public void getHighSpeedVideoSizes(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getInputFormats);
                getHighSpeedVideoSizes(obtainAttributes, xmlPullParser);
                obtainAttributes.recycle();
            }
        }

        private void getHighSpeedVideoSizes(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.getOutputMinFrameDurationlomOqCM = string;
            }
            java.lang.String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.getOutputSizeshNQ4ISI = androidx.core.graphics.PathParser.createNodesFromPathData(string2);
            }
            this.getOutputSizes = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    static class VFullPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        androidx.core.content.res.ComplexColorCompat Camera2StreamConfigurationMap;
        androidx.core.content.res.ComplexColorCompat getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        android.graphics.Paint.Cap getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;
        android.graphics.Paint.Join getHighSpeedVideoSizesFor;
        float getInputFormats;
        float getInputSizeshNQ4ISI;
        float getOutputFormats;
        float getOutputMinFrameDuration;
        float getOutputStallDurationlomOqCM;
        private int[] isOutputSupportedForhNQ4ISI;

        VFullPath() {
            this.getOutputFormats = 0.0f;
            this.getHighSpeedVideoFpsRanges = 1.0f;
            this.getHighSpeedVideoSizes = 1.0f;
            this.getOutputStallDurationlomOqCM = 0.0f;
            this.getInputSizeshNQ4ISI = 1.0f;
            this.getInputFormats = 0.0f;
            this.getHighSpeedVideoFpsRangesFor = android.graphics.Paint.Cap.BUTT;
            this.getHighSpeedVideoSizesFor = android.graphics.Paint.Join.MITER;
            this.getOutputMinFrameDuration = 4.0f;
        }

        VFullPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath) {
            super(vFullPath);
            this.getOutputFormats = 0.0f;
            this.getHighSpeedVideoFpsRanges = 1.0f;
            this.getHighSpeedVideoSizes = 1.0f;
            this.getOutputStallDurationlomOqCM = 0.0f;
            this.getInputSizeshNQ4ISI = 1.0f;
            this.getInputFormats = 0.0f;
            this.getHighSpeedVideoFpsRangesFor = android.graphics.Paint.Cap.BUTT;
            this.getHighSpeedVideoSizesFor = android.graphics.Paint.Join.MITER;
            this.getOutputMinFrameDuration = 4.0f;
            this.isOutputSupportedForhNQ4ISI = vFullPath.isOutputSupportedForhNQ4ISI;
            this.Camera2StreamConfigurationMap = vFullPath.Camera2StreamConfigurationMap;
            this.getOutputFormats = vFullPath.getOutputFormats;
            this.getHighSpeedVideoFpsRanges = vFullPath.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = vFullPath.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputSizes = vFullPath.getOutputSizes;
            this.getHighSpeedVideoSizes = vFullPath.getHighSpeedVideoSizes;
            this.getOutputStallDurationlomOqCM = vFullPath.getOutputStallDurationlomOqCM;
            this.getInputSizeshNQ4ISI = vFullPath.getInputSizeshNQ4ISI;
            this.getInputFormats = vFullPath.getInputFormats;
            this.getHighSpeedVideoFpsRangesFor = vFullPath.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizesFor = vFullPath.getHighSpeedVideoSizesFor;
            this.getOutputMinFrameDuration = vFullPath.getOutputMinFrameDuration;
        }

        private android.graphics.Paint.Cap Camera2StreamConfigurationMap(int i, android.graphics.Paint.Cap cap) {
            if (i == 0) {
                return android.graphics.Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : android.graphics.Paint.Cap.SQUARE;
            }
            return android.graphics.Paint.Cap.ROUND;
        }

        private android.graphics.Paint.Join Camera2StreamConfigurationMap(int i, android.graphics.Paint.Join join) {
            if (i == 0) {
                return android.graphics.Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : android.graphics.Paint.Join.BEVEL;
            }
            return android.graphics.Paint.Join.ROUND;
        }

        public void getHighSpeedVideoFpsRanges(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges(obtainAttributes, xmlPullParser, theme);
            obtainAttributes.recycle();
        }

        private void getHighSpeedVideoFpsRanges(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) {
            this.isOutputSupportedForhNQ4ISI = null;
            if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                java.lang.String string = typedArray.getString(0);
                if (string != null) {
                    this.getOutputMinFrameDurationlomOqCM = string;
                }
                java.lang.String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.getOutputSizeshNQ4ISI = androidx.core.graphics.PathParser.createNodesFromPathData(string2);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.getHighSpeedVideoSizes = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.getHighSpeedVideoSizesFor);
                this.getOutputMinFrameDuration = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.getOutputMinFrameDuration);
                this.Camera2StreamConfigurationMap = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.getHighSpeedVideoFpsRanges = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.getHighSpeedVideoFpsRanges);
                this.getOutputFormats = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.getOutputFormats);
                this.getInputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.getInputSizeshNQ4ISI);
                this.getInputFormats = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.getInputFormats);
                this.getOutputStallDurationlomOqCM = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.getOutputStallDurationlomOqCM);
                this.getOutputSizes = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.getOutputSizes);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isStateful() || this.Camera2StreamConfigurationMap.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
            return this.Camera2StreamConfigurationMap.onStateChanged(iArr) | this.getHighResolutionOutputSizeshNQ4ISI.onStateChanged(iArr);
        }

        int getStrokeColor() {
            return this.Camera2StreamConfigurationMap.getColor();
        }

        void setStrokeColor(int i) {
            this.Camera2StreamConfigurationMap.setColor(i);
        }

        float getStrokeWidth() {
            return this.getOutputFormats;
        }

        void setStrokeWidth(float f) {
            this.getOutputFormats = f;
        }

        float getStrokeAlpha() {
            return this.getHighSpeedVideoFpsRanges;
        }

        void setStrokeAlpha(float f) {
            this.getHighSpeedVideoFpsRanges = f;
        }

        int getFillColor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getColor();
        }

        void setFillColor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.setColor(i);
        }

        float getFillAlpha() {
            return this.getHighSpeedVideoSizes;
        }

        void setFillAlpha(float f) {
            this.getHighSpeedVideoSizes = f;
        }

        float getTrimPathStart() {
            return this.getOutputStallDurationlomOqCM;
        }

        void setTrimPathStart(float f) {
            this.getOutputStallDurationlomOqCM = f;
        }

        float getTrimPathEnd() {
            return this.getInputSizeshNQ4ISI;
        }

        void setTrimPathEnd(float f) {
            this.getInputSizeshNQ4ISI = f;
        }

        float getTrimPathOffset() {
            return this.getInputFormats;
        }

        void setTrimPathOffset(float f) {
            this.getInputFormats = f;
        }
    }
}
