package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1835kB extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.N8 A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C1835kB(com.facebook.ads.redexgen.core.N8 n8, java.lang.String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.T8 t82;
        java.util.concurrent.CountDownLatch countDownLatch;
        com.facebook.ads.redexgen.core.N7 n7;
        com.facebook.ads.redexgen.core.N7 n72;
        com.facebook.ads.redexgen.core.N7 n73;
        boolean A0J;
        com.facebook.ads.redexgen.core.N7 n74;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            n7 = this.A00.A02;
            synchronized (n7) {
                n72 = this.A00.A02;
                java.util.Iterator<java.lang.String> keys = n72.A05().keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        com.facebook.ads.redexgen.core.N8 n8 = this.A00;
                        n74 = this.A00.A02;
                        n8.A0E((com.facebook.ads.redexgen.core.C0899Nf) n74.A05().get(next), next, next.equals(this.A01));
                    }
                }
                n73 = this.A00.A02;
                n73.A06();
                this.A00.A08();
            }
        } catch (java.lang.InterruptedException e) {
            t82 = this.A00.A03;
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = t82.A08();
            java.lang.String encryptedId = A00(0, 17, 22);
            A08.ABC(encryptedId, com.facebook.ads.redexgen.core.AbstractC1048Td.A1B, new com.facebook.ads.redexgen.core.C1049Te(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            t8 = this.A00.A03;
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A082 = t8.A08();
            java.lang.String encryptedId2 = A00(0, 17, 22);
            A082.ABC(encryptedId2, com.facebook.ads.redexgen.core.AbstractC1048Td.A1A, new com.facebook.ads.redexgen.core.C1049Te(e2));
        }
    }
}
