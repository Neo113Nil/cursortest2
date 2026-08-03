package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1315bV {
    public static long A0F;
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public com.facebook.ads.redexgen.core.InterfaceC0886Mr A00;
    public com.facebook.ads.redexgen.core.AbstractC0888Mt A01;
    public com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public com.facebook.ads.redexgen.core.XS A03;
    public com.facebook.ads.redexgen.core.InterfaceC1151Xh A04;
    public com.facebook.ads.redexgen.core.InterfaceC1314bU A05;
    public boolean A06;
    public final com.facebook.ads.redexgen.core.C0900Ng A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.VA A09;
    public final com.facebook.ads.redexgen.core.Y2 A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0B;
    public final com.facebook.ads.redexgen.core.C1581fp A0C;
    public final java.lang.String A0D;
    public final boolean A0E;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, Byte.MIN_VALUE, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        java.lang.String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C1315bV(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        this(c1636gi, str, c1581fp, y2, va, c0900Ng, new com.facebook.ads.redexgen.core.C0835Ks());
    }

    public C1315bV(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0900Ng c0900Ng, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        this.A0E = true;
        this.A08 = c1636gi;
        this.A0D = str;
        this.A0C = c1581fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c0900Ng;
        this.A0B = interfaceC1177Yh;
    }

    public C1315bV(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0900Ng c0900Ng, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh) {
        this.A0E = true;
        this.A08 = c1636gi;
        this.A0D = str;
        this.A0C = c1581fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c0900Ng;
        this.A0B = interfaceC1177Yh;
        this.A04 = interfaceC1151Xh;
    }

    private com.facebook.ads.redexgen.core.EnumC0885Mq A00(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String A01 = A01(0, 22, 33);
        com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        try {
            com.facebook.ads.redexgen.core.YB.A0c(map, this.A02);
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = com.facebook.ads.redexgen.core.C0889Mu.A01(this.A08, this.A09, str, A00, new com.facebook.ads.redexgen.core.C1293b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof com.facebook.ads.redexgen.core.AnonymousClass87) {
                ((com.facebook.ads.redexgen.core.AnonymousClass87) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof com.facebook.ads.redexgen.core.AnonymousClass85)) {
                    actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A08;
                }
            }
            if (!(((this.A01 instanceof com.facebook.ads.redexgen.core.AnonymousClass84) || (this.A01 instanceof com.facebook.ads.redexgen.core.AnonymousClass87)) && com.facebook.ads.redexgen.core.YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != com.facebook.ads.redexgen.core.EnumC0885Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e(A01, A01(44, 20, 68) + str2, e);
        } catch (java.lang.Exception e2) {
            android.util.Log.e(A01, A01(22, 22, 27), e2);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        boolean A2w = com.facebook.ads.redexgen.core.C1086Up.A2w(c1636gi);
        int A07 = com.facebook.ads.redexgen.core.C1086Up.A07(c1636gi);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - A0F;
        if (A2w && A0F > 0 && currentTimeMillis < A07) {
            return true;
        }
        A0F = java.lang.System.currentTimeMillis();
        return false;
    }

    public final com.facebook.ads.redexgen.core.EnumC0885Mq A05(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> extraData) {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        new com.facebook.ads.redexgen.core.VI(str, this.A09).A04(com.facebook.ads.redexgen.core.VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC0885Mq = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                com.facebook.ads.redexgen.core.XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC0885Mq;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0886Mr A06() {
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.InterfaceC0886Mr A0E = this.A01.A0E();
            java.lang.String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return A0E;
        }
        return null;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC0886Mr interfaceC0886Mr) {
        this.A00 = interfaceC0886Mr;
        A02();
    }

    public final void A08(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        this.A02 = abstractC1801jd;
    }

    public final void A09(com.facebook.ads.redexgen.core.XS xs) {
        this.A03 = xs;
    }

    public final void A0A(com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh) {
        this.A04 = interfaceC1151Xh;
    }

    public final void A0B(com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        this.A05 = interfaceC1314bU;
    }

    public final void A0C(boolean z) {
        this.A06 = z;
    }
}
