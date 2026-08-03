package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04605m extends com.facebook.ads.redexgen.core.E8 {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1412d4 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, com.google.common.base.Ascii.EM, 4};
    }

    public C04605m(com.facebook.ads.redexgen.core.C1412d4 c1412d4) {
        this.A00 = c1412d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.E9 e9) {
        com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d3;
        org.json.JSONObject A03;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.RunnableC1410d2(this));
        interfaceC1411d3 = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC1411d3.AGR(A00(0, 5, 126), A03);
    }
}
