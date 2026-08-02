package androidx.cardview.widget;

/* loaded from: classes6.dex */
class RoundRectDrawable extends android.graphics.drawable.Drawable {
    float Camera2StreamConfigurationMap;
    android.content.res.ColorStateList getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoSizes;
    private android.graphics.PorterDuffColorFilter getHighSpeedVideoSizesFor;
    private final android.graphics.RectF getInputFormats;
    private android.content.res.ColorStateList getInputSizeshNQ4ISI;
    private final android.graphics.Rect getOutputMinFrameDuration;
    boolean getHighSpeedVideoFpsRangesFor = false;
    boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private android.graphics.PorterDuff.Mode getOutputSizes = android.graphics.PorterDuff.Mode.SRC_IN;
    private final android.graphics.Paint getOutputFormats = new android.graphics.Paint(5);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    RoundRectDrawable(android.content.res.ColorStateList colorStateList, float f) {
        this.Camera2StreamConfigurationMap = f;
        getHighSpeedVideoSizes(colorStateList);
        this.getInputFormats = new android.graphics.RectF();
        this.getOutputMinFrameDuration = new android.graphics.Rect();
    }

    final void getHighSpeedVideoSizes(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.getHighSpeedVideoFpsRanges = colorStateList;
        this.getOutputFormats.setColor(colorStateList.getColorForState(getState(), this.getHighSpeedVideoFpsRanges.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z;
        android.graphics.Paint paint = this.getOutputFormats;
        if (this.getHighSpeedVideoSizesFor == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.getHighSpeedVideoSizesFor);
            z = true;
        }
        android.graphics.RectF rectF = this.getInputFormats;
        float f = this.Camera2StreamConfigurationMap;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    final void Camera2StreamConfigurationMap(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.getInputFormats.set(rect.left, rect.top, rect.right, rect.bottom);
        this.getOutputMinFrameDuration.set(rect);
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getOutputMinFrameDuration.inset((int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI)), (int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI)));
            this.getInputFormats.set(this.getOutputMinFrameDuration);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        Camera2StreamConfigurationMap(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.getOutputFormats.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getOutputFormats.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.getInputSizeshNQ4ISI = colorStateList;
        android.graphics.PorterDuff.Mode mode = this.getOutputSizes;
        this.getHighSpeedVideoSizesFor = (colorStateList == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getOutputSizes = mode;
        android.content.res.ColorStateList colorStateList = this.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = (colorStateList == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.content.res.ColorStateList colorStateList = this.getHighSpeedVideoFpsRanges;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.getOutputFormats.getColor();
        if (z) {
            this.getOutputFormats.setColor(colorForState);
        }
        android.content.res.ColorStateList colorStateList2 = this.getInputSizeshNQ4ISI;
        if (colorStateList2 == null || (mode = this.getOutputSizes) == null) {
            return z;
        }
        this.getHighSpeedVideoSizesFor = (colorStateList2 == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.getInputSizeshNQ4ISI;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList2 = this.getHighSpeedVideoFpsRanges;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }
}
