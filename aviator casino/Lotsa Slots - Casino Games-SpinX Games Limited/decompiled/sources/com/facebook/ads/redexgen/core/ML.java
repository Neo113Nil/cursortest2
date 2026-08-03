package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ML {
    public static byte[] A0V;
    public static java.lang.String[] A0W = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final com.facebook.ads.redexgen.core.MJ A0G;
    public final com.facebook.ads.redexgen.core.MK A0H;
    public final java.lang.String A0I;
    public final java.lang.String A0J;
    public final java.lang.String A0K;
    public final java.lang.String A0L;
    public final java.lang.String A0M;
    public final java.lang.String A0N;
    public final java.lang.String A0O;
    public final java.util.Map<java.lang.String, java.lang.String> A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
            if (A0W[4].charAt(24) == 'w') {
                throw new java.lang.RuntimeException();
            }
            A0W[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0V = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public ML() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new com.facebook.ads.redexgen.core.MK(), false, -1, -1, -1L, -1L, -1, null, -1, null, null, com.facebook.ads.redexgen.core.MJ.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public ML(com.facebook.ads.redexgen.core.ML ml) {
        this(ml, ml.A0M);
    }

    public ML(com.facebook.ads.redexgen.core.ML ml, java.lang.String str) {
        this(ml.A0L, ml.A0A, ml.A0S, ml.A08, ml.A07, ml.A00, ml.A09, ml.A0U, ml.A0R, ml.A05, ml.A0C, ml.A0H, ml.A0T, ml.A06, ml.A02, ml.A0E, ml.A0B, ml.A01, ml.A0P, ml.A04, ml.A0J, ml.A0I, ml.A0G, ml.A03, ml.A0Q, ml.A0N, ml.A0K, ml.A0O, str, -1L, -1L);
    }

    public ML(java.lang.String str, long j, boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3, int i5, long j2, com.facebook.ads.redexgen.core.MK mk, boolean z4, int i6, int i7, long j3, long j4, int i8, java.util.Map<java.lang.String, java.lang.String> map, int i9, java.lang.String str2, java.lang.String str3, com.facebook.ads.redexgen.core.MJ mj, int i10, boolean z5, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, long j5, long j6) {
        this.A0P = new java.util.HashMap();
        this.A0L = str;
        this.A0A = j;
        this.A0S = z;
        this.A08 = i;
        this.A07 = i2;
        this.A00 = i3;
        this.A09 = i4;
        this.A0U = z2;
        this.A0R = z3;
        this.A05 = i5;
        this.A0C = j2;
        this.A0H = mk;
        this.A0T = z4;
        this.A06 = i6;
        this.A02 = i7;
        this.A0E = j3;
        this.A0B = j4;
        this.A01 = i8;
        this.A04 = i9;
        this.A0I = str3;
        this.A0J = str2;
        if (map != null) {
            this.A0P.putAll(map);
        }
        this.A0G = mj;
        this.A03 = i10;
        this.A0Q = z5;
        this.A0N = str4;
        this.A0K = str5;
        this.A0O = str6;
        this.A0M = str7;
        this.A0F = j5;
        this.A0D = j6;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(this.A0L);
        java.lang.String A00 = A00(0, 2, 61);
        return append.append(A00).append(this.A0A).append(A00).append(this.A0S).append(A00).append(this.A08).append(A00).append(this.A07).append(A00).append(this.A00).append(A00).append(this.A09).append(A00).append(this.A0U).append(A00).append(this.A0R).append(A00).append(this.A05).append(A00).append(this.A0E).append(A00).append(this.A0B).append(A00).append(this.A01).append(A00).append(this.A04).append(A00).append(this.A06).append(A00).append(this.A02).append(A00).append(this.A03).append(A00).append(this.A0Q).append(A00).append(this.A0N).toString();
    }
}
