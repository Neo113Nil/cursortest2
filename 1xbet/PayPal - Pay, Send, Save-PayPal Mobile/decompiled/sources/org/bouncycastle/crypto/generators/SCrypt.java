package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class SCrypt {
    public static byte[] generate(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new java.lang.IllegalArgumentException("Salt S must be provided.");
        }
        if (i <= 1 || ((i - 1) & i) != 0) {
            throw new java.lang.IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i2 == 1 && i >= 65536) {
            throw new java.lang.IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Block size r must be >= 1.");
        }
        int i5 = Integer.MAX_VALUE / (i2 * 1024);
        if (i3 > 0 && i3 <= i5) {
            if (i4 > 0) {
                return getHighSpeedVideoFpsRangesFor(bArr, bArr2, i, i2, i3, i4);
            }
            throw new java.lang.IllegalArgumentException("Generated key length dkLen must be >= 1.");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parallelisation parameter p must be >= 1 and <= ");
        sb.append(i5);
        sb.append(" (based on block size r of ");
        sb.append(i2);
        sb.append(")");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7 A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:35:0x00f7, B:37:0x00fb, B:39:0x00ff, B:42:0x0102, B:44:0x010a, B:46:0x010e, B:48:0x0112, B:51:0x0115, B:80:0x00bc, B:82:0x00c0, B:84:0x00c3, B:87:0x00c7, B:90:0x00cf, B:92:0x00d3, B:94:0x00d7, B:97:0x00da), top: B:79:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:35:0x00f7, B:37:0x00fb, B:39:0x00ff, B:42:0x0102, B:44:0x010a, B:46:0x010e, B:48:0x0112, B:51:0x0115, B:80:0x00bc, B:82:0x00c0, B:84:0x00c3, B:87:0x00c7, B:90:0x00cf, B:92:0x00d3, B:94:0x00d7, B:97:0x00da), top: B:79:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        byte[] bArr3;
        byte[] bArr4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        int i12 = i2 * 128;
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr, bArr2, i3 * i12);
        byte b = 0;
        int[] iArr3 = null;
        try {
            int length = Camera2StreamConfigurationMap.length >>> 2;
            iArr3 = new int[length];
            try {
                org.bouncycastle.util.Pack.littleEndianToInt(Camera2StreamConfigurationMap, 0, iArr3);
                int i13 = 0;
                for (int i14 = i * i2; i - i13 > 2 && i14 > 1024; i14 >>>= 1) {
                    i13++;
                }
                int i15 = 0;
                while (i15 < length) {
                    try {
                        int i16 = i >>> i13;
                        int i17 = 1 << i13;
                        int numberOfTrailingZeros = org.bouncycastle.util.Integers.numberOfTrailingZeros(i) - i13;
                        int i18 = i2 * 32;
                        int[] iArr4 = new int[16];
                        int[] iArr5 = new int[16];
                        int[] iArr6 = new int[i18];
                        int i19 = length;
                        int[] iArr7 = new int[i18];
                        int i20 = i13;
                        int[][] iArr8 = new int[i17][];
                        bArr4 = Camera2StreamConfigurationMap;
                        int i21 = 0;
                        try {
                            java.lang.System.arraycopy(iArr3, i15, iArr7, 0, i18);
                            while (i21 < i17) {
                                try {
                                    int[] iArr9 = new int[i16 * i18];
                                    iArr8[i21] = iArr9;
                                    int i22 = i12;
                                    i11 = i17;
                                    int i23 = 0;
                                    int i24 = 0;
                                    while (i23 < i16) {
                                        iArr2 = iArr3;
                                        try {
                                            java.lang.System.arraycopy(iArr7, 0, iArr9, i24, i18);
                                            int i25 = i24 + i18;
                                            Camera2StreamConfigurationMap(iArr7, iArr4, iArr5, iArr6, i2);
                                            java.lang.System.arraycopy(iArr6, 0, iArr9, i25, i18);
                                            i24 = i25 + i18;
                                            Camera2StreamConfigurationMap(iArr6, iArr4, iArr5, iArr7, i2);
                                            i23 += 2;
                                            iArr3 = iArr2;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            i5 = i11;
                                            iArr = iArr2;
                                            while (i6 < i5) {
                                            }
                                            int[][] iArr10 = {iArr7, iArr4, iArr5, iArr6};
                                            while (i7 < 4) {
                                            }
                                            throw th;
                                        }
                                    }
                                    i21++;
                                    i12 = i22;
                                    i17 = i11;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    iArr2 = iArr3;
                                    i11 = i17;
                                }
                            }
                            i8 = i12;
                            int[] iArr11 = iArr3;
                            i9 = i17;
                            for (int i26 = 0; i26 < i; i26++) {
                                int i27 = iArr7[i18 - 16] & (i - 1);
                                java.lang.System.arraycopy(iArr8[i27 >>> numberOfTrailingZeros], (i27 & (i16 - 1)) * i18, iArr6, 0, i18);
                                Camera2StreamConfigurationMap(iArr6, iArr7, 0, iArr6);
                                Camera2StreamConfigurationMap(iArr6, iArr4, iArr5, iArr7, i2);
                            }
                            iArr = iArr11;
                            i10 = 0;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            iArr = iArr3;
                            i5 = i17;
                        }
                        try {
                            java.lang.System.arraycopy(iArr7, 0, iArr, i15, i18);
                            int i28 = 0;
                            while (i28 < i9) {
                                try {
                                    int[] iArr12 = iArr8[i28];
                                    if (iArr12 != null) {
                                        org.bouncycastle.util.Arrays.fill(iArr12, i10);
                                    }
                                    i28++;
                                    i10 = 0;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    iArr3 = iArr;
                                    bArr3 = bArr4;
                                    if (bArr3 != null) {
                                        org.bouncycastle.util.Arrays.fill(bArr3, (byte) 0);
                                    }
                                    if (iArr3 != null) {
                                        org.bouncycastle.util.Arrays.fill(iArr3, 0);
                                    }
                                    throw th;
                                }
                            }
                            int[][] iArr13 = {iArr7, iArr4, iArr5, iArr6};
                            for (int i29 = 0; i29 < 4; i29++) {
                                int[] iArr14 = iArr13[i29];
                                if (iArr14 != null) {
                                    org.bouncycastle.util.Arrays.fill(iArr14, 0);
                                }
                            }
                            i15 += i8 >>> 2;
                            iArr3 = iArr;
                            length = i19;
                            i13 = i20;
                            Camera2StreamConfigurationMap = bArr4;
                            i12 = i8;
                            b = 0;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i5 = i9;
                            for (i6 = 0; i6 < i5; i6++) {
                                int[] iArr15 = iArr8[i6];
                                if (iArr15 != null) {
                                    org.bouncycastle.util.Arrays.fill(iArr15, 0);
                                }
                            }
                            int[][] iArr102 = {iArr7, iArr4, iArr5, iArr6};
                            for (i7 = 0; i7 < 4; i7++) {
                                int[] iArr16 = iArr102[i7];
                                if (iArr16 != null) {
                                    org.bouncycastle.util.Arrays.fill(iArr16, 0);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bArr4 = Camera2StreamConfigurationMap;
                    }
                }
                bArr3 = Camera2StreamConfigurationMap;
                byte b2 = b;
                int[] iArr17 = iArr3;
                try {
                    org.bouncycastle.util.Pack.intToLittleEndian(iArr17, bArr3, b2);
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, bArr3, i4);
                    if (bArr3 != null) {
                        org.bouncycastle.util.Arrays.fill(bArr3, b2);
                    }
                    org.bouncycastle.util.Arrays.fill(iArr17, (int) b2);
                    return Camera2StreamConfigurationMap2;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    iArr3 = iArr17;
                    if (bArr3 != null) {
                    }
                    if (iArr3 != null) {
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                bArr3 = Camera2StreamConfigurationMap;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            bArr3 = Camera2StreamConfigurationMap;
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, int i) {
        org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((org.bouncycastle.crypto.params.KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i * 8)).getKey();
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        java.lang.System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            Camera2StreamConfigurationMap(iArr2, iArr, i2, iArr3);
            org.bouncycastle.crypto.engines.Salsa20Engine.salsaCore(8, iArr3, iArr2);
            java.lang.System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = ((length >>> 1) + i2) - i3;
            i2 += 16;
        }
    }

    private SCrypt() {
    }
}
