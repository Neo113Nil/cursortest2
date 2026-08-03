package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
/* loaded from: assets/audience_network/classes2.dex */
public enum MN {
    A05,
    A04,
    A06,
    A03;

    public static byte[] A00;
    public static java.lang.String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            java.lang.String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            copyOfRange[i4] = (byte) ((b - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 33, com.google.common.base.Ascii.NAK, 7, 9, com.google.common.base.Ascii.SI, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, -27, -31, -42, -18, -41, -42, -40, -32, -39, -37, -50, -49, -50, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}
