package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.q5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2183q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2183q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2183q5(com.facebook.ads.redexgen.core.BG bg) {
        this();
    }

    public static com.facebook.ads.redexgen.core.AbstractC2182q4<java.lang.Object> A00(int expectedKeys) {
        com.facebook.ads.redexgen.core.AbstractC2013nJ.A00(expectedKeys, A03(0, 12, 125));
        return new com.facebook.ads.redexgen.core.BG(expectedKeys);
    }

    public static <K0> com.facebook.ads.redexgen.core.AbstractC2182q4<K0> A01(java.util.Comparator<K0> comparator) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(comparator);
        return new com.facebook.ads.redexgen.core.BF(comparator);
    }

    public static com.facebook.ads.redexgen.core.AbstractC2182q4<java.lang.Comparable> A02() {
        return A01(com.facebook.ads.redexgen.core.AbstractC2198qK.A03());
    }
}
