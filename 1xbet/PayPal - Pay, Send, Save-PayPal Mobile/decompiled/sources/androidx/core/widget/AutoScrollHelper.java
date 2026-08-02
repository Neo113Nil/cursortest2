package androidx.core.widget;

/* loaded from: classes3.dex */
public abstract class AutoScrollHelper implements android.view.View.OnTouchListener {
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int getHighSpeedVideoSizesFor = android.view.ViewConfiguration.getTapTimeout();
    boolean Camera2StreamConfigurationMap;
    final android.view.View getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    private int getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;
    private boolean getOutputSizeshNQ4ISI;
    private boolean getOutputStallDurationlomOqCM;
    private java.lang.Runnable isOutputSupportedFor;
    final androidx.core.widget.AutoScrollHelper.ClampedScroller getHighResolutionOutputSizeshNQ4ISI = new androidx.core.widget.AutoScrollHelper.ClampedScroller();
    private final android.view.animation.Interpolator getOutputFormats = new android.view.animation.AccelerateInterpolator();
    private float[] isOutputSupportedForhNQ4ISI = {0.0f, 0.0f};
    private float[] getOutputMinFrameDurationlomOqCM = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] toString = {0.0f, 0.0f};
    private float[] getOutputSizes = {0.0f, 0.0f};
    private float[] getOutputStallDuration = {Float.MAX_VALUE, Float.MAX_VALUE};

    static float getHighSpeedVideoFpsRangesFor(float f, float f2, float f3) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public abstract void scrollTargetBy(int i, int i2);

    public AutoScrollHelper(android.view.View view) {
        this.getHighSpeedVideoFpsRanges = view;
        android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = i;
        setMaximumVelocity(f, f);
        float f2 = i2;
        setMinimumVelocity(f2, f2);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(getHighSpeedVideoSizesFor);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public androidx.core.widget.AutoScrollHelper setEnabled(boolean z) {
        if (this.getOutputStallDurationlomOqCM && !z) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getOutputStallDurationlomOqCM = z;
        return this;
    }

    public boolean isEnabled() {
        return this.getOutputStallDurationlomOqCM;
    }

    public androidx.core.widget.AutoScrollHelper setExclusive(boolean z) {
        this.getOutputSizeshNQ4ISI = z;
        return this;
    }

    public boolean isExclusive() {
        return this.getOutputSizeshNQ4ISI;
    }

    public androidx.core.widget.AutoScrollHelper setMaximumVelocity(float f, float f2) {
        float[] fArr = this.getOutputStallDuration;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setMinimumVelocity(float f, float f2) {
        float[] fArr = this.getOutputSizes;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setRelativeVelocity(float f, float f2) {
        float[] fArr = this.toString;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setEdgeType(int i) {
        this.getOutputMinFrameDuration = i;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setRelativeEdges(float f, float f2) {
        float[] fArr = this.isOutputSupportedForhNQ4ISI;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setMaximumEdges(float f, float f2) {
        float[] fArr = this.getOutputMinFrameDurationlomOqCM;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setActivationDelay(int i) {
        this.getInputFormats = i;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setRampUpDuration(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = i;
        return this;
    }

    public androidx.core.widget.AutoScrollHelper setRampDownDuration(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = i;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 == 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i;
        if (!this.getOutputStallDurationlomOqCM) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Camera2StreamConfigurationMap = true;
            this.getInputSizeshNQ4ISI = false;
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            getHighResolutionOutputSizeshNQ4ISI();
            return !this.getOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor;
        }
        float Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, motionEvent.getX(), view.getWidth(), this.getHighSpeedVideoFpsRanges.getWidth());
        float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(1, motionEvent.getY(), view.getHeight(), this.getHighSpeedVideoFpsRanges.getHeight());
        androidx.core.widget.AutoScrollHelper.ClampedScroller clampedScroller = this.getHighResolutionOutputSizeshNQ4ISI;
        clampedScroller.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        clampedScroller.getOutputStallDuration = Camera2StreamConfigurationMap2;
        if (!this.getHighSpeedVideoFpsRangesFor && Camera2StreamConfigurationMap()) {
            if (this.isOutputSupportedFor == null) {
                this.isOutputSupportedFor = new androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable();
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoSizes = true;
            if (!this.getInputSizeshNQ4ISI && (i = this.getInputFormats) > 0) {
                androidx.core.view.ViewCompat.postOnAnimationDelayed(this.getHighSpeedVideoFpsRanges, this.isOutputSupportedFor, i);
            } else {
                this.isOutputSupportedFor.run();
            }
            this.getInputSizeshNQ4ISI = true;
        }
        if (this.getOutputSizeshNQ4ISI) {
        }
    }

    final boolean Camera2StreamConfigurationMap() {
        androidx.core.widget.AutoScrollHelper.ClampedScroller clampedScroller = this.getHighResolutionOutputSizeshNQ4ISI;
        float f = clampedScroller.getOutputStallDuration;
        int abs = (int) (f / java.lang.Math.abs(f));
        float f2 = clampedScroller.getInputSizeshNQ4ISI;
        int abs2 = (int) (f2 / java.lang.Math.abs(f2));
        if (abs == 0 || !canTargetScrollVertically(abs)) {
            return abs2 != 0 && canTargetScrollHorizontally(abs2);
        }
        return true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i = 0;
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRangesFor = false;
            return;
        }
        androidx.core.widget.AutoScrollHelper.ClampedScroller clampedScroller = this.getHighResolutionOutputSizeshNQ4ISI;
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - clampedScroller.getInputFormats);
        int i3 = clampedScroller.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        clampedScroller.getHighSpeedVideoSizes = i;
        clampedScroller.getOutputMinFrameDuration = clampedScroller.Camera2StreamConfigurationMap(currentAnimationTimeMillis);
        clampedScroller.getHighSpeedVideoSizesFor = currentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r6 < (-1.0f)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float Camera2StreamConfigurationMap(int i, float f, float f2, float f3) {
        float f4;
        float f5 = this.isOutputSupportedForhNQ4ISI[i];
        float f6 = this.getOutputMinFrameDurationlomOqCM[i];
        float f7 = f5 * f2;
        if (f7 <= f6) {
            f6 = f7 < 0.0f ? 0.0f : f7;
        }
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(f2 - f, f6) - getHighSpeedVideoFpsRangesFor(f, f6);
        if (highSpeedVideoFpsRangesFor < 0.0f) {
            f4 = -this.getOutputFormats.getInterpolation(-highSpeedVideoFpsRangesFor);
        } else {
            if (highSpeedVideoFpsRangesFor <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f8 = this.toString[i];
                float f9 = this.getOutputSizes[i];
                float f10 = this.getOutputStallDuration[i];
                float f11 = f8 * f3;
                if (f4 > 0.0f) {
                    float f12 = f4 * f11;
                    return f12 > f10 ? f10 : f12 < f9 ? f9 : f12;
                }
                float f13 = (-f4) * f11;
                if (f13 > f10) {
                    f9 = f10;
                } else if (f13 >= f9) {
                    f9 = f13;
                }
                return -f9;
            }
            f4 = this.getOutputFormats.getInterpolation(highSpeedVideoFpsRangesFor);
        }
        float f14 = f4 <= 1.0f ? -1.0f : 1.0f;
        f4 = f14;
        if (f4 != 0.0f) {
        }
    }

    private float getHighSpeedVideoFpsRangesFor(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.getOutputMinFrameDuration;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.getHighSpeedVideoFpsRangesFor && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    class ScrollAnimationRunnable implements java.lang.Runnable {
        ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.core.widget.AutoScrollHelper.this.getHighSpeedVideoFpsRangesFor) {
                if (androidx.core.widget.AutoScrollHelper.this.getHighSpeedVideoSizes) {
                    androidx.core.widget.AutoScrollHelper.this.getHighSpeedVideoSizes = false;
                    androidx.core.widget.AutoScrollHelper.ClampedScroller clampedScroller = androidx.core.widget.AutoScrollHelper.this.getHighResolutionOutputSizeshNQ4ISI;
                    long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.getInputFormats = currentAnimationTimeMillis;
                    clampedScroller.getHighSpeedVideoSizesFor = -1L;
                    clampedScroller.getHighSpeedVideoFpsRangesFor = currentAnimationTimeMillis;
                    clampedScroller.getOutputMinFrameDuration = 0.5f;
                    clampedScroller.Camera2StreamConfigurationMap = 0;
                    clampedScroller.getHighSpeedVideoFpsRanges = 0;
                }
                androidx.core.widget.AutoScrollHelper.ClampedScroller clampedScroller2 = androidx.core.widget.AutoScrollHelper.this.getHighResolutionOutputSizeshNQ4ISI;
                if ((clampedScroller2.getHighSpeedVideoSizesFor > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > clampedScroller2.getHighSpeedVideoSizesFor + clampedScroller2.getHighSpeedVideoSizes) || !androidx.core.widget.AutoScrollHelper.this.Camera2StreamConfigurationMap()) {
                    androidx.core.widget.AutoScrollHelper.this.getHighSpeedVideoFpsRangesFor = false;
                    return;
                }
                if (androidx.core.widget.AutoScrollHelper.this.Camera2StreamConfigurationMap) {
                    androidx.core.widget.AutoScrollHelper.this.Camera2StreamConfigurationMap = false;
                    androidx.core.widget.AutoScrollHelper autoScrollHelper = androidx.core.widget.AutoScrollHelper.this;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    autoScrollHelper.getHighSpeedVideoFpsRanges.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (clampedScroller2.getHighSpeedVideoFpsRangesFor == 0) {
                    throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                float Camera2StreamConfigurationMap = clampedScroller2.Camera2StreamConfigurationMap(currentAnimationTimeMillis2);
                long j = clampedScroller2.getHighSpeedVideoFpsRangesFor;
                clampedScroller2.getHighSpeedVideoFpsRangesFor = currentAnimationTimeMillis2;
                float f = (currentAnimationTimeMillis2 - j) * (((-4.0f) * Camera2StreamConfigurationMap * Camera2StreamConfigurationMap) + (Camera2StreamConfigurationMap * 4.0f));
                clampedScroller2.Camera2StreamConfigurationMap = (int) (clampedScroller2.getInputSizeshNQ4ISI * f);
                clampedScroller2.getHighSpeedVideoFpsRanges = (int) (f * clampedScroller2.getOutputStallDuration);
                androidx.core.widget.AutoScrollHelper.this.scrollTargetBy(clampedScroller2.Camera2StreamConfigurationMap, clampedScroller2.getHighSpeedVideoFpsRanges);
                androidx.core.view.ViewCompat.postOnAnimation(androidx.core.widget.AutoScrollHelper.this.getHighSpeedVideoFpsRanges, this);
            }
        }
    }

    static class ClampedScroller {
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;
        float getInputSizeshNQ4ISI;
        int getOutputFormats;
        float getOutputMinFrameDuration;
        float getOutputStallDuration;
        long getInputFormats = Long.MIN_VALUE;
        long getHighSpeedVideoSizesFor = -1;
        long getHighSpeedVideoFpsRangesFor = 0;
        int Camera2StreamConfigurationMap = 0;
        int getHighSpeedVideoFpsRanges = 0;

        ClampedScroller() {
        }

        final float Camera2StreamConfigurationMap(long j) {
            if (j < this.getInputFormats) {
                return 0.0f;
            }
            long j2 = this.getHighSpeedVideoSizesFor;
            if (j2 < 0 || j < j2) {
                return androidx.core.widget.AutoScrollHelper.getHighSpeedVideoFpsRangesFor((j - r0) / this.getOutputFormats, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.getOutputMinFrameDuration;
            return (1.0f - f) + (f * androidx.core.widget.AutoScrollHelper.getHighSpeedVideoFpsRangesFor((j - j2) / this.getHighSpeedVideoSizes, 0.0f, 1.0f));
        }
    }
}
