package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1668hE implements com.facebook.ads.redexgen.core.InterfaceC1191Yv {
    public final /* synthetic */ com.facebook.ads.MediaViewListener A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1666hC A01;

    public C1668hE(com.facebook.ads.redexgen.core.C1666hC c1666hC, com.facebook.ads.MediaViewListener mediaViewListener) {
        this.A01 = c1666hC;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void ADQ() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void ADn() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void ADt() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void AE1() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void AE3() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void AFC() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void AGe() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewVideoRenderer = this.A01.A09;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1191Yv
    public final void onPause() {
        com.facebook.ads.MediaView mediaView;
        com.facebook.ads.MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onPause(mediaView);
    }
}
