package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W4 implements com.facebook.ads.redexgen.core.VX {
    public final /* synthetic */ com.facebook.ads.internal.api.MediaViewVideoRendererApi A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1120Vz A01;

    public W4(com.facebook.ads.redexgen.core.C1120Vz c1120Vz, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1120Vz;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.VX
    public final void AJU() {
        this.A01.A00 = 1.0f;
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.core.VX
    public final void AJZ(com.facebook.ads.NativeAd nativeAd) {
        this.A01.A02 = nativeAd.getNativeOptions();
        this.A01.A0G();
        this.A01.A0H();
        this.A01.A0Q(com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd()), new com.facebook.ads.redexgen.core.W0(com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.core.VX
    public final void AKY() {
        this.A01.A0J();
    }
}
