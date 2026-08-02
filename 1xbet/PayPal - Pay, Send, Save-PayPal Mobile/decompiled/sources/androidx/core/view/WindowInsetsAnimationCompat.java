package androidx.core.view;

/* loaded from: classes7.dex */
public final class WindowInsetsAnimationCompat {
    private androidx.core.view.WindowInsetsAnimationCompat.Impl getHighResolutionOutputSizeshNQ4ISI;

    public WindowInsetsAnimationCompat(int i, android.view.animation.Interpolator interpolator, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.WindowInsetsAnimationCompat.Impl30(i, interpolator, j);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.WindowInsetsAnimationCompat.Impl21(i, interpolator, j);
        }
    }

    private WindowInsetsAnimationCompat(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.WindowInsetsAnimationCompat.Impl30(windowInsetsAnimation);
    }

    public final int getTypeMask() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats();
    }

    public final float getFraction() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final float getInterpolatedFraction() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
    }

    public final android.view.animation.Interpolator getInterpolator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
    }

    public final long getDurationMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
    }

    public final void setFraction(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(f);
    }

    public final float getAlpha() {
        return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
    }

    public final void setAlpha(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(f);
    }

    public static final class BoundsCompat {
        private final androidx.core.graphics.Insets Camera2StreamConfigurationMap;
        private final androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor;

        public BoundsCompat(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
            this.getHighSpeedVideoFpsRangesFor = insets;
            this.Camera2StreamConfigurationMap = insets2;
        }

        private BoundsCompat(android.view.WindowInsetsAnimation.Bounds bounds) {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.view.WindowInsetsAnimationCompat.Impl30.cE_(bounds);
            this.Camera2StreamConfigurationMap = androidx.core.view.WindowInsetsAnimationCompat.Impl30.cD_(bounds);
        }

        public final androidx.core.graphics.Insets getLowerBound() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.graphics.Insets getUpperBound() {
            return this.Camera2StreamConfigurationMap;
        }

        public final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat inset(androidx.core.graphics.Insets insets) {
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(androidx.core.view.WindowInsetsCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, insets.left, insets.top, insets.right, insets.bottom), androidx.core.view.WindowInsetsCompat.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, insets.left, insets.top, insets.right, insets.bottom));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bounds{lower=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" upper=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append("}");
            return sb.toString();
        }

        public final android.view.WindowInsetsAnimation.Bounds toBounds() {
            return androidx.core.view.WindowInsetsAnimationCompat.Impl30.cC_(this);
        }

        public static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat toBoundsCompat(android.view.WindowInsetsAnimation.Bounds bounds) {
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(bounds);
        }
    }

    static androidx.core.view.WindowInsetsAnimationCompat cB_(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        return new androidx.core.view.WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        androidx.core.view.WindowInsetsCompat mDispachedInsets;
        private final int mDispatchMode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface DispatchMode {
        }

        public void onEnd(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list);

        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            return boundsCompat;
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }
    }

    static void getHighSpeedVideoSizes(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.WindowInsetsAnimationCompat.Impl30.getHighResolutionOutputSizeshNQ4ISI(view, callback);
        } else {
            androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoSizes(view, callback);
        }
    }

    static class Impl {
        private float Camera2StreamConfigurationMap;
        private float getHighResolutionOutputSizeshNQ4ISI = 1.0f;
        private final long getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final android.view.animation.Interpolator getHighSpeedVideoSizes;

        Impl(int i, android.view.animation.Interpolator interpolator, long j) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = interpolator;
            this.getHighSpeedVideoFpsRanges = j;
        }

        public int getInputFormats() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public float getHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }

        public float getHighSpeedVideoSizes() {
            android.view.animation.Interpolator interpolator = this.getHighSpeedVideoSizes;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.Camera2StreamConfigurationMap);
            }
            return this.Camera2StreamConfigurationMap;
        }

        public android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes;
        }

        public long getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public float Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public void getHighSpeedVideoSizes(float f) {
            this.Camera2StreamConfigurationMap = f;
        }

        public void getHighSpeedVideoFpsRanges(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }
    }

    static class Impl21 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        private static final android.view.animation.Interpolator Camera2StreamConfigurationMap = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final android.view.animation.Interpolator getHighSpeedVideoSizes = new androidx.interpolator.view.animation.FastOutLinearInInterpolator();
        private static final android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor = new android.view.animation.DecelerateInterpolator(1.5f);
        private static final android.view.animation.Interpolator getHighResolutionOutputSizeshNQ4ISI = new android.view.animation.AccelerateInterpolator(1.5f);

        Impl21(int i, android.view.animation.Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        static void getHighSpeedVideoSizes(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            android.view.View.OnApplyWindowInsetsListener Camera2StreamConfigurationMap2 = callback != null ? Camera2StreamConfigurationMap(view, callback) : null;
            view.setTag(androidx.core.R.id.tag_window_insets_animation_callback, Camera2StreamConfigurationMap2);
            if (view.getTag(androidx.core.R.id.tag_compat_insets_dispatch) == null && view.getTag(androidx.core.R.id.tag_on_apply_window_listener) == null) {
                view.setOnApplyWindowInsetsListener(Camera2StreamConfigurationMap2);
            }
        }

        private static android.view.View.OnApplyWindowInsetsListener Camera2StreamConfigurationMap(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            return new androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        }

        static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat getHighSpeedVideoFpsRangesFor(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2, int i) {
            androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(i);
            androidx.core.graphics.Insets insets2 = windowInsetsCompat2.getInsets(i);
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(androidx.core.graphics.Insets.of(java.lang.Math.min(insets.left, insets2.left), java.lang.Math.min(insets.top, insets2.top), java.lang.Math.min(insets.right, insets2.right), java.lang.Math.min(insets.bottom, insets2.bottom)), androidx.core.graphics.Insets.of(java.lang.Math.max(insets.left, insets2.left), java.lang.Math.max(insets.top, insets2.top), java.lang.Math.max(insets.right, insets2.right), java.lang.Math.max(insets.bottom, insets2.bottom)));
        }

        static void Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
            for (int i = 1; i <= 512; i <<= 1) {
                androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(i);
                androidx.core.graphics.Insets insets2 = windowInsetsCompat2.getInsets(i);
                boolean z = insets.left > insets2.left || insets.top > insets2.top || insets.right > insets2.right || insets.bottom > insets2.bottom;
                if (z != (insets.left < insets2.left || insets.top < insets2.top || insets.right < insets2.right || insets.bottom < insets2.bottom)) {
                    if (z) {
                        iArr[0] = iArr[0] | i;
                    } else {
                        iArr2[0] = iArr2[0] | i;
                    }
                }
            }
        }

        static android.view.animation.Interpolator getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            if ((androidx.core.view.WindowInsetsCompat.Type.ime() & i) != 0) {
                return Camera2StreamConfigurationMap;
            }
            if ((androidx.core.view.WindowInsetsCompat.Type.ime() & i2) != 0) {
                return getHighSpeedVideoSizes;
            }
            if ((i & androidx.core.view.WindowInsetsCompat.Type.systemBars()) != 0) {
                return getHighSpeedVideoFpsRangesFor;
            }
            if ((androidx.core.view.WindowInsetsCompat.Type.systemBars() & i2) != 0) {
                return getHighResolutionOutputSizeshNQ4ISI;
            }
            return null;
        }

        static androidx.core.view.WindowInsetsCompat Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            androidx.core.view.WindowInsetsCompat.Builder builder = new androidx.core.view.WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) == 0) {
                    builder.setInsets(i2, windowInsetsCompat.getInsets(i2));
                } else {
                    androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(i2);
                    androidx.core.graphics.Insets insets2 = windowInsetsCompat2.getInsets(i2);
                    float f2 = 1.0f - f;
                    builder.setInsets(i2, androidx.core.view.WindowInsetsCompat.getHighSpeedVideoSizes(insets, (int) (((insets.left - insets2.left) * f2) + 0.5d), (int) (((insets.top - insets2.top) * f2) + 0.5d), (int) (((insets.right - insets2.right) * f2) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f2) + 0.5d)));
                }
            }
            return builder.build();
        }

        static class Impl21OnApplyWindowInsetsListener implements android.view.View.OnApplyWindowInsetsListener {
            final androidx.core.view.WindowInsetsAnimationCompat.Callback getHighResolutionOutputSizeshNQ4ISI;
            private androidx.core.view.WindowInsetsCompat getHighSpeedVideoSizes;

            Impl21OnApplyWindowInsetsListener(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
                this.getHighResolutionOutputSizeshNQ4ISI = callback;
                androidx.core.view.WindowInsetsCompat rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(view);
                this.getHighSpeedVideoSizes = rootWindowInsets != null ? new androidx.core.view.WindowInsetsCompat.Builder(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(final android.view.View view, android.view.WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.getHighSpeedVideoSizes = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view, windowInsets);
                }
                final androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = androidx.core.view.ViewCompat.getRootWindowInsets(view);
                }
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = windowInsetsCompat;
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view, windowInsets);
                }
                androidx.core.view.WindowInsetsAnimationCompat.Callback highSpeedVideoFpsRangesFor = androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view);
                if (highSpeedVideoFpsRangesFor != null && java.util.Objects.equals(highSpeedVideoFpsRangesFor.mDispachedInsets, windowInsetsCompat)) {
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.Camera2StreamConfigurationMap(windowInsetsCompat, this.getHighSpeedVideoSizes, iArr, iArr2);
                int i = iArr[0];
                int i2 = iArr2[0];
                final int i3 = i | i2;
                if (i3 == 0) {
                    this.getHighSpeedVideoSizes = windowInsetsCompat;
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view, windowInsets);
                }
                final androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = this.getHighSpeedVideoSizes;
                final androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = new androidx.core.view.WindowInsetsAnimationCompat(i3, androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighResolutionOutputSizeshNQ4ISI(i, i2), (androidx.core.view.WindowInsetsCompat.Type.ime() & i3) != 0 ? 160L : 250L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                final android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat highSpeedVideoFpsRangesFor2 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(windowInsetsCompat, windowInsetsCompat2, i3);
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.Camera2StreamConfigurationMap(view, windowInsetsAnimationCompat, windowInsetsCompat, false);
                duration.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoSizes(view, androidx.core.view.WindowInsetsAnimationCompat.Impl21.Camera2StreamConfigurationMap(windowInsetsCompat, windowInsetsCompat2, windowInsetsAnimationCompat.getInterpolatedFraction(), i3), java.util.Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        windowInsetsAnimationCompat.setFraction(1.0f);
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRanges(view, windowInsetsAnimationCompat);
                    }
                });
                androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighResolutionOutputSizeshNQ4ISI(view, windowInsetsAnimationCompat, highSpeedVideoFpsRangesFor2);
                        duration.start();
                    }
                });
                this.getHighSpeedVideoSizes = windowInsetsCompat;
                return androidx.core.view.WindowInsetsAnimationCompat.Impl21.getHighSpeedVideoFpsRangesFor(view, windowInsets);
            }
        }

        static android.view.WindowInsets getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.getTag(androidx.core.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static void Camera2StreamConfigurationMap(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat, boolean z) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor.mDispachedInsets = windowInsetsCompat;
                if (!z) {
                    highSpeedVideoFpsRangesFor.onPrepare(windowInsetsAnimationCompat);
                    z = highSpeedVideoFpsRangesFor.getDispatchMode() == 0;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    Camera2StreamConfigurationMap(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsetsCompat, z);
                }
            }
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (highSpeedVideoFpsRangesFor.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    getHighResolutionOutputSizeshNQ4ISI(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        static void getHighSpeedVideoSizes(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != null) {
                windowInsetsCompat = highSpeedVideoFpsRangesFor.onProgress(windowInsetsCompat, list);
                if (highSpeedVideoFpsRangesFor.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    getHighSpeedVideoSizes(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor.onEnd(windowInsetsAnimationCompat);
                if (highSpeedVideoFpsRangesFor.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    getHighSpeedVideoFpsRanges(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        static androidx.core.view.WindowInsetsAnimationCompat.Callback getHighSpeedVideoFpsRangesFor(android.view.View view) {
            java.lang.Object tag = view.getTag(androidx.core.R.id.tag_window_insets_animation_callback);
            if (tag instanceof androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) {
                return ((androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) tag).getHighResolutionOutputSizeshNQ4ISI;
            }
            return null;
        }
    }

    static class Impl30 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        private final android.view.WindowInsetsAnimation getHighSpeedVideoFpsRanges;

        Impl30(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.getHighSpeedVideoFpsRanges = windowInsetsAnimation;
        }

        Impl30(int i, android.view.animation.Interpolator interpolator, long j) {
            this(new android.view.WindowInsetsAnimation(i, interpolator, j));
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getInputFormats() {
            return this.getHighSpeedVideoFpsRanges.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRanges.getInterpolator();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges.getFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void getHighSpeedVideoSizes(float f) {
            this.getHighSpeedVideoFpsRanges.setFraction(f);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRanges.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRanges.getAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void getHighSpeedVideoFpsRanges(float f) {
            this.getHighSpeedVideoFpsRanges.setAlpha(f);
        }

        static class ProxyCallback extends android.view.WindowInsetsAnimation.Callback {
            private final androidx.core.view.WindowInsetsAnimationCompat.Callback Camera2StreamConfigurationMap;
            private java.util.List<androidx.core.view.WindowInsetsAnimationCompat> getHighSpeedVideoFpsRanges;
            private final java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> getHighSpeedVideoFpsRangesFor;
            private java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> getHighSpeedVideoSizes;

            ProxyCallback(androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
                super(callback.getDispatchMode());
                this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
                this.Camera2StreamConfigurationMap = callback;
            }

            private androidx.core.view.WindowInsetsAnimationCompat cF_(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.getHighSpeedVideoFpsRangesFor.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                androidx.core.view.WindowInsetsAnimationCompat cB_ = androidx.core.view.WindowInsetsAnimationCompat.cB_(windowInsetsAnimation);
                this.getHighSpeedVideoFpsRangesFor.put(windowInsetsAnimation, cB_);
                return cB_;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.Camera2StreamConfigurationMap.onPrepare(cF_(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
                return this.Camera2StreamConfigurationMap.onStart(cF_(windowInsetsAnimation), androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
                java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> arrayList = this.getHighSpeedVideoSizes;
                if (arrayList == null) {
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> arrayList2 = new java.util.ArrayList<>(list.size());
                    this.getHighSpeedVideoSizes = arrayList2;
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    android.view.WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    androidx.core.view.WindowInsetsAnimationCompat cF_ = cF_(windowInsetsAnimation);
                    cF_.setFraction(windowInsetsAnimation.getFraction());
                    this.getHighSpeedVideoSizes.add(cF_);
                }
                return this.Camera2StreamConfigurationMap.onProgress(androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.getHighSpeedVideoFpsRanges).toWindowInsets();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.Camera2StreamConfigurationMap.onEnd(cF_(windowInsetsAnimation));
                this.getHighSpeedVideoFpsRangesFor.remove(windowInsetsAnimation);
            }
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new androidx.core.view.WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
        }

        public static android.view.WindowInsetsAnimation.Bounds cC_(androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            return new android.view.WindowInsetsAnimation.Bounds(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        public static androidx.core.graphics.Insets cE_(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.Insets.toCompatInsets(bounds.getLowerBound());
        }

        public static androidx.core.graphics.Insets cD_(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.Insets.toCompatInsets(bounds.getUpperBound());
        }
    }
}
