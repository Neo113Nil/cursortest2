package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
class ChaCha20 {
    static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        org.bouncycastle.crypto.engines.ChaChaEngine chaChaEngine = new org.bouncycastle.crypto.engines.ChaChaEngine(20);
        chaChaEngine.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr), bArr2));
        chaChaEngine.processBytes(bArr3, 0, i, bArr3, 0);
    }

    ChaCha20() {
    }
}
