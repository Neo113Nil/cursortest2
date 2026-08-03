package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04474z {
    public static byte[] A02;
    public static final com.facebook.ads.redexgen.core.C04474z A03;
    public static final com.facebook.ads.redexgen.core.C04474z A04;
    public final int A00;
    public final int A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new com.facebook.ads.redexgen.core.C04474z(-1, -1);
        A04 = new com.facebook.ads.redexgen.core.C04474z(0, 0);
    }

    public C04474z(int i, int i2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.A01 = i;
        this.A00 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C04474z)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C04474z c04474z = (com.facebook.ads.redexgen.core.C04474z) obj;
        return this.A01 == c04474z.A01 && this.A00 == c04474z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final java.lang.String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
