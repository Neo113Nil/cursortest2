package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum VW {
    A05(0, com.facebook.ads.NativeAdBase.MediaCacheFlag.NONE),
    A04(1, com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final com.facebook.ads.NativeAdBase.MediaCacheFlag A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, Byte.MIN_VALUE, Byte.MIN_VALUE, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    VW(long j, com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    @javax.annotation.Nullable
    public static com.facebook.ads.redexgen.core.VW A00(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (com.facebook.ads.redexgen.core.VW vw : values()) {
            if (vw.A01 == mediaCacheFlag) {
                return vw;
            }
        }
        return null;
    }
}
