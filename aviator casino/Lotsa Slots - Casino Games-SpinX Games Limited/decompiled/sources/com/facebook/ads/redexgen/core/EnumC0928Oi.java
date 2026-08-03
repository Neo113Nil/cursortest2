package com.facebook.ads.redexgen.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC0928Oi {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC0928Oi[] A03;
    public static final com.facebook.ads.redexgen.core.EnumC0928Oi A04;
    public static final com.facebook.ads.redexgen.core.EnumC0928Oi A05;
    public static final com.facebook.ads.redexgen.core.EnumC0928Oi A06;
    public final java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 62);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, 113, 70, 71, 70, 77, 82, 69, 80, 79, 82, 84, 74, 75, 70, 71, 101, 100, 101, 110, 44, 59, 46, 49, 44, 42};
    }

    static {
        A01();
        A06 = new com.facebook.ads.redexgen.core.EnumC0928Oi(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new com.facebook.ads.redexgen.core.EnumC0928Oi(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new com.facebook.ads.redexgen.core.EnumC0928Oi(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public EnumC0928Oi(java.lang.String str, int i, java.lang.String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.EnumC0928Oi[] A02() {
        com.facebook.ads.redexgen.core.EnumC0928Oi[] enumC0928OiArr = new com.facebook.ads.redexgen.core.EnumC0928Oi[3];
        enumC0928OiArr[0] = A06;
        com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi = A04;
        java.lang.String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        enumC0928OiArr[1] = enumC0928Oi;
        enumC0928OiArr[2] = A05;
        return enumC0928OiArr;
    }

    public final java.lang.String A03() {
        return this.A00;
    }

    public static com.facebook.ads.redexgen.core.EnumC0928Oi valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.EnumC0928Oi) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.EnumC0928Oi.class, str);
    }

    public static com.facebook.ads.redexgen.core.EnumC0928Oi[] values() {
        return (com.facebook.ads.redexgen.core.EnumC0928Oi[]) A03.clone();
    }
}
