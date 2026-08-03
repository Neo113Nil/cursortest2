package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.0v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0v extends com.facebook.ads.redexgen.core.C1B {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.CC A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{9, 34, 43, 56, 7, 43, 62, 41, 34, 47, 56, 100, 36, 37, 36, 47, 98, 99};
    }

    static {
        A01();
        A01 = new com.facebook.ads.redexgen.core.C0v();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0v() {
        new com.facebook.ads.redexgen.core.C2S(r0) { // from class: com.facebook.ads.redexgen.X.1B
            public final java.lang.String A00;

            {
                this.A00 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(r2);
            }

            public final java.lang.String toString() {
                return this.A00;
            }
        };
        final java.lang.String A002 = A00(0, 18, 12);
    }

    @Override // com.facebook.ads.redexgen.core.CC
    public final int A08(java.lang.CharSequence sequence, int start) {
        int length = sequence.length();
        com.facebook.ads.redexgen.core.AbstractC1866ki.A01(start, length);
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.CC
    public final boolean A09(char c) {
        return false;
    }
}
