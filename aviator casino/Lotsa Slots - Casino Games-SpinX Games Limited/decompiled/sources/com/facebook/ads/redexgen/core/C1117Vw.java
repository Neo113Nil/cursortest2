package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1117Vw extends com.facebook.ads.redexgen.core.N2 {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UK A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, 63};
    }

    public C1117Vw(com.facebook.ads.redexgen.core.UK uk) {
        this.A00 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0B(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        this.A00.A1d(c1818ju);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv2;
        interfaceC1066Tv = this.A00.A0I;
        if (interfaceC1066Tv != null) {
            interfaceC1066Tv2 = this.A00.A0I;
            interfaceC1066Tv2.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        throw new java.lang.IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(com.facebook.ads.redexgen.core.N1 n1) {
        com.facebook.ads.redexgen.core.C05067g c05067g;
        com.facebook.ads.redexgen.core.C05067g c05067g2;
        c05067g = this.A00.A0B;
        if (c05067g != null) {
            c05067g2 = this.A00.A0B;
            c05067g2.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        long j;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv;
        com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv2;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(com.facebook.ads.redexgen.core.Y1.A01(j), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
        interfaceC1066Tv = this.A00.A0I;
        if (interfaceC1066Tv != null) {
            interfaceC1066Tv2 = this.A00.A0I;
            interfaceC1066Tv2.ADp(c1108Vm);
        }
    }
}
