package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05549i extends com.facebook.ads.redexgen.core.C2155pc implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> A0E;
    public final android.util.SparseBooleanArray A0F;
    public static java.lang.String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final com.facebook.ads.redexgen.core.C05549i A0J = new com.facebook.ads.redexgen.core.C2014nK().A0p();

    @java.lang.Deprecated
    public static final com.facebook.ads.redexgen.core.C05549i A0I = A0J;
    public static final java.lang.String A0W = com.facebook.ads.redexgen.core.C5C.A0h(1000);
    public static final java.lang.String A0Q = com.facebook.ads.redexgen.core.C5C.A0h(1001);
    public static final java.lang.String A0R = com.facebook.ads.redexgen.core.C5C.A0h(1002);
    public static final java.lang.String A0T = com.facebook.ads.redexgen.core.C5C.A0h(1003);
    public static final java.lang.String A0M = com.facebook.ads.redexgen.core.C5C.A0h(1004);
    public static final java.lang.String A0N = com.facebook.ads.redexgen.core.C5C.A0h(1005);
    public static final java.lang.String A0K = com.facebook.ads.redexgen.core.C5C.A0h(1006);
    public static final java.lang.String A0V = com.facebook.ads.redexgen.core.C5C.A0h(1007);
    public static final java.lang.String A0b = com.facebook.ads.redexgen.core.C5C.A0h(1008);
    public static final java.lang.String A0O = com.facebook.ads.redexgen.core.C5C.A0h(1009);
    public static final java.lang.String A0Z = com.facebook.ads.redexgen.core.C5C.A0h(1010);
    public static final java.lang.String A0a = com.facebook.ads.redexgen.core.C5C.A0h(1011);
    public static final java.lang.String A0Y = com.facebook.ads.redexgen.core.C5C.A0h(1012);
    public static final java.lang.String A0X = com.facebook.ads.redexgen.core.C5C.A0h(1013);
    public static final java.lang.String A0P = com.facebook.ads.redexgen.core.C5C.A0h(1014);
    public static final java.lang.String A0L = com.facebook.ads.redexgen.core.C5C.A0h(1015);
    public static final java.lang.String A0S = com.facebook.ads.redexgen.core.C5C.A0h(1016);
    public static final java.lang.String A0U = com.facebook.ads.redexgen.core.C5C.A0h(1017);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C05549i> A0H = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.C05549i A0p;
            A0p = new com.facebook.ads.redexgen.core.C2014nK(bundle).A0p();
            return A0p;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> sparseArray, android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (indexOfKey < 0 || !A0O(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> map, java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> entry : map.entrySet()) {
            com.facebook.ads.redexgen.core.C2026nW key = entry.getKey();
            if (!map2.containsKey(key) || !com.facebook.ads.redexgen.core.C5C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C05549i(com.facebook.ads.redexgen.core.C2014nK c2014nK) {
        super(c2014nK);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> sparseArray;
        android.util.SparseBooleanArray sparseBooleanArray;
        boolean z14;
        z = c2014nK.A0C;
        this.A0C = z;
        z2 = c2014nK.A06;
        this.A06 = z2;
        z3 = c2014nK.A07;
        this.A07 = z3;
        z4 = c2014nK.A05;
        this.A05 = z4;
        z5 = c2014nK.A09;
        this.A09 = z5;
        z6 = c2014nK.A02;
        this.A02 = z6;
        z7 = c2014nK.A03;
        this.A03 = z7;
        z8 = c2014nK.A00;
        this.A00 = z8;
        z9 = c2014nK.A01;
        this.A01 = z9;
        z10 = c2014nK.A08;
        this.A08 = z10;
        z11 = c2014nK.A0B;
        this.A0B = z11;
        z12 = c2014nK.A0D;
        this.A0D = z12;
        z13 = c2014nK.A04;
        this.A04 = z13;
        sparseArray = c2014nK.A0E;
        this.A0E = sparseArray;
        sparseBooleanArray = c2014nK.A0F;
        this.A0F = sparseBooleanArray;
        z14 = c2014nK.A0A;
        this.A0A = z14;
    }

    public static com.facebook.ads.redexgen.core.C05549i A02(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C2014nK(context).A0p();
    }

    public static /* synthetic */ java.lang.String A0B() {
        java.lang.String str = A0Z;
        java.lang.String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ java.lang.String A0C() {
        java.lang.String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ java.lang.String A0H() {
        java.lang.String str = A0P;
        java.lang.String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new java.lang.RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ java.lang.String A0J() {
        java.lang.String str = A0M;
        java.lang.String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0P() {
        return new com.facebook.ads.redexgen.core.C2014nK(this);
    }

    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.C2011nH A0Q(int i, com.facebook.ads.redexgen.core.C2026nW c2026nW) {
        java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c2026nW);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @java.lang.Deprecated
    public final boolean A0S(int i, com.facebook.ads.redexgen.core.C2026nW c2026nW) {
        java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> map = this.A0E.get(i);
        return map != null && map.containsKey(c2026nW);
    }

    @Override // com.facebook.ads.redexgen.core.C2155pc
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                com.facebook.ads.redexgen.core.C05549i c05549i = (com.facebook.ads.redexgen.core.C05549i) obj;
                if (super.equals(c05549i) && this.A0C == c05549i.A0C && this.A06 == c05549i.A06 && this.A07 == c05549i.A07 && this.A05 == c05549i.A05 && this.A09 == c05549i.A09 && this.A02 == c05549i.A02 && this.A03 == c05549i.A03 && this.A00 == c05549i.A00 && this.A01 == c05549i.A01 && this.A08 == c05549i.A08 && this.A0B == c05549i.A0B && this.A0D == c05549i.A0D && this.A04 == c05549i.A04 && A0N(this.A0F, c05549i.A0F) && A0M(this.A0E, c05549i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C2155pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
