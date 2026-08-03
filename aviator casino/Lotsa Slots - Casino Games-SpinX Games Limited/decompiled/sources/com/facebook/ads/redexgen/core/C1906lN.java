package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1906lN implements com.facebook.ads.redexgen.core.InterfaceC0838Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final java.util.List<com.facebook.ads.redexgen.core.LC> A04;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd[] A05;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FF, 9, 3, 1, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, -49, 4, com.google.common.base.Ascii.SYN, 2, 19, com.google.common.base.Ascii.NAK, 2, 19};
    }

    public C1906lN(java.util.List<com.facebook.ads.redexgen.core.LC> list) {
        this.A04 = list;
        this.A05 = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[list.size()];
    }

    private boolean A02(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        if (c04434v.A07() == 0) {
            return false;
        }
        if (c04434v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c04434v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c04434v, 0)) {
                return;
            }
            int A09 = c04434v.A09();
            int A07 = c04434v.A07();
            for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd : this.A05) {
                c04434v.A0f(A09);
                interfaceC0743Hd.AIr(c04434v, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5c(com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.LC lc = this.A04.get(i);
            lg.A05();
            com.facebook.ads.redexgen.core.InterfaceC0743Hd AKS = ha.AKS(lg.A03(), 3);
            AKS.A6e(new com.facebook.ads.redexgen.core.C03872p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(java.util.Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i] = AKS;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd : this.A05) {
                    interfaceC0743Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGq(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != -9223372036854775807L) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
