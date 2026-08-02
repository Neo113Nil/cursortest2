package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RSABlindingEngine implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private boolean Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.engines.RSACoreEngine getHighSpeedVideoSizes = new org.bouncycastle.crypto.engines.RSACoreEngine();

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        org.bouncycastle.crypto.params.RSABlindingParameters rSABlindingParameters = (org.bouncycastle.crypto.params.RSABlindingParameters) cipherParameters;
        org.bouncycastle.crypto.engines.RSACoreEngine rSACoreEngine = this.getHighSpeedVideoSizes;
        rSACoreEngine.getHighSpeedVideoFpsRangesFor = rSABlindingParameters.getPublicKey();
        rSACoreEngine.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = rSABlindingParameters.getPublicKey();
        this.getHighResolutionOutputSizeshNQ4ISI = rSABlindingParameters.getBlindingFactor();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        java.math.BigInteger mod;
        java.math.BigInteger highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2);
        if (this.Camera2StreamConfigurationMap) {
            mod = highSpeedVideoSizes.multiply(this.getHighResolutionOutputSizeshNQ4ISI.modPow(this.getHighSpeedVideoFpsRangesFor.getExponent(), this.getHighSpeedVideoFpsRangesFor.getModulus())).mod(this.getHighSpeedVideoFpsRangesFor.getModulus());
        } else {
            java.math.BigInteger modulus = this.getHighSpeedVideoFpsRangesFor.getModulus();
            mod = highSpeedVideoSizes.multiply(org.bouncycastle.util.BigIntegers.modOddInverse(modulus, this.getHighResolutionOutputSizeshNQ4ISI)).mod(modulus);
        }
        return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(mod);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
    }
}
