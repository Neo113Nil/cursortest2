package androidx.cardview.widget;

/* loaded from: classes6.dex */
class RoundRectDrawableWithShadow extends android.graphics.drawable.Drawable {
    static androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper getHighSpeedVideoSizes;
    private static final double getHighSpeedVideoSizesFor = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    float getHighSpeedVideoFpsRanges;
    android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor;
    final int getInputFormats;
    float getInputSizeshNQ4ISI;
    private final android.graphics.RectF getOutputFormats;
    float getOutputMinFrameDuration;
    private android.graphics.Path getOutputSizes;
    private android.graphics.Paint getOutputStallDuration;
    private android.graphics.Paint getOutputStallDurationlomOqCM;
    private float isOutputSupportedForhNQ4ISI;
    private final int toString;
    private final int unwrapAs;
    boolean Camera2StreamConfigurationMap = true;
    boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private boolean getOutputSizeshNQ4ISI = false;
    private android.graphics.Paint getOutputMinFrameDurationlomOqCM = new android.graphics.Paint(5);

    interface RoundRectHelper {
        void getHighSpeedVideoSizes(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    RoundRectDrawableWithShadow(android.content.res.Resources resources, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        this.unwrapAs = resources.getColor(androidx.cardview.R.color.cardview_shadow_start_color);
        this.toString = resources.getColor(androidx.cardview.R.color.cardview_shadow_end_color);
        this.getInputFormats = resources.getDimensionPixelSize(androidx.cardview.R.dimen.cardview_compat_inset_shadow);
        getHighSpeedVideoFpsRanges(colorStateList);
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.getOutputStallDurationlomOqCM = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.getHighSpeedVideoFpsRanges = (int) (f + 0.5f);
        this.getOutputFormats = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(this.getOutputStallDurationlomOqCM);
        this.getOutputStallDuration = paint2;
        paint2.setAntiAlias(false);
        getHighSpeedVideoSizes(f2, f3);
    }

    final void getHighSpeedVideoFpsRanges(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.getHighSpeedVideoFpsRangesFor = colorStateList;
        this.getOutputMinFrameDurationlomOqCM.setColor(colorStateList.getColorForState(getState(), this.getHighSpeedVideoFpsRangesFor.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.getOutputMinFrameDurationlomOqCM.setAlpha(i);
        this.getOutputStallDurationlomOqCM.setAlpha(i);
        this.getOutputStallDuration.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.Camera2StreamConfigurationMap = true;
    }

    final void getHighSpeedVideoSizes(float f, float f2) {
        if (f < 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (f2 < 0.0f) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        float f3 = i;
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        if (f3 > f4) {
            if (!this.getOutputSizeshNQ4ISI) {
                this.getOutputSizeshNQ4ISI = true;
            }
            f3 = f4;
        }
        if (this.getInputSizeshNQ4ISI == f3 && this.getOutputMinFrameDuration == f4) {
            return;
        }
        this.getInputSizeshNQ4ISI = f3;
        this.getOutputMinFrameDuration = f4;
        this.isOutputSupportedForhNQ4ISI = (int) ((f3 * 1.5f) + this.getInputFormats + 0.5f);
        this.Camera2StreamConfigurationMap = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        float f = this.getOutputMinFrameDuration;
        int ceil = (int) java.lang.Math.ceil(this.getHighResolutionOutputSizeshNQ4ISI ? (float) ((f * 1.5f) + ((1.0d - getHighSpeedVideoSizesFor) * this.getHighSpeedVideoFpsRanges)) : f * 1.5f);
        float f2 = this.getOutputMinFrameDuration;
        float f3 = this.getHighSpeedVideoFpsRanges;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            f2 = (float) (f2 + ((1.0d - getHighSpeedVideoSizesFor) * f3));
        }
        int ceil2 = (int) java.lang.Math.ceil(f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float getHighSpeedVideoFpsRanges(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - getHighSpeedVideoSizesFor) * f2)) : f * 1.5f;
    }

    static float getHighSpeedVideoSizes(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - getHighSpeedVideoSizesFor) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        android.content.res.ColorStateList colorStateList = this.getHighSpeedVideoFpsRangesFor;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.getOutputMinFrameDurationlomOqCM.getColor() == colorForState) {
            return false;
        }
        this.getOutputMinFrameDurationlomOqCM.setColor(colorForState);
        this.Camera2StreamConfigurationMap = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.getHighSpeedVideoFpsRangesFor;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getOutputMinFrameDurationlomOqCM.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i;
        if (this.Camera2StreamConfigurationMap) {
            android.graphics.Rect bounds = getBounds();
            float f = this.getOutputMinFrameDuration * 1.5f;
            this.getOutputFormats.set(bounds.left + this.getOutputMinFrameDuration, bounds.top + f, bounds.right - this.getOutputMinFrameDuration, bounds.bottom - f);
            float f2 = this.getHighSpeedVideoFpsRanges;
            float f3 = -f2;
            android.graphics.RectF rectF = new android.graphics.RectF(f3, f3, f2, f2);
            android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
            float f4 = -this.isOutputSupportedForhNQ4ISI;
            rectF2.inset(f4, f4);
            android.graphics.Path path = this.getOutputSizes;
            if (path == null) {
                this.getOutputSizes = new android.graphics.Path();
            } else {
                path.reset();
            }
            this.getOutputSizes.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            this.getOutputSizes.moveTo(-this.getHighSpeedVideoFpsRanges, 0.0f);
            this.getOutputSizes.rLineTo(-this.isOutputSupportedForhNQ4ISI, 0.0f);
            this.getOutputSizes.arcTo(rectF2, 180.0f, 90.0f, false);
            this.getOutputSizes.arcTo(rectF, 270.0f, -90.0f, false);
            this.getOutputSizes.close();
            float f5 = this.getHighSpeedVideoFpsRanges;
            float f6 = this.isOutputSupportedForhNQ4ISI;
            android.graphics.Paint paint = this.getOutputStallDurationlomOqCM;
            int i2 = this.unwrapAs;
            paint.setShader(new android.graphics.RadialGradient(0.0f, 0.0f, f5 + f6, new int[]{i2, i2, this.toString}, new float[]{0.0f, f5 / (f6 + f5), 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            android.graphics.Paint paint2 = this.getOutputStallDuration;
            float f7 = -this.getHighSpeedVideoFpsRanges;
            float f8 = this.isOutputSupportedForhNQ4ISI;
            int i3 = this.unwrapAs;
            paint2.setShader(new android.graphics.LinearGradient(0.0f, f7 + f8, 0.0f, f7 - f8, new int[]{i3, i3, this.toString}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.getOutputStallDuration.setAntiAlias(false);
            this.Camera2StreamConfigurationMap = false;
        }
        canvas.translate(0.0f, this.getInputSizeshNQ4ISI / 2.0f);
        float f9 = this.getHighSpeedVideoFpsRanges;
        float f10 = (-f9) - this.isOutputSupportedForhNQ4ISI;
        float f11 = f9 + this.getInputFormats + (this.getInputSizeshNQ4ISI / 2.0f);
        float f12 = f11 * 2.0f;
        boolean z = this.getOutputFormats.width() - f12 > 0.0f;
        boolean z2 = this.getOutputFormats.height() - f12 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.getOutputFormats.left + f11, this.getOutputFormats.top + f11);
        canvas.drawPath(this.getOutputSizes, this.getOutputStallDurationlomOqCM);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f10, this.getOutputFormats.width() - f12, -this.getHighSpeedVideoFpsRanges, this.getOutputStallDuration);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        canvas.translate(this.getOutputFormats.right - f11, this.getOutputFormats.bottom - f11);
        canvas.rotate(180.0f);
        canvas.drawPath(this.getOutputSizes, this.getOutputStallDurationlomOqCM);
        if (z) {
            canvas.drawRect(0.0f, f10, this.getOutputFormats.width() - f12, (-this.getHighSpeedVideoFpsRanges) + this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.getOutputFormats.left + f11, this.getOutputFormats.bottom - f11);
        canvas.rotate(270.0f);
        canvas.drawPath(this.getOutputSizes, this.getOutputStallDurationlomOqCM);
        if (z2) {
            canvas.drawRect(0.0f, f10, this.getOutputFormats.height() - f12, -this.getHighSpeedVideoFpsRanges, this.getOutputStallDuration);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.getOutputFormats.right - f11, this.getOutputFormats.top + f11);
        canvas.rotate(90.0f);
        canvas.drawPath(this.getOutputSizes, this.getOutputStallDurationlomOqCM);
        if (z2) {
            canvas.drawRect(0.0f, f10, this.getOutputFormats.height() - f12, -this.getHighSpeedVideoFpsRanges, this.getOutputStallDuration);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.getInputSizeshNQ4ISI) / 2.0f);
        getHighSpeedVideoSizes.getHighSpeedVideoSizes(canvas, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDurationlomOqCM);
    }
}
