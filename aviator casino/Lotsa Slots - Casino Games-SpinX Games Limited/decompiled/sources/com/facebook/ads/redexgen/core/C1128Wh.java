package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1128Wh {
    public static java.lang.String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final java.lang.ThreadLocal<com.facebook.ads.redexgen.core.C1128Wh> A02 = new java.lang.ThreadLocal<>();
    public final com.facebook.ads.redexgen.core.WQ A00 = new com.facebook.ads.redexgen.core.WQ();

    public static com.facebook.ads.redexgen.core.WQ A00() {
        return A02().A00;
    }

    public static com.facebook.ads.redexgen.core.WQ A01(com.facebook.ads.redexgen.core.C1127Wg c1127Wg) {
        com.facebook.ads.redexgen.core.WQ currentStackTraces = new com.facebook.ads.redexgen.core.WQ(A00());
        currentStackTraces.add(c1127Wg);
        return currentStackTraces;
    }

    public static com.facebook.ads.redexgen.core.C1128Wh A02() {
        com.facebook.ads.redexgen.core.C1128Wh c1128Wh = A02.get();
        if (c1128Wh == null) {
            com.facebook.ads.redexgen.core.C1128Wh c1128Wh2 = new com.facebook.ads.redexgen.core.C1128Wh();
            A02.set(c1128Wh2);
            return c1128Wh2;
        }
        return c1128Wh;
    }

    public static void A03(com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc) {
        com.facebook.ads.redexgen.core.WQ A06 = abstractRunnableC1123Wc.A06();
        if (A06 != null) {
            com.facebook.ads.redexgen.core.WQ createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A06);
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc) {
        com.facebook.ads.redexgen.core.WQ A06 = abstractRunnableC1123Wc.A06();
        if (A06 != null) {
            com.facebook.ads.redexgen.core.WQ wq = A02().A00;
            java.lang.String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            wq.removeAll(A06);
        }
    }
}
