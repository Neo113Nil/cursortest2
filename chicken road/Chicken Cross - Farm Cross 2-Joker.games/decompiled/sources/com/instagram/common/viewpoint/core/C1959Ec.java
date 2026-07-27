package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1959Ec implements Comparable<C1959Ec> {
    public final boolean A00;
    public final boolean A01;

    public C1959Ec(C3490qI c3490qI, int i) {
        this.A00 = (c3490qI.A0H & 1) != 0;
        this.A01 = C18479h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1959Ec c1959Ec) {
        return AbstractC3342ns.A01().A09(this.A01, c1959Ec.A01).A09(this.A00, c1959Ec.A00).A05();
    }
}
