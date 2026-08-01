package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3064iz extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C3117jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C18037j A02;

    public C3064iz(C18037j c18037j, O8 o8, C3117jz c3117jz) {
        this.A02 = c18037j;
        this.A01 = o8;
        this.A00 = c3117jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C2402Vm A00 = C2402Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
