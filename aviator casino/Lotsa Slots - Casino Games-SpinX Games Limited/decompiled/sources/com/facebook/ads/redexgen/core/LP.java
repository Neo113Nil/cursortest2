package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.LN A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        byte[] bArr;
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(16);
        com.facebook.ads.redexgen.core.LO A03 = A03(1718449184, interfaceC1987ms, c04434v);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(A03.A01 >= 16);
        interfaceC1987ms.AGt(c04434v.A0l(), 0, 16);
        c04434v.A0f(0);
        int A0G = c04434v.A0G();
        int A0G2 = c04434v.A0G();
        int A0F = c04434v.A0F();
        int A0F2 = c04434v.A0F();
        int A0G3 = c04434v.A0G();
        int A0G4 = c04434v.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC1987ms.AGt(bArr, 0, i);
        } else {
            bArr = com.facebook.ads.redexgen.core.C5C.A07;
        }
        interfaceC1987ms.AK3((int) (interfaceC1987ms.A8i() - interfaceC1987ms.A8n()));
        return new com.facebook.ads.redexgen.core.LN(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, 19, 88, 17, com.google.common.base.Ascii.VT, 88, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 88, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, 10, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 88, 80, 6, 74, 63, 58, 83, 81, 88, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, 88, com.google.common.base.Ascii.VT, 19, 17, 8, 67, 88, 17, com.google.common.base.Ascii.FS, 66, 88, 45, 3, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 10, 3, 68, 17, 10, com.google.common.base.Ascii.SI, 10, com.google.common.base.Ascii.VT, 19, 10, 68, 51, 37, 50, 68, 7, com.google.common.base.Ascii.FF, 17, 10, com.google.common.base.Ascii.SI, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, com.google.common.base.Ascii.FS, 90, 83, 78, 81, com.google.common.base.Ascii.FS, 72, 69, 76, 89, 6, com.google.common.base.Ascii.FS, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(8);
        com.facebook.ads.redexgen.core.LO chunkHeader = com.facebook.ads.redexgen.core.LO.A00(interfaceC1987ms, c04434v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC1987ms.AIl();
            return -1L;
        }
        interfaceC1987ms.A47(8);
        c04434v.A0f(0);
        interfaceC1987ms.AGt(c04434v.A0l(), 0, 8);
        long sampleDataSize = c04434v.A0N();
        interfaceC1987ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static android.util.Pair<java.lang.Long, java.lang.Long> A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        interfaceC1987ms.AIl();
        com.facebook.ads.redexgen.core.LO A03 = A03(1684108385, interfaceC1987ms, new com.facebook.ads.redexgen.core.C04434v(8));
        interfaceC1987ms.AK3(8);
        return android.util.Pair.create(java.lang.Long.valueOf(interfaceC1987ms.A8n()), java.lang.Long.valueOf(A03.A01));
    }

    public static com.facebook.ads.redexgen.core.LO A03(int i, com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.C04434v c04434v) throws java.io.IOException {
        com.facebook.ads.redexgen.core.LO A002 = com.facebook.ads.redexgen.core.LO.A00(interfaceC1987ms, c04434v);
        while (A002.A00 != i) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A04(91, 15, 125), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC1987ms.AK3((int) j);
                A002 = com.facebook.ads.redexgen.core.LO.A00(interfaceC1987ms, c04434v);
            } else {
                throw com.facebook.ads.redexgen.core.C3K.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(8);
        com.facebook.ads.redexgen.core.LO A002 = com.facebook.ads.redexgen.core.LO.A00(interfaceC1987ms, c04434v);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC1987ms.AGt(c04434v.A0l(), 0, 4);
        c04434v.A0f(0);
        int A0C = c04434v.A0C();
        if (A0C != 1463899717) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A05(A04(91, 15, 125), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
