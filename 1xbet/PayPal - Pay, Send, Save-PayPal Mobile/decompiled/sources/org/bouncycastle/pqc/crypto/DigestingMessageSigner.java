package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public class DigestingMessageSigner implements org.bouncycastle.crypto.Signer {
    private final org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.pqc.crypto.MessageSigner getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("DigestingMessageSigner not initialised for verification");
        }
        byte[] bArr2 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, 0);
        return this.getHighSpeedVideoSizes.verifySignature(bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? (org.bouncycastle.crypto.params.AsymmetricKeyParameter) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!z && asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Verification Requires Public Key.");
        }
        reset();
        this.getHighSpeedVideoSizes.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("DigestingMessageSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0);
        return this.getHighSpeedVideoSizes.generateSignature(bArr);
    }

    public DigestingMessageSigner(org.bouncycastle.pqc.crypto.MessageSigner messageSigner, org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = messageSigner;
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
    }
}
