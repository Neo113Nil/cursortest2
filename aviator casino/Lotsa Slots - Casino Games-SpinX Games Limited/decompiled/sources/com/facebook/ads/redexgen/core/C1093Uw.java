package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1093Uw {
    public final android.view.View A00;
    public final com.facebook.ads.redexgen.core.C1632ge A01;
    public final com.facebook.ads.redexgen.core.VA A02;
    public final java.lang.String A03;
    public final java.util.HashMap<java.lang.String, java.lang.String> A04 = new java.util.HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C1093Uw(com.facebook.ads.redexgen.core.C1632ge c1632ge, android.view.View view, java.lang.String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = c1632ge;
        this.A02 = c1632ge.A0A();
        this.A00 = view;
        this.A05 = z2;
        this.A06 = z;
    }

    public final android.view.View A00() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1632ge A01() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.VA A02() {
        return this.A02;
    }

    public final java.lang.String A03() {
        return this.A03;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        return java.util.Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
