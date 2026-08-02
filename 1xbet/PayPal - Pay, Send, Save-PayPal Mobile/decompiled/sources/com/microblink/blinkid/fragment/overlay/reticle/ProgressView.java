package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class ProgressView extends android.view.View {
    private android.graphics.RectF Camera2StreamConfigurationMap;
    private android.graphics.Paint getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.Runnable getHighSpeedVideoFpsRangesFor;
    com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private java.lang.Float getInputFormats;
    private final android.os.Handler getOutputMinFrameDuration;

    public ProgressView(android.content.Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new android.graphics.RectF((canvas.getWidth() / 2.0f) - this.getInputFormats.floatValue(), (canvas.getHeight() / 2.0f) - this.getInputFormats.floatValue(), this.getInputFormats.floatValue() + (canvas.getWidth() / 2.0f), this.getInputFormats.floatValue() + (canvas.getHeight() / 2.0f));
        }
        float f = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        float f2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI.setAlpha(this.getHighSpeedVideoSizesFor);
        canvas.drawArc(this.Camera2StreamConfigurationMap, 0.0f, f2 * 360.0f, false, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI.setAlpha(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes * 255);
        canvas.drawArc(this.Camera2StreamConfigurationMap, f * 360.0f, 45.0f, false, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public void onConfigurationChanged() {
        this.Camera2StreamConfigurationMap = null;
    }

    public void setAnimationEnabled(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
        if (z && !this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.isStarted()) {
            this.getOutputMinFrameDuration.post(new com.microblink.blinkid.fragment.overlay.reticle.ProgressView$$ExternalSyntheticLambda1(this));
            return;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator = this.getHighSpeedVideoSizes;
        progressAnimator.Camera2StreamConfigurationMap.cancel();
        progressAnimator.getHighSpeedVideoFpsRanges = 0.0f;
        progressAnimator.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        progressAnimator.getHighSpeedVideoSizes = 0;
    }

    public void setup(int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighResolutionOutputSizeshNQ4ISI = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(i);
        this.getHighResolutionOutputSizeshNQ4ISI.setAlpha(127);
        this.getHighResolutionOutputSizeshNQ4ISI.setStrokeWidth(6.0f);
        this.getHighResolutionOutputSizeshNQ4ISI.setAntiAlias(true);
        this.getInputFormats = java.lang.Float.valueOf(getContext().getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_inner_reticle_margin));
        this.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI.getAlpha();
        com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator = new com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator(this);
        this.getHighSpeedVideoSizes = progressAnimator;
        progressAnimator.addListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ProgressView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator2 = com.microblink.blinkid.fragment.overlay.reticle.ProgressView.this.getHighSpeedVideoSizes;
                progressAnimator2.getHighSpeedVideoFpsRanges = 0.0f;
                progressAnimator2.getHighResolutionOutputSizeshNQ4ISI = 1.0f;
                progressAnimator2.getHighSpeedVideoSizes = 1;
                com.microblink.blinkid.fragment.overlay.reticle.ProgressView.getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.reticle.ProgressView.this);
            }
        });
    }

    public ProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputMinFrameDuration = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoFpsRanges = true;
        this.Camera2StreamConfigurationMap = null;
    }

    /* renamed from: $r8$lambda$Vof3wl6vn4KRT4TH10nldCL-wxU, reason: not valid java name */
    public static /* synthetic */ void m10895$r8$lambda$Vof3wl6vn4KRT4TH10nldCLwxU(final com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView) {
        if (progressView.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.isStarted() || !progressView.getHighSpeedVideoFpsRanges) {
            return;
        }
        java.lang.Runnable runnable = progressView.getHighSpeedVideoFpsRangesFor;
        if (runnable != null) {
            progressView.getOutputMinFrameDuration.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ProgressView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.reticle.ProgressView.$r8$lambda$k_hzu5L4jkO9HHtUGQyDb8NiaUE(com.microblink.blinkid.fragment.overlay.reticle.ProgressView.this);
            }
        };
        progressView.getHighSpeedVideoFpsRangesFor = runnable2;
        progressView.getOutputMinFrameDuration.postDelayed(runnable2, 0L);
    }

    public static /* synthetic */ void $r8$lambda$k_hzu5L4jkO9HHtUGQyDb8NiaUE(com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView) {
        if (progressView.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.isStarted() || !progressView.getHighSpeedVideoFpsRanges) {
            return;
        }
        com.microblink.blinkid.fragment.overlay.reticle.ProgressAnimator progressAnimator = progressView.getHighSpeedVideoSizes;
        if (progressAnimator.Camera2StreamConfigurationMap.isRunning()) {
            return;
        }
        progressAnimator.Camera2StreamConfigurationMap.start();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView) {
        progressView.getOutputMinFrameDuration.post(new com.microblink.blinkid.fragment.overlay.reticle.ProgressView$$ExternalSyntheticLambda1(progressView));
    }
}
