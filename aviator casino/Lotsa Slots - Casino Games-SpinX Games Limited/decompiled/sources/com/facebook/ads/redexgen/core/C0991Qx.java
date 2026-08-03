package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0991Qx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final com.facebook.ads.redexgen.core.C0991Qx A00(com.facebook.ads.redexgen.core.RK rk, int i) {
        android.view.View view = rk.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0991Qx A01(com.facebook.ads.redexgen.core.RK rk) {
        return A00(rk, 0);
    }
}
