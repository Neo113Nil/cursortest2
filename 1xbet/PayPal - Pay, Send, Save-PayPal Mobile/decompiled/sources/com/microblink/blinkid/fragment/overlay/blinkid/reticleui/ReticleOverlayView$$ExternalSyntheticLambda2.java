package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public final /* synthetic */ class ReticleOverlayView$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView f$0;
    public final /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState f$1;
    public final /* synthetic */ java.lang.String f$2;

    public /* synthetic */ ReticleOverlayView$$ExternalSyntheticLambda2(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView reticleOverlayView, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState, java.lang.String str) {
        this.f$0 = reticleOverlayView;
        this.f$1 = reticleUiState;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.changeState(this.f$1, this.f$2);
    }
}
