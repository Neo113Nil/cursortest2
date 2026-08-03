package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class y3 {
    public static boolean a(byte b) {
        return b >= 0;
    }

    public static boolean b(byte b) {
        return b > -65;
    }

    public static void a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || b(b2)) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & com.google.common.base.Ascii.US) << 6) | (b2 & 63));
    }

    public static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!b(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !b(b3)))) {
            cArr[i] = (char) (((b & com.google.common.base.Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
    }

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!b(b2)) {
            if ((((b2 + 112) + (b << com.google.common.base.Ascii.FS)) >> 30) == 0 && !b(b3) && !b(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
    }
}
