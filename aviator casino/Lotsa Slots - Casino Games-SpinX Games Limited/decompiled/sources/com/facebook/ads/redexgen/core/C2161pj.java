package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2161pj implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2161pj> A0J;
    public static final java.lang.Object A0K;
    public static final com.facebook.ads.redexgen.core.C2185q7 A0L;
    public static final java.lang.Object A0M;
    public static final java.lang.String A0N;
    public static final java.lang.String A0O;
    public static final java.lang.String A0P;
    public static final java.lang.String A0Q;
    public static final java.lang.String A0R;
    public static final java.lang.String A0S;
    public static final java.lang.String A0T;
    public static final java.lang.String A0U;
    public static final java.lang.String A0V;
    public static final java.lang.String A0W;
    public static final java.lang.String A0X;
    public static final java.lang.String A0Y;
    public static final java.lang.String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public com.facebook.ads.redexgen.core.C2188qA A08;
    public java.lang.Object A0A;

    @java.lang.Deprecated
    public java.lang.Object A0B;
    public boolean A0D;

    @java.lang.Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public java.lang.Object A0C = A0K;
    public com.facebook.ads.redexgen.core.C2185q7 A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C2161pj A00(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.C2188qA c2188qA;
        android.os.Bundle bundle2 = bundle.getBundle(A0W);
        com.facebook.ads.redexgen.core.C2185q7 A6f = bundle2 != null ? com.facebook.ads.redexgen.core.C2185q7.A08.A6f(bundle2) : com.facebook.ads.redexgen.core.C2185q7.A09;
        long j = bundle.getLong(A0Y, -9223372036854775807L);
        long j2 = bundle.getLong(A0Z, -9223372036854775807L);
        long j3 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z = bundle.getBoolean(A0T, false);
        boolean z2 = bundle.getBoolean(A0R, false);
        android.os.Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c2188qA = com.facebook.ads.redexgen.core.C2188qA.A06.A6f(bundle3);
        } else {
            c2188qA = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z3 = bundle.getBoolean(A0S, false);
        long j4 = bundle.getLong(A0N, 0L);
        long j5 = bundle.getLong(A0O, -9223372036854775807L);
        int i = bundle.getInt(A0Q, 0);
        int i2 = bundle.getInt(A0U, 0);
        long j6 = bundle.getLong(A0X, 0L);
        com.facebook.ads.redexgen.core.C2161pj c2161pj = new com.facebook.ads.redexgen.core.C2161pj();
        c2161pj.A07(A0M, A6f, null, j, j2, j3, z, z2, c2188qA, j4, j5, i, i2, j6);
        c2161pj.A0F = z3;
        return c2161pj;
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, com.google.common.base.Ascii.SO, 75, 4, 1, com.google.common.base.Ascii.SYN, 75, 4, com.google.common.base.Ascii.VT, 1, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.GS, 75, 8, 0, 1, com.google.common.base.Ascii.FF, 4, 86, 75, 6, 10, 8, 8, 10, com.google.common.base.Ascii.VT, 75, 49, com.google.common.base.Ascii.FF, 8, 0, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 0};
    }

    static {
        A03();
        A0K = new java.lang.Object();
        A0M = new java.lang.Object();
        A0L = new com.facebook.ads.redexgen.core.C03922u().A03(A02(0, 48, 107)).A00(android.net.Uri.EMPTY).A05();
        A0W = com.facebook.ads.redexgen.core.C5C.A0h(1);
        A0Y = com.facebook.ads.redexgen.core.C5C.A0h(2);
        A0Z = com.facebook.ads.redexgen.core.C5C.A0h(3);
        A0P = com.facebook.ads.redexgen.core.C5C.A0h(4);
        A0T = com.facebook.ads.redexgen.core.C5C.A0h(5);
        A0R = com.facebook.ads.redexgen.core.C5C.A0h(6);
        A0V = com.facebook.ads.redexgen.core.C5C.A0h(7);
        A0S = com.facebook.ads.redexgen.core.C5C.A0h(8);
        A0N = com.facebook.ads.redexgen.core.C5C.A0h(9);
        A0O = com.facebook.ads.redexgen.core.C5C.A0h(10);
        A0Q = com.facebook.ads.redexgen.core.C5C.A0h(11);
        A0U = com.facebook.ads.redexgen.core.C5C.A0h(12);
        A0X = com.facebook.ads.redexgen.core.C5C.A0h(13);
        A0J = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pk
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                com.facebook.ads.redexgen.core.C2161pj A00;
                A00 = com.facebook.ads.redexgen.core.C2161pj.A00(bundle);
                return A00;
            }
        };
    }

    public final long A04() {
        return com.facebook.ads.redexgen.core.C5C.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return com.facebook.ads.redexgen.core.C5C.A0P(this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r0 = r7.A03.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.C2161pj A07(java.lang.Object obj, com.facebook.ads.redexgen.core.C2185q7 c2185q7, java.lang.Object obj2, long j, long j2, long j3, boolean z, boolean z2, com.facebook.ads.redexgen.core.C2188qA c2188qA, long j4, long j5, int i, int i2, long j6) {
        this.A0C = obj;
        this.A09 = c2185q7 != null ? c2185q7 : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new java.lang.RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c2185q7 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass32 anonymousClass32 = c2185q7.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
            } else {
                A0I[5] = "IGwZtC";
            }
            this.A0B = r0;
            this.A0A = obj2;
            this.A06 = j;
            this.A07 = j2;
            this.A04 = j3;
            this.A0G = z;
            this.A0D = z2;
            this.A0E = c2188qA == null;
            this.A08 = c2188qA;
            this.A02 = j4;
            this.A03 = j5;
            this.A00 = i;
            this.A01 = i2;
            this.A05 = j6;
            this.A0F = false;
            return this;
        }
        java.lang.Object obj3 = null;
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        this.A0E = c2188qA == null;
        this.A08 = c2188qA;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = j6;
        this.A0F = false;
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2161pj c2161pj = (com.facebook.ads.redexgen.core.C2161pj) obj;
        if (com.facebook.ads.redexgen.core.C5C.A1E(this.A0C, c2161pj.A0C) && com.facebook.ads.redexgen.core.C5C.A1E(this.A09, c2161pj.A09) && com.facebook.ads.redexgen.core.C5C.A1E(this.A0A, c2161pj.A0A) && com.facebook.ads.redexgen.core.C5C.A1E(this.A08, c2161pj.A08) && this.A06 == c2161pj.A06 && this.A07 == c2161pj.A07 && this.A04 == c2161pj.A04 && this.A0G == c2161pj.A0G && this.A0D == c2161pj.A0D && this.A0F == c2161pj.A0F && this.A02 == c2161pj.A02 && this.A03 == c2161pj.A03 && this.A00 == c2161pj.A00 && this.A01 == c2161pj.A01) {
            long j = this.A05;
            long j2 = c2161pj.A05;
            java.lang.String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j == j2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((hashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
