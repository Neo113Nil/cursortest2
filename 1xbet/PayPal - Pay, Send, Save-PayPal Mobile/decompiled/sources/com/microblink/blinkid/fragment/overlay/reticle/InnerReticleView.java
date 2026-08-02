package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class InnerReticleView extends android.view.View {
    private android.graphics.Paint Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator getHighSpeedVideoFpsRanges;
    private java.lang.Float getHighSpeedVideoFpsRangesFor;
    private java.lang.Runnable getHighSpeedVideoSizes;
    private final android.os.Handler getInputSizeshNQ4ISI;
    private android.graphics.RectF getOutputFormats;

    public InnerReticleView(android.content.Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.getOutputFormats == null) {
            this.getOutputFormats = new android.graphics.RectF((canvas.getWidth() / 2.0f) - this.getHighSpeedVideoFpsRangesFor.floatValue(), (canvas.getHeight() / 2.0f) - this.getHighSpeedVideoFpsRangesFor.floatValue(), this.getHighSpeedVideoFpsRangesFor.floatValue() + (canvas.getWidth() / 2.0f), this.getHighSpeedVideoFpsRangesFor.floatValue() + (canvas.getHeight() / 2.0f));
        }
        float f = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
        float f2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor * 180.0f;
        float f3 = f * 45.0f;
        canvas.drawArc(this.getOutputFormats, (67.5f * f) + f2, f3, false, this.Camera2StreamConfigurationMap);
        canvas.drawArc(this.getOutputFormats, (157.5f * f) + f2, f3, false, this.Camera2StreamConfigurationMap);
        canvas.drawArc(this.getOutputFormats, (247.5f * f) + f2, f3, false, this.Camera2StreamConfigurationMap);
        canvas.drawArc(this.getOutputFormats, (f * 337.5f) + f2, f3, false, this.Camera2StreamConfigurationMap);
    }

    public void onConfigurationChanged() {
        this.getOutputFormats = null;
    }

    public void setAnimationEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (z && !this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isStarted()) {
            this.getInputSizeshNQ4ISI.post(new com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView$$ExternalSyntheticLambda1(this));
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator = this.getHighSpeedVideoFpsRanges;
        innerReticleAnimator.getHighSpeedVideoFpsRanges.cancel();
        innerReticleAnimator.getHighSpeedVideoFpsRangesFor = 0.0f;
        innerReticleAnimator.Camera2StreamConfigurationMap = 0.0f;
        innerReticleAnimator.getHighSpeedVideoSizes.setStartDelay(2000L);
        innerReticleAnimator.getHighResolutionOutputSizeshNQ4ISI.setDuration(1400L);
    }

    public void setup(int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.Camera2StreamConfigurationMap = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.Camera2StreamConfigurationMap.setColor(i);
        this.Camera2StreamConfigurationMap.setAlpha(127);
        this.Camera2StreamConfigurationMap.setStrokeWidth(7.0f);
        this.Camera2StreamConfigurationMap.setAntiAlias(true);
        this.getHighSpeedVideoFpsRangesFor = java.lang.Float.valueOf(getContext().getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_inner_reticle_margin));
        com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator = new com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator(this);
        this.getHighSpeedVideoFpsRanges = innerReticleAnimator;
        innerReticleAnimator.addListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator2 = com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.this.getHighSpeedVideoFpsRanges;
                innerReticleAnimator2.Camera2StreamConfigurationMap = 1.0f;
                innerReticleAnimator2.getHighSpeedVideoFpsRangesFor = 0.0f;
                innerReticleAnimator2.getHighSpeedVideoSizes.setStartDelay(400L);
                innerReticleAnimator2.getHighResolutionOutputSizeshNQ4ISI.setDuration(0L);
                innerReticleAnimator2.getHighResolutionOutputSizeshNQ4ISI.setStartDelay(0L);
                com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.this);
            }
        });
    }

    public InnerReticleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InnerReticleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getInputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getOutputFormats = null;
    }

    /* renamed from: $r8$lambda$iRUw-lEJ8NB4HoCjsWozEvFtPCY, reason: not valid java name */
    public static /* synthetic */ void m10893$r8$lambda$iRUwlEJ8NB4HoCjsWozEvFtPCY(final com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView) {
        if (innerReticleView.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isStarted() || !innerReticleView.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        java.lang.Runnable runnable = innerReticleView.getHighSpeedVideoSizes;
        if (runnable != null) {
            innerReticleView.getInputSizeshNQ4ISI.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.$r8$lambda$nmUQJD4beg_954WqpNWPxZiK0CI(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView.this);
            }
        };
        innerReticleView.getHighSpeedVideoSizes = runnable2;
        innerReticleView.getInputSizeshNQ4ISI.postDelayed(runnable2, 0L);
    }

    public static /* synthetic */ void $r8$lambda$nmUQJD4beg_954WqpNWPxZiK0CI(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView) {
        if (innerReticleView.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.isStarted() || !innerReticleView.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        com.microblink.blinkid.fragment.overlay.reticle.InnerReticleAnimator innerReticleAnimator = innerReticleView.getHighSpeedVideoFpsRanges;
        if (innerReticleAnimator.getHighSpeedVideoFpsRanges.isRunning()) {
            return;
        }
        innerReticleAnimator.getHighSpeedVideoFpsRanges.start();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView) {
        innerReticleView.getInputSizeshNQ4ISI.post(new com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView$$ExternalSyntheticLambda1(innerReticleView));
    }
}
