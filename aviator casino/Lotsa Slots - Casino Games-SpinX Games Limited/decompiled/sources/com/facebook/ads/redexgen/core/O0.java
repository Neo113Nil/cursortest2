package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O0 {
    public static java.lang.String[] A00 = {"8XYGd5ZHSKJUGKcOBZRj1wh994qBk", "BxRxgsb39CeS8gUybSCvfMthfoa7WN", "MbLF7RBGQJ5IZlZwsL", "5COIZmJumnkEkrhpQeQyhRhZGCLVsyVV", "KxSUW8Yx0pGLd", "vVb3IVkHxruGPbcu6dN9QNWQiYSW5FCa", "S8VYx", "aJn40"};

    public static void A00(com.facebook.ads.redexgen.core.NQ nq, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, java.lang.String str) {
        if (nq.A0t() != null && nq.A0t().A05() != null) {
            int A04 = nq.A0t().A04();
            if (A00[2].length() == 15) {
                throw new java.lang.RuntimeException();
            }
            A00[4] = "IYXFBoSH0TRoN";
            if (A04 > 0 && nq.A0t().A03() > 0) {
                c1042Sx.A0c(new com.facebook.ads.redexgen.core.C1040Sv(nq.A0t().A05(), (int) (nq.A0t().A03() * com.facebook.ads.redexgen.core.XX.A02), (int) (nq.A0t().A04() * com.facebook.ads.redexgen.core.XX.A02), nq.A1D(), str));
            }
        }
    }
}
