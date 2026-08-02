package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
class CardFlipAnimator implements com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator {
    private android.animation.AnimatorSet Camera2StreamConfigurationMap;

    CardFlipAnimator() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator
    public void cancel() {
        android.animation.AnimatorSet animatorSet = this.Camera2StreamConfigurationMap;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.Camera2StreamConfigurationMap.end();
            this.Camera2StreamConfigurationMap.cancel();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator
    public void start(final android.widget.ImageView imageView, final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources) {
        final android.content.Context context = imageView.getContext();
        imageView.setVisibility(0);
        imageView.setImageDrawable(blinkCardReticleOverlayResources.getOutputSizeshNQ4ISI);
        imageView.setRotationX(0.0f);
        imageView.setRotationY(0.0f);
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(context, com.microblink.blinkid.library.R.animator.mb_card_flip_1);
        this.Camera2StreamConfigurationMap = animatorSet;
        animatorSet.setTarget(imageView);
        this.Camera2StreamConfigurationMap.start();
        this.Camera2StreamConfigurationMap.addListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator.this.Camera2StreamConfigurationMap.removeAllListeners();
                imageView.setImageDrawable(blinkCardReticleOverlayResources.CoroutineDebuggingKt);
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator.this.Camera2StreamConfigurationMap = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(context, com.microblink.blinkid.library.R.animator.mb_card_flip_2);
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator.this.Camera2StreamConfigurationMap.setTarget(imageView);
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardFlipAnimator.this.Camera2StreamConfigurationMap.start();
            }
        });
    }
}
