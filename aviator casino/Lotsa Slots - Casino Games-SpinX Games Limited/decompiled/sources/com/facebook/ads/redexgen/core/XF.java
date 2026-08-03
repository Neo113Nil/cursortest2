package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum XF {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);

    public static byte[] A01;
    public static java.lang.String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final com.facebook.ads.redexgen.core.XF[] A03;
    public static final java.lang.String A04;
    public final int A00;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {88, 93, 70, 90, 81, 86, 80, 90, 92, 74, 122, 107, 107, 100, 122, Byte.MAX_VALUE, 43, 58, 58, 53, 43, 46, 53, 60, 88, 110, Byte.MAX_VALUE, Byte.MAX_VALUE, 112, 106, 97, 104, 110, 104, 106, 98, 106, 97, 123, 112, 110, 107, 71, 68, 75, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 90, 81, 74, 90, 76, 75, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 86, 81, 76, 81, 76, 68, 73, 52, 32, 55, 35, 39, 55, 60, 49, 43, 45, 49, 51, 34, 34, 59, 60, 53, 43, 55, 55, 51, 60, 47, 42, 45, 40, 48, 8, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, 8, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 8, 5, 4, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.RS, 0, 5, 93, 68, 72, 67, 69, 94, 80, 80, 82, 69, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, 0, 17, com.google.common.base.Ascii.DLE, 0, com.google.common.base.Ascii.RS, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, 0, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 0, 19, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.CAN, 103, 98, 101, 96, 116, 106, 111, 77, 72, 79, 74, 94, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 94, 87, 51, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.EM, 4, com.google.common.base.Ascii.ESC, 8, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 1, 2, com.google.common.base.Ascii.RS, 8, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, 2, 3, 47, 52, 51, 60, 51, 63, 62, 37, 54, 53, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 51, 52, kotlin.io.encoding.Base64.padSymbol, 57, 38, 43, 42, 32, 48, 46, 43};
        if (A02[5].charAt(26) != 'j') {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new com.facebook.ads.redexgen.core.XF[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.facebook.ads.redexgen.core.XF supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    XF(int i) {
        this.A00 = i;
    }

    private final int A00() {
        return this.A00;
    }

    public static java.lang.String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.A00);
    }
}
