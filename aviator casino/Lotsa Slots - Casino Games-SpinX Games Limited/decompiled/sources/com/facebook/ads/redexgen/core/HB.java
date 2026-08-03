package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static java.lang.String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 < i2) {
            int totalBytesPeeked = i2 - i3;
            int AGs = interfaceC1987ms.AGs(bArr, i + i3, totalBytesPeeked);
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[4];
            int charAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (charAt != totalBytesPeeked2) {
                throw new java.lang.RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (AGs == -1) {
                break;
            }
            i3 += AGs;
        }
        return i3;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A01(boolean z, java.lang.String str) throws com.facebook.ads.redexgen.core.C3K {
        if (z) {
        } else {
            throw com.facebook.ads.redexgen.core.C3K.A01(str, null);
        }
    }

    public static boolean A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, int i) throws java.io.IOException {
        try {
            interfaceC1987ms.AK3(i);
            if (A00[0].length() != 0) {
                throw new java.lang.RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean A03(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            interfaceC1987ms.readFully(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            if (A00[0].length() != 0) {
                throw new java.lang.RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        try {
            return interfaceC1987ms.AGu(bArr, i, i2, z);
        } catch (java.io.EOFException e) {
            if (!z) {
                throw e;
            }
            if (A00[3].length() == 20) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[7] = "24rmiB";
            strArr[5] = "kHyj46IkHv9Sbvkaop";
            return false;
        }
    }
}
