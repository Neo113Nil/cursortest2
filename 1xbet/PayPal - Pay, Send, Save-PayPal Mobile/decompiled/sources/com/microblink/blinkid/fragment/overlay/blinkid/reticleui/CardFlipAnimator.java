package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
class CardFlipAnimator implements com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator {
    private android.animation.AnimatorSet getHighSpeedVideoFpsRangesFor;

    CardFlipAnimator() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
    public final void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation documentRotation, android.widget.FrameLayout frameLayout, final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources) {
        final android.content.Context context = frameLayout.getContext();
        frameLayout.removeAllViews();
        final android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageDrawable(reticleOverlayResources.getValidOutputFormatsForInputhNQ4ISI);
        frameLayout.addView(imageView, new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.setVisibility(0);
        imageView.setRotationX(0.0f);
        imageView.setRotationY(0.0f);
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(context, com.microblink.blinkid.library.R.animator.mb_card_flip_1);
        this.getHighSpeedVideoFpsRangesFor = animatorSet;
        animatorSet.setTarget(imageView);
        this.getHighSpeedVideoFpsRangesFor.start();
        this.getHighSpeedVideoFpsRangesFor.addListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator.this.getHighSpeedVideoFpsRangesFor.removeAllListeners();
                imageView.setImageDrawable(reticleOverlayResources.c);
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator.this.getHighSpeedVideoFpsRangesFor = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(context, com.microblink.blinkid.library.R.animator.mb_card_flip_2);
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator.this.getHighSpeedVideoFpsRangesFor.setTarget(imageView);
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardFlipAnimator.this.getHighSpeedVideoFpsRangesFor.start();
            }
        });
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
    public final void getHighSpeedVideoSizes() {
        android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoFpsRangesFor;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.getHighSpeedVideoFpsRangesFor.end();
            this.getHighSpeedVideoFpsRangesFor.cancel();
        }
    }
}
