package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1638gk implements com.facebook.ads.redexgen.core.InterfaceC1566fa {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.CallableC1037Ss A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1038St A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C1638gk(com.facebook.ads.redexgen.core.CallableC1037Ss callableC1037Ss, com.facebook.ads.redexgen.core.C1038St c1038St, long j, long j2) {
        this.A02 = callableC1037Ss;
        this.A03 = c1038St;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1566fa
    public final void ADj(boolean z) {
        com.facebook.ads.redexgen.core.T8 t8;
        java.util.concurrent.BlockingQueue blockingQueue;
        com.facebook.ads.redexgen.core.T8 t82;
        com.facebook.ads.redexgen.core.T8 t83;
        t8 = this.A02.A01.A04;
        if (com.facebook.ads.redexgen.core.T0.A06(t8)) {
            com.facebook.ads.redexgen.core.C1044Sz c1044Sz = new com.facebook.ads.redexgen.core.C1044Sz(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            t82 = this.A02.A01.A04;
            com.facebook.ads.redexgen.core.T0.A04(t82, c1044Sz, z);
            if (!z) {
                t83 = this.A02.A01.A04;
                com.facebook.ads.redexgen.core.T0.A05(t83, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2112, null, java.lang.Long.valueOf(this.A00), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A01), null);
            }
            com.facebook.ads.redexgen.core.C1042Sx.A0A().put(c1044Sz.A04, c1044Sz);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1566fa
    public final void ADr(java.lang.Throwable th) {
        com.facebook.ads.redexgen.core.T8 t8;
        java.util.concurrent.BlockingQueue blockingQueue;
        com.facebook.ads.redexgen.core.T8 t82;
        t8 = this.A02.A01.A04;
        if (com.facebook.ads.redexgen.core.T0.A06(t8)) {
            t82 = this.A02.A01.A04;
            com.facebook.ads.redexgen.core.T0.A05(t82, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th != null ? th.toString() : A00(0, 7, 109), null, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A01), null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
