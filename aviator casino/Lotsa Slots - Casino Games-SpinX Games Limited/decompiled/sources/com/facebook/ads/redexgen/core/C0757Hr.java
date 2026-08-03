package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0757Hr implements com.facebook.ads.redexgen.core.InterfaceC1274aq {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass55 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, com.google.common.base.Ascii.GS, 44, com.google.common.base.Ascii.US, 52, 39, 37, com.google.common.base.Ascii.US, 50, 39, 45, 44, com.google.common.base.Ascii.GS, 39, com.google.common.base.Ascii.US, 32};
    }

    static {
        A01();
    }

    public C0757Hr(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF7(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.C1265ah c1265ah2;
        com.facebook.ads.redexgen.core.C1265ah c1265ah3;
        this.A00.A0H = false;
        c1265ah = this.A00.A05;
        if (c1265ah != null) {
            c1265ah3 = this.A00.A05;
            c1265ah3.setProgress(100);
        }
        c1265ah2 = this.A00.A05;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah2, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF9(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.M8 m8;
        boolean z;
        int i;
        com.facebook.ads.redexgen.core.M8 m82;
        this.A00.A0H = true;
        c1265ah = this.A00.A05;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah, 0);
        m8 = this.A00.A04;
        if (m8 != null) {
            m82 = this.A00.A04;
            m82.setUrl(str);
        }
        z = this.A00.A0G;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0G = true;
                this.A00.A0r(A00(0, 19, 88));
            }
        }
        com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55 = this.A00;
        if (A02[1].length() != 23) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        com.facebook.ads.redexgen.core.AnonymousClass55.A03(anonymousClass55);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFY(int i) {
        boolean z;
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.C1265ah c1265ah2;
        z = this.A00.A0H;
        if (z) {
            c1265ah = this.A00.A05;
            if (c1265ah != null) {
                c1265ah2 = this.A00.A05;
                c1265ah2.setProgress(i);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFb(java.lang.String str) {
        com.facebook.ads.redexgen.core.M8 m8;
        com.facebook.ads.redexgen.core.M8 m82;
        m8 = this.A00.A04;
        if (m8 != null) {
            m82 = this.A00.A04;
            m82.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFe() {
        ((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A0B.ADJ(14);
    }
}
