package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class Horst {
    static int getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[2097152];
        byte[] bArr7 = new byte[4194272];
        org.bouncycastle.pqc.crypto.sphincs.Seed.Camera2StreamConfigurationMap(bArr6, 0, 2097152L, bArr3, 0);
        for (int i2 = 0; i2 < 65536; i2++) {
            hashFunctions.getHighSpeedVideoSizes(bArr7, (65535 + i2) * 32, bArr6, i2 * 32);
        }
        for (int i3 = 0; i3 < 16; i3++) {
            long j = (1 << (16 - i3)) - 1;
            int i4 = 1 << (15 - i3);
            long j2 = i4 - 1;
            int i5 = 0;
            while (i5 < i4) {
                hashFunctions.Camera2StreamConfigurationMap(bArr7, (int) ((i5 + j2) * 32), bArr7, (int) (((i5 * 2) + j) * 32), bArr4, i3 * 64);
                i5++;
                i4 = i4;
                j2 = j2;
            }
        }
        int i6 = 2016;
        int i7 = i;
        while (i6 < 4064) {
            bArr[i7] = bArr7[i6];
            i6++;
            i7++;
        }
        for (int i8 = 0; i8 < 32; i8++) {
            int i9 = i8 * 2;
            int i10 = (bArr5[i9] & 255) + ((bArr5[i9 + 1] & 255) << 8);
            int i11 = 0;
            while (i11 < 32) {
                bArr[i7] = bArr6[(i10 * 32) + i11];
                i11++;
                i7++;
            }
            int i12 = i10 + 65535;
            for (int i13 = 0; i13 < 10; i13++) {
                int i14 = (i12 & 1) != 0 ? i12 + 1 : i12 - 1;
                int i15 = 0;
                while (i15 < 32) {
                    bArr[i7] = bArr7[(i14 * 32) + i15];
                    i15++;
                    i7++;
                }
                i12 = (i14 - 1) / 2;
            }
        }
        for (int i16 = 0; i16 < 32; i16++) {
            bArr2[i16] = bArr7[i16];
        }
        return 13312;
    }

    static int getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[1024];
        int i = 2088;
        int i2 = 0;
        while (i2 < 32) {
            int i3 = i2 * 2;
            int i4 = (bArr4[i3] & 255) + ((bArr4[i3 + 1] & 255) << 8);
            if ((i4 & 1) == 0) {
                hashFunctions.getHighSpeedVideoSizes(bArr5, 0, bArr2, i);
                for (int i5 = 0; i5 < 32; i5++) {
                    bArr5[i5 + 32] = bArr2[i + 32 + i5];
                }
            } else {
                hashFunctions.getHighSpeedVideoSizes(bArr5, 32, bArr2, i);
                for (int i6 = 0; i6 < 32; i6++) {
                    bArr5[i6] = bArr2[i + 32 + i6];
                }
            }
            int i7 = i + 64;
            int i8 = i4;
            for (int i9 = 1; i9 < 10; i9++) {
                i8 >>>= 1;
                if ((i8 & 1) == 0) {
                    hashFunctions.Camera2StreamConfigurationMap(bArr5, 0, bArr5, 0, bArr3, (i9 - 1) * 64);
                    for (int i10 = 0; i10 < 32; i10++) {
                        bArr5[i10 + 32] = bArr2[i7 + i10];
                    }
                } else {
                    hashFunctions.Camera2StreamConfigurationMap(bArr5, 32, bArr5, 0, bArr3, (i9 - 1) * 64);
                    for (int i11 = 0; i11 < 32; i11++) {
                        bArr5[i11] = bArr2[i7 + i11];
                    }
                }
                i7 += 32;
            }
            hashFunctions.Camera2StreamConfigurationMap(bArr5, 0, bArr5, 0, bArr3, 576);
            for (int i12 = 0; i12 < 32; i12++) {
                if (bArr2[((i8 >>> 1) * 32) + 40 + i12] != bArr5[i12]) {
                    for (int i13 = 0; i13 < 32; i13++) {
                        bArr[i13] = 0;
                    }
                    return -1;
                }
            }
            i2++;
            i = i7;
        }
        for (int i14 = 0; i14 < 32; i14++) {
            hashFunctions.Camera2StreamConfigurationMap(bArr5, i14 * 32, bArr2, (i14 * 64) + 40, bArr3, 640);
        }
        for (int i15 = 0; i15 < 16; i15++) {
            hashFunctions.Camera2StreamConfigurationMap(bArr5, i15 * 32, bArr5, i15 * 64, bArr3, 704);
        }
        for (int i16 = 0; i16 < 8; i16++) {
            hashFunctions.Camera2StreamConfigurationMap(bArr5, i16 * 32, bArr5, i16 * 64, bArr3, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            hashFunctions.Camera2StreamConfigurationMap(bArr5, i17 * 32, bArr5, i17 * 64, bArr3, 832);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            hashFunctions.Camera2StreamConfigurationMap(bArr5, i18 * 32, bArr5, i18 * 64, bArr3, 896);
        }
        hashFunctions.Camera2StreamConfigurationMap(bArr, 0, bArr5, 0, bArr3, 960);
        return 0;
    }

    Horst() {
    }
}
