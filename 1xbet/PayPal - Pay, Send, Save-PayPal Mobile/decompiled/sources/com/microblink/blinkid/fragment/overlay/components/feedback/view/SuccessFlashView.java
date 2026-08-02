package com.microblink.blinkid.fragment.overlay.components.feedback.view;

/* loaded from: classes10.dex */
public class SuccessFlashView extends android.view.View {
    com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.PointF getHighSpeedVideoFpsRanges;
    private android.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public class Animator {
        final android.animation.AnimatorSet getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoSizes = 0.0f;
        float Camera2StreamConfigurationMap = 0.0f;

        Animator(final com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView successFlashView) {
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setStartDelay(400L);
            duration.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.this.getHighSpeedVideoSizes = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    successFlashView.postInvalidate();
                }
            });
            android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration2.setStartDelay(600L);
            duration2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.this.getHighSpeedVideoSizes = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    successFlashView.postInvalidate();
                }
            });
            android.animation.ValueAnimator duration3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(400L);
            duration3.setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator());
            duration3.setStartDelay(400L);
            duration3.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator.this.Camera2StreamConfigurationMap = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    successFlashView.postInvalidate();
                }
            });
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.getHighResolutionOutputSizeshNQ4ISI = animatorSet;
            animatorSet.playTogether(duration, duration2, duration3);
        }
    }

    public SuccessFlashView(android.content.Context context) {
        this(context, null, 0);
    }

    public void cancelAnimation() {
        com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator animator = this.getHighResolutionOutputSizeshNQ4ISI;
        animator.getHighResolutionOutputSizeshNQ4ISI.cancel();
        animator.getHighSpeedVideoSizes = 0.0f;
        animator.Camera2StreamConfigurationMap = 0.0f;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        float f;
        float f2;
        super.draw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        android.graphics.PointF pointF = this.getHighSpeedVideoFpsRanges;
        if (pointF != null) {
            float f3 = pointF.x;
            if (f3 >= 0.0f && f3 <= 1.0f) {
                float f4 = pointF.y;
                if (f4 >= 0.0f && f4 <= 1.0f) {
                    f = width * f3;
                    f2 = height * f4;
                    this.getHighSpeedVideoFpsRangesFor.setAlpha((int) ((this.getHighSpeedVideoSizes * this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) / 2.0f));
                    canvas.drawCircle(f, f2, canvas.getHeight() * this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
                }
            }
        }
        f = width / 2.0f;
        f2 = height / 2.0f;
        this.getHighSpeedVideoFpsRangesFor.setAlpha((int) ((this.getHighSpeedVideoSizes * this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) / 2.0f));
        canvas.drawCircle(f, f2, canvas.getHeight() * this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    public void setRelativeCenter(android.graphics.PointF pointF) {
        this.getHighSpeedVideoFpsRanges = pointF;
    }

    public void setup(int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRangesFor = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.getHighSpeedVideoFpsRangesFor.setColor(i);
        this.getHighSpeedVideoFpsRangesFor.setAntiAlias(true);
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getAlpha();
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator(this);
    }

    public void startAnimation() {
        com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView.Animator animator = this.getHighResolutionOutputSizeshNQ4ISI;
        if (animator.getHighResolutionOutputSizeshNQ4ISI.isRunning()) {
            return;
        }
        animator.getHighResolutionOutputSizeshNQ4ISI.start();
    }

    public SuccessFlashView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SuccessFlashView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
