package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class DSADigestSigner implements org.bouncycastle.crypto.Signer {
    private final org.bouncycastle.crypto.signers.DSAEncoding Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.DSA getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("DSADigestSigner not initialised for verification");
        }
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        try {
            java.math.BigInteger[] decode = this.Camera2StreamConfigurationMap.decode(getOrder(), bArr);
            return this.getHighSpeedVideoFpsRanges.verifySignature(bArr2, decode[0], decode[1]);
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
            throw new java.lang.IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!z && asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Verification Requires Public Key.");
        }
        reset();
        this.getHighSpeedVideoFpsRanges.init(z, cipherParameters);
    }

    protected java.math.BigInteger getOrder() {
        org.bouncycastle.crypto.DSA dsa = this.getHighSpeedVideoFpsRanges;
        if (dsa instanceof org.bouncycastle.crypto.DSAExt) {
            return ((org.bouncycastle.crypto.DSAExt) dsa).getOrder();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        java.math.BigInteger[] generateSignature = this.getHighSpeedVideoFpsRanges.generateSignature(bArr);
        try {
            return this.Camera2StreamConfigurationMap.encode(getOrder(), generateSignature[0], generateSignature[1]);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("unable to encode signature");
        }
    }

    public DSADigestSigner(org.bouncycastle.crypto.DSAExt dSAExt, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.signers.DSAEncoding dSAEncoding) {
        this.getHighSpeedVideoFpsRanges = dSAExt;
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.Camera2StreamConfigurationMap = dSAEncoding;
    }

    public DSADigestSigner(org.bouncycastle.crypto.DSA dsa, org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRanges = dsa;
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE;
    }
}
