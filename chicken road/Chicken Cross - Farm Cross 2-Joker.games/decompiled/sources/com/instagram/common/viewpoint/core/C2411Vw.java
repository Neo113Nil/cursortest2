package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2411Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, 63};
    }

    public C2411Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0B(C3112ju c3112ju) {
        this.A00.A1d(c3112ju);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterfaceC2360Tv interfaceC2360Tv;
        InterfaceC2360Tv interfaceC2360Tv2;
        interfaceC2360Tv = this.A00.A0I;
        if (interfaceC2360Tv != null) {
            interfaceC2360Tv2 = this.A00.A0I;
            interfaceC2360Tv2.ACm();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C18007g c18007g;
        C18007g c18007g2;
        c18007g = this.A00.A0B;
        if (c18007g != null) {
            c18007g2 = this.A00.A0B;
            c18007g2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C2402Vm c2402Vm) {
        long j;
        InterfaceC2360Tv interfaceC2360Tv;
        InterfaceC2360Tv interfaceC2360Tv2;
        InterfaceC2156Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2402Vm.A03().getErrorCode(), c2402Vm.A04());
        interfaceC2360Tv = this.A00.A0I;
        if (interfaceC2360Tv != null) {
            interfaceC2360Tv2 = this.A00.A0I;
            interfaceC2360Tv2.ADp(c2402Vm);
        }
    }
}
