package androidx.camera.view;

/* loaded from: classes6.dex */
public final class ScreenFlashView extends android.view.View {
    private android.view.Window Camera2StreamConfigurationMap;
    private androidx.camera.view.CameraController getHighSpeedVideoFpsRangesFor;
    private androidx.camera.core.ImageCapture.ScreenFlash getHighSpeedVideoSizes;

    public final long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public ScreenFlashView(android.content.Context context) {
        this(context, null);
    }

    public ScreenFlashView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScreenFlashView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    public final void setController(androidx.camera.view.CameraController cameraController) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.view.CameraController cameraController2 = this.getHighSpeedVideoFpsRangesFor;
        if (cameraController2 != null && cameraController2 != cameraController) {
            getHighResolutionOutputSizeshNQ4ISI(null);
        }
        this.getHighSpeedVideoFpsRangesFor = cameraController;
        if (cameraController == null) {
            return;
        }
        if (cameraController.getImageCaptureFlashMode() == 3 && this.Camera2StreamConfigurationMap == null) {
            throw new java.lang.IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        getHighResolutionOutputSizeshNQ4ISI(getScreenFlash());
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        androidx.camera.view.CameraController cameraController = this.getHighSpeedVideoFpsRangesFor;
        if (cameraController == null) {
            androidx.camera.core.Logger.d("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new androidx.camera.view.internal.ScreenFlashUiInfo(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW, screenFlash));
        }
    }

    public final void setScreenFlashWindow(android.view.Window window) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.Camera2StreamConfigurationMap);
        androidx.camera.core.Logger.d("ScreenFlashView", sb.toString());
        if (this.Camera2StreamConfigurationMap != window) {
            this.getHighSpeedVideoSizes = window == null ? null : new androidx.camera.core.ImageCapture.ScreenFlash() { // from class: androidx.camera.view.ScreenFlashView.1
                private float getHighResolutionOutputSizeshNQ4ISI;
                private android.animation.ValueAnimator getHighSpeedVideoSizes;

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void apply(long j, final androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener) {
                    androidx.camera.core.Logger.d("ScreenFlashView", "ScreenFlash#apply");
                    this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.view.ScreenFlashView.Camera2StreamConfigurationMap(androidx.camera.view.ScreenFlashView.this);
                    androidx.camera.view.ScreenFlashView.getHighSpeedVideoFpsRangesFor(androidx.camera.view.ScreenFlashView.this, 1.0f);
                    android.animation.ValueAnimator valueAnimator = this.getHighSpeedVideoSizes;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    androidx.camera.view.ScreenFlashView screenFlashView = androidx.camera.view.ScreenFlashView.this;
                    java.util.Objects.requireNonNull(screenFlashListener);
                    this.getHighSpeedVideoSizes = androidx.camera.view.ScreenFlashView.getHighSpeedVideoSizes(screenFlashView, new java.lang.Runnable() { // from class: androidx.camera.view.ScreenFlashView$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.ImageCapture.ScreenFlashListener.this.onCompleted();
                        }
                    });
                }

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void clear() {
                    androidx.camera.core.Logger.d("ScreenFlashView", "ScreenFlash#clear");
                    android.animation.ValueAnimator valueAnimator = this.getHighSpeedVideoSizes;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.getHighSpeedVideoSizes = null;
                    }
                    androidx.camera.view.ScreenFlashView.this.setAlpha(0.0f);
                    androidx.camera.view.ScreenFlashView.getHighSpeedVideoFpsRangesFor(androidx.camera.view.ScreenFlashView.this, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            };
        }
        this.Camera2StreamConfigurationMap = window;
        getHighResolutionOutputSizeshNQ4ISI(getScreenFlash());
    }

    public final androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.getHighSpeedVideoSizes;
    }

    static /* synthetic */ float Camera2StreamConfigurationMap(androidx.camera.view.ScreenFlashView screenFlashView) {
        android.view.Window window = screenFlashView.Camera2StreamConfigurationMap;
        if (window == null) {
            androidx.camera.core.Logger.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.camera.view.ScreenFlashView screenFlashView, float f) {
        if (screenFlashView.Camera2StreamConfigurationMap == null) {
            androidx.camera.core.Logger.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (java.lang.Float.isNaN(f)) {
            androidx.camera.core.Logger.e("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        android.view.WindowManager.LayoutParams attributes = screenFlashView.Camera2StreamConfigurationMap.getAttributes();
        attributes.screenBrightness = f;
        screenFlashView.Camera2StreamConfigurationMap.setAttributes(attributes);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Brightness set to ");
        sb.append(attributes.screenBrightness);
        androidx.camera.core.Logger.d("ScreenFlashView", sb.toString());
    }

    static /* synthetic */ android.animation.ValueAnimator getHighSpeedVideoSizes(final androidx.camera.view.ScreenFlashView screenFlashView, final java.lang.Runnable runnable) {
        androidx.camera.core.Logger.d("ScreenFlashView", "animateToFullOpacity");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(screenFlashView.getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.ScreenFlashView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                androidx.camera.view.ScreenFlashView screenFlashView2 = androidx.camera.view.ScreenFlashView.this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("animateToFullOpacity: value = ");
                sb.append(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                androidx.camera.core.Logger.d("ScreenFlashView", sb.toString());
                screenFlashView2.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: androidx.camera.view.ScreenFlashView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.camera.core.Logger.d("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        ofFloat.start();
        return ofFloat;
    }
}
