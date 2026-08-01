package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3058it extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C18167w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C17947a A02;

    public C3058it(C17947a c17947a, O8 o8, C18167w c18167w) {
        this.A02 = c17947a;
        this.A01 = o8;
        this.A00 = c18167w;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C2402Vm(adErrorType, ""));
    }
}
