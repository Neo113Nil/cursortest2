package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1102cV {
    public String A02;
    public String A03;
    public String A04;
    public final C0614Mw A06;
    public final N9 A07;
    public final C1153dL A08;
    public C0616My A01 = C0616My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C1102cV(C1153dL c1153dL, C0614Mw c0614Mw, N9 n9) {
        this.A08 = c1153dL;
        this.A06 = c0614Mw;
        this.A07 = n9;
    }

    public final C1102cV A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C1102cV A0A(C0616My c0616My) {
        this.A01 = c0616My;
        return this;
    }

    public final C1102cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C1102cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C1102cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C1102cV A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C1104cX A0F() {
        return new C1104cX(this, null);
    }
}
