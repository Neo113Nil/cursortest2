package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class OldIESEngine extends org.bouncycastle.crypto.engines.IESEngine {
    @Override // org.bouncycastle.crypto.engines.IESEngine
    protected byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            org.bouncycastle.util.Pack.intToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public OldIESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
        super(basicAgreement, derivationFunction, mac, bufferedBlockCipher);
    }

    public OldIESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac) {
        super(basicAgreement, derivationFunction, mac);
    }
}
