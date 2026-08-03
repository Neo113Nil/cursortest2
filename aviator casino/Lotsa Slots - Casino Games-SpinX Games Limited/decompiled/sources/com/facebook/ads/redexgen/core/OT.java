package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OT {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"pY9ZXifxArCVjHBuW1cFi0dQljuE9Tf0", "pWwXLaHMc2CIhW3XIuObF4bvoKv8BfMZ", "mjts0HvkPGtREm0amxRZnnNRJAuUZdvm", "abSMUJDaje8PZVdniKXVA7EheIgEU2Ky", "XlFlgNr5vQZ1tyGpSUziV1wK28nmqCDp", "l72ITgVAaer6oLi3ZuEszNZ4Tz579Dik", "01uixCM2ew1GUtPlkStbY4R3MiHKurQG", "OuIJxNEFpIwLjLPuYqUOL946mVcVFOoz"};
    public static final java.util.HashMap<java.lang.String, com.facebook.ads.CacheFlag> A02;
    public static final java.util.HashMap<com.facebook.ads.CacheFlag, java.lang.String> A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 91);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-58, 10, 4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, -34, -30, -42, -36, -38, -42, -41, -42, -51, -47, -54, -57, -54, -53, -45, -54, -45, -58, -63, -62, -52};
        if (A01[0].charAt(16) != 'W') {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "Bq2StgQbD5mLPjUE1dw95ch9p648bptk";
        A00 = bArr;
    }

    static {
        A03();
        A03 = new java.util.HashMap<>();
        A02 = new java.util.HashMap<>();
        A04(com.facebook.ads.CacheFlag.NONE, A00(10, 4, 13));
        A04(com.facebook.ads.CacheFlag.ICON, A00(1, 4, 70));
        A04(com.facebook.ads.CacheFlag.IMAGE, A00(5, 5, 26));
        A04(com.facebook.ads.CacheFlag.VIDEO, A00(21, 5, 2));
    }

    public static java.lang.String A01(java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags) {
        if (cacheFlags == null) {
            if (A01[0].charAt(16) != 'W') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "mQm3e3EDrMVtI1xQTgCv9nJkqidgOUz3";
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = cacheFlags.iterator();
        while (it.hasNext()) {
            java.lang.String str = A03.get((com.facebook.ads.CacheFlag) it.next());
            if (str == null) {
                str = A00(14, 7, 1);
            }
            java.lang.StringBuilder append = sb.append(str);
            java.lang.String mappedValue = A00(0, 1, 63);
            if (A01[2].charAt(21) != 'n') {
                append.append(mappedValue);
            } else {
                A01[5] = "m2WAASCqguA1bRajQOE6ItOClvFsunSk";
                append.append(mappedValue);
            }
        }
        return sb.toString();
    }

    public static java.util.EnumSet<com.facebook.ads.CacheFlag> A02(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.EnumSet<com.facebook.ads.CacheFlag> noneOf = java.util.EnumSet.noneOf(com.facebook.ads.CacheFlag.class);
        for (java.lang.String str2 : str.split(A00(0, 1, 63))) {
            noneOf.add(A02.get(str2));
        }
        return noneOf;
    }

    public static void A04(com.facebook.ads.CacheFlag cacheFlag, java.lang.String str) {
        A03.put(cacheFlag, str);
        A02.put(str, cacheFlag);
    }
}
