package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class U8 {
    public static java.util.HashMap<java.lang.String, java.lang.String> A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"iAmMZEnTjRyKTNBZ", "vq5cthhr", "805H8tMQ6F09oxi1Jl38UficVRLMtQ", "JBRmxZg7", "Cn5UKxgX5LOr", "xwoZ6hhdKgqxJaNY", "yguqyABz11m3k", "UOBi89mTAaMo"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() != 16) {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "gDribvuqSsGNU0u3";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-69, -54, -54, -68, -49, -61, -58, -66, -60, -45, -45, -47, -60, -48, -56, 6, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, 10, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, -15, 4, -3, -13, -5, -12, -38, -36, -47, -46, -39, -34, -30, 0, 4, 7, -10, 3, 4, 8, -7, 0, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -31, -45, -31, -31, -41, -35, -36, -19, -41, -46, -54, -41, -51, -37, -40, -46, -51};
    }

    static {
        A02();
    }

    public static synchronized java.util.Map<java.lang.String, java.lang.String> A01(com.facebook.ads.redexgen.core.T8 t8) {
        synchronized (com.facebook.ads.redexgen.core.U8.class) {
            if (A00 != null) {
                return new java.util.HashMap(A00);
            }
            A00 = new java.util.HashMap<>();
            A00.put(A00(22, 6, 105), t8.getPackageName());
            A03(t8, A00, null);
            return new java.util.HashMap(A00);
        }
    }

    public static synchronized void A03(com.facebook.ads.redexgen.core.T8 t8, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        synchronized (com.facebook.ads.redexgen.core.U8.class) {
            map.put(A00(41, 3, 111), A00(65, 7, 35));
            map.put(A00(44, 11, 52), t8.A05().A9T());
            map.put(A00(33, 2, 73), t8.A05().A9S());
            map.put(A00(35, 6, 107), com.facebook.ads.redexgen.core.C1059To.A04);
            com.facebook.ads.redexgen.core.C1059To c1059To = new com.facebook.ads.redexgen.core.C1059To(t8, str);
            map.put(A00(15, 7, 127), c1059To.A06());
            map.put(A00(8, 7, 61), c1059To.A05());
            map.put(A00(0, 8, 52), java.lang.String.valueOf(c1059To.A04()));
            map.put(A00(28, 5, 71), c1059To.A0A());
            map.put(A00(55, 10, 72), t8.A09().A02());
        }
    }
}
