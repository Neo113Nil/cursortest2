package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class UD implements InterfaceC0808Um {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ TD A01;

    public UD(TD td, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = td;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0808Um
    public final void AIk() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0808Um
    public final void AIp(NativeAd nativeAd) {
        this.A01.A0I(C0696Qc.A0L(nativeAd.getInternalNativeAd()), new C0773Tc(C0696Qc.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0808Um
    public final void AJn() {
        this.A01.A0D();
    }
}
