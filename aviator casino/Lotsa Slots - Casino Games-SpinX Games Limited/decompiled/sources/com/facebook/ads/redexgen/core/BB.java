package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class BB extends com.facebook.ads.redexgen.core.AbstractC2198qK<java.lang.Comparable<?>> implements java.io.Serializable {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"JDLm", "59j9VSz50JRV62zRfQhUHOfkCXfgeUgK", "B91zWfVJnglJ6qaTwxSE2cgOmWPFgOKk", "ELqJY4", "RV9gCl0i3PKSKYNXbtai8ngQK3fccqTs", "fKxm10xyRNZ", "83zGhfyjGQem9Bncw", "2Nxy8TZF5cPmoYOpvxnNSToHaqPSrsmH"};
    public static final com.facebook.ads.redexgen.core.BB A02;
    public static final long serialVersionUID = 0;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
            if (A01[5].length() == 31) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "F1rbTbQwQjJP2vUBRKO1k8FP";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.CR, 48, 38, 39, 48, 43, 44, 37, 108, 44, 35, 54, 55, 48, 35, 46, 106, 107};
    }

    static {
        A02();
        A02 = new com.facebook.ads.redexgen.core.BB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK, java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(left);
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(right);
        return left.compareTo(right);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK
    public final <S extends java.lang.Comparable<?>> com.facebook.ads.redexgen.core.AbstractC2198qK<S> A06() {
        return com.facebook.ads.redexgen.core.B8.A02;
    }

    public final java.lang.String toString() {
        return A01(0, 18, 23);
    }
}
