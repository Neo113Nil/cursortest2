package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class UTF8 {
    private static final short[] Camera2StreamConfigurationMap = new short[128];
    private static final byte[] getHighSpeedVideoFpsRanges;

    static {
        byte[] bArr = new byte[112];
        getHighSpeedVideoFpsRanges = bArr;
        byte[] bArr2 = new byte[128];
        for (int i = 0; i <= 15; i++) {
            bArr2[i] = 1;
        }
        for (int i2 = 16; i2 <= 31; i2++) {
            bArr2[i2] = 2;
        }
        for (int i3 = 32; i3 <= 63; i3++) {
            bArr2[i3] = 3;
        }
        for (int i4 = 64; i4 <= 65; i4++) {
            bArr2[i4] = 0;
        }
        for (int i5 = 66; i5 <= 95; i5++) {
            bArr2[i5] = 4;
        }
        bArr2[96] = 5;
        for (int i6 = 97; i6 <= 108; i6++) {
            bArr2[i6] = 6;
        }
        bArr2[109] = 7;
        for (int i7 = 110; i7 <= 111; i7++) {
            bArr2[i7] = 6;
        }
        bArr2[112] = 8;
        for (int i8 = 113; i8 <= 115; i8++) {
            bArr2[i8] = 9;
        }
        bArr2[116] = 10;
        for (int i9 = 117; i9 <= 127; i9++) {
            bArr2[i9] = 0;
        }
        for (int i10 = 0; i10 <= 111; i10++) {
            bArr[i10] = -2;
        }
        for (int i11 = 8; i11 <= 11; i11++) {
            bArr[i11] = -1;
        }
        for (int i12 = 24; i12 <= 27; i12++) {
            bArr[i12] = 0;
        }
        for (int i13 = 40; i13 <= 43; i13++) {
            bArr[i13] = 16;
        }
        for (int i14 = 58; i14 <= 59; i14++) {
            bArr[i14] = 0;
        }
        for (int i15 = 72; i15 <= 73; i15++) {
            bArr[i15] = 0;
        }
        for (int i16 = 89; i16 <= 91; i16++) {
            bArr[i16] = 16;
        }
        bArr[104] = 16;
        byte[] bArr3 = {0, 0, 0, 0, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, com.visa.cbp.getEncExpo.IResultReceiver2};
        for (int i17 = 0; i17 < 128; i17++) {
            byte b = bArr2[i17];
            Camera2StreamConfigurationMap[i17] = (short) (bArr4[b] | ((bArr3[b] & i17) << 8));
        }
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = Camera2StreamConfigurationMap[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i3 >= bArr.length) {
                        return -1;
                    }
                    byte b3 = bArr[i3];
                    i4 = (i4 << 6) | (b3 & 63);
                    b2 = getHighSpeedVideoFpsRanges[b2 + ((b3 & 255) >>> 4)];
                    i3++;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i4 <= 65535) {
                    if (i2 >= cArr.length) {
                        return -1;
                    }
                    cArr[i2] = (char) i4;
                } else {
                    if (i2 >= cArr.length - 1) {
                        return -1;
                    }
                    cArr[i2] = (char) ((i4 >>> 10) + 55232);
                    cArr[i2 + 1] = (char) ((i4 & 1023) | 56320);
                    i2 += 2;
                    i = i3;
                }
            } else {
                if (i2 >= cArr.length) {
                    return -1;
                }
                cArr[i2] = (char) b;
            }
            i2++;
            i = i3;
        }
        return i2;
    }
}
