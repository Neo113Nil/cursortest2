package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.46, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass46 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"iRbt0o504Arwoby5JHXaSNdVCCanqX3Z", "ASbg6tg4kzyOiw5fOrTV48A6bdNu61QQ", "VJNj5t4vCwi8aTooUiCSn6hrJqJmgDCA", "jF3QiYzhpB2jmiLUWXOlRV8C8MCMW37s", "04l0YgLQyX7hnS2Tq5aYjCPcYldth61t", "viWvpQwMaKSmF6BaYaPf73TpnglWhe5o", "UZSp3mVbJo9", "8WqjnkkE7kcSKcejfHJHrMyyjo529bht"};
    public static final byte[] A02;
    public static final java.lang.String[] A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-49, -58, -47, -45, -7, -5, -84, -74, com.google.common.base.Ascii.CR, 34, com.google.common.base.Ascii.SI, -35, -38, -47, -36, -34, 4, -47, -36, -34, 4, -47, -36, -34, 4, -43, -29, -48, -98, -101, -110, -32, -110, -47, -101, -110, -59, -101, -110, -48, -110, -47};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A03 = new java.lang.String[]{A02(0, 0, 27), A02(5, 1, 112), A02(6, 1, 32), A02(7, 1, 41)};
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A00(byte[] bArr) {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(bArr);
        c04434v.A0f(9);
        int sampleRate = c04434v.A0I();
        c04434v.A0f(20);
        return android.util.Pair.create(java.lang.Integer.valueOf(c04434v.A0L()), java.lang.Integer.valueOf(sampleRate));
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        return java.lang.String.format(A02(8, 17, 98), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.lang.String A03(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.facebook.ads.redexgen.core.C5C.A0n(A02(25, 17, 35), A03[i], java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Character.valueOf(z ? 'H' : 'L'), java.lang.Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(java.lang.String.format(A02(0, 5, 87), java.lang.Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static java.util.List<byte[]> A04(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return java.util.Collections.singletonList(bArr);
    }

    public static boolean A06(java.util.List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1) {
            return false;
        }
        byte b = list.get(0)[0];
        if (A01[6].length() != 11) {
            throw new java.lang.RuntimeException();
        }
        A01[6] = "7rG63N7qIw7";
        return b == 1;
    }

    public static byte[] A07(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[A02.length + i2];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        java.lang.System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        java.lang.System.arraycopy(bArr, i, bArr2, nalUnit2.length, i2);
        return bArr2;
    }
}
