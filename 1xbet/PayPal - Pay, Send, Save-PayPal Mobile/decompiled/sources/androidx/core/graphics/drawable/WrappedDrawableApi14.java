package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
class WrappedDrawableApi14 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, androidx.core.graphics.drawable.WrappedDrawable, androidx.core.graphics.drawable.TintAwareDrawable {
    static final android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRanges = android.graphics.PorterDuff.Mode.SRC_IN;
    androidx.core.graphics.drawable.WrappedDrawableState Camera2StreamConfigurationMap;
    android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private android.graphics.PorterDuff.Mode getHighSpeedVideoSizesFor;
    private boolean getOutputMinFrameDuration;

    protected boolean Camera2StreamConfigurationMap() {
        return true;
    }

    WrappedDrawableApi14(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState, android.content.res.Resources resources) {
        this.Camera2StreamConfigurationMap = wrappedDrawableState;
        getHighSpeedVideoFpsRangesFor(resources);
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.res.Resources resources) {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.Camera2StreamConfigurationMap;
        if (wrappedDrawableState == null || wrappedDrawableState.Camera2StreamConfigurationMap == null) {
            return;
        }
        setWrappedDrawable(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.newDrawable(resources));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.getHighResolutionOutputSizeshNQ4ISI.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.getHighResolutionOutputSizeshNQ4ISI.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.Camera2StreamConfigurationMap;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.getHighResolutionOutputSizeshNQ4ISI.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getHighResolutionOutputSizeshNQ4ISI.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState;
        android.content.res.ColorStateList colorStateList = (!Camera2StreamConfigurationMap() || (wrappedDrawableState = this.Camera2StreamConfigurationMap) == null) ? null : wrappedDrawableState.getHighSpeedVideoSizes;
        return (colorStateList != null && colorStateList.isStateful()) || this.getHighResolutionOutputSizeshNQ4ISI.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return getHighSpeedVideoFpsRanges(iArr) || this.getHighResolutionOutputSizeshNQ4ISI.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.getHighResolutionOutputSizeshNQ4ISI.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.getHighResolutionOutputSizeshNQ4ISI, z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.Camera2StreamConfigurationMap;
        if (wrappedDrawableState == null || wrappedDrawableState.Camera2StreamConfigurationMap == null) {
            return null;
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = getChangingConfigurations();
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.getOutputMinFrameDuration && super.mutate() == this) {
            this.Camera2StreamConfigurationMap = getHighSpeedVideoSizes();
            android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
            if (drawable != null) {
                drawable.mutate();
            }
            androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.Camera2StreamConfigurationMap;
            if (wrappedDrawableState != null) {
                android.graphics.drawable.Drawable drawable2 = this.getHighResolutionOutputSizeshNQ4ISI;
                wrappedDrawableState.Camera2StreamConfigurationMap = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.getOutputMinFrameDuration = true;
        }
        return this;
    }

    private androidx.core.graphics.drawable.WrappedDrawableState getHighSpeedVideoSizes() {
        return new androidx.core.graphics.drawable.WrappedDrawableState(this.Camera2StreamConfigurationMap);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes = colorStateList;
        getHighSpeedVideoFpsRanges(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = mode;
        getHighSpeedVideoFpsRanges(getState());
    }

    private boolean getHighSpeedVideoFpsRanges(int[] iArr) {
        if (!Camera2StreamConfigurationMap()) {
            return false;
        }
        android.content.res.ColorStateList colorStateList = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        android.graphics.PorterDuff.Mode mode = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.getHighSpeedVideoFpsRangesFor || colorForState != this.getHighSpeedVideoSizes || mode != this.getHighSpeedVideoSizesFor) {
                setColorFilter(colorForState, mode);
                this.getHighSpeedVideoSizes = colorForState;
                this.getHighSpeedVideoSizesFor = mode;
                this.getHighSpeedVideoFpsRangesFor = true;
                return true;
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final android.graphics.drawable.Drawable getWrappedDrawable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.Camera2StreamConfigurationMap;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.Camera2StreamConfigurationMap = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
