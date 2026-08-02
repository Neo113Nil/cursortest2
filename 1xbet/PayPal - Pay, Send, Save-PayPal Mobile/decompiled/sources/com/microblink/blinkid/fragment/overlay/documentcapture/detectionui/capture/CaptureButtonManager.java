package com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture;

/* loaded from: classes10.dex */
public final class CaptureButtonManager {
    private final android.animation.ObjectAnimator Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonView getHighSpeedVideoFpsRangesFor;
    private final android.animation.ObjectAnimator getHighSpeedVideoSizes;

    public interface EndAnimationListener {
        void onAnimationEnd();
    }

    public CaptureButtonManager(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonView captureButtonView) {
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.this.getHighSpeedVideoFpsRangesFor.invalidate();
            }
        };
        this.getHighSpeedVideoFpsRangesFor = captureButtonView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(captureButtonView, "spinnerStartAngle", 270.0f, 630.0f);
        this.Camera2StreamConfigurationMap = ofFloat;
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(captureButtonView, "spinnerSweepAngle", 90.0f, 360.0f);
        this.getHighSpeedVideoSizes = ofFloat2;
        ofFloat2.setDuration(500L);
        ofFloat2.addUpdateListener(animatorUpdateListener);
    }

    public final void cancelSpinnerAnimation(final com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.EndAnimationListener endAnimationListener) {
        if (this.Camera2StreamConfigurationMap.isRunning() || this.getHighSpeedVideoSizes.isRunning()) {
            this.Camera2StreamConfigurationMap.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.this.Camera2StreamConfigurationMap.cancel();
                    com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.this.getHighSpeedVideoSizes.removeAllListeners();
                    com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.this.getHighSpeedVideoSizes.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.1.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(android.animation.Animator animator2) {
                            endAnimationListener.onAnimationEnd();
                        }
                    });
                    com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.this.getHighSpeedVideoSizes.start();
                }
            });
        } else {
            endAnimationListener.onAnimationEnd();
        }
    }

    public final void startSpinnerAnimation() {
        this.Camera2StreamConfigurationMap.removeAllListeners();
        this.getHighSpeedVideoFpsRangesFor.setSpinnerSweepAngle(90.0f);
        this.Camera2StreamConfigurationMap.start();
    }
}
