package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class OZ implements java.lang.Runnable {
    public static byte[] A02;
    public final /* synthetic */ java.lang.String A00;
    public final /* synthetic */ java.util.List A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{112, 123, 118, 103, 108, 101, 97, 112, 113, 74, 118, 101, 120, 57, kotlin.io.encoding.Base64.padSymbol, 32, 34, 53, 35, 35, 57, 63, 62};
    }

    public OZ(java.util.List list, java.lang.String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            for (com.facebook.ads.AdSDKNotificationListener adSDKNotificationListener : this.A01) {
                android.os.Bundle data = new android.os.Bundle();
                data.putString(A00(0, 13, 63), this.A00);
                adSDKNotificationListener.onAdEvent(A00(13, 10, 122), data);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
