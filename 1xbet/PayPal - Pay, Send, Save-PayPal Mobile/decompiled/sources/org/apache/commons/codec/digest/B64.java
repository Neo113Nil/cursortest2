package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
final class B64 {
    static final char[] Camera2StreamConfigurationMap = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    B64() {
    }

    static void Camera2StreamConfigurationMap(byte b, byte b2, byte b3, int i, java.lang.StringBuilder sb) {
        int i2 = ((b << 16) & 16777215) | ((b2 << 8) & 65535) | (b3 & 255);
        while (i > 0) {
            sb.append(Camera2StreamConfigurationMap[i2 & 63]);
            i2 >>= 6;
            i--;
        }
    }

    static java.lang.String Camera2StreamConfigurationMap() {
        return Camera2StreamConfigurationMap(8, new java.security.SecureRandom());
    }

    static java.lang.String Camera2StreamConfigurationMap(int i, java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(8);
        for (int i2 = 1; i2 <= 8; i2++) {
            sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
