package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1149Xf implements com.facebook.ads.redexgen.core.ViewpointAction<com.facebook.ads.redexgen.core.C1093Uw, com.facebook.ads.redexgen.core.V1> {
    public com.facebook.ads.redexgen.core.XM A00;

    public C1149Xf(com.facebook.ads.redexgen.core.XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(com.facebook.ads.redexgen.core.C2245rN<com.facebook.ads.redexgen.core.C1093Uw, com.facebook.ads.redexgen.core.V1> c2245rN, com.facebook.ads.redexgen.core.InterfaceC2236rD interfaceC2236rD) {
        switch (interfaceC2236rD.A9U(c2245rN)) {
            case A02:
            case A04:
                this.A00.A02(c2245rN, interfaceC2236rD);
                break;
        }
    }
}
