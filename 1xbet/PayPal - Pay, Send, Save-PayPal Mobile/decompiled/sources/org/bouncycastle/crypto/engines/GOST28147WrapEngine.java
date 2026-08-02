package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class GOST28147WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private org.bouncycastle.crypto.engines.GOST28147Engine getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.engines.GOST28147Engine();
    private org.bouncycastle.crypto.macs.GOST28147Mac getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.macs.GOST28147Mac();

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getMacSize() + i2];
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i, bArr2, 0);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 8, bArr2, 8);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 16, bArr2, 16);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 24, bArr2, 24);
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, i2);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int macSize = i2 - this.getHighSpeedVideoFpsRanges.getMacSize();
        byte[] bArr2 = new byte[macSize];
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i, bArr2, 0);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 8, bArr2, 8);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 16, bArr2, 16);
        this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRanges.getMacSize()];
        this.getHighSpeedVideoFpsRanges.update(bArr2, 0, macSize);
        this.getHighSpeedVideoFpsRanges.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[this.getHighSpeedVideoFpsRanges.getMacSize()];
        java.lang.System.arraycopy(bArr, (i + i2) - 4, bArr4, 0, this.getHighSpeedVideoFpsRanges.getMacSize());
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr3, bArr4)) {
            return bArr2;
        }
        throw new java.lang.IllegalStateException("mac mismatch");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        org.bouncycastle.crypto.params.ParametersWithUKM parametersWithUKM = (org.bouncycastle.crypto.params.ParametersWithUKM) cipherParameters;
        this.getHighSpeedVideoFpsRangesFor.init(z, parametersWithUKM.getParameters());
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.ParametersWithIV(parametersWithUKM.getParameters(), parametersWithUKM.getUKM()));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return "GOST28147Wrap";
    }
}
