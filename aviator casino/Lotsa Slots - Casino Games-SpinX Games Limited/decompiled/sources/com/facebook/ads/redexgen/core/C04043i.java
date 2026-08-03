package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04043i {
    public static byte[] A04;
    public static final com.facebook.ads.redexgen.core.C04043i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, 37, com.google.common.base.Ascii.RS, 43, 43, 34, 41, 0, 44, 50, 43, 49, -6, com.google.common.base.Ascii.SO, 2, 71, 80, 69, 81, 70, 75, 80, 73, com.google.common.base.Ascii.US, -33, 19, 2, 7, com.google.common.base.Ascii.CR, -28, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, -1, com.google.common.base.Ascii.DC2, -7, 17, -1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 10, 3, -16, -1, com.google.common.base.Ascii.DC2, 3, -37};
    }

    static {
        A01();
        A05 = new com.facebook.ads.redexgen.core.C04043i(-1, -1, -1);
    }

    public C04043i(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (com.facebook.ads.redexgen.core.C5C.A15(i3)) {
            i4 = com.facebook.ads.redexgen.core.C5C.A06(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C04043i)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C04043i c04043i = (com.facebook.ads.redexgen.core.C04043i) obj;
        return this.A03 == c04043i.A03 && this.A01 == c04043i.A01 && this.A02 == c04043i.A02;
    }

    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(java.lang.Integer.valueOf(this.A03), java.lang.Integer.valueOf(this.A01), java.lang.Integer.valueOf(this.A02));
    }

    public final java.lang.String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, 127) + this.A02 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }
}
