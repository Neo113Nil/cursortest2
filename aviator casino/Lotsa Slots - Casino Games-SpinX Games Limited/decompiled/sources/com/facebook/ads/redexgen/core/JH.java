package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class JH {
    public static byte[] A00;
    public static java.lang.String[] A01 = {com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "wBzTr9isyWuzk0Was82fzP", "sjHXZ8xDB", "rmj8ZpQPq6N", "k0JnkexrU5JvppKLiAvWnmQe", "wOTrIZh22Rcriy8Kptm38zvp", "MO9vm10BV89BFpJ5cx5aSl", "G2cEiJ7mV"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-68, -33, -33, -44, -83, -32, -37, -39, -63, -32, -43, -40, -20, 5, 10, com.google.common.base.Ascii.FF, 7, 7, 6, 9, com.google.common.base.Ascii.VT, -4, -5, -73, 7, 10, 10, -1, -73, com.google.common.base.Ascii.CR, -4, 9, 10, 0, 6, 5, -47, -73};
        java.lang.String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[2] = "tjOAGVDnT";
        strArr2[7] = "ur6F1gHbb";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.JG A00(byte[] bArr) {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(bArr);
        if (c04434v.A0A() < 32) {
            return null;
        }
        c04434v.A0f(0);
        if (c04434v.A0C() != c04434v.A07() + 4 || c04434v.A0C() != 1886614376) {
            return null;
        }
        int dataSize = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(c04434v.A0C());
        if (dataSize > 1) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A01(0, 12, 82), A01(12, 26, 125) + dataSize);
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(c04434v.A0P(), c04434v.A0P());
        if (dataSize == 1) {
            c04434v.A0g(c04434v.A0L() * 16);
        }
        int atomType = c04434v.A0L();
        java.lang.String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[6] = "Op4nBnIC0DPoqkcvuw04qL";
        if (atomType != c04434v.A07()) {
            return null;
        }
        byte[] bArr2 = new byte[atomType];
        c04434v.A0k(bArr2, 0, atomType);
        return new com.facebook.ads.redexgen.core.JG(uuid, dataSize, bArr2);
    }

    public static java.util.UUID A02(byte[] bArr) {
        java.util.UUID uuid;
        com.facebook.ads.redexgen.core.JG parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
