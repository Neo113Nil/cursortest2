package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AM extends com.facebook.ads.redexgen.core.C2122p5 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"IiHFHpE70aCOc94efxOlf2iC0Ng8zMr5", "b3mzaytlZJgoRVhs4UINeaUr6S0G0E41", "6IHqdrhMw9UxFnoc7iMNxZeDC0DTO0yB", "go0dTVggBQ2s7heaJCrnqGQgIh6JhPx1", "bkC24C7HhnNqTiNutYzB4zMXotuBenI", "te5qRCwogDd297VgLok2fv8nwYFOdDR1", "xjDDw5bsf4CogqtV7hhNk6k9HWMs2JIA", "oLDdWjUmHvVvISH87gP40QDZoo9t6EZz"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].charAt(11) != 'O') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "31sOmOCDO5yq31NNiMqquOfpDH8J50WI";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{96, 79, 70, 66, 81, 87, 70, 91, 87, 3, 107, 119, 119, 115, 3, 87, 81, 66, 69, 69, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 3, 77, 76, 87, 3, 83, 70, 81, 78, 74, 87, 87, 70, 71, com.google.common.base.Ascii.CR, 3, 112, 70, 70, 3, 75, 87, 87, 83, 80, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, 71, 70, 85, 70, 79, 76, 83, 70, 81, com.google.common.base.Ascii.CR, 66, 77, 71, 81, 76, 74, 71, com.google.common.base.Ascii.CR, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 78, com.google.common.base.Ascii.FF, 68, 86, 74, 71, 70, com.google.common.base.Ascii.FF, 87, 76, 83, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 80, com.google.common.base.Ascii.FF, 78, 70, 71, 74, 66, com.google.common.base.Ascii.FF, 74, 80, 80, 86, 70, 80, com.google.common.base.Ascii.FF, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 70, 66, 81, 87, 70, 91, 87, com.google.common.base.Ascii.SO, 77, 76, 87, com.google.common.base.Ascii.SO, 83, 70, 81, 78, 74, 87, 87, 70, 71};
    }

    static {
        A02();
    }

    public AM(java.io.IOException iOException, com.facebook.ads.redexgen.core.C04565i c04565i) {
        super(A01(0, 121, 4), iOException, c04565i, 2007, 1);
    }
}
