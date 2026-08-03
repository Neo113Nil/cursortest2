package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1820jw implements com.facebook.ads.redexgen.core.InterfaceC1034Sp {
    public static byte[] A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.N9 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass80 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass76 A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Z2 A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C1820jw(com.facebook.ads.redexgen.core.AnonymousClass80 anonymousClass80, com.facebook.ads.redexgen.core.Z2 z2, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76) {
        this.A01 = anonymousClass80;
        this.A03 = z2;
        this.A00 = n9;
        this.A02 = anonymousClass76;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADL() {
        long j;
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.CACHE_FAILURE_ERROR;
        java.lang.String A00 = A00(0, 27, 69);
        com.facebook.ads.redexgen.core.InterfaceC1863kf A0F = this.A02.A0F();
        j = this.A01.A00;
        A0F.A3N(com.facebook.ads.redexgen.core.Y1.A01(j), adErrorType.getErrorCode(), A00);
        this.A00.AEN(this.A01, com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1034Sp
    public final void ADT() {
        com.facebook.ads.redexgen.core.N9 n9;
        this.A03.A0J();
        this.A00.ADD(this.A01, this.A03);
        com.facebook.ads.redexgen.core.InterfaceC1863kf A0F = this.A02.A0F();
        n9 = this.A01.A01;
        A0F.A4O(n9 != null);
    }
}
