package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2122p5 extends com.facebook.ads.redexgen.core.C04495b {
    public static byte[] A02;
    public final int A00;
    public final com.facebook.ads.redexgen.core.C04565i A01;

    static {
        A06();
    }

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C2122p5(com.facebook.ads.redexgen.core.C04565i c04565i, int i, int i2) {
        super(A03(i, i2));
        this.A01 = c04565i;
        this.A00 = i2;
    }

    public C2122p5(java.io.IOException iOException, com.facebook.ads.redexgen.core.C04565i c04565i, int i, int i2) {
        super(iOException, A03(i, i2));
        this.A01 = c04565i;
        this.A00 = i2;
    }

    public C2122p5(java.lang.String str, com.facebook.ads.redexgen.core.C04565i c04565i, int i, int i2) {
        super(str, A03(i, i2));
        this.A01 = c04565i;
        this.A00 = i2;
    }

    public C2122p5(java.lang.String str, java.io.IOException iOException, com.facebook.ads.redexgen.core.C04565i c04565i, int i, int i2) {
        super(str, iOException, A03(i, i2));
        this.A01 = c04565i;
        this.A00 = i2;
    }

    public static int A03(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static com.facebook.ads.redexgen.core.C2122p5 A04(java.io.IOException iOException, com.facebook.ads.redexgen.core.C04565i c04565i, int i) {
        int errorCode;
        java.lang.String message = iOException.getMessage();
        if (iOException instanceof java.net.SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof java.io.InterruptedIOException) {
            errorCode = 1004;
        } else {
            if (message != null) {
                java.lang.String A01 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(message);
                java.lang.String message2 = A05(0, 26, 62);
                if (A01.matches(message2)) {
                    errorCode = 2007;
                }
            }
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new com.facebook.ads.redexgen.core.AM(iOException, c04565i);
        }
        return new com.facebook.ads.redexgen.core.C2122p5(iOException, c04565i, errorCode, i);
    }
}
