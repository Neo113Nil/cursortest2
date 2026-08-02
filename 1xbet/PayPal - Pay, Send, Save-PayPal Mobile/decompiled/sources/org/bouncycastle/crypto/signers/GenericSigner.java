package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class GenericSigner implements org.bouncycastle.crypto.Signer {
    private final org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("GenericSigner not initialised for verification");
        }
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        try {
            byte[] processBlock = this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr.length);
            if (processBlock.length < digestSize) {
                byte[] bArr3 = new byte[digestSize];
                java.lang.System.arraycopy(processBlock, 0, bArr3, digestSize - processBlock.length, processBlock.length);
                processBlock = bArr3;
            }
            return org.bouncycastle.util.Arrays.constantTimeAreEqual(processBlock, bArr2);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoSizes = z;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? (org.bouncycastle.crypto.params.AsymmetricKeyParameter) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("signing requires private key");
        }
        if (!z && asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("verification requires public key");
        }
        reset();
        this.getHighSpeedVideoFpsRanges.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException, org.bouncycastle.crypto.DataLengthException {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("GenericSigner not initialised for signature generation.");
        }
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        return this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, digestSize);
    }

    public GenericSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRanges = asymmetricBlockCipher;
        this.getHighSpeedVideoFpsRangesFor = digest;
    }
}
