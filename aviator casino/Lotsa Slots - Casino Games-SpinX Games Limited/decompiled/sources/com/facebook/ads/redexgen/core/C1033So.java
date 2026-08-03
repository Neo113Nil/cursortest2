package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1033So {
    public static byte[] A03;
    public static final java.util.concurrent.atomic.AtomicBoolean A04;
    public com.facebook.ads.redexgen.core.C1632ge A00;
    public java.lang.String A01;
    public final com.facebook.ads.redexgen.core.C1155Xl A02 = new com.facebook.ads.redexgen.core.C1155Xl(300000000000L, new com.facebook.ads.redexgen.core.C1643gp(this));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.facebook.ads.redexgen.core.UD A00(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.C1086Up.A1B(c1632ge)) {
            return com.facebook.ads.redexgen.core.UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return com.facebook.ads.redexgen.core.UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        com.facebook.ads.redexgen.core.C1632ge c1632ge;
        synchronized (this) {
            c1632ge = this.A00;
        }
        if (c1632ge == null) {
            return;
        }
        java.lang.String A05 = com.facebook.ads.redexgen.core.UG.A00().A01(c1632ge, true).A05(A00(c1632ge));
        synchronized (this) {
            this.A01 = A05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized java.lang.String A06(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c1632ge);
        if (this.A00.A07().AJw() || ((A04.get() && com.facebook.ads.redexgen.core.C1086Up.A21(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
