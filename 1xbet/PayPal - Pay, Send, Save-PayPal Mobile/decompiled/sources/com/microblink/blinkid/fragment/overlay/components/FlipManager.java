package com.microblink.blinkid.fragment.overlay.components;

/* loaded from: classes10.dex */
public class FlipManager {
    public static long FLIP_DURATION_MS = 2300;
    private final android.view.View getHighSpeedVideoFpsRanges;
    private final android.animation.AnimatorSet getHighSpeedVideoFpsRangesFor;

    public FlipManager(android.view.View view) {
        this.getHighSpeedVideoFpsRanges = view;
        this.getHighSpeedVideoFpsRangesFor = (android.animation.AnimatorSet) android.animation.AnimatorInflater.loadAnimator(view.getContext(), com.microblink.blinkid.library.R.animator.mb_card_flip);
    }

    public void cancel() {
        this.getHighSpeedVideoFpsRangesFor.end();
    }

    public long flipToBackSide() {
        float f = this.getHighSpeedVideoFpsRanges.getResources().getDisplayMetrics().density;
        this.getHighSpeedVideoFpsRanges.setCameraDistance(r1.getWidth() * 60 * f);
        this.getHighSpeedVideoFpsRangesFor.setTarget(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor.start();
        return FLIP_DURATION_MS;
    }
}
