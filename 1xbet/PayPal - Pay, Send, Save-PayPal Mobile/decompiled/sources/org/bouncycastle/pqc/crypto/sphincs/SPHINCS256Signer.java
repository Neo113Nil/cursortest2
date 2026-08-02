package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCS256Signer implements org.bouncycastle.pqc.crypto.MessageSigner {
    private byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.pqc.crypto.sphincs.HashFunctions getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions = this.getHighSpeedVideoSizes;
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i = 0; i < 1088; i++) {
            bArr9[i] = bArr2[i];
        }
        java.lang.System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        org.bouncycastle.crypto.Digest digest = hashFunctions.getHighSpeedVideoSizes;
        byte[] bArr10 = new byte[digest.getDigestSize()];
        digest.update(bArr3, 40968, 32);
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr10, 0);
        for (int i2 = 0; i2 != 32; i2++) {
            bArr3[i2 + 40968] = 0;
        }
        for (int i3 = 0; i3 != 8; i3++) {
            jArr[i3] = org.bouncycastle.util.Pack.littleEndianToLong(bArr10, i3 * 8);
        }
        long j = jArr[0] & 1152921504606846975L;
        java.lang.System.arraycopy(bArr10, 16, bArr4, 0, 32);
        java.lang.System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar = new org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr();
        leafaddrVar.getHighSpeedVideoSizes = 11;
        leafaddrVar.getHighResolutionOutputSizeshNQ4ISI = 0L;
        leafaddrVar.Camera2StreamConfigurationMap = 0L;
        java.lang.System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        org.bouncycastle.pqc.crypto.sphincs.Tree.getHighSpeedVideoSizes(hashFunctions, bArr3, 40968, bArr9, leafaddrVar, bArr3, 39944);
        org.bouncycastle.crypto.Digest digest2 = hashFunctions.getHighSpeedVideoSizes;
        digest2.update(bArr3, 39912, 1088);
        int i4 = 0;
        digest2.update(bArr, 0, bArr.length);
        digest2.doFinal(bArr5, 0);
        org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar2 = new org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr();
        leafaddrVar2.getHighSpeedVideoSizes = 12;
        leafaddrVar2.Camera2StreamConfigurationMap = (int) (r21 & 31);
        leafaddrVar2.getHighResolutionOutputSizeshNQ4ISI = j >>> 5;
        for (int i5 = 0; i5 < 32; i5++) {
            bArr3[i5] = bArr4[i5];
        }
        byte[] bArr11 = bArr8;
        java.lang.System.arraycopy(bArr9, 32, bArr11, 0, 1024);
        int i6 = 0;
        while (i6 < 8) {
            bArr3[i6 + 32] = (byte) ((j >>> (i6 * 8)) & 255);
            i6++;
            bArr11 = bArr11;
        }
        byte[] bArr12 = bArr11;
        byte[] bArr13 = bArr7;
        org.bouncycastle.pqc.crypto.sphincs.Seed.getHighSpeedVideoSizes(hashFunctions, bArr13, 0, bArr9, leafaddrVar2);
        new org.bouncycastle.pqc.crypto.sphincs.Horst();
        org.bouncycastle.pqc.crypto.sphincs.Horst.getHighSpeedVideoFpsRangesFor(hashFunctions, bArr3, 40, bArr6, bArr13, bArr12, bArr5);
        new org.bouncycastle.pqc.crypto.sphincs.Wots();
        int i7 = 13352;
        int i8 = 0;
        for (int i9 = 12; i8 < i9; i9 = 12) {
            leafaddrVar2.getHighSpeedVideoSizes = i8;
            org.bouncycastle.pqc.crypto.sphincs.Seed.getHighSpeedVideoSizes(hashFunctions, bArr13, i4, bArr9, leafaddrVar2);
            org.bouncycastle.pqc.crypto.sphincs.Wots.Camera2StreamConfigurationMap(hashFunctions, bArr3, i7, bArr6, bArr13, bArr12);
            int i10 = i7 + 2144;
            org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar3 = new org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr(leafaddrVar2);
            byte[] bArr14 = new byte[2048];
            byte[] bArr15 = new byte[1024];
            byte[] bArr16 = new byte[68608];
            byte[] bArr17 = bArr13;
            leafaddrVar3.Camera2StreamConfigurationMap = 0L;
            while (leafaddrVar3.Camera2StreamConfigurationMap < 32) {
                org.bouncycastle.pqc.crypto.sphincs.Seed.getHighSpeedVideoSizes(hashFunctions, bArr15, (int) (leafaddrVar3.Camera2StreamConfigurationMap * 32), bArr9, leafaddrVar3);
                leafaddrVar3.Camera2StreamConfigurationMap++;
            }
            new org.bouncycastle.pqc.crypto.sphincs.Wots();
            leafaddrVar3.Camera2StreamConfigurationMap = 0L;
            while (leafaddrVar3.Camera2StreamConfigurationMap < 32) {
                byte[] bArr18 = bArr16;
                byte[] bArr19 = bArr15;
                org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar4 = leafaddrVar3;
                org.bouncycastle.pqc.crypto.sphincs.Wots.getHighSpeedVideoFpsRangesFor(hashFunctions, bArr18, (int) (leafaddrVar3.Camera2StreamConfigurationMap * 2144), bArr19, (int) (leafaddrVar3.Camera2StreamConfigurationMap * 32), bArr12, 0);
                leafaddrVar4.Camera2StreamConfigurationMap++;
                leafaddrVar3 = leafaddrVar4;
                i10 = i10;
                bArr16 = bArr18;
                bArr15 = bArr19;
                i8 = i8;
            }
            byte[] bArr20 = bArr16;
            org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar5 = leafaddrVar3;
            int i11 = i10;
            int i12 = i8;
            long j2 = 0;
            while (true) {
                leafaddrVar5.Camera2StreamConfigurationMap = j2;
                if (leafaddrVar5.Camera2StreamConfigurationMap >= 32) {
                    break;
                }
                org.bouncycastle.pqc.crypto.sphincs.Tree.getHighResolutionOutputSizeshNQ4ISI(hashFunctions, bArr14, (int) ((leafaddrVar5.Camera2StreamConfigurationMap * 32) + okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), bArr20, (int) (leafaddrVar5.Camera2StreamConfigurationMap * 2144), bArr12, 0);
                j2 = leafaddrVar5.Camera2StreamConfigurationMap + 1;
            }
            int i13 = 0;
            for (int i14 = 32; i14 > 0; i14 >>>= 1) {
                for (int i15 = 0; i15 < i14; i15 += 2) {
                    hashFunctions.Camera2StreamConfigurationMap(bArr14, ((i14 >>> 1) * 32) + ((i15 >>> 1) * 32), bArr14, (i14 * 32) + (i15 * 32), bArr12, (i13 + 7) * 64);
                }
                i13++;
            }
            int i16 = (int) leafaddrVar2.Camera2StreamConfigurationMap;
            for (int i17 = 0; i17 < 5; i17++) {
                java.lang.System.arraycopy(bArr14, ((32 >>> i17) * 32) + (((i16 >>> i17) ^ 1) * 32), bArr3, i11 + (i17 * 32), 32);
            }
            java.lang.System.arraycopy(bArr14, 32, bArr6, 0, 32);
            i7 += 2304;
            leafaddrVar2.Camera2StreamConfigurationMap = (int) (leafaddrVar2.getHighResolutionOutputSizeshNQ4ISI & 31);
            leafaddrVar2.getHighResolutionOutputSizeshNQ4ISI >>>= 5;
            i8 = i12 + 1;
            bArr13 = bArr17;
            i4 = 0;
        }
        for (int i18 = 0; i18 != 1088; i18++) {
            bArr9[i18] = 0;
        }
        return bArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        boolean z;
        int i;
        byte[] bArr3;
        org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions = this.getHighSpeedVideoSizes;
        byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr5 = new byte[2144];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[41000];
        byte[] bArr9 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new java.lang.IllegalArgumentException("signature wrong size");
        }
        byte[] bArr10 = new byte[64];
        int i2 = 0;
        for (int i3 = 0; i3 < 1056; i3++) {
            bArr9[i3] = bArr4[i3];
        }
        byte[] bArr11 = new byte[32];
        for (int i4 = 0; i4 < 32; i4++) {
            bArr11[i4] = bArr2[i4];
        }
        java.lang.System.arraycopy(bArr2, 0, bArr8, 0, 41000);
        org.bouncycastle.crypto.Digest digest = hashFunctions.getHighSpeedVideoSizes;
        digest.update(bArr11, 0, 32);
        digest.update(bArr9, 0, 1056);
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr10, 0);
        long j = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            j ^= (bArr8[i5 + 32] & 255) << (i5 * 8);
        }
        new org.bouncycastle.pqc.crypto.sphincs.Horst();
        org.bouncycastle.pqc.crypto.sphincs.Horst.getHighSpeedVideoSizes(hashFunctions, bArr7, bArr8, bArr9, bArr10);
        new org.bouncycastle.pqc.crypto.sphincs.Wots();
        long j2 = j;
        int i6 = 13352;
        int i7 = 0;
        while (true) {
            z = 1;
            if (i7 >= 12) {
                break;
            }
            int i8 = i7;
            org.bouncycastle.pqc.crypto.sphincs.Wots.getHighSpeedVideoFpsRanges(hashFunctions, bArr5, bArr8, i6, bArr7, bArr9);
            int i9 = i2;
            org.bouncycastle.pqc.crypto.sphincs.Tree.getHighResolutionOutputSizeshNQ4ISI(hashFunctions, bArr6, 0, bArr5, 0, bArr9, 0);
            int i10 = (int) (j2 & 31);
            int i11 = i6 + 2144;
            byte[] bArr12 = new byte[64];
            if ((i10 & 1) != 0) {
                for (int i12 = i9; i12 < 32; i12++) {
                    bArr12[i12 + 32] = bArr6[i12];
                }
                for (int i13 = i9; i13 < 32; i13++) {
                    bArr12[i13] = bArr8[i11 + i13];
                }
            } else {
                for (int i14 = i9; i14 < 32; i14++) {
                    bArr12[i14] = bArr6[i14];
                }
                for (int i15 = i9; i15 < 32; i15++) {
                    bArr12[i15 + 32] = bArr8[i11 + i15];
                }
            }
            int i16 = i6 + 2176;
            int i17 = i9;
            while (i17 < 4) {
                int i18 = i10 >>> 1;
                if ((i18 & 1) != 0) {
                    i = i17;
                    bArr3 = bArr12;
                    hashFunctions.Camera2StreamConfigurationMap(bArr12, 32, bArr12, 0, bArr9, (i17 + 7) * 64);
                    for (int i19 = i9; i19 < 32; i19++) {
                        bArr3[i19] = bArr8[i16 + i19];
                    }
                } else {
                    i = i17;
                    bArr3 = bArr12;
                    hashFunctions.Camera2StreamConfigurationMap(bArr3, 0, bArr3, 0, bArr9, (i + 7) * 64);
                    for (int i20 = i9; i20 < 32; i20++) {
                        bArr3[i20 + 32] = bArr8[i16 + i20];
                    }
                }
                i16 += 32;
                i17 = i + 1;
                i10 = i18;
                bArr12 = bArr3;
            }
            hashFunctions.Camera2StreamConfigurationMap(bArr7, 0, bArr12, 0, bArr9, 704);
            j2 >>= 5;
            i6 += 2304;
            i7 = i8 + 1;
            i2 = i9;
        }
        int i21 = i2;
        while (i2 < 32) {
            if (bArr7[i2] != bArr9[i2 + 1024]) {
                z = i21;
            }
            i2++;
            z = z;
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!z) {
            this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    public SPHINCS256Signer(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new java.lang.IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        }
        if (digest2.getDigestSize() != 64) {
            throw new java.lang.IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.sphincs.HashFunctions(digest, digest2);
    }
}
