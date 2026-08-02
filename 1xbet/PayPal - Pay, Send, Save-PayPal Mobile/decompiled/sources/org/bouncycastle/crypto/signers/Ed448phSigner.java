package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class Ed448phSigner implements org.bouncycastle.crypto.Signer {
    private org.bouncycastle.crypto.params.Ed448PrivateKeyParameters Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.Xof getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.math.ec.rfc8032.Ed448.createPrehash();
    private boolean getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.Ed448PublicKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        org.bouncycastle.crypto.params.Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.getHighSpeedVideoFpsRanges || (ed448PublicKeyParameters = this.getHighSpeedVideoSizes) == null) {
            throw new java.lang.IllegalStateException("Ed448phSigner not initialised for verification");
        }
        if (114 == bArr.length) {
            return org.bouncycastle.math.ec.rfc8032.Ed448.verifyPrehash(bArr, 0, ed448PublicKeyParameters.getEncoded(), 0, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        return false;
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
        this.getHighSpeedVideoFpsRanges = z;
        if (z) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = null;
        } else {
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.Ed448PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.getHighSpeedVideoFpsRanges || this.Camera2StreamConfigurationMap == null) {
            throw new java.lang.IllegalStateException("Ed448phSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[64];
        if (64 != this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0, 64)) {
            throw new java.lang.IllegalStateException("Prehash digest failed");
        }
        byte[] bArr2 = new byte[114];
        this.Camera2StreamConfigurationMap.sign(1, this.getHighSpeedVideoFpsRangesFor, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    public Ed448phSigner(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
