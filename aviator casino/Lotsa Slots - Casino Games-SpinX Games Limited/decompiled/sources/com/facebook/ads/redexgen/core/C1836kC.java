package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1836kC extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.N8 A00;
    public final /* synthetic */ org.json.JSONObject A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C1836kC(com.facebook.ads.redexgen.core.N8 n8, org.json.JSONObject jSONObject) {
        this.A00 = n8;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.T8 t82;
        java.util.concurrent.CountDownLatch countDownLatch;
        com.facebook.ads.redexgen.core.N7 n7;
        com.facebook.ads.redexgen.core.N7 n72;
        java.util.concurrent.CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            n7 = this.A00.A02;
            synchronized (n7) {
                n72 = this.A00.A02;
                n72.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (java.lang.InterruptedException e) {
            t82 = this.A00.A03;
            t82.A08().ABC(A00(0, 17, 25), com.facebook.ads.redexgen.core.AbstractC1048Td.A1B, new com.facebook.ads.redexgen.core.C1049Te(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            t8 = this.A00.A03;
            t8.A08().ABC(A00(0, 17, 25), com.facebook.ads.redexgen.core.AbstractC1048Td.A1A, new com.facebook.ads.redexgen.core.C1049Te(e2));
        }
    }
}
