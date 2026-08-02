package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class Ed25519phSigner implements org.bouncycastle.crypto.Signer {
    private boolean Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges = org.bouncycastle.math.ec.rfc8032.Ed25519.createPrehash();
    private org.bouncycastle.crypto.params.Ed25519PublicKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.Camera2StreamConfigurationMap || (ed25519PublicKeyParameters = this.getHighSpeedVideoFpsRangesFor) == null) {
            throw new java.lang.IllegalStateException("Ed25519phSigner not initialised for verification");
        }
        if (64 == bArr.length) {
            return org.bouncycastle.math.ec.rfc8032.Ed25519.verifyPrehash(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoFpsRanges.reset();
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoFpsRanges.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("Ed25519phSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[64];
        if (64 != this.getHighSpeedVideoFpsRanges.doFinal(bArr, 0)) {
            throw new java.lang.IllegalStateException("Prehash digest failed");
        }
        byte[] bArr2 = new byte[64];
        this.getHighSpeedVideoSizes.sign(2, this.getHighResolutionOutputSizeshNQ4ISI, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    public Ed25519phSigner(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
