package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
class WrappedDrawableApi21 extends androidx.core.graphics.drawable.WrappedDrawableApi14 {
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    WrappedDrawableApi21(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState, android.content.res.Resources resources) {
        super(wrappedDrawableState, resources);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.getHighResolutionOutputSizeshNQ4ISI.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.getHighResolutionOutputSizeshNQ4ISI.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        this.getHighResolutionOutputSizeshNQ4ISI.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDirtyBounds();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (Camera2StreamConfigurationMap()) {
            super.setTintList(colorStateList);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (Camera2StreamConfigurationMap()) {
            super.setTint(i);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (Camera2StreamConfigurationMap()) {
            super.setTintMode(mode);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setTintMode(mode);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14
    protected boolean Camera2StreamConfigurationMap() {
        android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
        return (drawable instanceof android.graphics.drawable.GradientDrawable) || (drawable instanceof android.graphics.drawable.DrawableContainer) || (drawable instanceof android.graphics.drawable.InsetDrawable) || (drawable instanceof android.graphics.drawable.RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        java.lang.reflect.Method method;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null && (method = getHighSpeedVideoSizes) != null) {
            try {
                return ((java.lang.Boolean) method.invoke(this.getHighResolutionOutputSizeshNQ4ISI, new java.lang.Object[0])).booleanValue();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (getHighSpeedVideoSizes == null) {
            try {
                getHighSpeedVideoSizes = android.graphics.drawable.Drawable.class.getDeclaredMethod("isProjected", new java.lang.Class[0]);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
