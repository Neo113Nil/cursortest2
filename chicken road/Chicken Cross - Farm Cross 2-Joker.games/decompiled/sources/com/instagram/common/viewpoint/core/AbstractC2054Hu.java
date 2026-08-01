package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2054Hu {
    public final InterfaceC2037Hd A00;

    public abstract boolean A0B(C17374v c17374v) throws C3K;

    public abstract boolean A0C(C17374v c17374v, long j) throws C3K;

    public AbstractC2054Hu(InterfaceC2037Hd interfaceC2037Hd) {
        this.A00 = interfaceC2037Hd;
    }

    public final boolean A00(C17374v c17374v, long j) throws C3K {
        return A0B(c17374v) && A0C(c17374v, j);
    }
}
