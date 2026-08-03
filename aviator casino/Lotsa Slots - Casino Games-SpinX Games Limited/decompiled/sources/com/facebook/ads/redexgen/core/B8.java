package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class B8 extends com.facebook.ads.redexgen.core.AbstractC2198qK<java.lang.Comparable<?>> implements java.io.Serializable {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"VpDQNWoK0mmjrFci3J1ES8becoOn0yPT", "Vr", "", "dVgvDtkQ8cSY7jysLBul", "4dcdEYs2txrJkBrXjBMi1LqbKTa90ufq", "PVumC7zyVZC9p2BLxPfo", "qAFwV", ""};
    public static final com.facebook.ads.redexgen.core.B8 A02;
    public static final long serialVersionUID = 0;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.DC2, 47, 57, 56, 47, 52, 51, 58, 115, 51, 60, 41, 40, 47, 60, 49, 117, 116, 115, 47, 56, 43, 56, 47, 46, 56, 117, 116};
    }

    static {
        A02();
        A02 = new com.facebook.ads.redexgen.core.B8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK, java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(left);
        if (left != right) {
            return right.compareTo(left);
        }
        java.lang.String[] strArr = A01;
        if (strArr[6].length() == strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[0] = "QsSMXmf1NPN173cjiLSi9PN2wuQJFCPh";
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK
    public final <S extends java.lang.Comparable<?>> com.facebook.ads.redexgen.core.AbstractC2198qK<S> A06() {
        return com.facebook.ads.redexgen.core.AbstractC2198qK.A03();
    }

    public final java.lang.String toString() {
        return A01(0, 28, 44);
    }
}
