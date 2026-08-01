package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2443Xf implements ViewpointAction<C2387Uw, V1> {
    public XM A00;

    public C2443Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6R(C3539rN<C2387Uw, V1> c3539rN, InterfaceC3530rD interfaceC3530rD) {
        switch (interfaceC3530rD.A9U(c3539rN)) {
            case A02:
            case A04:
                this.A00.A02(c3539rN, interfaceC3530rD);
                break;
        }
    }
}
