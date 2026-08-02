package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class HashFunctions {
    private static final byte[] getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Strings.toByteArray("expand 32-byte to 64-byte state!");
    private final org.bouncycastle.pqc.crypto.sphincs.Permute Camera2StreamConfigurationMap;
    final org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    final int Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[64];
        for (int i4 = 0; i4 < 64; i4++) {
            bArr4[i4] = (byte) (bArr2[i2 + i4] ^ bArr3[i3 + i4]);
        }
        byte[] bArr5 = new byte[64];
        for (int i5 = 0; i5 < 32; i5++) {
            bArr5[i5] = bArr4[i5];
            bArr5[i5 + 32] = getHighSpeedVideoFpsRangesFor[i5];
        }
        org.bouncycastle.pqc.crypto.sphincs.Permute.getHighSpeedVideoSizes(bArr5, bArr5);
        for (int i6 = 0; i6 < 32; i6++) {
            bArr5[i6] = (byte) (bArr5[i6] ^ bArr4[i6 + 32]);
        }
        org.bouncycastle.pqc.crypto.sphincs.Permute.getHighSpeedVideoSizes(bArr5, bArr5);
        for (int i7 = 0; i7 < 32; i7++) {
            bArr[i + i7] = bArr5[i7];
        }
        return 0;
    }

    final int getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = new byte[64];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr2[i2 + i3];
            bArr3[i3 + 32] = getHighSpeedVideoFpsRangesFor[i3];
        }
        org.bouncycastle.pqc.crypto.sphincs.Permute.getHighSpeedVideoSizes(bArr3, bArr3);
        for (int i4 = 0; i4 < 32; i4++) {
            bArr[i + i4] = bArr3[i4];
        }
        return 0;
    }

    HashFunctions(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.sphincs.Permute();
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoSizes = digest2;
    }

    HashFunctions(org.bouncycastle.crypto.Digest digest) {
        this(digest, null);
    }
}
