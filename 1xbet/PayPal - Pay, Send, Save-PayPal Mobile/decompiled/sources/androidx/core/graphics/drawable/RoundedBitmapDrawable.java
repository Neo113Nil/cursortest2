package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
public abstract class RoundedBitmapDrawable extends android.graphics.drawable.Drawable {
    private int Camera2StreamConfigurationMap;
    private final android.graphics.BitmapShader getHighResolutionOutputSizeshNQ4ISI;
    final android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizesFor;
    private int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private int getInputFormats = 119;
    private final android.graphics.Paint getOutputSizeshNQ4ISI = new android.graphics.Paint(3);
    private final android.graphics.Matrix getOutputStallDuration = new android.graphics.Matrix();
    final android.graphics.Rect getHighSpeedVideoFpsRanges = new android.graphics.Rect();
    private final android.graphics.RectF getOutputMinFrameDuration = new android.graphics.RectF();
    private boolean getHighSpeedVideoSizes = true;

    private static boolean getHighResolutionOutputSizeshNQ4ISI(float f) {
        return f > 0.05f;
    }

    public final android.graphics.Paint getPaint() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private void Camera2StreamConfigurationMap() {
        this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getScaledWidth(this.getOutputMinFrameDurationlomOqCM);
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.getScaledHeight(this.getOutputMinFrameDurationlomOqCM);
    }

    public void setTargetDensity(android.graphics.Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(android.util.DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (this.getOutputMinFrameDurationlomOqCM != i) {
            if (i == 0) {
                i = 160;
            }
            this.getOutputMinFrameDurationlomOqCM = i;
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                Camera2StreamConfigurationMap();
            }
            invalidateSelf();
        }
    }

    public int getGravity() {
        return this.getInputFormats;
    }

    public void setGravity(int i) {
        if (this.getInputFormats != i) {
            this.getInputFormats = i;
            this.getHighSpeedVideoSizes = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean hasMipMap() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void setAntiAlias(boolean z) {
        this.getOutputSizeshNQ4ISI.setAntiAlias(z);
        invalidateSelf();
    }

    public boolean hasAntiAlias() {
        return this.getOutputSizeshNQ4ISI.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.getOutputSizeshNQ4ISI.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.getOutputSizeshNQ4ISI.setDither(z);
        invalidateSelf();
    }

    void getHighSpeedVideoFpsRanges(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        throw new java.lang.UnsupportedOperationException();
    }

    void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizes) {
            if (this.getOutputFormats) {
                int min = java.lang.Math.min(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                getHighSpeedVideoFpsRanges(this.getInputFormats, min, min, getBounds(), this.getHighSpeedVideoFpsRanges);
                int min2 = java.lang.Math.min(this.getHighSpeedVideoFpsRanges.width(), this.getHighSpeedVideoFpsRanges.height());
                this.getHighSpeedVideoFpsRanges.inset(java.lang.Math.max(0, (this.getHighSpeedVideoFpsRanges.width() - min2) / 2), java.lang.Math.max(0, (this.getHighSpeedVideoFpsRanges.height() - min2) / 2));
                this.getHighSpeedVideoSizesFor = min2 * 0.5f;
            } else {
                getHighSpeedVideoFpsRanges(this.getInputFormats, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, getBounds(), this.getHighSpeedVideoFpsRanges);
            }
            this.getOutputMinFrameDuration.set(this.getHighSpeedVideoFpsRanges);
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.getOutputStallDuration.setTranslate(this.getOutputMinFrameDuration.left, this.getOutputMinFrameDuration.top);
                this.getOutputStallDuration.preScale(this.getOutputMinFrameDuration.width() / this.getHighSpeedVideoFpsRangesFor.getWidth(), this.getOutputMinFrameDuration.height() / this.getHighSpeedVideoFpsRangesFor.getHeight());
                this.getHighResolutionOutputSizeshNQ4ISI.setLocalMatrix(this.getOutputStallDuration);
                this.getOutputSizeshNQ4ISI.setShader(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            this.getHighSpeedVideoSizes = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.getHighSpeedVideoFpsRangesFor;
        if (bitmap == null) {
            return;
        }
        getHighSpeedVideoSizes();
        if (this.getOutputSizeshNQ4ISI.getShader() == null) {
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI);
            return;
        }
        android.graphics.RectF rectF = this.getOutputMinFrameDuration;
        float f = this.getHighSpeedVideoSizesFor;
        canvas.drawRoundRect(rectF, f, f, this.getOutputSizeshNQ4ISI);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.getOutputSizeshNQ4ISI.getAlpha()) {
            this.getOutputSizeshNQ4ISI.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.getOutputSizeshNQ4ISI.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getOutputSizeshNQ4ISI.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.getOutputSizeshNQ4ISI.getColorFilter();
    }

    public void setCircular(boolean z) {
        this.getOutputFormats = z;
        this.getHighSpeedVideoSizes = true;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI();
            this.getOutputSizeshNQ4ISI.setShader(this.getHighResolutionOutputSizeshNQ4ISI);
            invalidateSelf();
            return;
        }
        setCornerRadius(0.0f);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoSizesFor = java.lang.Math.min(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI) / 2;
    }

    public boolean isCircular() {
        return this.getOutputFormats;
    }

    public void setCornerRadius(float f) {
        if (this.getHighSpeedVideoSizesFor == f) {
            return;
        }
        this.getOutputFormats = false;
        if (getHighResolutionOutputSizeshNQ4ISI(f)) {
            this.getOutputSizeshNQ4ISI.setShader(this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            this.getOutputSizeshNQ4ISI.setShader(null);
        }
        this.getHighSpeedVideoSizesFor = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getHighSpeedVideoSizes = true;
    }

    public float getCornerRadius() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.Bitmap bitmap;
        return (this.getInputFormats != 119 || this.getOutputFormats || (bitmap = this.getHighSpeedVideoFpsRangesFor) == null || bitmap.hasAlpha() || this.getOutputSizeshNQ4ISI.getAlpha() < 255 || getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor)) ? -3 : -1;
    }

    RoundedBitmapDrawable(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        this.getOutputMinFrameDurationlomOqCM = 160;
        if (resources != null) {
            this.getOutputMinFrameDurationlomOqCM = resources.getDisplayMetrics().densityDpi;
        }
        this.getHighSpeedVideoFpsRangesFor = bitmap;
        if (bitmap != null) {
            Camera2StreamConfigurationMap();
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.Camera2StreamConfigurationMap = -1;
            this.getInputSizeshNQ4ISI = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }
}
