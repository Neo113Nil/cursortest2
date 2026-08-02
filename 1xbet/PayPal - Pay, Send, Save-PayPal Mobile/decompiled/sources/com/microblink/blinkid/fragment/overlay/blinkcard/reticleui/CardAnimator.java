package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
public interface CardAnimator {
    public static final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator EMPTY = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator.1
        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator
        public void cancel() {
        }

        @Override // com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator
        public void start(android.widget.ImageView imageView, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources) {
            imageView.setVisibility(8);
        }
    };

    void cancel();

    void start(android.widget.ImageView imageView, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources);
}
