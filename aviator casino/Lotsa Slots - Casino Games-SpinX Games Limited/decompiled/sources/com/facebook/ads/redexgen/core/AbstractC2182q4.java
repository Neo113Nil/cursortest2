package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.q4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2182q4<K0> {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"bao8c38n28wPAMqvf0", "eVcWzAuCAXWumTICSFBebUgmb9TguTkL", "p", "gqL7Zo5j54GI4jqi05kLU", "fae6iywUSwwj1RjLTY2P", "asvzUEyWtHVXByXUijz9tuohidd7jT94", "t7lccWit4rbeEMhbm3WlI6hCZ2BNlGb8", "1T7kTgAAsxu7zrmAj3X1"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 104;
            java.lang.String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "XFZlfL1njVMJiM3nHtzYTwesPM930KjJ";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{46, 51, 59, 46, 40, 63, 46, 47, com.google.common.base.Ascii.GS, 42, 39, 62, 46, 56, com.google.common.base.Ascii.ESC, 46, 57, 0, 46, 50};
    }

    public abstract <K extends K0, V> java.util.Map<K, java.util.Collection<V>> A04();

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q4 != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    private final com.facebook.ads.redexgen.core.BD<K0, java.lang.Object> A00(final int expectedValuesPerKey) {
        com.facebook.ads.redexgen.core.AbstractC2013nJ.A00(expectedValuesPerKey, A01(0, 20, 35));
        return new com.facebook.ads.redexgen.core.BD<K0, java.lang.Object>(this) { // from class: com.facebook.ads.redexgen.X.2F
            public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC2182q4 A01;

            {
                this.A01 = this;
            }

            @Override // com.facebook.ads.redexgen.core.BD
            public final <K extends K0, V> com.facebook.ads.redexgen.core.BM<K, V> A00() {
                return com.facebook.ads.redexgen.core.AbstractC2186q8.A00(this.A01.A04(), new com.facebook.ads.redexgen.core.BE(expectedValuesPerKey));
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q4 != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    public final com.facebook.ads.redexgen.core.BD<K0, java.lang.Object> A03() {
        return A00(2);
    }
}
