package androidx.core.view.insets;

/* loaded from: classes7.dex */
public abstract class Protection {
    private final int getOutputSizes;
    private static final android.view.animation.Interpolator getOutputFormats = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private static final android.view.animation.Interpolator getOutputStallDuration = new android.view.animation.PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    private static final android.view.animation.Interpolator getInputSizeshNQ4ISI = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    private static final android.view.animation.Interpolator getOutputMinFrameDuration = new android.view.animation.PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    final androidx.core.view.insets.Protection.Attributes getHighSpeedVideoFpsRanges = new androidx.core.view.insets.Protection.Attributes();
    androidx.core.graphics.Insets getHighResolutionOutputSizeshNQ4ISI = androidx.core.graphics.Insets.NONE;
    androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor = androidx.core.graphics.Insets.NONE;
    float getHighSpeedVideoSizes = 1.0f;
    float getHighSpeedVideoSizesFor = 1.0f;
    float getInputFormats = 1.0f;
    private float getOutputSizeshNQ4ISI = 1.0f;
    java.lang.Object Camera2StreamConfigurationMap = null;
    private android.animation.ValueAnimator getOutputStallDurationlomOqCM = null;
    private android.animation.ValueAnimator getOutputMinFrameDurationlomOqCM = null;

    void Camera2StreamConfigurationMap(int i) {
    }

    boolean getHighSpeedVideoFpsRanges() {
        return false;
    }

    int getHighSpeedVideoFpsRangesFor(int i) {
        return i;
    }

    public Protection(int i) {
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw new java.lang.IllegalArgumentException("Unexpected side: ".concat(java.lang.String.valueOf(i)));
        }
        this.getOutputSizes = i;
    }

    public int getSide() {
        return this.getOutputSizes;
    }

    final androidx.core.graphics.Insets getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        androidx.core.graphics.Insets insets = androidx.core.graphics.Insets.NONE;
        int i2 = this.getOutputSizes;
        if (i2 == 1) {
            i = this.getHighResolutionOutputSizeshNQ4ISI.left;
            androidx.core.view.insets.Protection.Attributes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.left));
            if (getHighSpeedVideoFpsRanges()) {
                insets = androidx.core.graphics.Insets.of(getHighSpeedVideoFpsRangesFor(i), 0, 0, 0);
            }
        } else if (i2 == 2) {
            i = this.getHighResolutionOutputSizeshNQ4ISI.top;
            androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.top));
            if (getHighSpeedVideoFpsRanges()) {
                insets = androidx.core.graphics.Insets.of(0, getHighSpeedVideoFpsRangesFor(i), 0, 0);
            }
        } else if (i2 == 4) {
            i = this.getHighResolutionOutputSizeshNQ4ISI.right;
            androidx.core.view.insets.Protection.Attributes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.right));
            if (getHighSpeedVideoFpsRanges()) {
                insets = androidx.core.graphics.Insets.of(0, 0, getHighSpeedVideoFpsRangesFor(i), 0);
            }
        } else if (i2 != 8) {
            i = 0;
        } else {
            i = this.getHighResolutionOutputSizeshNQ4ISI.bottom;
            androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.bottom));
            if (getHighSpeedVideoFpsRanges()) {
                insets = androidx.core.graphics.Insets.of(0, 0, 0, getHighSpeedVideoFpsRangesFor(i));
            }
        }
        androidx.core.view.insets.Protection.Attributes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, i > 0);
        float f = i > 0 ? 1.0f : 0.0f;
        this.getHighSpeedVideoSizes = f;
        androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, f * this.getHighSpeedVideoSizesFor);
        this.getInputFormats = i <= 0 ? 0.0f : 1.0f;
        Camera2StreamConfigurationMap();
        return insets;
    }

    public float getAlpha() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getInsetAmount() {
        return this.getOutputSizeshNQ4ISI;
    }

    final void Camera2StreamConfigurationMap() {
        float f = this.getOutputSizeshNQ4ISI * this.getInputFormats;
        int i = this.getOutputSizes;
        if (i == 1) {
            androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, (-(1.0f - f)) * r1.getHighSpeedVideoSizesFor);
            return;
        }
        if (i == 2) {
            androidx.core.view.insets.Protection.Attributes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, (-(1.0f - f)) * r1.getHighSpeedVideoFpsRanges);
        } else if (i == 4) {
            androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, (1.0f - f) * r1.getHighSpeedVideoSizesFor);
        } else {
            if (i != 8) {
                return;
            }
            androidx.core.view.insets.Protection.Attributes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, (1.0f - f) * r1.getHighSpeedVideoFpsRanges);
        }
    }

    static class Attributes {
        androidx.core.view.insets.Protection.Attributes.Callback Camera2StreamConfigurationMap;
        int getHighSpeedVideoSizesFor = -1;
        int getHighSpeedVideoFpsRanges = -1;
        androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor = androidx.core.graphics.Insets.NONE;
        boolean getOutputMinFrameDuration = false;
        android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI = null;
        float getInputSizeshNQ4ISI = 0.0f;
        float getInputFormats = 0.0f;
        float getHighSpeedVideoSizes = 1.0f;

        interface Callback {
            default void Camera2StreamConfigurationMap(float f) {
            }

            default void Camera2StreamConfigurationMap(int i) {
            }

            default void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
            }

            default void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets) {
            }

            default void getHighSpeedVideoFpsRangesFor(float f) {
            }

            default void getHighSpeedVideoFpsRangesFor(int i) {
            }

            default void getHighSpeedVideoSizes(float f) {
            }

            default void getHighSpeedVideoSizes(boolean z) {
            }
        }

        Attributes() {
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.core.view.insets.Protection.Attributes attributes, androidx.core.graphics.Insets insets) {
            if (attributes.getHighSpeedVideoFpsRangesFor.equals(insets)) {
                return;
            }
            attributes.getHighSpeedVideoFpsRangesFor = insets;
            androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
            if (callback != null) {
                callback.getHighSpeedVideoFpsRanges(insets);
            }
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.core.view.insets.Protection.Attributes attributes, int i) {
            if (attributes.getHighSpeedVideoSizesFor != i) {
                attributes.getHighSpeedVideoSizesFor = i;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.getHighSpeedVideoFpsRangesFor(i);
                }
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.core.view.insets.Protection.Attributes attributes, int i) {
            if (attributes.getHighSpeedVideoFpsRanges != i) {
                attributes.getHighSpeedVideoFpsRanges = i;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.Camera2StreamConfigurationMap(i);
                }
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.core.view.insets.Protection.Attributes attributes, boolean z) {
            if (attributes.getOutputMinFrameDuration != z) {
                attributes.getOutputMinFrameDuration = z;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.getHighSpeedVideoSizes(z);
                }
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.core.view.insets.Protection.Attributes attributes, float f) {
            if (attributes.getHighSpeedVideoSizes != f) {
                attributes.getHighSpeedVideoSizes = f;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.getHighSpeedVideoFpsRangesFor(f);
                }
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.core.view.insets.Protection.Attributes attributes, float f) {
            if (attributes.getInputSizeshNQ4ISI != f) {
                attributes.getInputSizeshNQ4ISI = f;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.Camera2StreamConfigurationMap(f);
                }
            }
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(androidx.core.view.insets.Protection.Attributes attributes, float f) {
            if (attributes.getInputFormats != f) {
                attributes.getInputFormats = f;
                androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
                if (callback != null) {
                    callback.getHighSpeedVideoSizes(f);
                }
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.core.view.insets.Protection.Attributes attributes, android.graphics.drawable.Drawable drawable) {
            attributes.getHighResolutionOutputSizeshNQ4ISI = drawable;
            androidx.core.view.insets.Protection.Attributes.Callback callback = attributes.Camera2StreamConfigurationMap;
            if (callback != null) {
                callback.getHighResolutionOutputSizeshNQ4ISI(drawable);
            }
        }
    }

    public void animateAlpha(float f) {
        android.animation.ValueAnimator valueAnimator = this.getOutputStallDurationlomOqCM;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.getOutputStallDurationlomOqCM = null;
        }
        float f2 = this.getHighSpeedVideoSizesFor;
        if (f == f2) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f2, f);
        this.getOutputStallDurationlomOqCM = ofFloat;
        if (this.getHighSpeedVideoSizesFor < f) {
            ofFloat.setDuration(333L);
            this.getOutputStallDurationlomOqCM.setInterpolator(getInputSizeshNQ4ISI);
        } else {
            ofFloat.setDuration(166L);
            this.getOutputStallDurationlomOqCM.setInterpolator(getOutputMinFrameDuration);
        }
        this.getOutputStallDurationlomOqCM.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.Protection$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                androidx.core.view.insets.Protection protection = androidx.core.view.insets.Protection.this;
                protection.getHighSpeedVideoSizesFor = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
            }
        });
        this.getOutputStallDurationlomOqCM.start();
    }

    public void animateInsetsAmount(float f) {
        android.animation.ValueAnimator valueAnimator = this.getOutputMinFrameDurationlomOqCM;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        float f2 = this.getOutputSizeshNQ4ISI;
        if (f == f2) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f2, f);
        this.getOutputMinFrameDurationlomOqCM = ofFloat;
        if (this.getOutputSizeshNQ4ISI < f) {
            ofFloat.setDuration(333L);
            this.getOutputMinFrameDurationlomOqCM.setInterpolator(getOutputFormats);
        } else {
            ofFloat.setDuration(166L);
            this.getOutputMinFrameDurationlomOqCM.setInterpolator(getOutputStallDuration);
        }
        this.getOutputMinFrameDurationlomOqCM.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.Protection$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                androidx.core.view.insets.Protection protection = androidx.core.view.insets.Protection.this;
                protection.getHighSpeedVideoSizesFor = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
            }
        });
        this.getOutputMinFrameDurationlomOqCM.start();
    }

    public void setAlpha(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Alpha must in a range of [0, 1]. Got: ".concat(java.lang.String.valueOf(f)));
        }
        android.animation.ValueAnimator valueAnimator = this.getOutputStallDurationlomOqCM;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.getOutputStallDurationlomOqCM = null;
        }
        this.getHighSpeedVideoSizesFor = f;
        androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes * f);
    }

    public void setInsetAmount(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: ".concat(java.lang.String.valueOf(f)));
        }
        android.animation.ValueAnimator valueAnimator = this.getOutputMinFrameDurationlomOqCM;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        this.getOutputSizeshNQ4ISI = f;
        Camera2StreamConfigurationMap();
    }
}
