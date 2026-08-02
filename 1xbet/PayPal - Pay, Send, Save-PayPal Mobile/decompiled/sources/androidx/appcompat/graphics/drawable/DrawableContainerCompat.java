package androidx.appcompat.graphics.drawable;

/* loaded from: classes5.dex */
public class DrawableContainerCompat extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback Camera2StreamConfigurationMap;
    private java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState getInputFormats;
    private android.graphics.Rect getInputSizeshNQ4ISI;
    private long getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private android.graphics.drawable.Drawable getOutputStallDuration;
    private int getHighSpeedVideoFpsRangesFor = 255;
    private int getHighSpeedVideoFpsRanges = -1;

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable2 = this.getOutputStallDuration;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.getInputFormats.getChangingConfigurations();
    }

    private boolean getHighSpeedVideoFpsRanges() {
        return isAutoMirrored() && androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        boolean padding;
        android.graphics.Rect inputFormats = this.getInputFormats.getInputFormats();
        if (inputFormats != null) {
            rect.set(inputFormats);
            padding = (inputFormats.right | ((inputFormats.left | inputFormats.top) | inputFormats.bottom)) != 0;
        } else {
            android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (getHighSpeedVideoFpsRanges()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.Camera2StreamConfigurationMap(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.getOutputMinFrameDuration && this.getHighSpeedVideoFpsRangesFor == i) {
            return;
        }
        this.getOutputMinFrameDuration = true;
        this.getHighSpeedVideoFpsRangesFor = i;
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            if (this.getOutputFormats == 0) {
                drawable.setAlpha(i);
            } else {
                getHighSpeedVideoSizes(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.getInputFormats.getValidOutputFormatsForInputhNQ4ISI != z) {
            this.getInputFormats.getValidOutputFormatsForInputhNQ4ISI = z;
            android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
            if (drawable != null) {
                drawable.setDither(this.getInputFormats.getValidOutputFormatsForInputhNQ4ISI);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getInputFormats.ArtificialStackFrames = true;
        if (this.getInputFormats.getOutputMinFrameDurationlomOqCM != colorFilter) {
            this.getInputFormats.getOutputMinFrameDurationlomOqCM = colorFilter;
            android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.getInputFormats._BOUNDARY = true;
        if (this.getInputFormats.d != colorStateList) {
            this.getInputFormats.d = colorStateList;
            androidx.core.graphics.drawable.DrawableCompat.setTintList(this.getHighSpeedVideoSizes, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getInputFormats.f2663a = true;
        if (this.getInputFormats.exchange != mode) {
            this.getInputFormats.exchange = mode;
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.getHighSpeedVideoSizes, mode);
        }
    }

    public void setEnterFadeDuration(int i) {
        this.getInputFormats.CoroutineDebuggingKt = i;
    }

    public void setExitFadeDuration(int i) {
        this.getInputFormats.accessartificialFrame = i;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.getInputFormats.getOutputSizeshNQ4ISI();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.getInputFormats.getHighSpeedVideoFpsRanges != z) {
            this.getInputFormats.getHighSpeedVideoFpsRanges = z;
            android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
            if (drawable != null) {
                androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(drawable, this.getInputFormats.getHighSpeedVideoFpsRanges);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.getInputFormats.getHighSpeedVideoFpsRanges;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.getOutputStallDuration = null;
            z = true;
        } else {
            z = false;
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.getOutputMinFrameDuration) {
                this.getHighSpeedVideoSizes.setAlpha(this.getHighSpeedVideoFpsRangesFor);
            }
        }
        if (this.getHighSpeedVideoSizesFor != 0) {
            this.getHighSpeedVideoSizesFor = 0L;
        } else {
            z2 = z;
        }
        if (this.getOutputFormats != 0) {
            this.getOutputFormats = 0L;
        } else if (!z2) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = this.getInputSizeshNQ4ISI;
        if (rect == null) {
            this.getInputSizeshNQ4ISI = new android.graphics.Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.getInputSizeshNQ4ISI;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.getInputFormats.getHighSpeedVideoFpsRangesFor(i, getHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.getInputFormats.getOutputStallDurationlomOqCM()) {
            return this.getInputFormats.getOutputMinFrameDuration();
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.getInputFormats.getOutputStallDurationlomOqCM()) {
            return this.getInputFormats.getHighSpeedVideoSizesFor();
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.getInputFormats.getOutputStallDurationlomOqCM()) {
            return this.getInputFormats.getInputSizeshNQ4ISI();
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.getInputFormats.getOutputStallDurationlomOqCM()) {
            return this.getInputFormats.getOutputFormats();
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState = this.getInputFormats;
        if (drawableContainerState != null) {
            drawableContainerState.getOutputMinFrameDurationlomOqCM();
        }
        if (drawable != this.getHighSpeedVideoSizes || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        if (drawable != this.getHighSpeedVideoSizes || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        if (drawable != this.getHighSpeedVideoSizes || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.getInputFormats.getOutputSizes();
    }

    int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges;
    }

    boolean getHighSpeedVideoSizes(int i) {
        if (i == this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.getInputFormats.accessartificialFrame > 0) {
            android.graphics.drawable.Drawable drawable = this.getOutputStallDuration;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
            if (drawable2 != null) {
                this.getOutputStallDuration = drawable2;
                this.getHighSpeedVideoSizesFor = this.getInputFormats.accessartificialFrame + uptimeMillis;
            } else {
                this.getOutputStallDuration = null;
                this.getHighSpeedVideoSizesFor = 0L;
            }
        } else {
            android.graphics.drawable.Drawable drawable3 = this.getHighSpeedVideoSizes;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0 && i < this.getInputFormats.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            android.graphics.drawable.Drawable highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(i);
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i;
            if (highSpeedVideoFpsRanges != null) {
                if (this.getInputFormats.CoroutineDebuggingKt > 0) {
                    this.getOutputFormats = uptimeMillis + this.getInputFormats.CoroutineDebuggingKt;
                }
                getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            }
        } else {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = -1;
        }
        if (this.getOutputFormats != 0 || this.getHighSpeedVideoSizesFor != 0) {
            java.lang.Runnable runnable = this.getHighResolutionOutputSizeshNQ4ISI;
            if (runnable == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Runnable() { // from class: androidx.appcompat.graphics.drawable.DrawableContainerCompat.1
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.appcompat.graphics.drawable.DrawableContainerCompat.this.getHighSpeedVideoSizes(true);
                        androidx.appcompat.graphics.drawable.DrawableContainerCompat.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            getHighSpeedVideoSizes(true);
        }
        invalidateSelf();
        return true;
    }

    private void getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback();
        }
        drawable.setCallback(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(drawable.getCallback()));
        try {
            if (this.getInputFormats.CoroutineDebuggingKt <= 0 && this.getOutputMinFrameDuration) {
                drawable.setAlpha(this.getHighSpeedVideoFpsRangesFor);
            }
            if (this.getInputFormats.ArtificialStackFrames) {
                drawable.setColorFilter(this.getInputFormats.getOutputMinFrameDurationlomOqCM);
            } else {
                if (this.getInputFormats._BOUNDARY) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, this.getInputFormats.d);
                }
                if (this.getInputFormats.f2663a) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, this.getInputFormats.exchange);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.getInputFormats.getValidOutputFormatsForInputhNQ4ISI);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this));
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(drawable, this.getInputFormats.getHighSpeedVideoFpsRanges);
            android.graphics.Rect rect = this.getInputSizeshNQ4ISI;
            if (rect != null) {
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getHighSpeedVideoSizes(boolean z) {
        boolean z2;
        android.graphics.drawable.Drawable drawable;
        boolean z3 = true;
        this.getOutputMinFrameDuration = true;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            long j = this.getOutputFormats;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.getHighSpeedVideoFpsRangesFor);
                } else {
                    this.getHighSpeedVideoSizes.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.getInputFormats.CoroutineDebuggingKt)) * this.getHighSpeedVideoFpsRangesFor) / 255);
                    z2 = true;
                    drawable = this.getOutputStallDuration;
                    if (drawable != null) {
                        long j2 = this.getHighSpeedVideoSizesFor;
                        if (j2 != 0) {
                            if (j2 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.getOutputStallDuration = null;
                            } else {
                                this.getOutputStallDuration.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.getInputFormats.accessartificialFrame) * this.getHighSpeedVideoFpsRangesFor) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.getHighResolutionOutputSizeshNQ4ISI, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                        z3 = z2;
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    }
                    this.getHighSpeedVideoSizesFor = 0L;
                    z3 = z2;
                    if (z) {
                    }
                }
            }
            z2 = false;
            drawable = this.getOutputStallDuration;
            if (drawable != null) {
            }
            this.getHighSpeedVideoSizesFor = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.getOutputFormats = 0L;
        z2 = false;
        drawable = this.getOutputStallDuration;
        if (drawable != null) {
        }
        this.getHighSpeedVideoSizesFor = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.getHighSpeedVideoSizes;
    }

    final void getHighSpeedVideoFpsRangesFor(android.content.res.Resources resources) {
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.getInputFormats.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (!this.getInputFormats.getHighSpeedVideoSizes()) {
            return null;
        }
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI = getChangingConfigurations();
        return this.getInputFormats;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.getOutputMinFrameDurationlomOqCM && super.mutate() == this) {
            androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState highSpeedVideoSizes = getHighSpeedVideoSizes();
            highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            this.getOutputMinFrameDurationlomOqCM = true;
        }
        return this;
    }

    androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState getHighSpeedVideoSizes() {
        return this.getInputFormats;
    }

    static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState {
        boolean AMEXKernel;
        boolean ArtificialStackFrames;
        int CoroutineDebuggingKt;
        boolean _BOUNDARY;
        int _CREATION;

        /* renamed from: a, reason: collision with root package name */
        boolean f2663a;
        int accessartificialFrame;
        boolean b;
        int c;
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> coroutineBoundary;
        android.graphics.drawable.Drawable[] coroutineCreation;
        android.content.res.ColorStateList d;
        android.graphics.PorterDuff.Mode exchange;
        int getARTIFICIAL_FRAME_PACKAGE_NAME;
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        boolean getInputFormats;
        boolean getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;
        android.graphics.ColorFilter getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        int getOutputSizeshNQ4ISI;
        int getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        boolean getValidOutputFormatsForInputhNQ4ISI;
        android.content.res.Resources init;
        boolean isOutputSupportedFor;
        int isOutputSupportedForhNQ4ISI;
        final androidx.appcompat.graphics.drawable.DrawableContainerCompat kernelVersion;
        boolean release;
        android.graphics.Rect toString;
        int unwrapAs;

        DrawableContainerState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState, androidx.appcompat.graphics.drawable.DrawableContainerCompat drawableContainerCompat, android.content.res.Resources resources) {
            android.content.res.Resources resources2;
            this.release = false;
            this.isOutputSupportedFor = false;
            this.getValidOutputFormatsForInputhNQ4ISI = true;
            this.CoroutineDebuggingKt = 0;
            this.accessartificialFrame = 0;
            this.kernelVersion = drawableContainerCompat;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = drawableContainerState != null ? drawableContainerState.init : null;
            }
            this.init = resources2;
            int Camera2StreamConfigurationMap = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Camera2StreamConfigurationMap(resources, drawableContainerState != null ? drawableContainerState.isOutputSupportedForhNQ4ISI : 0);
            this.isOutputSupportedForhNQ4ISI = Camera2StreamConfigurationMap;
            if (drawableContainerState != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = drawableContainerState.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = drawableContainerState.getOutputSizes;
                this.getHighSpeedVideoSizesFor = true;
                this.getHighSpeedVideoSizes = true;
                this.release = drawableContainerState.release;
                this.isOutputSupportedFor = drawableContainerState.isOutputSupportedFor;
                this.getValidOutputFormatsForInputhNQ4ISI = drawableContainerState.getValidOutputFormatsForInputhNQ4ISI;
                this.b = drawableContainerState.b;
                this._CREATION = drawableContainerState._CREATION;
                this.CoroutineDebuggingKt = drawableContainerState.CoroutineDebuggingKt;
                this.accessartificialFrame = drawableContainerState.accessartificialFrame;
                this.getHighSpeedVideoFpsRanges = drawableContainerState.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDurationlomOqCM = drawableContainerState.getOutputMinFrameDurationlomOqCM;
                this.ArtificialStackFrames = drawableContainerState.ArtificialStackFrames;
                this.d = drawableContainerState.d;
                this.exchange = drawableContainerState.exchange;
                this._BOUNDARY = drawableContainerState._BOUNDARY;
                this.f2663a = drawableContainerState.f2663a;
                if (drawableContainerState.isOutputSupportedForhNQ4ISI == Camera2StreamConfigurationMap) {
                    if (drawableContainerState.getInputSizeshNQ4ISI) {
                        this.toString = drawableContainerState.toString != null ? new android.graphics.Rect(drawableContainerState.toString) : null;
                        this.getInputSizeshNQ4ISI = true;
                    }
                    if (drawableContainerState.getOutputFormats) {
                        this.unwrapAs = drawableContainerState.unwrapAs;
                        this.getOutputStallDurationlomOqCM = drawableContainerState.getOutputStallDurationlomOqCM;
                        this.getOutputStallDuration = drawableContainerState.getOutputStallDuration;
                        this.getOutputSizeshNQ4ISI = drawableContainerState.getOutputSizeshNQ4ISI;
                        this.getOutputFormats = true;
                    }
                }
                if (drawableContainerState.getInputFormats) {
                    this.c = drawableContainerState.c;
                    this.getInputFormats = true;
                }
                if (drawableContainerState.getOutputMinFrameDuration) {
                    this.AMEXKernel = drawableContainerState.AMEXKernel;
                    this.getOutputMinFrameDuration = true;
                }
                android.graphics.drawable.Drawable[] drawableArr = drawableContainerState.coroutineCreation;
                this.coroutineCreation = new android.graphics.drawable.Drawable[drawableArr.length];
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = drawableContainerState.getARTIFICIAL_FRAME_PACKAGE_NAME;
                android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> sparseArray = drawableContainerState.coroutineBoundary;
                if (sparseArray != null) {
                    this.coroutineBoundary = sparseArray.clone();
                } else {
                    this.coroutineBoundary = new android.util.SparseArray<>(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
                }
                int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                for (int i2 = 0; i2 < i; i2++) {
                    android.graphics.drawable.Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.coroutineBoundary.put(i2, constantState);
                        } else {
                            this.coroutineCreation[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.coroutineCreation = new android.graphics.drawable.Drawable[10];
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.getHighResolutionOutputSizeshNQ4ISI | this.getOutputSizes;
        }

        public final int getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable) {
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (i >= this.coroutineCreation.length) {
                getHighResolutionOutputSizeshNQ4ISI(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.kernelVersion);
            this.coroutineCreation[i] = drawable;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME++;
            this.getOutputSizes = drawable.getChangingConfigurations() | this.getOutputSizes;
            getOutputMinFrameDurationlomOqCM();
            this.toString = null;
            this.getInputSizeshNQ4ISI = false;
            this.getOutputFormats = false;
            this.getHighSpeedVideoSizesFor = false;
            return i;
        }

        void getOutputMinFrameDurationlomOqCM() {
            this.getInputFormats = false;
            this.getOutputMinFrameDuration = false;
        }

        final int Camera2StreamConfigurationMap() {
            return this.coroutineCreation.length;
        }

        private void getOutputStallDuration() {
            android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> sparseArray = this.coroutineBoundary;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.coroutineCreation[this.coroutineBoundary.keyAt(i)] = Camera2StreamConfigurationMap(this.coroutineBoundary.valueAt(i).newDrawable(this.init));
                }
                this.coroutineBoundary = null;
            }
        }

        private android.graphics.drawable.Drawable Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, this._CREATION);
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            mutate.setCallback(this.kernelVersion);
            return mutate;
        }

        public final int getHighSpeedVideoFpsRanges() {
            return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }

        public final android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges(int i) {
            int indexOfKey;
            android.graphics.drawable.Drawable drawable = this.coroutineCreation[i];
            if (drawable != null) {
                return drawable;
            }
            android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> sparseArray = this.coroutineBoundary;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            android.graphics.drawable.Drawable Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.coroutineBoundary.valueAt(indexOfKey).newDrawable(this.init));
            this.coroutineCreation[i] = Camera2StreamConfigurationMap;
            this.coroutineBoundary.removeAt(indexOfKey);
            if (this.coroutineBoundary.size() == 0) {
                this.coroutineBoundary = null;
            }
            return Camera2StreamConfigurationMap;
        }

        final boolean getHighSpeedVideoFpsRangesFor(int i, int i2) {
            int i3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean layoutDirection = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, i);
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this._CREATION = i;
            return z;
        }

        final void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources resources) {
            if (resources != null) {
                this.init = resources;
                int Camera2StreamConfigurationMap = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Camera2StreamConfigurationMap(resources, this.isOutputSupportedForhNQ4ISI);
                int i = this.isOutputSupportedForhNQ4ISI;
                this.isOutputSupportedForhNQ4ISI = Camera2StreamConfigurationMap;
                if (i != Camera2StreamConfigurationMap) {
                    this.getOutputFormats = false;
                    this.getInputSizeshNQ4ISI = false;
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources.Theme theme) {
            if (theme != null) {
                getOutputStallDuration();
                int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
                for (int i2 = 0; i2 < i; i2++) {
                    android.graphics.drawable.Drawable drawable = drawableArr[i2];
                    if (drawable != null && androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(drawable)) {
                        androidx.core.graphics.drawable.DrawableCompat.applyTheme(drawableArr[i2], theme);
                        this.getOutputSizes |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.Camera2StreamConfigurationMap(theme));
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            for (int i2 = 0; i2 < i; i2++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(drawable)) {
                        return true;
                    }
                } else {
                    android.graphics.drawable.Drawable.ConstantState constantState = this.coroutineBoundary.get(i2);
                    if (constantState != null && androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getHighResolutionOutputSizeshNQ4ISI(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        void getHighSpeedVideoFpsRangesFor() {
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            for (int i2 = 0; i2 < i; i2++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.b = true;
        }

        public final void getHighSpeedVideoSizes(boolean z) {
            this.release = z;
        }

        public final android.graphics.Rect getInputFormats() {
            android.graphics.Rect rect = null;
            if (this.release) {
                return null;
            }
            android.graphics.Rect rect2 = this.toString;
            if (rect2 != null || this.getInputSizeshNQ4ISI) {
                return rect2;
            }
            getOutputStallDuration();
            android.graphics.Rect rect3 = new android.graphics.Rect();
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new android.graphics.Rect(0, 0, 0, 0);
                    }
                    if (rect3.left > rect.left) {
                        rect.left = rect3.left;
                    }
                    if (rect3.top > rect.top) {
                        rect.top = rect3.top;
                    }
                    if (rect3.right > rect.right) {
                        rect.right = rect3.right;
                    }
                    if (rect3.bottom > rect.bottom) {
                        rect.bottom = rect3.bottom;
                    }
                }
            }
            this.getInputSizeshNQ4ISI = true;
            this.toString = rect;
            return rect;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            this.isOutputSupportedFor = z;
        }

        public final boolean getOutputStallDurationlomOqCM() {
            return this.isOutputSupportedFor;
        }

        public final int getOutputMinFrameDuration() {
            if (!this.getOutputFormats) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return this.unwrapAs;
        }

        public final int getHighSpeedVideoSizesFor() {
            if (!this.getOutputFormats) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return this.getOutputStallDurationlomOqCM;
        }

        public final int getInputSizeshNQ4ISI() {
            if (!this.getOutputFormats) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return this.getOutputStallDuration;
        }

        public final int getOutputFormats() {
            if (!this.getOutputFormats) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return this.getOutputSizeshNQ4ISI;
        }

        protected void getHighResolutionOutputSizeshNQ4ISI() {
            this.getOutputFormats = true;
            getOutputStallDuration();
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            this.getOutputStallDurationlomOqCM = -1;
            this.unwrapAs = -1;
            this.getOutputSizeshNQ4ISI = 0;
            this.getOutputStallDuration = 0;
            for (int i2 = 0; i2 < i; i2++) {
                android.graphics.drawable.Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.unwrapAs) {
                    this.unwrapAs = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.getOutputStallDurationlomOqCM) {
                    this.getOutputStallDurationlomOqCM = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.getOutputStallDuration) {
                    this.getOutputStallDuration = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.getOutputSizeshNQ4ISI) {
                    this.getOutputSizeshNQ4ISI = minimumHeight;
                }
            }
        }

        public final void getHighSpeedVideoSizes(int i) {
            this.CoroutineDebuggingKt = i;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.accessartificialFrame = i;
        }

        public final int getOutputSizes() {
            if (this.getInputFormats) {
                return this.c;
            }
            getOutputStallDuration();
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = android.graphics.drawable.Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.c = opacity;
            this.getInputFormats = true;
            return opacity;
        }

        public final boolean getOutputSizeshNQ4ISI() {
            if (this.getOutputMinFrameDuration) {
                return this.AMEXKernel;
            }
            getOutputStallDuration();
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                }
                i2++;
            }
            this.AMEXKernel = z;
            this.getOutputMinFrameDuration = true;
            return z;
        }

        public void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[i2];
            android.graphics.drawable.Drawable[] drawableArr2 = this.coroutineCreation;
            if (drawableArr2 != null) {
                java.lang.System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.coroutineCreation = drawableArr;
        }

        public boolean getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoSizesFor) {
                return this.getHighSpeedVideoSizes;
            }
            getOutputStallDuration();
            this.getHighSpeedVideoSizesFor = true;
            int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            android.graphics.drawable.Drawable[] drawableArr = this.coroutineCreation;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.getHighSpeedVideoSizes = false;
                    return false;
                }
            }
            this.getHighSpeedVideoSizes = true;
            return true;
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        this.getInputFormats = drawableContainerState;
        int i = this.getHighSpeedVideoFpsRanges;
        if (i >= 0) {
            android.graphics.drawable.Drawable highSpeedVideoFpsRanges = drawableContainerState.getHighSpeedVideoFpsRanges(i);
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges != null) {
                getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            }
        }
        this.getOutputStallDuration = null;
    }

    static class BlockInvalidateCallback implements android.graphics.drawable.Drawable.Callback {
        private android.graphics.drawable.Drawable.Callback getHighSpeedVideoFpsRangesFor;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        }

        BlockInvalidateCallback() {
        }

        public androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback Camera2StreamConfigurationMap(android.graphics.drawable.Drawable.Callback callback) {
            this.getHighSpeedVideoFpsRangesFor = callback;
            return this;
        }

        public android.graphics.drawable.Drawable.Callback getHighResolutionOutputSizeshNQ4ISI() {
            android.graphics.drawable.Drawable.Callback callback = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
            android.graphics.drawable.Drawable.Callback callback = this.getHighSpeedVideoFpsRangesFor;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
            android.graphics.drawable.Drawable.Callback callback = this.getHighSpeedVideoFpsRangesFor;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static int Camera2StreamConfigurationMap(android.content.res.Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        public static boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static android.content.res.Resources Camera2StreamConfigurationMap(android.content.res.Resources.Theme theme) {
            return theme.getResources();
        }

        public static void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable, android.graphics.Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
