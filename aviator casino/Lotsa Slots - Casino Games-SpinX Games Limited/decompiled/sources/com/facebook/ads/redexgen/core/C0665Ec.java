package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0665Ec implements java.lang.Comparable<com.facebook.ads.redexgen.core.C0665Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0665Ec(com.facebook.ads.redexgen.core.C2196qI c2196qI, int i) {
        this.A00 = (c2196qI.A0H & 1) != 0;
        this.A01 = com.facebook.ads.redexgen.core.C05539h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C0665Ec c0665Ec) {
        return com.facebook.ads.redexgen.core.AbstractC2048ns.A01().A09(this.A01, c0665Ec.A01).A09(this.A00, c0665Ec.A00).A05();
    }
}
