package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0760Hu {
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd A00;

    public abstract boolean A0B(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C3K;

    public abstract boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j) throws com.facebook.ads.redexgen.core.C3K;

    public AbstractC0760Hu(com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        this.A00 = interfaceC0743Hd;
    }

    public final boolean A00(com.facebook.ads.redexgen.core.C04434v c04434v, long j) throws com.facebook.ads.redexgen.core.C3K {
        return A0B(c04434v) && A0C(c04434v, j);
    }
}
