package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0875Mg {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public com.facebook.ads.redexgen.core.C1846kN A00;
    public final int A01;
    public final java.lang.String A02;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C0874Mf> A03;
    public final java.util.TreeSet<com.facebook.ads.redexgen.core.C1844kL> A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C0875Mg(int i, java.lang.String str) {
        this(i, str, com.facebook.ads.redexgen.core.C1846kN.A03);
    }

    public C0875Mg(int i, java.lang.String str, com.facebook.ads.redexgen.core.C1846kN c1846kN) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c1846kN;
        this.A04 = new java.util.TreeSet<>();
        this.A03 = new java.util.ArrayList<>();
    }

    public final long A02(long j, long j2) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        com.facebook.ads.redexgen.core.C1844kL A04 = A04(j, j2);
        if (A04.A03()) {
            return -java.lang.Math.min(A04.A04() ? Long.MAX_VALUE : A04.A01, j2);
        }
        long j3 = j + j2;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        long currentEndPosition = A04.A02 + A04.A01;
        if (currentEndPosition < j3) {
            java.util.TreeSet<com.facebook.ads.redexgen.core.C1844kL> treeSet = this.A04;
            java.lang.String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (com.facebook.ads.redexgen.core.C1844kL c1844kL : treeSet.tailSet(A04, false)) {
                if (c1844kL.A02 > currentEndPosition) {
                    break;
                }
                long j4 = c1844kL.A02;
                long queryEndPosition = c1844kL.A01;
                currentEndPosition = java.lang.Math.max(currentEndPosition, j4 + queryEndPosition);
                if (currentEndPosition >= j3) {
                    break;
                }
            }
        }
        return java.lang.Math.min(currentEndPosition - j, j2);
    }

    public final com.facebook.ads.redexgen.core.C1846kN A03() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1844kL A04(long j, long j2) {
        com.facebook.ads.redexgen.core.C1844kL A03 = com.facebook.ads.redexgen.core.C1844kL.A03(this.A02, j);
        com.facebook.ads.redexgen.core.C1844kL floor = this.A04.floor(A03);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        com.facebook.ads.redexgen.core.C1844kL lookupSpan = this.A04.ceiling(A03);
        if (lookupSpan != null) {
            long j3 = lookupSpan.A02 - j;
            if (j2 != -1) {
                j3 = java.lang.Math.min(j3, j2);
            }
            j2 = j3;
        }
        return com.facebook.ads.redexgen.core.C1844kL.A04(this.A02, j, j2);
    }

    public final com.facebook.ads.redexgen.core.C1844kL A05(com.facebook.ads.redexgen.core.C1844kL c1844kL, long j, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A04.remove(c1844kL));
        java.io.File file = (java.io.File) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c1844kL.A03);
        if (z) {
            java.io.File file2 = file.getParentFile();
            java.io.File A052 = com.facebook.ads.redexgen.core.C1844kL.A05((java.io.File) com.facebook.ads.redexgen.core.AbstractC04203y.A01(file2), this.A01, c1844kL.A02, j);
            if (file.renameTo(A052)) {
                file = A052;
            } else {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + A052);
            }
        }
        com.facebook.ads.redexgen.core.C1844kL newCacheSpan = c1844kL.A09(file, j);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final java.util.TreeSet<com.facebook.ads.redexgen.core.C1844kL> A06() {
        return this.A04;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07(long j) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01 == j) {
                this.A03.remove(i);
                return;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public final void A08(com.facebook.ads.redexgen.core.C1844kL c1844kL) {
        this.A04.add(c1844kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0B(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A00(j, j2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0C(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01(j, j2)) {
                return false;
            }
        }
        this.A03.add(new com.facebook.ads.redexgen.core.C0874Mf(j, j2));
        return true;
    }

    public final boolean A0D(com.facebook.ads.redexgen.core.MZ mz) {
        if (this.A04.remove(mz)) {
            if (mz.A03 != null) {
                mz.A03.delete();
                return true;
            }
            return true;
        }
        java.lang.String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(com.facebook.ads.redexgen.core.C0880Ml c0880Ml) {
        com.facebook.ads.redexgen.core.C1846kN c1846kN = this.A00;
        com.facebook.ads.redexgen.core.C1846kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c0880Ml);
        com.facebook.ads.redexgen.core.C1846kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c1846kN);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C0875Mg c0875Mg = (com.facebook.ads.redexgen.core.C0875Mg) obj;
        if (this.A01 == c0875Mg.A01 && this.A02.equals(c0875Mg.A02) && this.A04.equals(c0875Mg.A04) && this.A00.equals(c0875Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = this.A02.hashCode();
        return ((i + result2) * 31) + this.A00.hashCode();
    }
}
