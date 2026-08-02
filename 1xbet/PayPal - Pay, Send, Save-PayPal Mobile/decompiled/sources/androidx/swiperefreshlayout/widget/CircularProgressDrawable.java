package androidx.swiperefreshlayout.widget;

/* loaded from: classes7.dex */
public class CircularProgressDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    public static final int DEFAULT = 1;
    public static final int LARGE = 0;
    float getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    private final androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring getInputFormats;
    private android.animation.Animator getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private android.content.res.Resources getOutputMinFrameDuration;
    private static final android.view.animation.Interpolator getHighResolutionOutputSizeshNQ4ISI = new android.view.animation.LinearInterpolator();
    private static final android.view.animation.Interpolator Camera2StreamConfigurationMap = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    private static final int[] getHighSpeedVideoFpsRanges = {-16777216};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ProgressDrawableSize {
    }

    private static int getHighSpeedVideoFpsRanges(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r5))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CircularProgressDrawable(android.content.Context context) {
        this.getOutputMinFrameDuration = ((android.content.Context) androidx.core.util.Preconditions.checkNotNull(context)).getResources();
        final androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = new androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring();
        this.getInputFormats = ring;
        ring.getOutputFormats = getHighSpeedVideoFpsRanges;
        ring.getOutputMinFrameDuration = 0;
        ring.getInputSizeshNQ4ISI = ring.getOutputFormats[0];
        setStrokeWidth(2.5f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.getHighSpeedVideoFpsRanges(floatValue, ring);
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoSizes(floatValue, ring, false);
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(getHighResolutionOutputSizeshNQ4ISI);
        ofFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoFpsRangesFor = 0.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoSizes(1.0f, ring, true);
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring2 = ring;
                ring2.isOutputSupportedForhNQ4ISI = ring2.unwrapAs;
                ring2.getValidOutputFormatsForInputhNQ4ISI = ring2.getOutputSizes;
                ring2.isOutputSupportedFor = ring2.getOutputMinFrameDurationlomOqCM;
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring3 = ring;
                int length = (ring3.getOutputMinFrameDuration + 1) % ring3.getOutputFormats.length;
                ring3.getOutputMinFrameDuration = length;
                ring3.getInputSizeshNQ4ISI = ring3.getOutputFormats[length];
                if (androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoSizes) {
                    androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoSizes = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring4 = ring;
                    if (ring4.getOutputStallDurationlomOqCM) {
                        ring4.getOutputStallDurationlomOqCM = false;
                        return;
                    }
                    return;
                }
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.getHighSpeedVideoFpsRangesFor += 1.0f;
            }
        });
        this.getInputSizeshNQ4ISI = ofFloat;
    }

    private void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        float f5 = this.getOutputMinFrameDuration.getDisplayMetrics().density;
        float f6 = f2 * f5;
        ring.toString = f6;
        ring.getOutputStallDuration.setStrokeWidth(f6);
        ring.getOutputSizeshNQ4ISI = f * f5;
        ring.getOutputMinFrameDuration = 0;
        ring.getInputSizeshNQ4ISI = ring.getOutputFormats[0];
        ring.getInputFormats = (int) (f3 * f5);
        ring.getHighSpeedVideoSizes = (int) (f4 * f5);
    }

    public void setStyle(int i) {
        if (i == 0) {
            getHighSpeedVideoFpsRanges(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            getHighSpeedVideoFpsRanges(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public float getStrokeWidth() {
        return this.getInputFormats.toString;
    }

    public void setStrokeWidth(float f) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        ring.toString = f;
        ring.getOutputStallDuration.setStrokeWidth(f);
        invalidateSelf();
    }

    public float getCenterRadius() {
        return this.getInputFormats.getOutputSizeshNQ4ISI;
    }

    public void setCenterRadius(float f) {
        this.getInputFormats.getOutputSizeshNQ4ISI = f;
        invalidateSelf();
    }

    public void setStrokeCap(android.graphics.Paint.Cap cap) {
        this.getInputFormats.getOutputStallDuration.setStrokeCap(cap);
        invalidateSelf();
    }

    public android.graphics.Paint.Cap getStrokeCap() {
        return this.getInputFormats.getOutputStallDuration.getStrokeCap();
    }

    public float getArrowWidth() {
        return this.getInputFormats.getInputFormats;
    }

    public float getArrowHeight() {
        return this.getInputFormats.getHighSpeedVideoSizes;
    }

    public void setArrowDimensions(float f, float f2) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        ring.getInputFormats = (int) f;
        ring.getHighSpeedVideoSizes = (int) f2;
        invalidateSelf();
    }

    public boolean getArrowEnabled() {
        return this.getInputFormats.getOutputStallDurationlomOqCM;
    }

    public void setArrowEnabled(boolean z) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        if (ring.getOutputStallDurationlomOqCM != z) {
            ring.getOutputStallDurationlomOqCM = z;
        }
        invalidateSelf();
    }

    public float getArrowScale() {
        return this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setArrowScale(float f) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        if (f != ring.getHighResolutionOutputSizeshNQ4ISI) {
            ring.getHighResolutionOutputSizeshNQ4ISI = f;
        }
        invalidateSelf();
    }

    public float getStartTrim() {
        return this.getInputFormats.unwrapAs;
    }

    public float getEndTrim() {
        return this.getInputFormats.getOutputSizes;
    }

    public void setStartEndTrim(float f, float f2) {
        this.getInputFormats.unwrapAs = f;
        this.getInputFormats.getOutputSizes = f2;
        invalidateSelf();
    }

    public float getProgressRotation() {
        return this.getInputFormats.getOutputMinFrameDurationlomOqCM;
    }

    public void setProgressRotation(float f) {
        this.getInputFormats.getOutputMinFrameDurationlomOqCM = f;
        invalidateSelf();
    }

    public int getBackgroundColor() {
        return this.getInputFormats.getHighSpeedVideoSizesFor.getColor();
    }

    public void setBackgroundColor(int i) {
        this.getInputFormats.getHighSpeedVideoSizesFor.setColor(i);
        invalidateSelf();
    }

    public int[] getColorSchemeColors() {
        return this.getInputFormats.getOutputFormats;
    }

    public void setColorSchemeColors(int... iArr) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        ring.getOutputFormats = iArr;
        ring.getOutputMinFrameDuration = 0;
        ring.getInputSizeshNQ4ISI = ring.getOutputFormats[0];
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring2 = this.getInputFormats;
        ring2.getOutputMinFrameDuration = 0;
        ring2.getInputSizeshNQ4ISI = ring2.getOutputFormats[0];
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.getOutputFormats, bounds.exactCenterX(), bounds.exactCenterY());
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        android.graphics.RectF rectF = ring.ArtificialStackFrames;
        float f = ring.getOutputSizeshNQ4ISI;
        float f2 = (ring.toString / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (java.lang.Math.min(bounds.width(), bounds.height()) / 2.0f) - java.lang.Math.max((ring.getInputFormats * ring.getHighResolutionOutputSizeshNQ4ISI) / 2.0f, ring.toString / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = ring.unwrapAs;
        float f4 = ring.getOutputMinFrameDurationlomOqCM;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((ring.getOutputSizes + f4) * 360.0f) - f5;
        ring.getOutputStallDuration.setColor(ring.getInputSizeshNQ4ISI);
        ring.getOutputStallDuration.setAlpha(ring.getHighSpeedVideoFpsRangesFor);
        float f7 = ring.toString / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ring.getHighSpeedVideoSizesFor);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, ring.getOutputStallDuration);
        if (ring.getOutputStallDurationlomOqCM) {
            android.graphics.Path path = ring.Camera2StreamConfigurationMap;
            if (path == null) {
                android.graphics.Path path2 = new android.graphics.Path();
                ring.Camera2StreamConfigurationMap = path2;
                path2.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (ring.getInputFormats * ring.getHighResolutionOutputSizeshNQ4ISI) / 2.0f;
            ring.Camera2StreamConfigurationMap.moveTo(0.0f, 0.0f);
            ring.Camera2StreamConfigurationMap.lineTo(ring.getInputFormats * ring.getHighResolutionOutputSizeshNQ4ISI, 0.0f);
            android.graphics.Path path3 = ring.Camera2StreamConfigurationMap;
            float f10 = ring.getInputFormats;
            float f11 = ring.getHighResolutionOutputSizeshNQ4ISI;
            path3.lineTo((f10 * f11) / 2.0f, ring.getHighSpeedVideoSizes * f11);
            ring.Camera2StreamConfigurationMap.offset((min + rectF.centerX()) - f9, rectF.centerY() + (ring.toString / 2.0f));
            ring.Camera2StreamConfigurationMap.close();
            ring.getHighSpeedVideoFpsRanges.setColor(ring.getInputSizeshNQ4ISI);
            ring.getHighSpeedVideoFpsRanges.setAlpha(ring.getHighSpeedVideoFpsRangesFor);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ring.Camera2StreamConfigurationMap, ring.getHighSpeedVideoFpsRanges);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.getInputFormats.getHighSpeedVideoFpsRangesFor = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.getInputFormats.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getInputFormats.getOutputStallDuration.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.getInputSizeshNQ4ISI.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.getInputSizeshNQ4ISI.cancel();
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        ring.isOutputSupportedForhNQ4ISI = ring.unwrapAs;
        ring.getValidOutputFormatsForInputhNQ4ISI = ring.getOutputSizes;
        ring.isOutputSupportedFor = ring.getOutputMinFrameDurationlomOqCM;
        if (this.getInputFormats.getOutputSizes != this.getInputFormats.unwrapAs) {
            this.getHighSpeedVideoSizes = true;
            this.getInputSizeshNQ4ISI.setDuration(666L);
            this.getInputSizeshNQ4ISI.start();
            return;
        }
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring2 = this.getInputFormats;
        ring2.getOutputMinFrameDuration = 0;
        ring2.getInputSizeshNQ4ISI = ring2.getOutputFormats[0];
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring3 = this.getInputFormats;
        ring3.isOutputSupportedForhNQ4ISI = 0.0f;
        ring3.getValidOutputFormatsForInputhNQ4ISI = 0.0f;
        ring3.isOutputSupportedFor = 0.0f;
        ring3.unwrapAs = 0.0f;
        ring3.getOutputSizes = 0.0f;
        ring3.getOutputMinFrameDurationlomOqCM = 0.0f;
        this.getInputSizeshNQ4ISI.setDuration(1332L);
        this.getInputSizeshNQ4ISI.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.getInputSizeshNQ4ISI.cancel();
        this.getOutputFormats = 0.0f;
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.getInputFormats;
        if (ring.getOutputStallDurationlomOqCM) {
            ring.getOutputStallDurationlomOqCM = false;
        }
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring2 = this.getInputFormats;
        ring2.getOutputMinFrameDuration = 0;
        ring2.getInputSizeshNQ4ISI = ring2.getOutputFormats[0];
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring3 = this.getInputFormats;
        ring3.isOutputSupportedForhNQ4ISI = 0.0f;
        ring3.getValidOutputFormatsForInputhNQ4ISI = 0.0f;
        ring3.isOutputSupportedFor = 0.0f;
        ring3.unwrapAs = 0.0f;
        ring3.getOutputSizes = 0.0f;
        ring3.getOutputMinFrameDurationlomOqCM = 0.0f;
        invalidateSelf();
    }

    final void getHighSpeedVideoSizes(float f, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring, boolean z) {
        float interpolation;
        float f2;
        if (this.getHighSpeedVideoSizes) {
            getHighSpeedVideoFpsRanges(f, ring);
            float floor = (float) (java.lang.Math.floor(ring.isOutputSupportedFor / 0.8f) + 1.0d);
            ring.unwrapAs = ring.isOutputSupportedForhNQ4ISI + (((ring.getValidOutputFormatsForInputhNQ4ISI - 0.01f) - ring.isOutputSupportedForhNQ4ISI) * f);
            ring.getOutputSizes = ring.getValidOutputFormatsForInputhNQ4ISI;
            ring.getOutputMinFrameDurationlomOqCM = ring.isOutputSupportedFor + ((floor - ring.isOutputSupportedFor) * f);
            return;
        }
        if (f != 1.0f || z) {
            float f3 = ring.isOutputSupportedFor;
            if (f < 0.5f) {
                interpolation = ring.isOutputSupportedForhNQ4ISI;
                f2 = (Camera2StreamConfigurationMap.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f4 = ring.isOutputSupportedForhNQ4ISI + 0.79f;
                interpolation = f4 - (((1.0f - Camera2StreamConfigurationMap.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f4;
            }
            float f5 = this.getHighSpeedVideoFpsRangesFor;
            ring.unwrapAs = interpolation;
            ring.getOutputSizes = f2;
            ring.getOutputMinFrameDurationlomOqCM = f3 + (0.20999998f * f);
            this.getOutputFormats = (f + f5) * 216.0f;
        }
    }

    static class Ring {
        final android.graphics.RectF ArtificialStackFrames = new android.graphics.RectF();
        android.graphics.Path Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        final android.graphics.Paint getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        final android.graphics.Paint getHighSpeedVideoSizesFor;
        int getInputFormats;
        int getInputSizeshNQ4ISI;
        int[] getOutputFormats;
        int getOutputMinFrameDuration;
        float getOutputMinFrameDurationlomOqCM;
        float getOutputSizes;
        float getOutputSizeshNQ4ISI;
        final android.graphics.Paint getOutputStallDuration;
        boolean getOutputStallDurationlomOqCM;
        float getValidOutputFormatsForInputhNQ4ISI;
        float isOutputSupportedFor;
        float isOutputSupportedForhNQ4ISI;
        float toString;
        float unwrapAs;

        Ring() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.getOutputStallDuration = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.getHighSpeedVideoFpsRanges = paint2;
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.getHighSpeedVideoSizesFor = paint3;
            this.unwrapAs = 0.0f;
            this.getOutputSizes = 0.0f;
            this.getOutputMinFrameDurationlomOqCM = 0.0f;
            this.toString = 5.0f;
            this.getHighResolutionOutputSizeshNQ4ISI = 1.0f;
            this.getHighSpeedVideoFpsRangesFor = 255;
            paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint2.setStyle(android.graphics.Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }
    }

    static void getHighSpeedVideoFpsRanges(float f, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring) {
        if (f > 0.75f) {
            ring.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges((f - 0.75f) / 0.25f, ring.getOutputFormats[ring.getOutputMinFrameDuration], ring.getOutputFormats[(ring.getOutputMinFrameDuration + 1) % ring.getOutputFormats.length]);
        } else {
            ring.getInputSizeshNQ4ISI = ring.getOutputFormats[ring.getOutputMinFrameDuration];
        }
    }
}
