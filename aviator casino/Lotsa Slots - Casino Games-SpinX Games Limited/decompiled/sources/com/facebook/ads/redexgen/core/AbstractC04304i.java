package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04304i {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"xemy17oJESjX", "rPO8UlQzVoplqsv241x2vKH9ITvvG5RO", "lwnNPX4PInl", "3ZJzEwR8uVRMBQC0tqntIJ86zVyjP6", "EDwbiEJ5SEYx8yR18WYzWyNJdlpGFaeE", "Kr1YCqNPaz9XeY6", "vkRdwAWmOCKEbB6zjyqD0a8RWRR8tEwK", "9fnayNKVpPH2aeCe0iQJlqHqzIFqpYut"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {74, 86, 83, 86, 89, com.google.common.base.Ascii.DC4, 89, 72, 85, 78, 76, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, -43, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, -22, -10, -13, -10, -7, -76, -5, -7, -24, -11, -6, -19, -20, -7, -29, -13, -28, -83, 85, 81, 95, com.google.common.base.Ascii.SUB, 96, 97, 78, 97, 86, 80, com.google.common.base.Ascii.SUB, 86, 91, 83, 92};
        if (A01[1].charAt(12) != 'q') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[6] = "2QjkwbE64yFQhHjtiWmGMRmbrZEFKpMO";
        strArr[0] = "Fg5M50njpCut";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(android.media.MediaFormat mediaFormat, com.facebook.ads.androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 23), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 56), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 119), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 125), colorInfo.A04);
        }
    }

    public static void A03(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void A04(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A05(android.media.MediaFormat mediaFormat, java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, java.nio.ByteBuffer.wrap(bArr));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A06(android.media.MediaFormat mediaFormat, java.util.List<byte[]> list) {
        for (int i = 0; i < i; i++) {
            mediaFormat.setByteBuffer(A00(39, 4, 16) + i, java.nio.ByteBuffer.wrap(list.get(i)));
        }
    }
}
