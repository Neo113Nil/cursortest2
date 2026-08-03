package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2058o3 implements com.facebook.ads.redexgen.core.CJ {
    public static byte[] A02;
    public static final android.util.SparseArray<java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.CH>> A03;
    public final com.facebook.ads.redexgen.core.C1852kT A00;
    public final java.util.concurrent.Executor A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.CH> A03(java.lang.Class<?> cls) {
        try {
            return cls.asSubclass(com.facebook.ads.redexgen.core.CH.class).getConstructor(com.facebook.ads.redexgen.core.C2185q7.class, com.facebook.ads.redexgen.core.C1852kT.class, java.util.concurrent.Executor.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException(A02(0, 30, 5), e);
        }
    }

    public static void A04() {
        A02 = new byte[]{-66, -23, -15, -24, -26, -23, -37, -34, -33, -20, -102, -35, -23, -24, -19, -18, -20, -17, -35, -18, -23, -20, -102, -25, -29, -19, -19, -29, -24, -31, -10, 17, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, -48, 36, com.google.common.base.Ascii.US, -48, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 35, 36, 17, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.EM, 17, 36, com.google.common.base.Ascii.NAK, -48, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, 39, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 17, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 34, -48, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 34, -48, 19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, 36, -48, 36, 41, 32, com.google.common.base.Ascii.NAK, -48, 34, 68, 57, 74, 65, 58, -11, 66, 62, 72, 72, 62, 67, 60, -11, 59, 68, 71, -11, 56, 68, 67, 73, 58, 67, 73, -11, 73, 78, 69, 58, -11, -2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, -55, com.google.common.base.Ascii.GS, 34, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, -29, -55, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 44, 57, 47, kotlin.io.encoding.Base64.padSymbol, 58, 52, 47, 67, -7, 56, 48, 47, 52, 44, -2, -7, 48, 67, 58, 59, 55, 44, 68, 48, kotlin.io.encoding.Base64.padSymbol, -7, 62, 58, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, kotlin.io.encoding.Base64.padSymbol, 46, 48, -7, 47, 44, 62, 51, -7, 58, 49, 49, 55, 52, 57, 48, -7, com.google.common.base.Ascii.SI, 44, 62, 51, com.google.common.base.Ascii.SI, 58, 66, 57, 55, 58, 44, 47, 48, kotlin.io.encoding.Base64.padSymbol, 40, 52, 50, -13, 43, 38, 40, 42, 39, 52, 52, 48, -13, 38, 41, 56, -13, 38, 51, 41, 55, 52, 46, 41, kotlin.io.encoding.Base64.padSymbol, -13, 50, 42, 41, 46, 38, -8, -13, 42, kotlin.io.encoding.Base64.padSymbol, 52, 53, 49, 38, 62, 42, 55, -13, 56, 52, 58, 55, 40, 42, -13, 45, 49, 56, -13, 52, 43, 43, 49, 46, 51, 42, -13, com.google.common.base.Ascii.CR, 49, 56, 9, 52, 60, 51, 49, 52, 38, 41, 42, 55, 87, 99, 97, 34, 90, 85, 87, 89, 86, 99, 99, 95, 34, 85, 88, 103, 34, 85, 98, 88, 102, 99, 93, 88, 108, 34, 97, 89, 88, 93, 85, 39, 34, 89, 108, 99, 100, 96, 85, 109, 89, 102, 34, 103, 99, 105, 102, 87, 89, 34, 103, 97, 99, 99, 104, 92, 103, 104, 102, 89, 85, 97, 93, 98, 91, 34, 99, 90, 90, 96, 93, 98, 89, 34, 71, 103, 56, 99, 107, 98, 96, 99, 85, 88, 89, 102};
    }

    static {
        A04();
        A03 = A00();
    }

    public C2058o3(com.facebook.ads.redexgen.core.C1852kT c1852kT, java.util.concurrent.Executor executor) {
        this.A00 = (com.facebook.ads.redexgen.core.C1852kT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c1852kT);
        this.A01 = (java.util.concurrent.Executor) com.facebook.ads.redexgen.core.AbstractC04203y.A01(executor);
    }

    public static android.util.SparseArray<java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.CH>> A00() {
        android.util.SparseArray<java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.CH>> sparseArray = new android.util.SparseArray<>();
        try {
            sparseArray.put(0, A03(java.lang.Class.forName(A02(130, 77, 86))));
        } catch (java.lang.ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, A03(java.lang.Class.forName(A02(207, 75, 80))));
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, A03(java.lang.Class.forName(A02(282, 86, 127))));
        } catch (java.lang.ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private com.facebook.ads.redexgen.core.CH A01(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
        java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.CH> constructor = A03.get(i);
        if (constructor != null) {
            try {
                return constructor.newInstance(new com.facebook.ads.redexgen.core.C03922u().A00(downloadRequest.A00).A04(downloadRequest.A04).A02(downloadRequest.A01).A05(), this.A00, this.A01);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(A02(30, 50, 59) + i, e);
            }
        }
        throw new java.lang.IllegalStateException(A02(80, 32, 96) + i);
    }

    @Override // com.facebook.ads.redexgen.core.CJ
    public final com.facebook.ads.redexgen.core.CH A5M(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        int A0B = com.facebook.ads.redexgen.core.C5C.A0B(downloadRequest.A00, downloadRequest.A03);
        switch (A0B) {
            case 0:
            case 1:
            case 2:
                return A01(downloadRequest, A0B);
            case 3:
            default:
                throw new java.lang.IllegalArgumentException(A02(112, 18, 52) + A0B);
            case 4:
                return new com.facebook.ads.redexgen.core.C2053nx(new com.facebook.ads.redexgen.core.C03922u().A00(downloadRequest.A00).A02(downloadRequest.A01).A05(), this.A00, this.A01);
        }
    }
}
