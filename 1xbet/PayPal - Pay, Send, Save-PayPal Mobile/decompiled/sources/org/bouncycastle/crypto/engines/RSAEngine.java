package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RSAEngine implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private org.bouncycastle.crypto.engines.RSACoreEngine getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.engines.RSACoreEngine();
        }
        org.bouncycastle.crypto.engines.RSACoreEngine rSACoreEngine = this.getHighSpeedVideoFpsRanges;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        rSACoreEngine.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
        rSACoreEngine.getHighSpeedVideoSizes = z;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        org.bouncycastle.crypto.engines.RSACoreEngine rSACoreEngine = this.getHighSpeedVideoFpsRanges;
        if (rSACoreEngine != null) {
            return rSACoreEngine.Camera2StreamConfigurationMap(rSACoreEngine.getHighSpeedVideoFpsRanges(rSACoreEngine.getHighSpeedVideoSizes(bArr, i, i2)));
        }
        throw new java.lang.IllegalStateException("RSA engine not initialised");
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
    }
}
