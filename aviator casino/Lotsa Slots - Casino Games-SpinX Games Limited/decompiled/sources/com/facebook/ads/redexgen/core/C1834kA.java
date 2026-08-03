package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1834kA extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.N8 A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, com.google.common.base.Ascii.GS, 33, 35, 50, 50, 43, 44, 37};
    }

    public C1834kA(com.facebook.ads.redexgen.core.N8 n8, java.lang.String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.T8 t82;
        java.util.concurrent.CountDownLatch countDownLatch;
        boolean A0J;
        com.facebook.ads.redexgen.core.N7 n7;
        com.facebook.ads.redexgen.core.N7 n72;
        com.facebook.ads.redexgen.core.N7 n73;
        java.lang.String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                n7 = this.A00.A02;
                ((com.facebook.ads.redexgen.core.C0899Nf) n7.A05().get(this.A01)).A04((int) (java.lang.System.currentTimeMillis() / 1000));
                n72 = this.A00.A02;
                n72.A07(this.A01);
                n73 = this.A00.A02;
                n73.A06();
                this.A00.A08();
            }
        } catch (java.lang.InterruptedException e) {
            t82 = this.A00.A03;
            t82.A08().ABC(A00, com.facebook.ads.redexgen.core.AbstractC1048Td.A1B, new com.facebook.ads.redexgen.core.C1049Te(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            t8 = this.A00.A03;
            t8.A08().ABC(A00, com.facebook.ads.redexgen.core.AbstractC1048Td.A1A, new com.facebook.ads.redexgen.core.C1049Te(e2));
        }
    }
}
