package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class Tree {
    static void getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar, byte[] bArr3, int i2) {
        org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar2 = new org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr(leafaddrVar);
        byte[] bArr4 = new byte[192];
        int[] iArr = new int[6];
        int i3 = (int) (leafaddrVar2.Camera2StreamConfigurationMap + 32);
        int i4 = 0;
        while (leafaddrVar2.Camera2StreamConfigurationMap < i3) {
            byte[] bArr5 = new byte[32];
            byte[] bArr6 = new byte[2144];
            new org.bouncycastle.pqc.crypto.sphincs.Wots();
            org.bouncycastle.pqc.crypto.sphincs.Seed.getHighSpeedVideoSizes(hashFunctions, bArr5, 0, bArr2, leafaddrVar2);
            org.bouncycastle.pqc.crypto.sphincs.Wots.getHighSpeedVideoFpsRangesFor(hashFunctions, bArr6, 0, bArr5, 0, bArr3, i2);
            getHighResolutionOutputSizeshNQ4ISI(hashFunctions, bArr4, i4 * 32, bArr6, 0, bArr3, i2);
            iArr[i4] = 0;
            i4++;
            while (i4 > 1) {
                int i5 = iArr[i4 - 1];
                int i6 = i4 - 2;
                if (i5 == iArr[i6]) {
                    int i7 = i6 * 32;
                    hashFunctions.Camera2StreamConfigurationMap(bArr4, i7, bArr4, i7, bArr3, i2 + ((i5 + 7) * 64));
                    iArr[i6] = iArr[i6] + 1;
                    i4--;
                }
            }
            leafaddrVar2.Camera2StreamConfigurationMap++;
        }
        for (int i8 = 0; i8 < 32; i8++) {
            bArr[i + i8] = bArr4[i8];
        }
    }

    static class leafaddr {
        long Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        public leafaddr(org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar) {
            this.getHighSpeedVideoSizes = leafaddrVar.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = leafaddrVar.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = leafaddrVar.Camera2StreamConfigurationMap;
        }

        public leafaddr() {
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4;
        int i5 = 67;
        for (int i6 = 0; i6 < 7; i6++) {
            int i7 = 0;
            while (true) {
                i4 = i5 >>> 1;
                if (i7 >= i4) {
                    break;
                }
                hashFunctions.Camera2StreamConfigurationMap(bArr2, i2 + (i7 * 32), bArr2, i2 + (i7 * 64), bArr3, i3 + (i6 * 64));
                i7++;
            }
            if ((i5 & 1) != 0) {
                java.lang.System.arraycopy(bArr2, i2 + ((i5 - 1) * 32), bArr2, (i4 * 32) + i2, 32);
                i4++;
            }
            i5 = i4;
        }
        java.lang.System.arraycopy(bArr2, i2, bArr, i, 32);
    }

    Tree() {
    }
}
