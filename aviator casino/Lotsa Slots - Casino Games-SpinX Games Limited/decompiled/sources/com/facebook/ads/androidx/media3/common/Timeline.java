package com.facebook.ads.androidx.media3.common;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public static java.lang.String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final com.facebook.ads.androidx.media3.common.Timeline A02 = new com.facebook.ads.redexgen.core.AS();
    public static final java.lang.String A05 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A03 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.androidx.media3.common.Timeline> A01 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.androidx.media3.common.Timeline A022;
            A022 = com.facebook.ads.androidx.media3.common.Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(java.lang.Object obj);

    public abstract com.facebook.ads.redexgen.core.C2163pl A0I(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl, boolean z);

    public abstract com.facebook.ads.redexgen.core.C2161pj A0L(int i, com.facebook.ads.redexgen.core.C2161pj c2161pj, long j);

    public abstract java.lang.Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static com.facebook.ads.redexgen.core.AR A02(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.BP A042 = A04(com.facebook.ads.redexgen.core.C2161pj.A0J, com.facebook.ads.redexgen.core.AnonymousClass43.A00(bundle, A05));
        com.facebook.ads.redexgen.core.BP A043 = A04(com.facebook.ads.redexgen.core.C2163pl.A08, com.facebook.ads.redexgen.core.AnonymousClass43.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new com.facebook.ads.redexgen.core.AR(A042, A043, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends com.facebook.ads.redexgen.core.AnonymousClass24> com.facebook.ads.redexgen.core.BP<T> A04(com.facebook.ads.redexgen.core.AnonymousClass23<T> anonymousClass23, android.os.IBinder iBinder) {
        if (iBinder == null) {
            return com.facebook.ads.redexgen.core.BP.A03();
        }
        com.facebook.ads.redexgen.core.C2K c2k = new com.facebook.ads.redexgen.core.C2K();
        com.facebook.ads.redexgen.core.BP<android.os.Bundle> A002 = com.facebook.ads.redexgen.core.AnonymousClass22.A00(iBinder);
        for (int i = 0; i < A002.size(); i++) {
            c2k.A04(anonymousClass23.A6f(A002.get(i)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
            int i3 = A00[1].charAt(20);
            if (i3 == 50) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z);
                java.lang.String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new java.lang.RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final int A09(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl, com.facebook.ads.redexgen.core.C2161pj c2161pj, int i2, boolean z) {
        int i3 = A0H(i, c2163pl).A00;
        int windowIndex = A0K(i3, c2161pj).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2161pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> A0D(com.facebook.ads.redexgen.core.C2161pj c2161pj, com.facebook.ads.redexgen.core.C2163pl c2163pl, int i, long j) {
        return A0E(c2161pj, c2163pl, i, j);
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> A0E(com.facebook.ads.redexgen.core.C2161pj c2161pj, com.facebook.ads.redexgen.core.C2163pl c2163pl, int i, long j) {
        return (android.util.Pair) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A0G(c2161pj, c2163pl, i, j, 0L));
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> A0F(com.facebook.ads.redexgen.core.C2161pj c2161pj, com.facebook.ads.redexgen.core.C2163pl c2163pl, int i, long j, long j2) {
        return A0G(c2161pj, c2163pl, i, j, j2);
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> A0G(com.facebook.ads.redexgen.core.C2161pj c2161pj, com.facebook.ads.redexgen.core.C2163pl c2163pl, int i, long j, long j2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A00(i, 0, A07());
        A0L(i, c2161pj, j2);
        if (j == -9223372036854775807L) {
            j = c2161pj.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c2161pj.A00;
        A0H(i2, c2163pl);
        while (i2 < c2161pj.A01 && c2163pl.A02 != j && A0H(i2 + 1, c2163pl).A02 <= j) {
            i2++;
        }
        A0I(i2, c2163pl, true);
        long j3 = j - c2163pl.A02;
        if (c2163pl.A01 != -9223372036854775807L) {
            long j4 = c2163pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new java.lang.RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j3 = java.lang.Math.min(j3, j4 - 1);
        }
        return android.util.Pair.create(com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2163pl.A04), java.lang.Long.valueOf(java.lang.Math.max(0L, j3)));
    }

    public final com.facebook.ads.redexgen.core.C2163pl A0H(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl) {
        return A0I(i, c2163pl, false);
    }

    public com.facebook.ads.redexgen.core.C2163pl A0J(java.lang.Object obj, com.facebook.ads.redexgen.core.C2163pl c2163pl) {
        return A0I(A0A(obj), c2163pl, true);
    }

    public final com.facebook.ads.redexgen.core.C2161pj A0K(int i, com.facebook.ads.redexgen.core.C2161pj c2161pj) {
        return A0L(i, c2161pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, com.facebook.ads.redexgen.core.C2163pl c2163pl, com.facebook.ads.redexgen.core.C2161pj c2161pj, int i2, boolean z) {
        return A09(i, c2163pl, c2161pj, i2, z) == -1;
    }

    public final boolean equals(java.lang.Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.androidx.media3.common.Timeline)) {
            return false;
        }
        com.facebook.ads.androidx.media3.common.Timeline timeline = (com.facebook.ads.androidx.media3.common.Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2161pj c2161pj = new com.facebook.ads.redexgen.core.C2161pj();
        com.facebook.ads.redexgen.core.C2163pl c2163pl = new com.facebook.ads.redexgen.core.C2163pl();
        com.facebook.ads.redexgen.core.C2161pj window = new com.facebook.ads.redexgen.core.C2161pj();
        com.facebook.ads.redexgen.core.C2163pl otherPeriod = new com.facebook.ads.redexgen.core.C2163pl();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c2161pj).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < A06(); i2++) {
            boolean equals = A0I(i2, c2163pl, true).equals(timeline.A0I(i2, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!equals) {
                return false;
            }
        }
        int A0B = A0B(true);
        if (A0B != timeline.A0B(true) || (A0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (A0B != A0C) {
            int A08 = A08(A0B, 0, true);
            if (A08 != timeline.A08(A0B, 0, true)) {
                return false;
            }
            A0B = A08;
        }
        return true;
    }

    public final int hashCode() {
        com.facebook.ads.redexgen.core.C2161pj c2161pj = new com.facebook.ads.redexgen.core.C2161pj();
        com.facebook.ads.redexgen.core.C2163pl c2163pl = new com.facebook.ads.redexgen.core.C2163pl();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            com.facebook.ads.redexgen.core.C2161pj window = A0K(i2, c2161pj);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c2163pl, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i3;
    }
}
