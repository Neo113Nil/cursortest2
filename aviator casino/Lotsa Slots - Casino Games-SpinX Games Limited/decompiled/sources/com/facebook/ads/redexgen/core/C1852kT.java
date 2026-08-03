package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1852kT implements com.facebook.ads.redexgen.core.C5Y {
    public static java.lang.String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.C5V A02;
    public com.facebook.ads.redexgen.core.C5Y A04;
    public com.facebook.ads.redexgen.core.MP A05;
    public boolean A07;
    public com.facebook.ads.redexgen.core.C5Y A03 = new com.facebook.ads.redexgen.core.C2128pB();
    public com.facebook.ads.redexgen.core.MY A06 = com.facebook.ads.redexgen.core.MY.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C8B A5I() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00, this.A01);
    }

    private com.facebook.ads.redexgen.core.C8B A01(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, int i, int i2) {
        com.facebook.ads.redexgen.core.C1853kU c1853kU;
        com.facebook.ads.redexgen.core.MP mp = (com.facebook.ads.redexgen.core.MP) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A05);
        if (this.A07 || interfaceC2132pF == null) {
            c1853kU = null;
        } else if (this.A02 != null) {
            com.facebook.ads.redexgen.core.C5V c5v = this.A02;
            java.lang.String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c1853kU = c5v.A5H();
        } else {
            c1853kU = new com.facebook.ads.redexgen.core.C1854kV().A00(mp).A5H();
        }
        return new com.facebook.ads.redexgen.core.C8B(mp, interfaceC2132pF, this.A03.A5I(), c1853kU, this.A06, i, null, i2, null);
    }

    public final com.facebook.ads.redexgen.core.AbstractC04013d A02() {
        return null;
    }

    public final com.facebook.ads.redexgen.core.C1852kT A03(int i) {
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1852kT A04(com.facebook.ads.redexgen.core.C5Y c5y) {
        this.A03 = c5y;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1852kT A05(com.facebook.ads.redexgen.core.C5Y c5y) {
        this.A04 = c5y;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1852kT A06(com.facebook.ads.redexgen.core.MP mp) {
        this.A05 = mp;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C8B A07() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00 | 1, -1000);
    }
}
