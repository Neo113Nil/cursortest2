package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0576Lj {
    public static byte[] A0W;
    public static String[] A0X = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
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
    public final long A0G;
    public final C0574Lh A0H;
    public final C0575Li A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map<String, String> A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
            if (A0X[4].charAt(24) == 'w') {
                throw new RuntimeException();
            }
            A0X[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0W = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public C0576Lj() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new C0575Li(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C0574Lh.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public C0576Lj(C0576Lj c0576Lj) {
        this(c0576Lj, c0576Lj.A0N);
    }

    public C0576Lj(C0576Lj c0576Lj, String str) {
        this(c0576Lj.A0M, c0576Lj.A0A, c0576Lj.A0T, c0576Lj.A08, c0576Lj.A07, c0576Lj.A00, c0576Lj.A09, c0576Lj.A0V, c0576Lj.A0S, c0576Lj.A05, c0576Lj.A0C, c0576Lj.A0I, c0576Lj.A0F, c0576Lj.A0U, c0576Lj.A06, c0576Lj.A02, c0576Lj.A0E, c0576Lj.A0B, c0576Lj.A01, c0576Lj.A0Q, c0576Lj.A04, c0576Lj.A0K, c0576Lj.A0J, c0576Lj.A0H, c0576Lj.A03, c0576Lj.A0R, c0576Lj.A0O, c0576Lj.A0L, c0576Lj.A0P, str, -1L, -1L);
    }

    public C0576Lj(String str, long j, boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3, int i5, long j2, C0575Li c0575Li, long j3, boolean z4, int i6, int i7, long j4, long j5, int i8, Map<String, String> map, int i9, String str2, String str3, C0574Lh c0574Lh, int i10, boolean z5, String str4, String str5, String str6, String str7, long j6, long j7) {
        this.A0Q = new HashMap();
        this.A0M = str;
        this.A0A = j;
        this.A0T = z;
        this.A08 = i;
        this.A07 = i2;
        this.A00 = i3;
        this.A09 = i4;
        this.A0V = z2;
        this.A0S = z3;
        this.A05 = i5;
        this.A0C = j2;
        this.A0I = c0575Li;
        this.A0F = j3;
        this.A0U = z4;
        this.A06 = i6;
        this.A02 = i7;
        this.A0E = j4;
        this.A0B = j5;
        this.A01 = i8;
        this.A04 = i9;
        this.A0J = str3;
        this.A0K = str2;
        if (map != null) {
            this.A0Q.putAll(map);
        }
        this.A0H = c0574Lh;
        this.A03 = i10;
        this.A0R = z5;
        this.A0O = str4;
        this.A0L = str5;
        this.A0P = str6;
        this.A0N = str7;
        this.A0G = j6;
        this.A0D = j7;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(this.A0M);
        String A00 = A00(0, 2, 61);
        return append.append(A00).append(this.A0A).append(A00).append(this.A0T).append(A00).append(this.A08).append(A00).append(this.A07).append(A00).append(this.A00).append(A00).append(this.A09).append(A00).append(this.A0V).append(A00).append(this.A0S).append(A00).append(this.A05).append(A00).append(this.A0E).append(A00).append(this.A0B).append(A00).append(this.A01).append(A00).append(this.A04).append(A00).append(this.A06).append(A00).append(this.A02).append(A00).append(this.A03).append(A00).append(this.A0R).append(A00).append(this.A0O).toString();
    }
}
