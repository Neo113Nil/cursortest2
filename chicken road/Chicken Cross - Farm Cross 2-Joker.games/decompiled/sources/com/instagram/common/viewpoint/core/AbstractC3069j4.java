package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3069j4 implements InterfaceC2328Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC3069j4(boolean z) {
        this.A00 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADT() {
        A01(true);
    }
}
