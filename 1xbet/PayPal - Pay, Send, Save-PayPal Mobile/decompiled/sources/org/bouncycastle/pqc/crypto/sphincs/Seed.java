package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class Seed {
    static void getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar) {
        byte[] bArr3 = new byte[40];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr3[i2] = bArr2[i2];
        }
        org.bouncycastle.util.Pack.longToLittleEndian((leafaddrVar.Camera2StreamConfigurationMap << 59) | leafaddrVar.getHighSpeedVideoSizes | (leafaddrVar.getHighResolutionOutputSizeshNQ4ISI << 4), bArr3, 32);
        hashFunctions.getHighResolutionOutputSizeshNQ4ISI.update(bArr3, 0, 40);
        hashFunctions.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, i);
    }

    static void Camera2StreamConfigurationMap(byte[] bArr, int i, long j, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.engines.ChaChaEngine chaChaEngine = new org.bouncycastle.crypto.engines.ChaChaEngine(12);
        chaChaEngine.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr2, i2, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i, (int) j, bArr, i);
    }

    Seed() {
    }
}
