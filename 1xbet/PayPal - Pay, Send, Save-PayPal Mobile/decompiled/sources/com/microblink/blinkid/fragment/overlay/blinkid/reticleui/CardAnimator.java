package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
interface CardAnimator {
    public static final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator getHighSpeedVideoFpsRanges = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.1
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
        public final void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation documentRotation, android.widget.FrameLayout frameLayout, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources) {
            frameLayout.setVisibility(8);
        }

        @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator
        public final void getHighSpeedVideoSizes() {
        }
    };

    public enum DocumentRotation {
        ZERO,
        CLOCKWISE_90,
        COUNTER_CLOCKWISE_90,
        UPSIDE_DOWN
    }

    void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation documentRotation, android.widget.FrameLayout frameLayout, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources);

    void getHighSpeedVideoSizes();
}
