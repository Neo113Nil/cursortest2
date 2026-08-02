package androidx.appcompat.graphics.drawable;

/* loaded from: classes5.dex */
public class DrawerArrowDrawable extends android.graphics.drawable.Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float getHighSpeedVideoSizes = (float) java.lang.Math.toRadians(45.0d);
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private final android.graphics.Paint getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private float getInputSizeshNQ4ISI;
    private final android.graphics.Path getOutputFormats;
    private float getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private final int getOutputStallDuration;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ArrowDirection {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public DrawerArrowDrawable(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoSizesFor = paint;
        this.getOutputFormats = new android.graphics.Path();
        this.getOutputSizes = false;
        this.getInputFormats = 2;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, androidx.appcompat.R.styleable.DrawerArrowToggle, androidx.appcompat.R.attr.drawerArrowStyle, androidx.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(androidx.appcompat.R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(java.lang.Math.round(obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.getOutputStallDuration = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.round(obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.Camera2StreamConfigurationMap = java.lang.Math.round(obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public void setArrowHeadLength(float f) {
        if (this.Camera2StreamConfigurationMap != f) {
            this.Camera2StreamConfigurationMap = f;
            invalidateSelf();
        }
    }

    public float getArrowHeadLength() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setArrowShaftLength(float f) {
        if (this.getHighSpeedVideoFpsRanges != f) {
            this.getHighSpeedVideoFpsRanges = f;
            invalidateSelf();
        }
    }

    public float getArrowShaftLength() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getBarLength() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setBarLength(float f) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (i != this.getHighSpeedVideoSizesFor.getColor()) {
            this.getHighSpeedVideoSizesFor.setColor(i);
            invalidateSelf();
        }
    }

    public int getColor() {
        return this.getHighSpeedVideoSizesFor.getColor();
    }

    public void setBarThickness(float f) {
        if (this.getHighSpeedVideoSizesFor.getStrokeWidth() != f) {
            this.getHighSpeedVideoSizesFor.setStrokeWidth(f);
            this.getInputSizeshNQ4ISI = (float) ((f / 2.0f) * java.lang.Math.cos(getHighSpeedVideoSizes));
            invalidateSelf();
        }
    }

    public float getBarThickness() {
        return this.getHighSpeedVideoSizesFor.getStrokeWidth();
    }

    public float getGapSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setGapSize(float f) {
        if (f != this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = f;
            invalidateSelf();
        }
    }

    public void setDirection(int i) {
        if (i != this.getInputFormats) {
            this.getInputFormats = i;
            invalidateSelf();
        }
    }

    public boolean isSpinEnabled() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setSpinEnabled(boolean z) {
        if (this.getOutputMinFrameDurationlomOqCM != z) {
            this.getOutputMinFrameDurationlomOqCM = z;
            invalidateSelf();
        }
    }

    public int getDirection() {
        return this.getInputFormats;
    }

    public void setVerticalMirror(boolean z) {
        if (this.getOutputSizes != z) {
            this.getOutputSizes = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int i = this.getInputFormats;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 0 : androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f = this.Camera2StreamConfigurationMap;
        float sqrt = (float) java.lang.Math.sqrt(f * f * 2.0f);
        float f2 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f3 = this.getOutputMinFrameDuration;
        float f4 = ((sqrt - f2) * f3) + f2;
        float f5 = f2 + ((this.getHighSpeedVideoFpsRanges - f2) * f3);
        float round = java.lang.Math.round(((this.getInputSizeshNQ4ISI - 0.0f) * f3) + 0.0f);
        float f6 = getHighSpeedVideoSizes;
        float f7 = this.getOutputMinFrameDuration;
        float f8 = ((f6 - 0.0f) * f7) + 0.0f;
        float f9 = z ? 0.0f : -180.0f;
        float f10 = f9 + (((z ? 180.0f : 0.0f) - f9) * f7);
        double d = f4;
        boolean z2 = z;
        double d2 = f8;
        float round2 = java.lang.Math.round(java.lang.Math.cos(d2) * d);
        float round3 = java.lang.Math.round(d * java.lang.Math.sin(d2));
        this.getOutputFormats.rewind();
        float strokeWidth = this.getHighSpeedVideoFpsRangesFor + this.getHighSpeedVideoSizesFor.getStrokeWidth();
        float f11 = strokeWidth + (((-this.getInputSizeshNQ4ISI) - strokeWidth) * this.getOutputMinFrameDuration);
        float f12 = (-f5) / 2.0f;
        this.getOutputFormats.moveTo(f12 + round, 0.0f);
        this.getOutputFormats.rLineTo(f5 - (round * 2.0f), 0.0f);
        this.getOutputFormats.moveTo(f12, f11);
        this.getOutputFormats.rLineTo(round2, round3);
        this.getOutputFormats.moveTo(f12, -f11);
        this.getOutputFormats.rLineTo(round2, -round3);
        this.getOutputFormats.close();
        canvas.save();
        float strokeWidth2 = this.getHighSpeedVideoSizesFor.getStrokeWidth();
        float height = bounds.height();
        canvas.translate(bounds.centerX(), ((((int) ((height - (3.0f * strokeWidth2)) - (2.0f * r7))) / 4) * 2) + (strokeWidth2 * 1.5f) + this.getHighSpeedVideoFpsRangesFor);
        if (this.getOutputMinFrameDurationlomOqCM) {
            canvas.rotate(f10 * (this.getOutputSizes ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.getOutputFormats, this.getHighSpeedVideoSizesFor);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.getHighSpeedVideoSizesFor.getAlpha()) {
            this.getHighSpeedVideoSizesFor.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getHighSpeedVideoSizesFor.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.getOutputStallDuration;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.getOutputStallDuration;
    }

    public float getProgress() {
        return this.getOutputMinFrameDuration;
    }

    public void setProgress(float f) {
        if (this.getOutputMinFrameDuration != f) {
            this.getOutputMinFrameDuration = f;
            invalidateSelf();
        }
    }

    public final android.graphics.Paint getPaint() {
        return this.getHighSpeedVideoSizesFor;
    }
}
