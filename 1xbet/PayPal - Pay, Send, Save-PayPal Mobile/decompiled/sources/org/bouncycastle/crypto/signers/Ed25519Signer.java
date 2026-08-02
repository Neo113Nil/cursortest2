package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class Ed25519Signer implements org.bouncycastle.crypto.Signer {
    private org.bouncycastle.crypto.params.Ed25519PublicKeyParameters Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.signers.Ed25519Signer.Buffer getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.signers.Ed25519Signer.Buffer(0);
    private org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.getHighSpeedVideoFpsRanges || (ed25519PublicKeyParameters = this.Camera2StreamConfigurationMap) == null) {
            throw new java.lang.IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(ed25519PublicKeyParameters, bArr);
    }

    static class Buffer extends java.io.ByteArrayOutputStream {
        final boolean getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr) {
            synchronized (this) {
                if (64 != bArr.length) {
                    reset();
                    return false;
                }
                boolean verify = org.bouncycastle.math.ec.rfc8032.Ed25519.verify(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, this.buf, 0, this.count);
                reset();
                return verify;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            synchronized (this) {
                org.bouncycastle.util.Arrays.fill(this.buf, 0, this.count, (byte) 0);
                this.count = 0;
            }
        }

        final byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters) {
            byte[] bArr;
            synchronized (this) {
                bArr = new byte[64];
                ed25519PrivateKeyParameters.sign(0, null, this.buf, 0, this.count, bArr, 0);
                reset();
            }
            return bArr;
        }

        /* synthetic */ Buffer(byte b) {
            this();
        }

        private Buffer() {
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoFpsRangesFor.write(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRanges = z;
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) cipherParameters;
            this.Camera2StreamConfigurationMap = null;
        } else {
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (!this.getHighSpeedVideoFpsRanges || (ed25519PrivateKeyParameters = this.getHighSpeedVideoSizes) == null) {
            throw new java.lang.IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(ed25519PrivateKeyParameters);
    }
}
